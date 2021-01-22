package p01;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
		JFrame f;  
		GUI(){  
		f=new JFrame();//creating instance of JFrame  
		
		 JLabel l1,l2;  
		 l1=new JLabel("Write a number:");  
		 l1.setBounds(15,10, 100,30);
		 f.add(l1);
		    
		final JTextField numtf=new JTextField();  
		//za izpisvane na chislo
	    numtf.setBounds(15,45, 100,20);  
	    f.add(numtf);
	    
	    l2=new JLabel("Check whether the number is:");  
		l2.setBounds(15,80, 200,30);
		f.add(l2);
		
		String actions[]={"prime","even","a palindrome",};        
	    JComboBox cb=new JComboBox(actions);    
	    cb.setBounds(15,105,120,20);    
	    f.add(cb);        
	    f.setLayout(null);    
	    
		
		JButton go=new JButton("Go");  
		go.setBounds(15,150,50, 20);  
		go.addActionListener(this);
		f.add(go);
		
		JLabel l3 = new JLabel("Additional functions:");  
	    l3.setBounds(315,10, 200,30);
		f.add(l3);
		
		JButton b1=new JButton("Previously checked numbers");  
		b1.setBounds(315,40,200, 20);           
		f.add(b1);
		
		JButton b2=new JButton("First 100 prime numbers");  
		b2.setBounds(315,70,200, 20);           
		f.add(b2);
		
		JButton b3=new JButton("Number fact");  
		b3.setBounds(315,100,200, 20);           
		f.add(b3);
		f.setSize(600,275);  
		f.setLayout(null); 
		f.setVisible(true);
		
    	String[] selectedItem = (String[])cb.getSelectedItem();
		
		String rezultat = "rezultat";
		JLabel rez = new JLabel("rezultat");  
	    rez.setBounds(15,180,50, 20);
		f.add(rez);
		
		}  
		
		
		public static void main(String[] args) {  
		GUI frame = new GUI();  
		
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int i= Integer.parseInt(numtf.getText());  
			switch(selectedItem) {
			case "palindrome": 
				int prov = i;
				int sum = 0;
				int r;//ostatuk
				int reverse;
				 while( prov != 0 )
			        {
			            r = prov % 10;
			            reverse = reverse * 10 + remainder;
			            prov  /= 10;
			        }
				 if(i == reverse) {rezultat = "The number is a palindrome"}
				 else {rezultat = "The number is not a palindrome"};
				 
			case "prime":
				bool IsPrime = true;
				for(int j=2; j<i/2; j++) {
					if(j/i) {IsPrime = false;}
				}
				if(IsPrime == true) {rezultat = "The number is prime"};
				 else {rezultat = "The number is not prime"};
			
			case "even":
				if(i%2==0) {rezultat = "The number is even"};
				else {rezultat = "The number is odd"};
				 }
		}  
}