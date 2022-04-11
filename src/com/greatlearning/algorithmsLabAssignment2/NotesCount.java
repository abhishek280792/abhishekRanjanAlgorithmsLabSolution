package com.greatlearning.algorithmsLabAssignment2;

import java.util.Arrays;
import java.util.Scanner;

public class NotesCount {
    public void notesCount(int denoArray[],int size,int amount){
        Scanner sc = new Scanner(System.in);
        Arrays.sort(denoArray);
        System.out.println("\n Your payment approach in order to give min no of notes will be : ");
        for(int i=(size-1);i>=0;i--){
            if(amount<=0){
                break;
            }
            int remainder = amount/denoArray[i];
            if(remainder>0){
                amount=amount%denoArray[i];
                System.out.println("\n"+denoArray[i]+" : "+remainder);
            }else if(i==0){
                amount=amount%denoArray[i];
                if(amount>0){
                    System.out.println("\n"+denoArray[i]+" : "+(remainder+1));
                }else{
                    System.out.println("\n"+denoArray[i]+" : "+remainder);
                }
            }
        }

    }
}
