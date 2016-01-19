/*
 * To set this license header, choose License Headers in Project Properties.
 * To set this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgrounds;
import java.util.Scanner;

/**
 *
 * @author knopsl
 */
public class Newgrounds {

    /**
     * @param args the command line arguments
     */
    
    public static String userinput() {
        Scanner inp = new Scanner(System.in);
        //System.out.println(message);
        return inp.nextLine();
    }
    
    
    public static void main(String[] args) {
                
        System.out.println("This is a dog simulator. \nThe Usecase is to try OOP.");
        RndmGameChooser gmchooser = new RndmGameChooser();
        Randomnumber rndmnr = new Randomnumber();        
        Player player = new Player(10);
        System.out.println("What's your Name?");
        player.setName(Newgrounds.userinput());
        
        System.out.println("Ah "+ player.getName() + " what a fine Name.\nNice to meet you.");
                
        Dog actualdog = new Dog(1,4,1);
        actualdog.setHunger(false);
        actualdog.setPee(false);
        
        System.out.println("What's the name of the puppy?");
        
        actualdog.setName(Newgrounds.userinput());
        
        System.out.println("So your puppy is named " + actualdog.getName() + "? (Y/N)");
        
        switch (Newgrounds.userinput()) {
            case "Y":
                System.out.println("Great! So lets go on.");
                break;
            case "N":
                System.out.println("Damnit, but that's what his collar says...\nis it really your dog?");
                System.exit(0);
            default:
                System.out.println("I can't hear yoooou!");
                System.exit(0);
        }
        
    System.out.println("Do you want to know how old your puppy is in doggy years?(Y/N");
    
    switch (Newgrounds.userinput()) {
            case "Y":
                System.out.println("Your puppy is "+ actualdog.inDogYears(actualdog.getAge()) + " years old in doggy years.");
                break;
            case "N":
                System.out.println("Ok, if you don't want to...");
                break;
            default:
                System.out.println("I can't hear yoooou!");
                System.exit(0);
        }
    System.out.println("HINT: if you type 'QUIT' the game ends");
        
    while(!Newgrounds.userinput().equals("QUIT")){
            
            
             Newgrounds.userinput();
            
          
            
            //System.out.println(rndmnr.getRN(100));
            
            
            
           // gmchooser.chooseGame(); 
          //gamecode  
            
            
            
        }
    }
    
}
