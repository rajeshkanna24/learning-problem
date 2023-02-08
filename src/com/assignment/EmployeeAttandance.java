package com.assignment;

import java.util.Random;

public class EmployeeAttandance {
        public static void main(String[] args) {
            int is_it_full = 1;
            Random random = new Random();
            int empcheck = random.nextInt(0, 2);
            if (empcheck == is_it_full)
            {
                System.out.println("employee is present");
            }
            else
            {
                System.out.println("employee is absent");
            }

        }
    }

