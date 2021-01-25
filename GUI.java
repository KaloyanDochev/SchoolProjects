package p01;

import javax.swing.BoxLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;

public class GUI implements ActionListener {
	JFrame f = new JFrame();

	final JTextField numtf = new JTextField();

	String actions[] = { "prime", "even", "a palindrome", };

	JComboBox cb = new JComboBox(actions);

	JButton go = new JButton("Go");
	JButton b1 = new JButton("Random prime number");
	JButton b2 = new JButton("Number fact");

	JTextField rez = new JTextField("");

	JTextArea pole = new JTextArea("");

	GUI() {
		JLabel l1, l2;
		l1 = new JLabel("Write a number:");
		l1.setBounds(15, 10, 100, 30);
		f.add(l1);

		// pole za izpisvane na chislo
		numtf.setBounds(15, 45, 100, 20);
		f.add(numtf);

		l2 = new JLabel("Check whether the number is:");
		l2.setBounds(15, 80, 200, 30);
		f.add(l2);

		String actions[] = { "prime", "even", "a palindrome", };
		cb.setBounds(15, 105, 120, 20);
		f.add(cb);
		f.setLayout(null);

		go.setBounds(15, 150, 50, 20);
		go.addActionListener(this);
		f.add(go);

		JLabel l3 = new JLabel("Additional functions:");
		l3.setBounds(315, 10, 200, 30);
		f.add(l3);

		b1.setBounds(315, 40, 200, 20);
		b1.addActionListener(this);
		f.add(b1);

		b2.setBounds(315, 70, 200, 20);
		b2.addActionListener(this);
		f.add(b2);

		rez.setBounds(15, 180, 200, 20);
		f.add(rez);

		pole.setBounds(315, 100, 200, 100);
		f.add(pole);

		f.setSize(600, 275);
		f.setLayout(null);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		GUI frame = new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == go) {
			String selectedItem = (String) cb.getSelectedItem();
			String rezultat = "";//teksta kojto shte se izpishe v text fielda 

			int i = Integer.parseInt(numtf.getText());

			switch (selectedItem) {
			case "a palindrome":
				// palindrome = reversed
				int prov = i;
				int r;// ostatuk
				int reverse = 0;
				while (prov != 0) {
					r = prov % 10;
					reverse = reverse * 10 + r;
					prov /= 10;
				}
				if (i == reverse) {
					rezultat = "The number is a palindrome";
				} else {
					rezultat = "The number is not a palindrome";
				}
				break;

			case "prime":
				boolean IsPrime = true;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						IsPrime = false;
					}
				}
				if (IsPrime == true) {
					rezultat = "The number is prime";
				} else {
					rezultat = "The number is not prime";
				}
				break;

			case "even":
				if (i % 2 == 0) {
					rezultat = "The number is even";
				} else {
					rezultat = "The number is odd";
				}
				break;
			}

			rez.setText(rezultat);
		}

		else if (e.getSource() == b1) {
			// random prime number
			int prosto = (int) (Math.random() * 1000000 + 1);
			boolean IsPrime = false;
			boolean Proverka = false;
			// proverqva se dali chisloto e prosto i ako ne е se uvelichava s 1 dokato stane
			while (IsPrime == false) {
				for (int j = 2; j <= prosto / 2; j++) {
					if (prosto % j == 0) {
						prosto++;
						Proverka = true;
					}
				}
				if (Proverka == true) {
					Proverka = false;
					continue;
				}
				IsPrime = true;
			}

			pole.setText(String.valueOf(prosto));
		}

		else if (e.getSource() == b2) {
			// random number fact
			String[] fakti = { "From 0 to 1000, the only number that has the letter “a” in it is “one thousand”",
					"Most mathematical symbols weren’t invented until the 16th century. Before that, equations were written in words.",
					"The word “hundred” comes from the old Norse term, “hundrath”, which actually means 120 and not 100.",
					"In a room of 23 people there’s a 50% chance that two people have the same birthday.",
					"Forty is the only number that is spelt with letters arranged in alphabetical order.",
					"Conversely, “one” is the only number that is spelt with letters arranged in descending order.",
					"Every odd number has an “e” in it.", "-40 °C is equal to -40 °F.",
					"Markings on animal bones indicate that humans have been doing math since around 30,000BC." };

			pole.setLineWrap(true);
			pole.setWrapStyleWord(true);
			pole.setText(fakti[(int) (Math.random() * 9)]);// izbira proizvolen fakt ot masiva

		}

	}
}