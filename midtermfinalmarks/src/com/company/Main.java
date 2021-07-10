package com.company;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static int marksOfSuccess(int midterm, int fınal) {
        int markSuccess = midterm * 40 / 100 + fınal * 60 / 100;
        if (0 <= markSuccess && markSuccess <= 20) {
            System.out.println("your point: FF");
        } else if (20 < markSuccess && markSuccess <= 50) {
            System.out.println("your point: CB");
        } else if (50 < markSuccess && markSuccess <= 70) {
            System.out.println("your point: BB");
        } else if (70 < markSuccess && markSuccess <= 100) {
            System.out.println("your point: AA");
        }

        return markSuccess;
    }

    public static void main(String[] args) {
        Scanner not = new Scanner(System.in);
        System.out.println("enter your mark:");
        System.out.println("midterm mark:");
        int mirterm = not.nextInt();
        System.out.println("Final mark:");
        int finale = not.nextInt();
        marksOfSuccess(mirterm, finale);
    }
}

