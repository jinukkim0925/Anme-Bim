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
		fs("������ �ص�");
		
		cp.setPreferredSize(new Dimension(300,400));
		cp.setBackground(Color.black);
		
		tm.start();
		sh();
	}
	String end = "<html><center>�׷��� �����̴� <br> �ʹ����� ������ <br> �ȸ��� �����Ϻ� <br> ���� �°ԵǾ� <br> ... <br> ... <br> ... <br> �ᱹ �ȸް� <br> �Ǿ����ϴ�. <br> ��_��  ��_��";
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
				imsg("�������� �޼�! \n <������ �� �ص� ��û>");
				System.exit(0);
			}
		}
	});
	
	public void imsg(String s) {
		JOptionPane.showMessageDialog(null, s, "-��-", JOptionPane.INFORMATION_MESSAGE);
	}

	public void wmsg(String s) {
		JOptionPane.showMessageDialog(null, s, "-��-", JOptionPane.ERROR_MESSAGE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Washing_turn_Bim_ending();
	}

}