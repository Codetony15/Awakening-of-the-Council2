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

public class Awakeningofthecouncil extends JComponent implements MouseListener {
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
	public static boolean battle = false;
	 public static int screen = 1; 
	public static int clicked = 1; 
	public static int state = 1; 
	public static boolean clickable = false;
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
	public Awakeningofthecouncil() {
		addMouseListener(this);
	}
	
	public void paint(Graphics g) {
		if (screen == 1){
			TheRoom(g); }
		else if (screen == 2){
			precmdcen(g);
			}
		
	    
		
		
		}
		
		
	public void TheRoom(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(20, 30, 300, 400);
		if (choiceno == 1){
			g.fillRect(375, 375, 150, 50);
		}else if (choiceno == 2){
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
		
		g.setColor(Color.black);
		
		g.drawString("347: Urk...", 25, 50);
		
		
		
		g.drawString("347: W-Where am I?", 25, 65);
		
			
		
		g.drawString("347 sits up, Noticing the darkness around him.", 25, 80);
		
		g.drawString("347: What the h*## happened last night?", 25, 95);
		g.drawString("347 stares at the only door in the room.", 25, 110);
		g.drawString("347: Only one place to go...", 25, 125);
	    choiceno = 2;
	    
	    	g.drawString("Leave the Room", 380, 395);
	    	g.drawString("Stay in the room", 580, 395);
	    	clickable = true; 
	    
	    	
		
	    	
	    }
	    
		
		
		
		
		
	
	public void precmdcen(Graphics g){
		choiceno = 1; 
		g.setColor(Color.white);
		g.fillRect(20, 30, 300, 400);
		if (choiceno == 1){
			g.fillRect(375, 375, 150, 50);
		}else if (choiceno == 2){
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
		g.setColor(Color.black);
		g.drawString("347: Urk...", 25, 50); 
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (clickable = true){
		if (x < 525 && x >374 && y <423 && y > 374){
			screen++;
			repaint();
		}else if (x < 524 && x >375 && y <423 && y > 374){
			screen = screen + 2; 
		}else if (x < 524 && x >375 && y <325 && y > 275){
			screen = screen + 3; 
		}}
		System.out.println(x + " " + y);
		
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
		frame.add(new Awakeningofthecouncil());
		frame.setSize(800, 500);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		
	}

}
