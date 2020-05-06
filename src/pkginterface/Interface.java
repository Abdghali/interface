/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author PC
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Animals c= new Cat();
//       c.sound();
//       
      Dog d= new Dog();
//       d.sound();
        
        
       Print a  = new Print();
       a.printAnimalSound(c);
       a.printAnimalSound(d);
        
    }
    
}
