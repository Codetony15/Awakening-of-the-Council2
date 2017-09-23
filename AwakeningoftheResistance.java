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

import javax.swing.JComponent;
import javax.swing.JFrame;

public class AwakeningoftheResistance extends JComponent implements MouseListener {
	public static int lvl = 1; 
	public static int xpneed = (lvl * 100);
	public static int xp = 0; 
	public static int healthlim = 10;
	public static int health = 10;
	public static int atk = 1; 
	public static int def = 1; 
	public static int spd = 10; 
	public static int missionno = 0; 
	public static int mgsanitylvl = 100;
	public static int playersanitylvl = 100; 
	public static int meleelvl = 1;
	public static int gunlvl = 1;
	public static int exolvl = 1; 
	public static int choiceno = 0; 
	public static int choice = 0;
	public static int checkpoint = 0; 
    
	 public static int screen = 1; 
	public static int clicked = 1; 
	public static int state = 1; 
	public static int text = 1; 
	
	public static String nameOfApp = "Awakening of the Resistance";
	
	
	public void data() throws IOException{
		boolean exists = false;
	
	//following code is for saving data, all will get saved in a file on the system, labeled as "Savedata.txt"
	File tmpDir = new File("H:/Comp Sci A/apcsa");
	 exists = tmpDir.exists();

	if (exists = false){
	    PrintWriter writer = new PrintWriter("savedata.txt", "UTF-8");
	    writer.println(lvl);
	    writer.println(xpneed);
	    writer.println(xp);
	    writer.println(atk);
	    writer.println(def);
	    writer.println(spd);
	    writer.println(missionno);
	    writer.println(mgsanitylvl);
	    writer.println(playersanitylvl);
	    writer.println(meleelvl);
	    writer.println(gunlvl);
	    writer.println(exolvl);
	    writer.close();}
	else if (exists = true){

	String tlvl = Files.readAllLines(Paths.get("savedata.txt")).get(1);
	String txpneed = Files.readAllLines(Paths.get("savedata.txt")).get(2);
	String txp = Files.readAllLines(Paths.get("savedata.txt")).get(3);
	String tatk = Files.readAllLines(Paths.get("savedata.txt")).get(4);
	String tdef = Files.readAllLines(Paths.get("savedata.txt")).get(5);
	String tspd = Files.readAllLines(Paths.get("savedata.txt")).get(6);
	String tmissionno = Files.readAllLines(Paths.get("savedata.txt")).get(7);
	String tmgsanitylvl = Files.readAllLines(Paths.get("savedata.txt")).get(8);
	String tplayersanitylvl = Files.readAllLines(Paths.get("savedata.txt")).get(9);
	String tmeleelvl = Files.readAllLines(Paths.get("savedata.txt")).get(10);
	String tgunlvl = Files.readAllLines(Paths.get("savedata.txt")).get(11);


	 lvl = Integer.parseInt(tlvl);

	 xp = Integer.parseInt(txp);
	atk = Integer.parseInt(tatk);
	def = Integer.parseInt(tdef); 
	spd = Integer.parseInt(tspd);
	missionno = Integer.parseInt(tmissionno); 
	mgsanitylvl = Integer.parseInt(tmgsanitylvl); 
	playersanitylvl = Integer.parseInt(tplayersanitylvl); 
	meleelvl = Integer.parseInt(tmeleelvl); 
	gunlvl = Integer.parseInt(tgunlvl); }
		
	}
	public AwakeningoftheResistance() {
		addMouseListener(this);
	}
	
