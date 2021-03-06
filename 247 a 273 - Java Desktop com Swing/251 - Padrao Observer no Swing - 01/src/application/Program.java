package application;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("Observer Aplication");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(1280, 720);
		window.setLayout(new FlowLayout());
		window.setLocationRelativeTo(null); //Centralizar na tela
		
		JButton button = new JButton("Click me");
		window.add(button);
		
//		button.addActionListener(new ActionListener() {
//			
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Occurrence of event");
//			}
//			
//		});
		
		button.addActionListener(e -> System.out.println("Event!!"));
		
		button.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		window.setVisible(true);
	}

}
