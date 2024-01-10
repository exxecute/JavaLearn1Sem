package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours, minutes, seconds;
        seconds = scanner.nextInt();

        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        seconds = (seconds % 3600) % 60;

        hours = (hours == 24) ? 0 : hours;

        System.out.printf("%d:%02d:%02d", hours, minutes, seconds);
    }
}
