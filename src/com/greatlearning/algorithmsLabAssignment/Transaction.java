package com.greatlearning.algorithmsLabAssignment;

import java.util.Scanner;

/**
 *
 */
public class Transaction {
    /**
     *
     * @param args
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter the size of Transaction array: ");
        int size = sc.nextInt();
        int tarray[] = new int[size];

        System.out.println("\n Please enter the value of array : ");

        for(int i=0;i<size;i++){
            tarray[i]=sc.nextInt();
        }

        System.out.println("\n Enter the total number of targets that need to achieved : ");
        int targetNumber = sc.nextInt();
        while(targetNumber-- != 0){
            int flag=0;
            int target;

            System.out.println("\n Enter the value of target : ");
            target = sc.nextInt();
            int sum = 0;
            for(int i=0;i<size;i++){
                sum+=tarray[i];
                if(sum>=target){
                    System.out.println("\n Target achieved after "+(i+1)+" transactions");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("\n Given target is not achieved");
            }
        }
        sc.close();
    }
}
