package com.jspider.lib;


import java.util.Random;

public class ThiefAndPolice {
    public static void main(String[] args) {
        final int TOTAL_CAVES = 13;
        int thiefPosition = new Random().nextInt(TOTAL_CAVES); // Random initial position of thief
        int day = 1;

        System.out.println("The game begins! There are " + TOTAL_CAVES + " caves.");

        while (true) {
            System.out.println("\nDay " + day);

            // Police chooses two caves to inspect
            int policeInspection1 = (day - 1) % TOTAL_CAVES;
            int policeInspection2 = day % TOTAL_CAVES;

            System.out.println("Police inspects caves: " + policeInspection1 + " and " + policeInspection2);

            // Check if thief is caught
            if (thiefPosition == policeInspection1 || thiefPosition == policeInspection2) {
                System.out.println("The thief was caught in cave " + thiefPosition + " on day " + day + "!");
                break;
            }

            // Thief moves to a new position
            thiefPosition = moveThief(thiefPosition, TOTAL_CAVES);
            System.out.println("Thief moves to a new cave.");

            day++;
        }
    }

    // Method to simulate the thief's movement
    private static int moveThief(int currentPosition, int totalCaves) {
        Random random = new Random();
        int move = random.nextInt(3) - 1; // -1 (left), 0 (stay), 1 (right)

        int newPosition = (currentPosition + move + totalCaves) % totalCaves;
        return newPosition;
    }
}

