package project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.*;
import javax.swing.JButton;

public class PatternGame implements ActionListener {
	int score = 0;
	JFrame f;
	JButton[] b = new JButton[9];
	LinkedList<Integer> used = new LinkedList<>();

//boolean notLost = true;
	PatternGame() throws InterruptedException {
		// waitUntil(2000);
		f = new JFrame();
		for (int i = 0; i < 9; i++) {
			b[i] = new JButton("");
			b[i].setBackground(Color.WHITE);
			b[i].addActionListener(this);
			f.add(b[i]);
		}
		f.setLayout(new GridLayout(3, 3));
		f.setSize(300, 300);
		f.setVisible(true);
		int vreme = 2000;
		long start = System.currentTimeMillis();
		long end = start + 5 * 1000; // 10 seconds * 1000 ms/sec
		while (System.currentTimeMillis() < end) {
			Random rand = new Random();
			int random = rand.nextInt(9);
			b[random].setBackground(Color.BLUE);
			used.add(random);
			Thread.sleep(vreme);
			// waitUntil(100);
			b[random].setBackground(Color.WHITE);
			Thread.sleep(10);
			vreme -= 50;
		}
		f.setVisible(false);
		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, "Score:" + score, "Scoreboard", JOptionPane.PLAIN_MESSAGE);
	}

	public static void waitUntil(int timestamp) {
		long millis = timestamp - System.currentTimeMillis();
		// return immediately if time is already in the past
		if (millis <= 0)
			return;
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		new PatternGame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b[used.getLast()]) {
			score++;
		}
	}
}