package com.assignment;
import java.util.Random;

public class Switchcase {
       public static final int IS_PART_TIME = 1;
      public static final int IS_FULL_TIME = 2;
      public static final int emp_rate_per_hour = 20;

    public static void main(String[] args) {


            int emphrs = 0;
            int empwage = 0;
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
            empwage = emphrs * emp_rate_per_hour;
        System.out.println("employee wage : " + empwage);
    }
}

