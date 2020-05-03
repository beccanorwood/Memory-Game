import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Otter extends Animal
{
	public Otter()
	{
		super(); 
	}
	
	public Icon Image()
	{
		try 
		{
			img = ImageIO.read(new File("otter.jpg")); 
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
		return "Otter"; 
	}
	
}
