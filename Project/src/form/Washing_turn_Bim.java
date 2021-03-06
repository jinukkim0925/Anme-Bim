package form;

import java.awt.AWTException;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import aframe.aframe;

public class Washing_turn_Bim extends aframe {

	Color col[] = { Color.red, Color.orange, Color.yellow, Color.green, Color.cyan, Color.blue, Color.pink,
			Color.magenta };
	JButton jb[] = new JButton[5];
	String s1[] = "빔 공격력 증가, 빔 속도 증가, 안호 강화, 재화력증가, 종료".split(", ");
	DecimalFormat won = new DecimalFormat("#,###");
	int lv1 = 0, lv2 = 0, lv3 = 0, lv4 = 0, pay1 = 1000, pay2 = 2000, pay3 = 2500, pay4 = 3000, click_pay = 10, ct = 0;
	JLabel click_money, month_money, cretical;
	ImageIcon ic = new ImageIcon(new ImageIcon("switch.jpg").getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
	Image im = ic.getImage();

	public Washing_turn_Bim() {
		// TODO Auto-generated constructor stub
		fs("워싱턴 빔");

		add(np = new JPanel(), BorderLayout.NORTH);

		add(cp = new JPanel(), BorderLayout.CENTER);

		// 안메
		add(wp = new JPanel(), BorderLayout.WEST);
		wp.add(ap = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				Graphics2D g2 = (Graphics2D) g;
				// 레벨
				if (lv3 >= 1 && lv3 <= 5) {
					g2.setColor(new Color(255, 255 - lv3 * 50, 50));
					g2.setStroke(new BasicStroke(7));
					g2.drawOval(45, 45, 60, 60);
					g2.setStroke(new BasicStroke(10));
					g2.drawLine(75, 100, 75, 180);
					// 다리
					g2.drawLine(75, 180, 50, 220);
					g2.drawLine(75, 180, 100, 220);
					// 팔
					g2.drawLine(75, 120, 120, 120);
					g2.drawLine(75, 120, 120, 140);
				} else if (lv3 > 1) {

					g2.setColor(new Color(255, 0, 0));
					g2.setStroke(new BasicStroke(7));
					g2.drawOval(45, 45, 60, 60);
					g2.setStroke(new BasicStroke(10));
					g2.drawLine(75, 100, 75, 180);
					// 다리
					g2.drawLine(75, 180, 50, 220);
					g2.drawLine(75, 180, 100, 220);
					// 팔
					g2.drawLine(75, 120, 120, 120);
					g2.drawLine(75, 120, 120, 140);
					if (lv3 == 6) {
						g2.setColor(Color.orange);
					}
					if (lv3 == 7) {
						g2.setColor(Color.yellow);
					}
					if (lv3 == 8) {
						g2.setColor(Color.black);
						g2.setStroke(new BasicStroke(10));
						g2.drawLine(60, 0, 50, 75);
						g2.drawLine(60, 0, 70, 25);
						g2.drawLine(70, 25, 75, 0);
						g2.drawLine(75, 0, 90, 25);
						g2.drawLine(90, 25, 100, 0);
						g2.drawLine(100, 0, 100, 75);

						g2.setColor(Color.white);
						g2.setStroke(new BasicStroke(8));
					}
					if (lv3 == 9) {
						g2.setColor(Color.black);
						g2.setStroke(new BasicStroke(10));
						g2.drawLine(60, 0, 50, 75);
						g2.drawLine(60, 0, 70, 25);
						g2.drawLine(70, 25, 75, 0);
						g2.drawLine(75, 0, 90, 25);
						g2.drawLine(90, 25, 100, 0);
						g2.drawLine(100, 0, 100, 75);

						g2.setColor(new Color(50, 255, 220));
						g2.setStroke(new BasicStroke(8));
					}
					if (lv3 == 10) {
						g2.setColor(Color.black);
						g2.setStroke(new BasicStroke(10));
						g2.drawLine(60, 0, 50, 75);
						g2.drawLine(60, 0, 70, 25);
						g2.drawLine(70, 25, 75, 0);
						g2.drawLine(75, 0, 90, 25);
						g2.drawLine(90, 25, 100, 0);
						g2.drawLine(100, 0, 100, 75);
						g2.setColor(new Color(161, 238, 253));

						g2.setStroke(new BasicStroke(8));
					}
					g2.drawLine(60, 0, 50, 75);
					g2.drawLine(60, 0, 70, 25);
					g2.drawLine(70, 25, 75, 0);
					g2.drawLine(75, 0, 90, 25);
					g2.drawLine(90, 25, 100, 0);
					g2.drawLine(100, 0, 100, 75);
				}

				g2.setStroke(new BasicStroke(5));
				g2.setColor(Color.black);

				g2.drawOval(50, 50, 50, 50);

				g2.drawLine(75, 100, 75, 180);
				g2.drawLine(75, 180, 50, 220);
				g2.drawLine(75, 180, 100, 220);
				// 팔
				g2.drawLine(75, 120, 120, 120);
				g2.drawLine(75, 120, 120, 140);

				g2.setColor(Color.black);

				g2.drawString("안메", 70, 240);

			}
		});

