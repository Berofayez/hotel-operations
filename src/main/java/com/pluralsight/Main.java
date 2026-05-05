package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee(1, "Abeer", "it", 35 );
        System.out.println("enter start time");
        int startTime = scanner.nextInt();

        scanner.nextLine();

        System.out.println("enter end time");
        int endTime = scanner.nextInt();

        employee.punchTimeCard(startTime, endTime);

        System.out.println(employee.getHoursWorked());

        Room room = new Room(2, 122, false, false);


        System.out.println(room.isAvailable());

        Reservation reservation = new Reservation("king", 2, true);
        System.out.println(reservation.getReservationTotal());

    }
}
