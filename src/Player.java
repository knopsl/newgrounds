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
public class Player {
    
    String name = "";
    int money = 0;
    
public Player (int money) {
    this.money = money;
}
    
public String getName() {
        return this.name;
    }

public void setName(String newName) {
        name = newName;
    }

public int getMoney() {
    return this.money;
}

public void setMoney(int newValue) {
    money = newValue;
}

public void addMoney(int addValue) {
    money = money + addValue;
}
    
boolean checkIfDoable(int money, int price)
    {
     if (money >= price) {
         return true;
    } else {
         return false;
    }
 }    
 
 
}