		ap.setPreferredSize(new Dimension(120, 300));
		// 덕현
		add(ep = new JPanel(), BorderLayout.EAST);

		ep.add(ap = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				Graphics2D g2 = (Graphics2D) g;
				g2.setStroke(new BasicStroke(5));

				g2.drawOval(10, 50, 50, 50);
				g2.drawLine(35, 100, 35, 180);
				g2.drawLine(35, 180, 10, 220);
				g2.drawLine(35, 180, 60, 220);
				// 팔
				g2.drawLine(35, 120, 60, 100);
				g2.drawLine(35, 120, 10, 100);
				g2.drawString("덕현", 20, 240);

				// 크리티컬
				if (ch_ct == 1) {

					g2.setColor(new Color(255, 0, 0));
					g2.setStroke(new BasicStroke(7));
					g2.drawOval(5, 45, 60, 60);
					g2.setStroke(new BasicStroke(10));

					g2.drawLine(35, 100, 35, 180);
					g2.drawLine(35, 180, 10, 220);
					g2.drawLine(35, 180, 60, 220);
					// 팔
					g2.drawLine(35, 120, 60, 100);
					g2.drawLine(35, 120, 10, 100);
					g2.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
					g2.drawString("Critical!", 80, 20);
				}
			}
		});

		ap.setPreferredSize(new Dimension(200, 300));

		add(sp = new JPanel(), BorderLayout.SOUTH);
		for (int i = 0; i < jb.length; i++) {
			sp.add(jb[i] = new JButton(s1[i]));
			jb[i].setBackground(Color.white);
			jb[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
			jb[i].setPreferredSize(new Dimension(150, 30));
		}

		np.setBackground(Color.white);
		np.setPreferredSize(new Dimension(900, 100));

		np.add(click_money = new JLabel("클릭 당 골드 : " + won.format(click_pay)));
		click_money.setFont(new Font("", Font.BOLD, 30));

		np.add(month_money = new JLabel("  //  월급 : " + won.format(money)));
		month_money.setFont(new Font("", Font.BOLD, 30));

		np.add(cretical = new JLabel("  //  크확 : " + ct + "%"));
		cretical.setFont(new Font("", Font.BOLD, 30));

		cp.setBackground(Color.white);
		cp.setPreferredSize(new Dimension(900, 300));

		wp.setBackground(Color.white);
		wp.setPreferredSize(new Dimension(120, 300));

		ep.setBackground(Color.white);
		ep.setPreferredSize(new Dimension(200, 300));

		sp.setBackground(Color.white);

		// 클릭
		cp.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				gold = gold + click_pay;
			};
		});

		jb[0].addActionListener(e -> {
			if (lv1 == 80) {
				imsg("최고레벨 입니다.");
				int a = JOptionPane.showConfirmDialog(null, "워싱턴 빔 엔딩을 보시겠습니까?", "종료", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				if (a == JOptionPane.YES_OPTION) {
					dispose();
					tm.stop();
					new Washing_turn_Bim_ending();
				}
				return;
			}
			System.out.println(((lv1 % 10) * 1000 + 1000));
			if (pay1 > gold) {
				wmsg("골드가 부족합니다.");
				return;
			}
			lv1++;
			money = money + 50;
			gold = gold - pay1;
			pay1 = pay1 + 1000;
			if (lv1 % 10 == 0) {
				if (co != col.length - 1) {
					co++;
				}
			}
		});
		jb[1].addActionListener(e -> {
			if (pay2 > gold) {
				wmsg("골드가 부족합니다.");
				return;
			}
			if (speed == 21) {
				imsg("최고레벨을 달성했습니다.");
				return;
			}
			speed++;
			gold = gold - pay2;
			pay2 = pay2 + 2000;
			lv2++;
			w = 0;

			tm.restart();
		});
		jb[2].addActionListener(e -> {
			if (lv3 == 10) {
				imsg("최고레벨을 달성했습니다.");
				return;
			}
			if (pay3 > gold) {
				wmsg("골드가 부족합니다.");
				return;
			}
			lv3++;
			ct = ct + 5;
			cretical.setText("  //  크확 : " + ct + "%");

			w = 0;
			gold = gold - pay3;
			pay3 = pay3 + 3000;
			repaint();
			revalidate();

		});
		jb[3].addActionListener(e -> {
			if (lv4 == 20) {
				imsg("최고레벨을 달성했습니다.");
				return;
			}
			if (pay4 > gold) {
				wmsg("골드가 부족합니다.");
				return;
			}
			gold = gold - pay4;
			lv4++;
			pay4 = pay4 + 4000;
			click_pay = click_pay + 10;
			click_money.setText("클릭 당 골드 : " + won.format(click_pay));

		});
		jb[4].addActionListener(e -> {
			int a = JOptionPane.showConfirmDialog(null, "워싱턴 빔 키우기를 종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (a == JOptionPane.YES_OPTION) {
				System.exit(0);
			}

		});
		
		tm.start();
		
		sh();
	}

	int w = 0, cnt = 0, co = 0, gold = 0, money = 500, speed = 1, ch_ct = 0;
	Timer tm = new Timer(1, new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cp.removeAll();

			cp.add(ap = new JPanel() {
				protected void paintComponent(java.awt.Graphics g) {
					Graphics2D g2 = (Graphics2D) g;

					int h = lv1 % 10;
					g2.setColor(col[co]);
					if (lv1 >= 80) {
						g2.setColor(new Color(140, 60, 245));
					}
					g2.fillRect(0, 110 - h * 2, w * speed, 40 + h * 4);
					if (lv1 >= 80) {
						g2.setStroke(new BasicStroke(5));
						g2.setColor(col[0]);
						g2.drawRect(0, 110 - h * 2, w * speed, 40 + h * 4);

					}

					g2.setColor(Color.black);
					g2.drawString("워싱턴 빔", w * speed - 30, 130);
					g2.setFont(new Font("", Font.BOLD, 30));
					g2.setColor(Color.orange);
					g2.drawString("골드 : " + won.format(gold), 400, 250);
					g2.setFont(new Font("", Font.BOLD, 15));
					g2.setColor(Color.black);

					// 빔
					g2.drawString("lVl : " + lv1, 110, 290);
					g2.drawString("비용 : " + won.format(pay1), 160, 290);
					// 속도
					g2.drawString("lVl : " + lv2, 265, 290);
					g2.drawString("비용 : " + won.format(pay2), 315, 290);
					// 개인
					g2.drawString("lVl : " + lv3, 420, 290);
					g2.drawString("비용 : " + won.format(pay3), 470, 290);
					// 재화
					g2.drawString("lVl : " + lv4, 575, 290);
					g2.drawString("비용 : " + won.format(pay4), 625, 290);
					if (w >= 450 / speed) {
						ch_ct = 0;
					}
//					System.out.println(899 / speed +" / "+w);
					if (w + 1 >= 899 / speed) {

						Random r = new Random();
						int rand = r.nextInt(100);
						if (rand < ct) {
							System.out.println("a");
							ch_ct = 1;
							gold = gold + money;
						}
					}

				};
			});
			w++;
			month_money.setText("  //  월급 : " + won.format(money));
			ap.setPreferredSize(new Dimension(900, 300));
			if (w >= 900 / speed) {
				gold = gold + money;
				w = 0;

			}
			repaint();
			revalidate();
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
		new Washing_turn_Bim();
	}

}
