package form;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import aframe.aframe;

public class Washing_turn_Bim_ending extends aframe {

	public Washing_turn_Bim_ending() {
		// TODO Auto-generated constructor stub
		fs("워싱턴 앤딩");
		
		cp.setPreferredSize(new Dimension(300,400));
		cp.setBackground(Color.black);
		
		tm.start();
		sh();
	}
	String end = "<html><center>그렇게 덕현이는 <br> 너무나도 강력한 <br> 안메의 워싱턴빔 <br> 빔을 맞게되어 <br> ... <br> ... <br> ... <br> 결국 안메가 <br> 되었습니다. <br> ㅠ_ㅠ  ㅠ_ㅠ";
	int h = 300;
	Timer tm = new Timer(30, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			h--;
			cp.removeAll();
			cp.setLayout(null);
			cp.add(jl = new JLabel(end));
			jl.setForeground(Color.yellow);
			jl.setFont(new Font("",Font.BOLD,30));
			jl.setBounds(30, h, 240, 700);
			repaint();
			revalidate();
			if (h == -600) {
				imsg("도전과제 달성! \n <워싱턴 빔 앤딩 시청>");
				System.exit(0);
			}
		}
	});
	
	public void imsg(String s) {
		JOptionPane.showMessageDialog(null, s, "-안-", JOptionPane.INFORMATION_MESSAGE);
	}

	public void wmsg(String s) {
		JOptionPane.showMessageDialog(null, s, "-안-", JOptionPane.ERROR_MESSAGE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Washing_turn_Bim_ending();
	}

}
