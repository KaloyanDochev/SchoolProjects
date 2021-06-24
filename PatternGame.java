package project;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.*;  
import javax.swing.JButton;
  
public class PatternGame{  
JFrame f; 
JButton[] b = new JButton[9];
PatternGame() throws InterruptedException{  
    f=new JFrame();  
    for(int i = 0; i<9; i++) {
    	b[i] = new JButton("");
    	b[i].setBackground(Color.WHITE);
    	f.add(b[i]);
    }
    f.setLayout(new GridLayout(3,3));   
    f.setSize(300,300);  
    f.setVisible(true); 
    boolean notLost = true;
    int hod = 1;
    while(notLost) {
    	Set<Integer> used = new HashSet<Integer>();
    	for(int i=0;i<hod; i++) {
    		Random rand = new Random();
    		int random = rand.nextInt(9);
    		
    		if(used.contains(random)) {
    			i--;
    			continue;
    		}
    		else {
    			b[random].setBackground(Color.BLUE);
        		Thread.sleep(3000);
        		b[random].setBackground(Color.WHITE);
        	    used.add(random);
    		}
    	}
    	
    	hod++;
    }
    
}  
public static void main(String[] args) throws InterruptedException {  
    new PatternGame();  
}  
}