/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgrounds;

/**
 *
 * @author knopsl
 */
public class RndmGameChooser {
    Randomnumber rnumber = new Randomnumber();
    
     
    public void chooseGame() {
        int number = rnumber.getRN(10);
        
        if (number == 1 || number == 2 || number == 3) {
            
            //start game one
            System.out.println("DEBUG: Game ONE starts.");
            
        } else if (number == 4 || number == 5 || number == 6) {
            
            //start game two
            System.out.println("DEBUG: Game TWO starts.");
        } else if (number == 7 || number == 8 || number == 9) {
            
            //start game three
            System.out.println("DEBUG: Game THREE starts.");
        } else if (number == 10) {
            
            //getextramoney
            System.out.println("DEBUG: Get Extra Money.");
        } else {
            
            System.out.println("DEBUG: Number is smaller than 1 or greater than 10!!!");
        }
        
    }
    
    

}