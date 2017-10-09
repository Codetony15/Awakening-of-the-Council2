import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Quiz extends JComponent implements MouseListener {

	public static int choiceno = 0; 
	public static int choice = 0;
	public static int checkpoint = 0; 
	 public static Random rand = new Random();
	 public static int screen = 0;
	 public int fail = 0; 
	
	public int[] answers= new int[12] ;
	public static String nameOfApp = "Super Happy Fun Quiz!";
	
	
	
	public Quiz() {
		addMouseListener(this);
		
	}
	
	public void paint(Graphics g) {
		int ans = rand.nextInt(2) ;
		for(int i = 0; i < answers.length; i++){
			answers[i] = 0; /*GPAConditional is the constant conversion factor used to convert grades into GPA, ultimately defined by you*/ 
			}

		if (fail == 1) {
			checkpoint = 0; 
			screen = 0;
		}
			
		
		if (checkpoint == 0) {
			if (screen == 0) {
				q1(g); 
			}else if (screen == 1) {
				answers[1] = 0;
			
				q2(g);
			}else if (screen == 2) {
				if ( ans == 1) {
					answers[1] = 1;
				
					q2(g);
				}else {
				Wrong(g); }}
			
		}else if (checkpoint == 1) {
			if (screen == 0) {
				q2(g); 
			}else if (screen == 1) {
				answers[2] = 0;
			
				q3(g);
			}else if (screen == 2) {
				
				if ( ans == 1) {
					answers[2] = 1;
				
					q3(g);
				}else {
				Wrong(g); }}
		}else if (checkpoint == 2) {
			if (screen == 0) {
				q3(g); 
			}else if (screen == 1) {
				answers[3] = 0;
			
				q4(g);
			}else if (screen == 2) {
				if ( ans == 1) {
					answers[3] = 1;
				
					q4(g);
				}else {
				inferiorwaifu(g); }}
		}else if (checkpoint == 3) {
			if (screen == 0) {
				q4(g); 
			}else if (screen == 1) {
				answers[1] = 0;
			
				q5(g);
			}else if (screen == 2) {
				if ( ans == 1) {
					answers[1] = 1;
				
					q5(g);
				}else {
				Wrong(g); }}
			else if (checkpoint == 4) {
				if (screen == 0) {
					q5(g); 
				}else if (screen == 1) {
					
				
					if ( ans == 1) {
						answers[1] = 1;
					
						q6(g);
					}else {
					inferiorwaifu(g); }
				}else if (screen == 2) {
					answers [5] = 0; 
							q6(g); }}}
			else if (checkpoint == 5) {
				
			}
				System.out.print(ans);
			}
			
		
			
			 
		
			
		
		
	    
		
		
		
		private void q6(Graphics g) {
		// TODO Auto-generated method stub
		
	}

		private void q5(Graphics g) {
			choiceno = 1; 
			 
			checkpoint = 4;
			choice = 0;
			
			 
			g.setColor(Color.white);
			g.fillRect(20, 30, 300, 400);
			
				g.fillRect(375, 375, 150, 50);
				
			g.setColor(Color.black);
			
			g.drawString("Pearl or Marina? ", 25, 50); 
			choiceno = 2; 
			checkchoice(g); 
			g.setColor(Color.black);
			g.drawString("Pearl ", 380, 395);
	    	g.drawString("Marina", 580, 395);
		
	}

		private void inferiorwaifu(Graphics g) {
			fail = 1;
			g.setColor(Color.white);
			g.fillRect(20, 30, 300, 400);
			
				g.fillRect(375, 375, 150, 50);
				
			g.setColor(Color.black);
			g.drawString("Inferior Waifu", 25, 50); 
	}

		private void Wrong(Graphics g) {
			fail = 1;
			g.setColor(Color.white);
			g.fillRect(20, 30, 300, 400);
			
				g.fillRect(375, 375, 150, 50);
				
			g.setColor(Color.black);
			g.drawString("Wrong!", 25, 50); 
		
	}

		
		
		
		public void q3(Graphics g) {
			choiceno = 1; 
			 
			checkpoint = 2;
			choice = 0;
			
			 
			g.setColor(Color.white);
			g.fillRect(20, 30, 300, 400);
			
				g.fillRect(375, 375, 150, 50);
				
			g.setColor(Color.black);
			
			g.drawString("Callie or Marie? ", 25, 50); 
			choiceno = 2; 
			checkchoice(g); 
			g.setColor(Color.black);
			g.drawString("Callie ", 380, 395);
	    	g.drawString("Marie", 580, 395);
	    	
			
		
	}
		public void q4(Graphics g) {
			choiceno = 2;
			choice = 0;
			checkchoice(g); 
			checkpoint = 3;
			 
			g.setColor(Color.white);
			g.fillRect(20, 30, 300, 400);
			
				g.fillRect(375, 375, 150, 50);
				
			g.setColor(Color.black);
		
			g.drawString("Switch or PS4? ", 25, 50); 
			
			g.drawString("Switch", 380, 395);
	    	g.drawString("PS4", 580, 395);
			
			
			
			
		}
		public void checkchoice(Graphics g) {
			g.setColor(Color.white);
			 if (choiceno == 2){
					g.fillRect(375, 375, 150, 50);
					g.fillRect(575, 375, 150, 50);
					
				} else if (choiceno == 3){
					g.fillRect(375, 375, 150, 50);
					g.fillRect(575, 375, 150, 50);
					g.fillRect(375, 300, 150, 50);
					
				} else if (choiceno == 4){
					g.fillRect(375, 375, 150, 50);
					g.fillRect(575, 375, 150, 50);
					g.fillRect(375, 300, 150, 50);
					g.fillRect(575, 300, 150, 50);
				}
			return;
		}
	public void q1(Graphics g) {
		fail = 0; 
		g.setColor(Color.white);
		g.fillRect(20, 30, 300, 400);
		
		
			g.fillRect(375, 375, 150, 50);
		
		g.setColor(Color.black);

		g.drawString("Left or Right?", 25, 50);
		choiceno = 2; 
		checkchoice(g); 
		g.setColor(Color.black);
		g.drawString("Left", 380, 395);
    	g.drawString("Right", 580, 395);
    	
	
	    
	    	
		
	    	
	    }
	    
		
		
		
		
		
	
	public void q2(Graphics g){
		choiceno = 1; 
		
		
		checkpoint = 1;
		choice = 0; 
		
		 
		g.setColor(Color.white);
		g.fillRect(20, 30, 300, 400);
		
			g.fillRect(375, 375, 150, 50);
			
		g.setColor(Color.black);
		
		g.drawString("Up or down?", 25, 50); 
		
			choiceno = 2; 
			checkchoice(g); 
			g.setColor(Color.black);
			g.drawString("Down ", 380, 395);
	    	g.drawString("Up", 580, 395);
	    
		
		
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		
		
		 if(x < 524 && x >375 && y <423 && y > 374){
			screen = 1; 
			
		}else if (x > 574 && x <725 && y <423 && y > 374){
			screen = 2; 
			
		}
		
		repaint(); 
	
		System.out.println( x + " " + y);
	}
	

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(nameOfApp);
		frame.getDefaultCloseOperation();
		frame.add(new Quiz());
		frame.setSize(800, 500);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		
	}

}