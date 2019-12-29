/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author priyamsuthar
 */
public class Medicine {
    private String name;
    private int quantity;
    private LocalDate orderedDate;
    
    public Medicine(String name, int quantity, LocalDate orderedDate){
        this.name = name;
        this.quantity = quantity;
        this.orderedDate = orderedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(LocalDate orderedDate) {
        this.orderedDate = orderedDate;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
