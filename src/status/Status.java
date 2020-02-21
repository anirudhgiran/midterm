/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * Use enumerators to avoid input errors
 * and print the status details. 
 * @author srinivsi
 * @modifier Anirudh Giran
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    Scanner in =new Scanner(System.in);
    System.out.println("\tStatus Codes: \n\t0 for ZERO\n\t1 for ONE\n\t2 for TWO\n\t3 for THREE");
    System.out.print("\t\tEnter Code: ");
    int i = in.nextInt();
    
    StausUser obj = new StausUser();
    obj.statusDetail(i);
    
    
    
    
    }
    
}
