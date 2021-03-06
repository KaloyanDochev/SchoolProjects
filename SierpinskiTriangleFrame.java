package Recursion;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
	static int r = 0, gr = 0, b = 255;
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	int order = 0;


	private JTextField jtfOrder = new JTextField("0", 5); // Order
	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern

	public SierpinskiTriangleFrame() {
// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		//panel.add(new JLabel("Enter an order: "));
		//panel.add(jtfOrder);
		
		panel.add(plus);
		panel.add(minus);
		jtfOrder.setHorizontalAlignment(SwingConstants.RIGHT);
// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		trianglePanel.setOrder(order);
		add(panel, BorderLayout.SOUTH);
// Register a listener
//		jtfOrder.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				trianglePanel.setOrder(Integer.parseInt(jtfOrder.getText()));
//			}
//		});
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				trianglePanel.setOrder(++order);
			}
				
		});
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				trianglePanel.setOrder(--order);
			}
				
		});

	}

}