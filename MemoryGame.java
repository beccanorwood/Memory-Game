import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.util.*;


public class MemoryGame extends JFrame implements ActionListener
{
	
	//JButton array to clean up code and add/remove buttons dependent upon # of matches
	ArrayList<JButton> buttons = new ArrayList<JButton>(12); 
	
	
	AnimalCollection initialPack = new AnimalCollection(); 
	
	private JButton one = new JButton();
	private JButton two = new JButton();
	private JButton three = new JButton();
	private JButton four = new JButton();
	private JButton five = new JButton();
	private JButton six = new JButton();
	private JButton seven = new JButton();
	private JButton eight = new JButton(); 
	private JButton nine = new JButton();
	private JButton ten = new JButton();
	private JButton eleven = new JButton();
	private JButton twelve = new JButton();

	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;
	
	
	public int cardPick = 0; 
	public int row; 
	public int col; 
	public int card1; 
	public int card2; 
	public int btn; 
	public int numofButtons; 
	public boolean match; 
	public boolean flipped; 
	
	public int match1;
	public int match2; 
	
	//Add fillArrayList of type JButton based upon #ofrows and #ofcolumns in Memorygame method
	//public static void fillArrayList(ArrayList<JButton> a)
	
	//Add comparable interface to check if user found a match
	//Create method to remove matching pair of animals from grid/arraylist
	
	public static void main(String[] args)
	{
		MemoryGame gui = new MemoryGame(3, 4);
		gui.setVisible(true);
		
	}
	
	public MemoryGame(int row, int col)
	{
		super();
		setSize(WIDTH, HEIGHT);
		setTitle("Memory Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(row, col));
		
		buttons.add(one);
		buttons.add(two);
		buttons.add(three);
		buttons.add(four);
		buttons.add(five);
		buttons.add(six);
		buttons.add(seven);
		buttons.add(eight);
		buttons.add(nine);
		buttons.add(ten);
		buttons.add(eleven);
		buttons.add(twelve);
		
		
		
		for(int i = 0; i < buttons.size(); i++)
		{
			buttons.get(i).addActionListener(this);
			add(buttons.get(i)); 
		}
		

		
		
		
		//int x = this.getRow(row);
		//int y = this.getCol(col); 
		
		//numofButtons = x * y; 
		
		//fillJButtonArray(buttons, numofButtons);
 
	}
	
	/*public int getRow(int row)
	{
		this.row = row; 
		return row; 
	}
	
	public int getCol(int col)
	{
		this.col = col; 
		return col; 
	}*/


	/*public void Match(int card1, int card2)
	{
		if((initialPack.Type(card1).equals(initialPack.Type(card2))))
		{
			JButtonMatch(card1, card2); 
		}
	}
	
	
	public void JButtonMatch(int flipped1, int flipped2)
	{
		
		buttons.get(flipped1).setBackground(Color.BLACK);
		buttons.get(flipped1).setIcon(null);
		buttons.get(flipped2).setBackground(Color.BLACK);
		buttons.get(flipped2).setIcon(null);
		
	}*/
	

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
		
		if(e.getSource() == one)
		{
			one.setIcon(initialPack.AnimalPic(0));
			initialPack.setFlip(0); 
			cardPick++;
		}
		else if(e.getSource() == two)
		{
			two.setIcon(initialPack.AnimalPic(1)); 
			initialPack.setFlip(1);
			cardPick++; 
		}
		else if(e.getSource() == three)
		{
			three.setIcon(initialPack.AnimalPic(2));
			initialPack.setFlip(2);
			cardPick++; 
		}
		else if(e.getSource() == four)
		{
			four.setIcon(initialPack.AnimalPic(3)); 
			initialPack.setFlip(3);
			cardPick++; 
		}
		else if(e.getSource() == five)
		{
			five.setIcon(initialPack.AnimalPic(4));
			initialPack.setFlip(4);
			cardPick++; 
		}
		else if(e.getSource() == six)
		{
			six.setIcon(initialPack.AnimalPic(5));
			initialPack.setFlip(5);
			cardPick++; 
		}
		else if(e.getSource() == seven)
		{
			seven.setIcon(initialPack.AnimalPic(6)); 
			initialPack.setFlip(6);
			cardPick++; 
		}
		else if(e.getSource() == eight)
		{
			eight.setIcon(initialPack.AnimalPic(7));
			initialPack.setFlip(7);
			cardPick++; 
		}
		else if(e.getSource() == nine)
		{
			nine.setIcon(initialPack.AnimalPic(8));
			initialPack.setFlip(8);
			cardPick++; 
		}
		else if(e.getSource() == ten)
		{
			ten.setIcon(initialPack.AnimalPic(9));
			initialPack.setFlip(9);
			cardPick++; 
		}
		else if(e.getSource() == eleven)
		{
			eleven.setIcon(initialPack.AnimalPic(10));
			initialPack.setFlip(10);
			cardPick++; 
		}
		else if(e.getSource() == twelve)
		{
			twelve.setIcon(initialPack.AnimalPic(11));
			initialPack.setFlip(11);
			cardPick++; 
		}
		
		
		if(cardPick > 2)
		{
			
			
			for(int i = 0; i < buttons.size(); i++)
			{
				for(int j = 0; j < buttons.size(); j++)
				{
					buttons.get(i).setIcon(null);
					buttons.get(j).setIcon(null);
				}
			}
			
			
			
			
			/*for(int i = 0; i < initialPack.Size(); i++)
			{
				for(int j = 0; j < initialPack.Size(); j++)
				{
					if(initialPack.Flipped(i) == true && initialPack.Flipped(j) == true)
					{
						Match(i, j); 
					}
				}
			}*/ 
			
		
			
			cardPick = 0; 
			
			
		}
	
		
	}
	
		
}

