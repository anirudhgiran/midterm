/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 *
 * @author aniru
 */
public class StatusStore {
    
    public enum input{ZERO,ONE,TWO,THREE};
    private input Input;
    
    public enum status{REJECTED,PENDING,PROCESSING,APPROVED};
    private status Status;

    /**
     * @return the Input
     */
    public input getInput() {
        return Input;
    }

    /**
     * @param Input the Input to set
     */
    

    /**
     * @return the Status
     */
    public status getStatus() {
        return Status;
    }

    /**
     * @param Input
     * @param Status the Status to set
     */
    
    
    /**
     * @param Input the Input to set
     */
    public void setInput(input Input) {
        this.Input = Input;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(status Status) {
        this.Status = Status;
    }
    
    
}
