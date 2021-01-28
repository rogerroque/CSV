package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("------ Consultas -------");
        System.out.println(" 1. Equipos con mas de 20 puntos");
        System.out.println(" 2. Equipos con menos de 20 puntos");
        System.out.println(" 3. Nombre de equipos");
        System.out.println(" 4. Numero de jugadores de cada equipo");
        System.out.println(" 5. Equipo con menos jugadores");
        System.out.println(" 6. Equipo con mas jugadores");
        System.out.println(" 7. Cantidad de equipos");
        System.out.println(" 8. Ordenar equipos alfabeticamente");
        System.out.print("\n Consulta: ");
        int opcion = scanner.nextInt();
        System.out.print("\n");

        readCSV(opcion);

    }

    private static void readCSV(int opcion) throws IOException {

        List<EstadisticasModel> estadisticasList = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("estadistiques.csv"));
        String line = bufferedReader.readLine();

        while ((line = bufferedReader.readLine()) != null) {
            String[] attributes = line.split(",");
            EstadisticasModel estadisticas = newEstadistica(attributes);
            estadisticasList.add(estadisticas);
        }

        switch (opcion) {

            case 1 -> estadisticasList.stream().filter(p -> p.getPoints() > 20).forEach(System.out::println);
            case 2 -> estadisticasList.stream().filter(p -> p.getPoints() < 20).forEach(System.out::println);
            case 3 -> estadisticasList.stream().map(EstadisticasModel::getHomeTeam).forEach(System.out::println);
            case 4 -> estadisticasList.stream().map(EstadisticasModel::getPlayers).forEach(System.out::println);
            case 5 -> System.out.println(estadisticasList.stream().mapToInt(EstadisticasModel::getPlayers).min());
            case 6 -> System.out.println(estadisticasList.stream().mapToInt(EstadisticasModel::getPlayers).max());
            case 7 -> System.out.println(estadisticasList.stream().map(EstadisticasModel::getHomeTeam).count());
            case 8 -> estadisticasList.stream().map(EstadisticasModel::getHomeTeam).sorted().forEach(System.out::println);
            default -> System.out.println("Un numero igual o menos que 4");

        }

        /*Metodos de busqueda utilizados: filter(), map(), mapToInt(), max(), min(), count(), sorted()*/

    }


    private static EstadisticasModel newEstadistica(String[] data) {
        String homeTeam = data[0];
        String matchDate = data[1];
        int players = Integer.parseInt(data[2]);
        int points = Integer.parseInt(data[3]);
        int asssists = Integer.parseInt(data[4]);
        int wins = Integer.parseInt(data[5]);
        int loses = Integer.parseInt(data[6]);

        return new EstadisticasModel(homeTeam, matchDate, players, points, asssists, wins, loses);
    }
}



