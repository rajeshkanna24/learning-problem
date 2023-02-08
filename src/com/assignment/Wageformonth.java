package com.assignment;
import java.util.Random;

public class Wageformonth {
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;
   public static final int emp_rate_per_hour = 20;
   public static final int num_of_working_days = 2;

    public static void main(String[] args) {

        int emphrs = 0, empwage = 0, totalempwage = 0;
        for (int day = 0; day < num_of_working_days; day++) {
            Random random = new Random();
            int empcheck = random.nextInt(0, 3);
            switch (empcheck) {
                case is_part_time:
                    emphrs = 4;
                    break;
                case is_full_time:
                    emphrs = 8;
                    break;
                default:
                    emphrs = 0;
                    break;
            }
            empwage = emphrs * emp_rate_per_hour;
            totalempwage += empwage;
            System.out.println("employee wage : " + empwage);
        }
        System.out.println("Total emp wage : " + totalempwage);
    }
}
