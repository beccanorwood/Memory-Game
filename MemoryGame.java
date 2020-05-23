import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.util.*;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException; 

public class MemoryGame extends JFrame implements ActionListener
{

	AnimalCollection initialPack = new AnimalCollection(); 
	
	ArrayList<JButton> buttons = new ArrayList<JButton>(); 

	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;
	public static int numofButtons = 0; 
	public static int animalmatches = 0; 
	public int cardPick = 0; 
	public boolean match; 
	
	public static int initialrow = 6; 
	public static int initialcol = 4; 
	
	public static MemoryGame gui; 
	
	PrintWriter outputStream = null;

	public static void main(String[] args)
	{
		gui = new MemoryGame(initialrow, initialcol);
		gui.setVisible(true);
	}
	
	
	//Animal Level
	public MemoryGame(int row, int col)
	{

		super();
		setSize(WIDTH, HEIGHT);
		setTitle("Memory Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(row, col));    

		
		initialPack.addAnimals(row, col);
		
		
		Buttons(row, col); 
		
		if(animalmatches == numofButtons % 2)
		{
			NextLevel x = new NextLevel(); 
		}

			
			try 
			{
				outputStream = new PrintWriter(new FileOutputStream("NumberofMatches.txt")); 
			}
			catch (FileNotFoundException e)
			{
				System.out.println("Error opening"); 
			}
			
		outputStream.println("Number of matches: " + numofButtons/2); 
		outputStream.close(); 
			
		
	}
	

	public void Buttons(int row, int col)
	{
		numofButtons = row * col; 

		JButton[] buttonList = new JButton[numofButtons]; 

		for(int b = 0; b < numofButtons; b++)
		{
			buttonList[b] = new JButton(); 
			buttons.add(buttonList[b]); 
			buttons.get(b).addActionListener(this);
			add(buttons.get(b)); 
		}
		
		
	}
	

	

	public void Match(int card1, int card2)
	{
		
		match = initialPack.equals(card1, card2); 
		
		if(match == true)
		{
			buttons.get(card1).setBackground(Color.BLACK);
			buttons.get(card1).setIcon(null);
			buttons.get(card2).setBackground(Color.BLACK);
			buttons.get(card2).setIcon(null);
			
			animalmatches++; 
			
		}
		else 
		{
			buttons.get(card1).setIcon(null);
			initialPack.reset(card1); 
			buttons.get(card2).setIcon(null);
			initialPack.reset(card2);
		}
		
		
	}
	

	public void actionPerformed(ActionEvent e)
	{
		try
		{
			CardSelection(e);
		}
		catch(IndexOutOfBoundsException e2)
		{
			
		}
	}

	public void CardSelection(ActionEvent e)
	{
		
		JButton src = (JButton) e.getSource(); 
		
		for(int i = 0; i < buttons.size(); i++)
		{
			if(src == buttons.get(i))
			{
				buttons.get(i).setIcon(initialPack.AnimalPic(i));
				initialPack.setFlip(i);
				cardPick++; 
			}
		}
		
		
		
		if(cardPick > 2)
		{
			
	
			for(int i = 0; i < initialPack.Size(); i++)
			{
				for(int j = 0; j < initialPack.Size(); j++)
				{
					if(i != j)
					{
						if(initialPack.Flipped(i) == true && initialPack.Flipped(j) == true)
						{
							Match(i, j); 
						}
					}    
					
				}
			}
			
		
			
			cardPick = 0; 
			
			
		}
		
		
	}
	
		
}

