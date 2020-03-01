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
public class constructorTest {
    public static void main(String[] args) {
        Constructor teacher1 = new Constructor("Imrul","male",2314234);
        teacher1.displayInformation();
        
        Constructor teacher2 = new Constructor(teacher1);
        teacher2.displayInformation();
    }
}
