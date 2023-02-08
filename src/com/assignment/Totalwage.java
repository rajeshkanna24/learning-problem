package com.assignment;
import java.util.Random;

public class Totalwage {
    public static final int IS_PART_TIME = 1;

    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 100;
    public static final int NUM_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {



        int emphrs = 0, empwage = 0, totalempwage = 0;
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++)
        {
            Random random = new Random();
            int empcheck = random.nextInt(0, 3);
            switch (empcheck)
            {
                case IS_PART_TIME:
                    emphrs = 4;
                    break;
                case IS_FULL_TIME:
                    emphrs = 8;
                    break;
                default:
                    emphrs = 0;
                    break;
            }
            empwage = emphrs * EMP_RATE_PER_HOUR;
            totalempwage += empwage;
            System.out.println("employee wage : " + empwage);
        }
        System.out.println("Total employee wage : " + totalempwage);

    }
}
