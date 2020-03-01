/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

/**
 *
 * @author imrul
 */
public class Constructor {
    String name,gender;
    int phone;
    
    Constructor(Constructor ob){
        name = ob.name;
        gender = ob.gender;
        phone = ob.phone;
    }
    
    Constructor(String na,String ge,int ph){
        name = na;
        gender = ge;
        phone = ph;
    }
    
    

    
    void displayInformation(){
                System.out.println(name+" "+gender+" "+phone);

    }
}
