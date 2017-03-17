package caneğrisi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
public class Animation extends JPanel implements ActionListener{
	Timer tm=new Timer(10,this);
	int x=0,velX=2;
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillOval(x, 30, 30, 30);
		tm.start();
		
	}
	public void actionPerformed(ActionEvent e){
		if(x<0 || x>550)
			velX=-velX;
		x=x+velX;
		repaint();
	}
	
	public static void main(String[] args) {
		Animation a=new Animation();
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setSize(600, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(a);

	}

}