	public void paint(Graphics g) {
		if (checkpoint == 0) {
			if (choice == 0) {
				TheRoom(g); 
			}else if (choice == 1) {
				precmdcena(g);
			}else if (choice == 2) {
				colddarkdeath(g); 
			}
		}else if (checkpoint == 1) {
			if (choice == 0) {
				precmdcena(g);
			}else if (choice == 1) {
				precmdcen(g);
			} else if (choice == 2) {
				coldheartedbastard();
			}
		}
		
	    
		
		
		}
		public void coldheartedbastard() {
		
		
	}
		public void checkpointclear() {
			screen = 1; 
			checkpoint++;
		}
		public void colddarkdeath(Graphics g) {
			
		
	}
		public void precmdcen(Graphics g) {
			choiceno = 1; 
			state = 1; 
			checkpoint++;
			
			 
			g.setColor(Color.white);
			g.fillRect(20, 30, 300, 400);
			
				g.fillRect(375, 375, 150, 50);
				
			g.setColor(Color.black);
			if (text == 1) {
			g.drawString("347 opens the door, blinding light floods the room", 25, 50); }
			else if (text == 2) {
			g.drawString("347 steps into the light ", 25, 65);
			}
			else if (text == 3) {
			g.drawString("He steps into a large room, surrounded by windows", 25, 80);}
			else if (text == 4) {
			g.drawString("347: What the f*$# happened last night?!", 25, 95);}
			else if (text == 5) {
			g.drawString("???: Good, you're up.", 25, 110);}
			else if (text == 6) {
			g.drawString("The feminine voice echoed through a dark hallway,", 25, 125);}
			else if (text == 7) {
			g.drawString("347 turned to face it", 25, 140);}
			else if (text == 8) {
			g.drawString("???: I was starting to worry, ", 25, 155);}
			else if (text == 9) {
			g.drawString("I thought I used too many roofies. Glad I didn't!", 25, 170);}
			else if (text == 10) {
				g.drawString("347: Roofies?", 25, 185);
			} else if (text == 11) {
				g.drawString("347: Step out of the hallway. ", 25, 200);
			}else if (text == 12) {
				g.drawString("A petite feminine figure steped out of the hallway.", 25, 215);
			}else if (text == 13) {
				g.drawString("Her brown hair glistened in the light,", 25, 230);
			}else if (text == 14) {
				g.drawString("Sporting a tank-top and ripped jeans.", 25, 245 );
			}else if (text == 15) {
				g.drawString("???: Yeah, Roofies. Sorry about that.", 25, 260);
			} else if (text == 16) {
				g.drawString("I couldn't think of any other way to get you here. ", 25, 275);
			} else if (text == 17) {
				g.drawString("347 stares at her,", 25, 290);
			} else if (text == 18) {
				g.drawString("347: I could think of several different ways. ", 25, 305);	
			}
			else if (text == 19) {
				g.drawString("???: Ew.", 25, 320);
			} else if (text == 20) {
				g.drawString("347: Anyway, what do you want with me?", 25, 335);
			}else if (text == 21) {
				g.drawString("???: Right! Anyway,", 25, 350);
			
			} else if (text == 22) {
				g.drawString("my name's Calla. ", 25, 365);
			} else if (text == 23) {
				g.drawString("My sister was kidnapped a few weeks ago.", 25, 380);
			} else if (text == 24) {
				g.drawString("The people who kidnapped her...", 25, 395);
			} else if (text == 25) {
				g.drawString("They're incredibly powerful.", 25, 410);
			} else if (text == 26) {
				g.drawString("I need your help.", 25, 425);
			} else if (text == 27) {
				g.drawString("Will you help me?", 25, 50);
				choiceno = 2; 
				checkchoice(g); 
				g.setColor(Color.black);
				g.drawString("Leave Her", 380, 395);
		    	g.drawString("Help Her", 580, 395);
		    	state = 2;
			}
		
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
	public void TheRoom(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(20, 30, 300, 400);
		
		
			g.fillRect(375, 375, 150, 50);
		
		g.setColor(Color.black);
		if (text == 1) {
		g.drawString("347: Urk...", 25, 50);}else
		
		if (text == 2){
		
		g.drawString("347: W-Where am I?", 25, 65);}else if(text == 3){
			
		
		
			
		
		g.drawString("347 sits up, Noticing the darkness around him.", 25, 80);}
		else if (text == 4){
		g.drawString("347: What the h*## happened last night?", 25, 95);}
		else if (text == 5){
		g.drawString("347 stares at the only door in the room.", 25, 110);}
		else if (text == 6){
		g.drawString("347: Only one place to go...", 25, 125);
	    choiceno = 2;
	    checkchoice(g);
	    g.setColor(Color.black);
	    	g.drawString("Leave the Room", 380, 395);
	    	g.drawString("Stay in the room", 580, 395);
	    	state = 2; }
	    
	    	
		
	    	
	    }
	    
		
		
		
		
		
	
	public void precmdcena(Graphics g){
		choiceno = 1; 
		
		state = 1; 
		checkpoint++;
		choice = 0; 
		
		 
		g.setColor(Color.white);
		g.fillRect(20, 30, 300, 400);
		
			g.fillRect(375, 375, 150, 50);
			
		g.setColor(Color.black);
		if (text == 1) {
		g.drawString("347 opens the door, blinding light floods the room", 25, 50); }
		else if (text == 2) {
		g.drawString("347 steps into the light ", 25, 65);
		}
		else if (text == 3) {
		g.drawString("He steps into a large room, surrounded by windows", 25, 80);}
		else if (text == 4) {
		g.drawString("347: What the f*$# happened last night?!", 25, 95);}
		else if (text == 5) {
		g.drawString("???: Good, you're up.", 25, 110);}
		else if (text == 6) {
		g.drawString("The feminine voice echoed through a dark hallway,", 25, 125);}
		else if (text == 7) {
		g.drawString("347 turned to face it", 25, 140);}
		else if (text == 8) {
		g.drawString("???: I was starting to worry, ", 25, 155);}
		else if (text == 9) {
		g.drawString("I thought I used too many roofies. Glad I didn't!", 25, 170);}
		else if (text == 10) {
			g.drawString("347: Roofies?", 25, 185);
		} else if (text == 11) {
			g.drawString("347: Step out of the hallway. ", 25, 200);
		}else if (text == 12) {
			g.drawString("A petite feminine figure steped out of the hallway.", 25, 215);
		}else if (text == 13) {
			g.drawString("Her brown hair glistened in the light,", 25, 230);
		}else if (text == 14) {
			g.drawString("Sporting a tank-top and ripped jeans.", 25, 245 );
		}else if (text == 15) {
			g.drawString("???: Yeah, Roofies. Sorry about that.", 25, 260);
		} else if (text == 16) {
			g.drawString("I couldn't think of any other way to get you here. ", 25, 275);
		} else if (text == 17) {
			g.drawString("347 stares at her,", 25, 290);
		} else if (text == 18) {
			g.drawString("347: I could think of several different ways. ", 25, 305);	
		}
		else if (text == 19) {
			g.drawString("???: Ew.", 25, 320);
		} else if (text == 20) {
			g.drawString("347: Anyway, what do you want with me?", 25, 335);
		}else if (text == 21) {
			g.drawString("???: Right!", 25, 350);
		
		} else if (text == 22) {
			g.drawString("My name's Calla. ", 25, 365);
		} else if (text == 23) {
			g.drawString("My sister was kidnapped a few weeks ago.", 25, 380);
		} else if (text == 24) {
			g.drawString("The people who kidnapped her...", 25, 395);
		} else if (text == 25) {
			g.drawString("They're incredibly powerful.", 25, 410);
		} else if (text == 26) {
			g.drawString("I need your help.", 25, 425);
		} else if (text == 27) {
			g.drawString("Will you help me?", 25, 50);
			choiceno = 2; 
			checkchoice(g); 
			g.setColor(Color.black);
			g.drawString("Leave Her", 380, 395);
	    	g.drawString("Help Her", 580, 395);
	    	state = 2;
		}
		
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		int x = e.getX();
		int y = e.getY();
		
		if (x < 525 && x >374 && y <423 && y > 374){
			if (state == 1) {
			text++;
			
			}else if (state == 2) {
				
				state = 1;
				text = 1;
				choice = 1;
			}
			
		} if (state == 2) { if (x < 524 && x >375 && y <423 && y > 374){
			screen = screen + 2; 
			
		}else if (x < 524 && x >375 && y <325 && y > 275){
			screen = screen + 3; 
			
		}}
		repaint(); 
		
		System.out.println(state + " " + text);
		
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
		frame.add(new AwakeningoftheResistance());
		frame.setSize(800, 500);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		
	}

}