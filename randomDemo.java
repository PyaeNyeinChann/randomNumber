package ChanLabDemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class randomDemo extends JFrame {
	private JTextField jtxt;
	private JLabel lblName,lblResult;
	private JButton jbnClick;
	
	public randomDemo() {
		setTitle("RANDOM");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblResult = new JLabel("0");
		lblResult.setFont(new Font("Lucida Hanwriting",Font.ITALIC,100));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblResult,BorderLayout.CENTER);
		
		jtxt = new JTextField("Enter your max num");
		jtxt.setBackground(Color.WHITE);
		jtxt.setForeground(Color.black);
		jtxt.setHorizontalAlignment(SwingConstants.CENTER);
		add(jtxt,BorderLayout.NORTH);
		
		jbnClick = new JButton("Click");
		add(jbnClick,BorderLayout.SOUTH);
		jbnClick.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int input = Integer.parseInt(jtxt.getText());
				Random num = new Random();
				int random_num = num.nextInt(input)+1;
				lblResult.setText("" + random_num);
			}
		});
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new randomDemo();

	}

}
