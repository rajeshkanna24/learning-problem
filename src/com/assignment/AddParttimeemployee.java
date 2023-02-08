package com.assignment;

import java.util.Random;

public class AddParttimeemployee {
    public static void main(String[] args) {
    int is_part_time = 1;
    int is_full_time = 2;
    int emp_rate_per_hour = 20;
    int emphrs = 0;
    int empwage = 0;
    Random random = new Random();
    int empcheck = random.nextInt(0, 2);
    if (empcheck == is_part_time)
    {
        emphrs = 8;
    }
    else if (empcheck == is_full_time)
    {
        emphrs = 8;
    }
    else
    {
        emphrs = 0;
    }
    empwage = emphrs * emp_rate_per_hour;
    System.out.println("Employee wage : " + empwage);

}
}
