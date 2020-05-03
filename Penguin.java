import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Penguin extends Animal
{
	public Penguin()
	{
		super();
	}
	
	
	public Icon Image()
	{
		try 
		{
			img = ImageIO.read(new File("penguin.jpg")); 
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		icon = new ImageIcon(img); 
		
		return icon; 
	}
	
	public String Type()
	{
		return "Penguin"; 
	}

	
}
