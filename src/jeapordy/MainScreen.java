package jeapordy;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class MainScreen extends JFrame {

	private JPanel contentPane;
	private int score = 0;
	private JButton btnVid200;
	private JButton btnVid400;
	private JButton btnVid600;
	private JButton btnVid800;
	private JButton btnVid1000;
	private JButton btnGeo200;
	private JButton btnGeo400;
	private JButton btnGeo600;
	private JButton btnGeo800;
	private JButton btnGeo1000;
	private JButton btnHis200;
	private JButton btnHis400_1;
	private JButton btnHis600;
	private JButton btnHis800;
	private JButton btnHis1000;
	private JButton btnPro200;
	private JButton button;
	private JButton btnPro600;
	private JButton btnPro800;
	private JButton btnPro1000;
	private JButton btnFru200;
	private JButton btnFru400;
	private JButton btnFru600;
	private JButton btnFru800;
	private JButton btnFru1000;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		//PlayAudio.play("Jeapordy Music.wav");
		
		JLabel lblScore = new JLabel("");
		GridBagConstraints gbc_lblScore = new GridBagConstraints();
		gbc_lblScore.insets = new Insets(0, 0, 0, 5);
		gbc_lblScore.gridx = 11;
		gbc_lblScore.gridy = 13;
		contentPane.add(lblScore, gbc_lblScore);
		
		
		JLabel lblVideoGames = new JLabel("           Video Games           ");
		GridBagConstraints gbc_lblVideoGames = new GridBagConstraints();
		gbc_lblVideoGames.insets = new Insets(0, 0, 5, 5);
		gbc_lblVideoGames.gridx = 2;
		gbc_lblVideoGames.gridy = 0;
		contentPane.add(lblVideoGames, gbc_lblVideoGames);
		
		JLabel lblGeography = new JLabel("Geography           ");
		GridBagConstraints gbc_lblGeography = new GridBagConstraints();
		gbc_lblGeography.insets = new Insets(0, 0, 5, 5);
		gbc_lblGeography.gridx = 5;
		gbc_lblGeography.gridy = 0;
		contentPane.add(lblGeography, gbc_lblGeography);
		
		JLabel lblHistroy = new JLabel("History           ");
		GridBagConstraints gbc_lblHistroy = new GridBagConstraints();
		gbc_lblHistroy.insets = new Insets(0, 0, 5, 5);
		gbc_lblHistroy.gridx = 8;
		gbc_lblHistroy.gridy = 0;
		contentPane.add(lblHistroy, gbc_lblHistroy);
		
		JLabel lblProgrammingTerms = new JLabel("Programming Terms           ");
		GridBagConstraints gbc_lblProgrammingTerms = new GridBagConstraints();
		gbc_lblProgrammingTerms.insets = new Insets(0, 0, 5, 5);
		gbc_lblProgrammingTerms.gridx = 11;
		gbc_lblProgrammingTerms.gridy = 0;
		contentPane.add(lblProgrammingTerms, gbc_lblProgrammingTerms);
		
		JLabel lblFruits = new JLabel("Fruits");
		GridBagConstraints gbc_lblFruits = new GridBagConstraints();
		gbc_lblFruits.insets = new Insets(0, 0, 5, 0);
		gbc_lblFruits.gridx = 14;
		gbc_lblFruits.gridy = 0;
		contentPane.add(lblFruits, gbc_lblFruits);
		
		btnVid200 = new JButton("200");
		btnVid200.setBackground(Color.MAGENTA);
		btnVid200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		           String btnVid200 = JOptionPane.showInputDialog
		        	("Who is the main villan in the Super Mario Bros games?", null); {
		        		if (btnVid200.equals("Bowser")) {
		        			score += 200;
		        			lblScore.setText("Score: " + score);
		        			contentPane.remove(MainScreen.this.btnVid200);
		        			repaint();	
		        			PlayAudio.play("Correct.wav");
		        		}
		        		else {
		        			contentPane.remove(MainScreen.this.btnVid200);
		        			repaint();
		        			PlayAudio.play("Incorrect Buzzer.wav");
		        		}
		        				
		        	}
			}
		}
			
		);
		GridBagConstraints gbc_btnVid200 = new GridBagConstraints();
		gbc_btnVid200.insets = new Insets(0, 0, 5, 5);
		gbc_btnVid200.gridx = 2;
		gbc_btnVid200.gridy = 1;
		contentPane.add(btnVid200, gbc_btnVid200);
		
		btnGeo200 = new JButton("200");
		btnGeo200.setBackground(Color.PINK);
		btnGeo200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String btnGeo200 = JOptionPane.showInputDialog
				        	("What country is north of the United States?", null); {
				        		if (btnGeo200.equals("Canada")) {
				        			score += 200;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnGeo200);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnGeo200);
				        			repaint();
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_btnGeo200 = new GridBagConstraints();
		gbc_btnGeo200.insets = new Insets(0, 0, 5, 5);
		gbc_btnGeo200.gridx = 5;
		gbc_btnGeo200.gridy = 1;
		contentPane.add(btnGeo200, gbc_btnGeo200);
		
		btnHis200 = new JButton("200");
		btnHis200.setBackground(Color.GREEN);
		btnHis200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String btnHis200 = JOptionPane.showInputDialog
				        	("Who was the first president of the United States?", null); {
				        		if (btnHis200.equals("George Washington")) {
				        			score += 200;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnHis200);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");	
				        			
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnHis200);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_btnHis200 = new GridBagConstraints();
		gbc_btnHis200.insets = new Insets(0, 0, 5, 5);
		gbc_btnHis200.gridx = 8;
		gbc_btnHis200.gridy = 1;
		contentPane.add(btnHis200, gbc_btnHis200);
		
		btnPro200 = new JButton("200");
		btnPro200.setBackground(Color.CYAN);
		btnPro200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String btnPro200 = JOptionPane.showInputDialog
				        	("This is used to create a \"blueprint\" or template of what an object in a program can store as information and actions that it can perform", null); {
				        		if (btnPro200.equals("Class")) {
				        			score += 200;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnPro200);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnPro200);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_btnPro200 = new GridBagConstraints();
		gbc_btnPro200.insets = new Insets(0, 0, 5, 5);
		gbc_btnPro200.gridx = 11;
		gbc_btnPro200.gridy = 1;
		contentPane.add(btnPro200, gbc_btnPro200);
		
		btnFru200 = new JButton("200");
		btnFru200.setBackground(Color.ORANGE);
		btnFru200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String btnFru200 = JOptionPane.showInputDialog
				        	("This common fruit is round, red, and has the same name as a technology company.", null); {
				        		if (btnFru200.equals("Apple")) {
				        			score += 200;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnFru200);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnFru200);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_btnFru200 = new GridBagConstraints();
		gbc_btnFru200.insets = new Insets(0, 0, 5, 0);
		gbc_btnFru200.gridx = 14;
		gbc_btnFru200.gridy = 1;
		contentPane.add(btnFru200, gbc_btnFru200);
		
		btnVid400 = new JButton("400");
		btnVid400.setBackground(Color.MAGENTA);
		btnVid400.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String btnVid400 = JOptionPane.showInputDialog
				        	("Who wears fully green armor and defeats the coventant, flood, and other aliens?", null); {
				        		if (btnVid400.equals("Master Chief")) {
				        			score += 400;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnVid400);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnVid400);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
		}}});
		
		GridBagConstraints gbc_btnVid400 = new GridBagConstraints();
		gbc_btnVid400.insets = new Insets(0, 0, 5, 5);
		gbc_btnVid400.gridx = 2;
		gbc_btnVid400.gridy = 2;
		contentPane.add(btnVid400, gbc_btnVid400);
		
		btnVid600 = new JButton("600\r\n");
		btnVid600.setBackground(Color.MAGENTA);
		btnVid600.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String btnVid600 = JOptionPane.showInputDialog
				        	("What Call of Duty game was released in 2010?", null); {
				        		if (btnVid600.equals("Black Ops")) {
				        			score += 600;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnVid600);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnVid600);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
		}}});
		
		btnGeo400 = new JButton("400");
		btnGeo400.setBackground(Color.PINK);
		btnGeo400.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String btnGeo400 = JOptionPane.showInputDialog
				        	("Beverly Hills in located is a suburb of what US city?", null); {
				        		if (btnGeo400.equals("Los Angeles")) {
				        			score += 400;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnGeo400);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnGeo400);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_btnGeo400 = new GridBagConstraints();
		gbc_btnGeo400.insets = new Insets(0, 0, 5, 5);
		gbc_btnGeo400.gridx = 5;
		gbc_btnGeo400.gridy = 2;
		contentPane.add(btnGeo400, gbc_btnGeo400);
		
		btnHis400_1 = new JButton("400\r\n");
		btnHis400_1.setBackground(Color.GREEN);
		btnHis400_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					 String btnHis400 = JOptionPane.showInputDialog
					        	("In what year did World War 2 end?", null); {
					        		if (btnHis400.equals("1945")) {
					        			score += 400;
					        			lblScore.setText("Score: " + score);
					        			contentPane.remove(MainScreen.this.btnHis400_1);
					        			repaint();	
					        			PlayAudio.play("Correct.wav");	
					        			
					        		}
					        		else {
					        			contentPane.remove(MainScreen.this.btnHis400_1);
					        			repaint();	
					        			PlayAudio.play("Incorrect Buzzer.wav");
				}
				}
			}
		});
		GridBagConstraints gbc_btnHis400_1 = new GridBagConstraints();
		gbc_btnHis400_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnHis400_1.gridx = 8;
		gbc_btnHis400_1.gridy = 2;
		contentPane.add(btnHis400_1, gbc_btnHis400_1);
		
		button = new JButton("400");
		button.setBackground(Color.CYAN);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String button = JOptionPane.showInputDialog
				        	("This term loads in existing code that can be referenced and used within a class definition.", null); {
				        		if (button.equals("Import")) {
				        			score += 400;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.button);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.button);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 11;
		gbc_button.gridy = 2;
		contentPane.add(button, gbc_button);
		
		btnFru400 = new JButton("400");
		btnFru400.setBackground(new Color(255, 200, 0));
		btnFru400.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String btnFru400 = JOptionPane.showInputDialog
				        	("What does a fruit have that a vegetable does not.", null); {
				        		if (btnFru400.equals("Seeds")) {
				        			score += 400;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnFru400);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnFru400);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_btnFru400 = new GridBagConstraints();
		gbc_btnFru400.insets = new Insets(0, 0, 5, 0);
		gbc_btnFru400.gridx = 14;
		gbc_btnFru400.gridy = 2;
		contentPane.add(btnFru400, gbc_btnFru400);
		GridBagConstraints gbc_btnVid600 = new GridBagConstraints();
		gbc_btnVid600.insets = new Insets(0, 0, 5, 5);
		gbc_btnVid600.gridx = 2;
		gbc_btnVid600.gridy = 3;
		contentPane.add(btnVid600, gbc_btnVid600);
		
		btnGeo600 = new JButton("600");
		btnGeo600.setBackground(Color.PINK);
		btnGeo600.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String btnGeo600 = JOptionPane.showInputDialog
				        	("What is the largest island in the world?", null); {
				        		if (btnGeo600.equals("Greenland")) {
				        			score += 600;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnGeo600);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnVid600);
				        			
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_btnGeo600 = new GridBagConstraints();
		gbc_btnGeo600.insets = new Insets(0, 0, 5, 5);
		gbc_btnGeo600.gridx = 5;
		gbc_btnGeo600.gridy = 3;
		contentPane.add(btnGeo600, gbc_btnGeo600);
		
		btnHis600 = new JButton("600");
		btnHis600.setBackground(Color.GREEN);
		btnHis600.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					 String btnHis600 = JOptionPane.showInputDialog
					        	("In 1492, this man sailed the ocean blue.", null); {
					        		if (btnHis600.equals("Christopher Columbus")) {
					        			score += 600;
					        			lblScore.setText("Score: " + score);
					        			contentPane.remove(MainScreen.this.btnHis600);
					        			repaint();	
					        			PlayAudio.play("Correct.wav");	
					        			
					        		}
					        		else {
					        			contentPane.remove(MainScreen.this.btnHis600);
					        			repaint();	
					        			PlayAudio.play("Incorrect Buzzer.wav");
				}
				}
			}
		});
		GridBagConstraints gbc_btnHis600 = new GridBagConstraints();
		gbc_btnHis600.insets = new Insets(0, 0, 5, 5);
		gbc_btnHis600.gridx = 8;
		gbc_btnHis600.gridy = 3;
		contentPane.add(btnHis600, gbc_btnHis600);
		
		btnPro600 = new JButton("600");
		btnPro600.setBackground(new Color(0, 255, 255));
		btnPro600.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						 String btnPro600 = JOptionPane.showInputDialog
						        	("Stores a 32 bit decimal number", null); {
						        		if (btnPro600.equals("Float")) {
						        			score += 600;
						        			lblScore.setText("Score: " + score);
						        			contentPane.remove(MainScreen.this.btnPro600);
						        			repaint();	
						        			PlayAudio.play("Correct.wav");
						        		}
						        		else {
						        			contentPane.remove(MainScreen.this.btnPro600);
						        			repaint();	
						        			PlayAudio.play("Incorrect Buzzer.wav");
					}
					}
				}});
		GridBagConstraints gbc_btnPro600 = new GridBagConstraints();
		gbc_btnPro600.insets = new Insets(0, 0, 5, 5);
		gbc_btnPro600.gridx = 11;
		gbc_btnPro600.gridy = 3;
		contentPane.add(btnPro600, gbc_btnPro600);
		btnFru600 = new JButton("600");
		btnFru600.setBackground(Color.ORANGE);
		btnFru600.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String btnFru600 = JOptionPane.showInputDialog
				        	("This is the world's most popular fruit.", null); {
				        		if (btnFru600.equals("Tomato")) {
				        			score += 600;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnFru600);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnFru600);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_btnFru600 = new GridBagConstraints();
		gbc_btnFru600.insets = new Insets(0, 0, 5, 0);
		gbc_btnFru600.gridx = 14;
		gbc_btnFru600.gridy = 3;
		contentPane.add(btnFru600, gbc_btnFru600);
		
		btnVid800 = new JButton("800");
		btnVid800.setBackground(Color.MAGENTA);
		btnVid800.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String btnVid800 = JOptionPane.showInputDialog
				        	("What is the name of the horse Link rides in Ocarina of Time?", null); {
				        		if (btnVid800.equals("Epona")) {
				        			score += 800;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnVid800);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnVid800);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
		}}});
		GridBagConstraints gbc_btnVid800 = new GridBagConstraints();
		gbc_btnVid800.insets = new Insets(0, 0, 5, 5);
		gbc_btnVid800.gridx = 2;
		gbc_btnVid800.gridy = 4;
		contentPane.add(btnVid800, gbc_btnVid800);
		
		
		btnGeo800 = new JButton("800");
		btnGeo800.setBackground(Color.PINK);
		btnGeo800.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String btnGeo800 = JOptionPane.showInputDialog
				        	("The Taj Mahal is located in what Indian city?", null); {
				        		if (btnGeo800.equals("Agra")) {
				        			score += 800;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnGeo800);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnGeo800);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_btnGeo800 = new GridBagConstraints();
		gbc_btnGeo800.insets = new Insets(0, 0, 5, 5);
		gbc_btnGeo800.gridx = 5;
		gbc_btnGeo800.gridy = 4;
		contentPane.add(btnGeo800, gbc_btnGeo800);
		
		btnHis800 = new JButton("800");
		btnHis800.setBackground(Color.GREEN);
		btnHis800.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String btnHis800 = JOptionPane.showInputDialog
				        	("What country did Germany invade to begin WW2?", null); {
				        		if (btnHis800.equals("Poland")) {
				        			score += 800;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnHis800);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");	
				        			
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnHis800);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_btnHis800 = new GridBagConstraints();
		gbc_btnHis800.insets = new Insets(0, 0, 5, 5);
		gbc_btnHis800.gridx = 8;
		gbc_btnHis800.gridy = 4;
		contentPane.add(btnHis800, gbc_btnHis800);
		
		btnPro800 = new JButton("800");
		btnPro800.setBackground(Color.CYAN);
		btnPro800.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String btnPro800 = JOptionPane.showInputDialog
				        	("Exposes or hides parts of a class definition from other classes, examples include public, private, and protected", null); {
				        		if (btnPro800.equals("Access Modifier")) {
				        			score += 800;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnPro800);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnPro800);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_btnPro800 = new GridBagConstraints();
		gbc_btnPro800.insets = new Insets(0, 0, 5, 5);
		gbc_btnPro800.gridx = 11;
		gbc_btnPro800.gridy = 4;
		contentPane.add(btnPro800, gbc_btnPro800);
		
		btnFru800 = new JButton("800");
		btnFru800.setBackground(Color.ORANGE);
		btnFru800.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String btnFru800 = JOptionPane.showInputDialog
				        	("What fruit is an Orangutan's favorite?", null); {
				        		if (btnFru800.equals("Mango")) {
				        			score += 800;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnFru800);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnFru800);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_btnFru800 = new GridBagConstraints();
		gbc_btnFru800.insets = new Insets(0, 0, 5, 0);
		gbc_btnFru800.gridx = 14;
		gbc_btnFru800.gridy = 4;
		contentPane.add(btnFru800, gbc_btnFru800);
		
		btnVid1000 = new JButton("1000");
		btnVid1000.setBackground(Color.MAGENTA);
		btnVid1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String btnVid1000 = JOptionPane.showInputDialog
				        	("In Counter Strike: Global Offensive, which grenade can you purchase two of?", null); {
				        		if (btnVid1000.equals("Flashbang")) {
				        			score += 1000;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnVid1000);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnVid1000);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
				        		}	
				        	}
		}
	});
		GridBagConstraints gbc_btnVid1000 = new GridBagConstraints();
		gbc_btnVid1000.insets = new Insets(0, 0, 5, 5);
		gbc_btnVid1000.gridx = 2;
		gbc_btnVid1000.gridy = 5;
		contentPane.add(btnVid1000, gbc_btnVid1000);
		
		
		btnGeo1000 = new JButton("1000");
		btnGeo1000.setBackground(Color.PINK);
		btnGeo1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String btnGeo1000 = JOptionPane.showInputDialog
				        	("The ruins of the ancient city of Pompeii are near what volcano?", null); {
				        		if (btnGeo1000.equals("Mount Vesuvius")) {
				        			score += 1000;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnGeo1000);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnGeo1000);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_btnGeo1000 = new GridBagConstraints();
		gbc_btnGeo1000.insets = new Insets(0, 0, 5, 5);
		gbc_btnGeo1000.gridx = 5;
		gbc_btnGeo1000.gridy = 5;
		contentPane.add(btnGeo1000, gbc_btnGeo1000);
		
		btnHis1000 = new JButton("1000");
		btnHis1000.setBackground(Color.GREEN);
		btnHis1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String btnHis1000 = JOptionPane.showInputDialog
				        	("Who was the first US president to declare war?", null); {
				        		if (btnHis1000.equals("James Madison")) {
				        			score += 1000;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnHis1000);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");	
				        			
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnHis1000);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
			}
		});
		GridBagConstraints gbc_btnHis1000 = new GridBagConstraints();
		gbc_btnHis1000.insets = new Insets(0, 0, 5, 5);
		gbc_btnHis1000.gridx = 8;
		gbc_btnHis1000.gridy = 5;
		contentPane.add(btnHis1000, gbc_btnHis1000);
		
		btnPro1000 = new JButton("1000");
		btnPro1000.setBackground(Color.CYAN);
		btnPro1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String btnPro1000 = JOptionPane.showInputDialog
				        	("Stores a 16 bit value from -32768 to 32767", null); {
				        		if (btnPro1000.equals("Short")) {
				        			score += 1000;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnPro1000);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnPro1000);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_btnPro1000 = new GridBagConstraints();
		gbc_btnPro1000.insets = new Insets(0, 0, 5, 5);
		gbc_btnPro1000.gridx = 11;
		gbc_btnPro1000.gridy = 5;
		contentPane.add(btnPro1000, gbc_btnPro1000);
		
		btnFru1000 = new JButton("1000");
		btnFru1000.setBackground(Color.ORANGE);
		btnFru1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String btnFru1000 = JOptionPane.showInputDialog
				        	("What is official name for the study of fruits? ", null); {
				        		if (btnPro200.equals("Pomology")) {
				        			score += 1000;
				        			lblScore.setText("Score: " + score);
				        			contentPane.remove(MainScreen.this.btnFru1000);
				        			repaint();	
				        			PlayAudio.play("Correct.wav");
				        		}
				        		else {
				        			contentPane.remove(MainScreen.this.btnFru1000);
				        			repaint();	
				        			PlayAudio.play("Incorrect Buzzer.wav");
			}
			}
		}});
		GridBagConstraints gbc_btnFru1000 = new GridBagConstraints();
		gbc_btnFru1000.insets = new Insets(0, 0, 5, 0);
		gbc_btnFru1000.gridx = 14;
		gbc_btnFru1000.gridy = 5;
		contentPane.add(btnFru1000, gbc_btnFru1000);
		

		
	}

}
