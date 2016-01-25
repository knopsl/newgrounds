/*
 * To set this license header, choose License Headers in Project Properties.
 * To set this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgrounds;

/**
 *
 * @author knopsl
 */
public class Dog {
    
    int age;
    int legs;
    int head;
    String name;
    boolean hunger;
    boolean needtopee;
    
    public Dog(int age, int legs, int head) {
    		
    	this.age = age;
    	this.legs = legs;
    	this.head = head;
    }
    	
    
    public void setAge(int newValue) {
        age = newValue;
    }
    
    public void setLegs(int newValue) {
        legs = newValue;
    }
    
    public void setHead(int newValue) {
        head = newValue;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public void setHunger(boolean hungry) {
        hunger = hungry;
    }
    
    public void setPee(boolean pee) {
        needtopee = pee;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }

    public int getHead() {
        return this.head;
    }
    
    public int getLegs() {
        return this.legs;
    }
    
    public boolean getHungry(){
        return this.hunger;
    }
    
    public boolean getPee(){
        return this.needtopee;
    }
    
    public int inDogYears(int years){
        int dogyears;
    dogyears = years * 7;
    return dogyears;
    } 
    
}
