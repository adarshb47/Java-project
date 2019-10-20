/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

/**
 *
 * @author Abhijeet Saraf
 */
public class stockItems {
    int id;
    String name;
    int quantity;
    int mrp;
    
    stockItems(int id,String name,int quantity,int mrp)
    {
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.mrp = mrp;
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMrp() {
        return mrp;
    }
    
    
    
    
}
