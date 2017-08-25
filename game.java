import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class game
{


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
 








	public static void main (String[] args) throws IOException 
	{
//following code is for saving data, all will get saved in a file on the system, labeled as "Savedata.txt"
File tmpDir = new File("/var/savedata.txt");
boolean exists = tmpDir.exists();

if (exists = true){
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
else{

String tlvl = Files.readAllLines(Paths.get("savedata.txt")).get(1);
String txpneed = Files.readAllLines(Paths.get("savedata.txt)).get(2);
String txp = Files.readAllLines(Paths.get("savedata.txt")).get(3);
String tatk = Files.readAllLines(Paths.get("savedata.txt")).get(4);
String tdef = Files.readAllLines(Paths.get("savedata.txt")).get(5);
String tspd = Files.readAllLines(Paths.get("savedata.txt")).get(6);
String tmissionno = Files.readAllLines(Paths.get("savedata.txt")).get(7);
String tmgsanitylvl = Files.readAllLines(Paths.get("savedata.txt")).get(8);
String tplayersanitylvl = Files.readAllLines(Paths.get("savedata.txt")).get(9);
String tmeleelvl = Files.readAllLines(Paths.get("savedata.txt")).get(10);
String tgunlvl = Files.readAllLines(Paths.get("savedata.txt")).get(11);
String texolvl = Files.readAllLines(Paths.get("savedata.txt")).get(12);

 lvl = Integer.parseInt(tlvl);

 xp = Integer.parseInt(txp);
atk = Integer.parseInt(tatk);
def = Integer.parseInt(tdef); 
spd = Integer.parseInt(tspd);
missionno = Integer.parseInt(tmissionno); 
mgsanitylvl = Integer.parseInt(tmgsanitylvl); 
playersanitylvl = Integer.parseInt(tplayersanitylvl); 
meleelvl = Integer.parseInt(tmeleelvl); 
gunlvl = Integer.parseInt(tgunlvl); 
exolvl = Integer.parseInt(texolvl); }

mainmenu();

}



public static void error() {
System.out.println("This is an error handling message. I'll be scared if I see it.");

}


public static void mainmenu() throws FileNotFoundException, UnsupportedEncodingException {
//Main Menu code
Scanner in = new Scanner(System.in); 

System.out.println("Awakening of the Council");
System.out.println("Version #: 0.0.1");
System.out.println("NOT A PUBLIC DEMO. DO NOT DISTRIBUTE");
in.nextLine(); 
System.out.println("Main Menu");
in.nextLine();
int c1 = in.nextInt(); 
System.out.println("1. Play");
System.out.println("2. Options");
System.out.println("3. Quit");

if (c1 == 1){
//code for determining which mission to start the player in. 
if (missionno == 0){ 

mission0(); 

}else if (missionno >0){ 
commandcentral();}else{

System.out.println("This is a error handling message. I'll be scared if I see it.");
}
}else if (c1 == 2){
//options menu code. I'll put more here later. 
in.nextLine();
in.nextLine(); 
System.out.println("1. Save");
System.out.println("2. Return to main menu");
int c2 = in.nextInt();

if (c2 == 1) {
savedata1();

}else if (c2 == 2){
mainmenu();
}else{
	error();
}}}


public static void mission0(){ 

Scanner in = new Scanner(System.in);
//finally starting the game for the player


System.out.println("347: Urk...");
in.nextLine();
System.out.println("347: W-Where am I?");
in.nextLine();
System.out.println("347 sits up on a bed, noticing the dark room around him.");
in.nextLine();
System.out.println("347: What the hell happened last night?");
System.out.println("347 stares at the only door in the room");
in.nextLine();
System.out.println("347: *Sigh*");
in.nextLine(); 
System.out.println("347 stands up");
in.nextLine(); 
System.out.println("------------------------------------------------");
System.out.println("1.Step out the door");
System.out.println("2. Check Stats");
int c3 = in.nextInt(); 

if (c3 == 1){
in.nextLine(); 
System.out.println("347 opens the door, blinding light floods in the room");
in.nextLine(); 
System.out.println("347 steps into the light, He steps in front of a large window overlooking a forest");
in.nextLine(); 
System.out.println("347: What the fuck happened last night?!");
in.nextLine();
System.out.println("???: Good, You're up."); 
System.out.println("347 turns around, and stares at the shadow in the hallway.");
in.nextLine();
System.out.println("???: I was starting to worry I used too many roofies. Glad I didn't!");
System.out.println("347: Roofies?"); 
in.nextLine();
System.out.println("???: Yeah, how else was I supposed to get you here?");
in.nextLine(); 
System.out.println("347: ... Step into the light.");
in.nextLine(); 
System.out.println("The shadowy figure steps out, her obsidian hair in the sunlight, Her clothing plain. just a simple tank-top and loose fitting jeans."); 
in.nextLine(); 

System.out.println("347: Seriously? You couldn't think of any other way to get me to your house?");
in.nextLine(); 
System.out.println("???: What do you mean?");
System.out.println("347: Have you looked in a mirror recently? All you had to do was whisper in my ear *I want your dick~!* That's it!"); 
in.nextLine(); 
System.out.println("???: Oh! I didn't think of that! That would've saved me 20$...");
in.nextLine();
System.out.println("...");
in.nextLine(); 
System.out.println("347: 20 DOLLARS?! WHAT ABOUT ME?!"); 
System.out.println("??? Oh! Right, I forgot. The reason why I brought you here in the first place."); 
in.nextLine(); 
System.out.println("???: My name's Calla, 3 weeks ago, someone close to me was kidnapped. I know who took her, but their incredibly powerful,"); 
System.out.println("and I can't take them alone, So I went looking. When I saw you wandering aimlessly around the bar, I knew you were the one."); 
in.nextLine();
System.out.println("347: So you need me to help you get this person back.");
System.out.println("Calla: Yep~!"); 
in.nextLine();
System.out.println("Calla: Will you help me?"); 
in.nextLine(); 
System.out.println("------------------------------------------------");
System.out.println("1. Sure, I fucking hate injustice.");
System.out.println("2. ...NO! You ROOFIED ME.");

int c4 = in.nextInt(); 
 if (c4 == 1){
in.nextLine(); 
System.out.println("347: Sure, I fucking hate injustice.");
System.out.println("Calla: *Gasp* Really?! A-Awesome! I have all the stuff you need, let's suit you up!");
in.nextLine();
System.out.println("Calla pulls you into another room, and hands you several pieces of equipment.");
System.out.println("Calla: Put it on! Put it on!");
System.out.println("347 steps into the room");
in.nextLine(); 
System.out.println("...");
in.nextLine();
System.out.println("347 steps out, wearing a rusty exoskeleton, with a small pistol in hand.");
System.out.println("347: This thing's all rusty! Where did you get it?");
in.nextLine(); 
System.out.println("Calla: Somewheeere... But you look fine in it! That was one of the finest exoskeletons back in it's day!");
System.out.println("347: Exactly. (In It's day). Not now!");
in.nextLine(); 
System.out.println("Calla:Whatever! Now c'mon, there's something else I need to show you.");
System.out.println("Calla runs back into the main room, 347 follows behind her");
in.nextLine(); 
System.out.println("Calla: 347,");
System.out.println("Calla pulls a switch");
in.nextLine();
System.out.println("Calla: Welcome to the Resistance.");
System.out.println("Panels and doors open to reveal monitors, maps and computer screens");
in.nextLine(); 
System.out.println("347 stands in awe, all the computer screens glow to life,");
System.out.println("347: What is this place?");
in.nextLine();
System.out.println("Calla: This is command central. The home to all our future operations. There's TONS of cool stuff here, Try playing around!");
System.out.println("Calla: Let me know when your ready for your first mission");
missionno = 1;

commandcentral(); 
}else if (c4 == 2){

System.out.println("347:...NO! You ROOFIED ME! Later bitch!");
System.out.println("347 walks out the door."); 
in.nextLine(); 

System.out.println("Cogratulations! You got the Who do you take me for? ending! There are xx more to find!");
System.out.println("Please restart the program to keep playing.");}else{
error();}}

}







public static void savedata1() throws FileNotFoundException, UnsupportedEncodingException {
	PrintWriter writer = new PrintWriter("savedata.txt", "UTF-8");
   Scanner in = new Scanner(System.in);
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
    writer.close();
System.out.println("Save completed. Returning to main menu");
in.nextInt();
mainmenu();
}

public static int savedata throws IOEexception; {
	PrintWriter writer = new PrintWriter("savedata.txt", "UTF-8");
    Scanner in = new Scanner(System.in);
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
    writer.close();
System.out.println("Save completed. Returning to Command Central.");
in.nextInt();
commandcentral();
}


public static int commandcentral(){
//command central. The hub of the game. 
	Scanner in = new Scanner(System.in);
System.out.println("------------------------------------------------");
System.out.println("Welcome to Command Central");

System.out.println("1.Talk to Calla");
System.out.println("2.Check Mission log");
System.out.println("3.Check collected intelligence");
System.out.println("4.Check Stats");
System.out.println("5.Check Inventory");
int c7 = in.nextInt(); 
if (c7 == 1){

System.out.println("Calla: Ready to go?");
System.out.println("------------------------------------------------");
System.out.println("1. Yes");
System.out.println("2. No"); 
int c8 = in.nextInt();
if (c8 == 1){
if (missionno == 1){
mission1();
}else{
error();}
}else if (c8 == 2){
System.out.println("Calla: Okay! Let me know when you are ready to go!");
in.nextLine(); 
commandcentral(); 
}else{
error();}
}else if(c7 == 2){
System.out.println("Checking mission log...");
if (missionno == 1){
System.out.println("Nothing. You haven't been on any missions.");
in.nextLine(); 
System.out.println("Returning to Command Central");
commandcentral();}
}else if (c7 == 3){
System.out.println("Checking collected intelligence");
in.nextLine();
if (missionno == 1){

System.out.println("No intel. I should go on a mission to find some.");}
System.out.println("Returning to Command Central");
in.nextLine(); 
commandcentral();}
}else if (c7 == 4){
System.out.println("Checking stats");
in.nextLine();
System.out.println("My Level is: " +lvl);
in.nextLine();
    System.out.println("I have " +xp +" xp. I need "+xpneed+" xp to level up.");
in.nextLine
    System.out.println("My Attack power is: "+atk);
in.nextLine();
    System.out.println("My Defence is: " +def);
in.nextLine();
    System.out.println("My Speed is: "+spd);
    in.nextLine();
    System.out.println("Returning to command central");
    in.nextLine(); 
    commandcentral(); 
    
  
    

}else if (c7 == 5){
System.out.println("1. Key items");
System.out.println("2. Regular Items");
int c12 = in.nextInt();
if (c12 == 1){
if (exolvl == 1){
System.out.println("1. Rusty Exoskeleton");
}else{
error(); }
if (gunlvl == 1){
System.out.println("2. Old Pistol");
}else{
error(); 
}
if (meleelvl == 1){
}else{
error();} else if (c12 == 2){
System.out.println("Placeholder for items.");  
}else{
error();}














		
	}
}