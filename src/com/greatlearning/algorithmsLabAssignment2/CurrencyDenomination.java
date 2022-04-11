package com.greatlearning.algorithmsLabAssignment2;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyDenomination {
    public static void main(String args[]){
        System.out.println("\n Enter the size of currency denominations : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("\n Enter the currency denominations value : ");
        int denoArray[] = new int[size];
        for(int i=0;i<size;i++){
            denoArray[i]=sc.nextInt();
        }
        System.out.println("\n Enter the amount you want to pay : ");
        int amount = sc.nextInt();
        NotesCount count = new NotesCount();
        count.notesCount(denoArray,size,amount);
    }
}
