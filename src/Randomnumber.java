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
public class Randomnumber {

  public int getRN(int i) {
    	
			double randomValue = Math.random();
			//too small so * 100 
			randomValue = randomValue * i;
			//cast double to int BECAUSE    	
			int o = (int) randomValue;
			//return integer from 1-10
			return o;
    }
    
}
