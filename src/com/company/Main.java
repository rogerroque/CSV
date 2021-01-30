package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        List<CarsModel> carsModel = new ArrayList<>();
        readCSV(carsModel);

        Menu.menu();

        int opcion = scanner.nextInt();
        System.out.print("\n");

        switch (opcion) {
            case 1 -> carsModel.stream().map(CarsModel::getCar).forEach(System.out::println);
            case 2 -> carsModel.stream().filter(c -> c.getCaballosFuerza() > 200.0).forEach(System.out::println);
            case 3 -> System.out.println(carsModel.stream().mapToInt(CarsModel::getCilindros).min());
            case 4 -> System.out.println(carsModel.stream().mapToInt(CarsModel::getCilindros).max());
            case 5 -> System.out.println(carsModel.stream().map(CarsModel::getCar).count());
            case 6 -> carsModel.stream().sorted(Comparator.comparing(CarsModel::getPeso).reversed()).forEach(System.out::println);
            case 7 ->  carsModel.stream().map(CarsModel::getCaballosFuerza).distinct().sorted().forEach(System.out::println);
        }

        // map(), forEach(), filter(), mapToInt(), min(), max(), count(), sorted(), distinct()

    }

    private static List<CarsModel> readCSV(List<CarsModel> carsModel) throws IOException {

        String pathCSV = "https://perso.telecom-paristech.fr/eagan/class/igr204/data/cars.csv";
        URL url = new URL(pathCSV);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = bufferedReader.readLine();
        line = bufferedReader.readLine();
        //Hay dos line = bufferedReader.readLine() por que el CSV comienza con dos lineas que no interesa leerlas.

        while ((line = bufferedReader.readLine()) != null) {
            String[] attributes = line.split(";");
            CarsModel cars = newCar(attributes);
            carsModel.add(cars);
        }

        return carsModel;

    }

    private static CarsModel newCar(String[] data) {
        String coche = data[0];
        String mpg = (data[1]);
        int cilindros = Integer.parseInt(data[2]);
        double desplazamiento = Double.parseDouble(data[3]);
        double caballosFuerza = Double.parseDouble(data[4]);
        double peso = Double.parseDouble(data[5]);
        double aceleracion = Double.parseDouble(data[6]);
        String modelo = data[6];
        String origen = data[6];

        return new CarsModel(coche, mpg, cilindros, desplazamiento, caballosFuerza, peso, aceleracion, modelo, origen);
    }

    static class Menu {

        private static void menu() {
            System.out.println("------ Consultas -------");
            System.out.println(" 1. Mostrar todos los coches");
            System.out.println(" 2. Coches con mas de 170 CP");
            System.out.println(" 3. Cantidad minima de cilindros");
            System.out.println(" 4. Cantidad maxima de cilindros");
            System.out.println(" 5. Cantidad de coches total");
            System.out.println(" 6. Ordenar coches por peso");
            System.out.println(" 7. Cantidad de CP sin que se repitan");
            System.out.println(" 8. Ordenar equipos alfabeticamente");
            System.out.print("\n Consulta: ");
        }

    }
}



