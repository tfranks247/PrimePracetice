package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {
            int temp;
            boolean isPrime=true;
            Scanner scan= new Scanner(System.in);
            System.out.println("Enter any number:");
            //capture the input in an integer
            int num=scan.nextInt();
            scan.close();
            for(int i=2;i<=num/2;i++)
            {
                temp=num%i;
                if(temp==0)
                {
                    isPrime=false;
                    break;
                }
            }
            //If isPrime is true then the number is prime else not
            if(isPrime)
                System.out.println(num + " is a Prime Number");
            else
                System.out.println(num + " is not a Prime Number");
        }

        int temp2;
        boolean isPrimeN=true;
        Random objGenerator = new Random();
        int randomNumber = objGenerator.nextInt(20);
        for (int iCount = 2; iCount<=randomNumber/2; iCount++) {
            temp2 = randomNumber % iCount;
            if (temp2 == 0) {
                isPrimeN = false;
                break;
            }
        }

        if(isPrimeN)
                System.out.println("Random No : " + randomNumber + " is a Prime number");

            else
                System.out.println("Random No : " + randomNumber + " is a Prime not a number");
            }
        }




