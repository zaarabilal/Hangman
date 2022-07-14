import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class Main extends JFrame{
	  private static final int WIDTH =800;
	  private static final int HEIGHT=600;
	  
	  public Main () {
	    super("Hangman-Zaara Bilal");
	    setSize(WIDTH, HEIGHT);
	    Game play = new Game();
	    ((Component) play).setFocusable(true);
	Color background=new Color(240,135,132);
	    setBackground(background);
	    getContentPane().add(play);
	    
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	  }
	  

	  public static void main(String[] args) {
	    Main run = new Main();
	    

	  }


	}

