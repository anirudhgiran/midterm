/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import status.StatusStore.status;

/**
 *
 * @author srinivsi
 */
public class StausUser 
{
   public void statusDetail(int i)
{
   
        
        switch (i) {
            case 0:
                System.out.println("Status is: " + status.REJECTED);
                break;
            case 1:
                System.out.println("Status is: " + status.PENDING);
                break;
            case 2:
                System.out.println("Status is: " + status.PROCESSING);
                break;
            case 3:
                System.out.println("Status is: " + status.APPROVED);
                break;
            default:
                System.out.println("Enter a valid option !!!");
                break;
        }
        
    
    
    
    
}
 
}
