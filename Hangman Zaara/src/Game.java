import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage; 
import java.awt.event.*; 


public class Game  extends JPanel implements Runnable, KeyListener{

	
	private BufferedImage back; 
	private int key; 
	private int wrong;
	private Words w;
	public char charkey;
	
	
	
	
	
	
	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		key =-1; 
		wrong=0;
		w= new Words();
		charkey= (char)(key);
		
		
		
	}

	
	
	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	

	

	
	
	
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics();
	
		g2d.clearRect(0,0,getSize().width, getSize().height);
		
		//g2d.drawImage(background.getImage(), 0, 0, getSize().width, getSize().height, this);
		
		
	g2d.setColor(Color.WHITE);
	g2d.setFont(new Font("Arial", Font.BOLD,40 ));;
	g2d.drawString("Hangman - Color Edition", 180, 60);
			
			Color man=new Color(174, 242, 211);
			g2d.setColor(man);
			drawMan(g2d);
		   
		

		
		Color dash= new Color (202, 169, 217);
		g2d.setColor(dash);
		g2d.setFont(new Font("Times New Roman", Font.BOLD, 100));;
		g2d.drawString(w.getDash(),50, 400);
		
		g2d.setColor(Color.WHITE);
		g2d.setFont(new Font("Times New Roman", Font.BOLD, 20));
		g2d.drawString("KEY "+ key, 5, 30);
		
	
			
			

		twoDgraph.drawImage(back, null, 0, 0);

	}
	
public void drawMan(Graphics g) {
	((Graphics2D)g).setStroke(new BasicStroke(5));
	switch(wrong) {
	case 6:
		g.drawLine(600,300,630,400);
	case 5:
		
		g.drawLine(600,300,570,400);
	case 4:
		
		g.drawLine(600,240,650,160);
	case 3:
		
		g.drawLine(600,240,550,160);
	case 2:
		
		g.drawLine(600,190,600,300);
	case 1:
		g.drawOval(575,140,50,50);
	case 0:
		g.drawLine(700,100,700,450);
		g.drawLine(620,450,780,450);
		g.drawLine(600,100,700,100);
		g.drawLine(600,100,600,140);
		
		break;
	default:
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 800, 600);
		g.setColor(Color.CYAN);
		g.setFont(new Font("Times New Roman", Font.BOLD, 60));
	    g.drawString("YOU LOSE", 250, 250);
	    g.setColor(Color.WHITE);
	    g.setFont(new Font("Times New Roman", Font.BOLD, 40));
	    g.drawString("The word was "+w.getAnswer(), 200, 500);
	    g.drawString("Restart to Play Again", 200, 50);
		
	}
}

		



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		key= e.getKeyCode();
		System.out.println(key);
		

		
		char charkey= (char)(key);
		System.out.println(charkey);
		
		if(!w.checkGuess(charkey)) {wrong ++;
		}
		}
  
		
	
	
	
		
	
		
		
	
		
		
		
		
		
		



	@Override
	public void keyReleased(KeyEvent e) {
	
		
		
		
	}
	
	
	

	
}

