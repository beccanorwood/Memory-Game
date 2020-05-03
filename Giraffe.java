import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Giraffe extends Animal
{
	public Giraffe()
	{
		super();
	}
	
	
	public Icon Image()
	{
		try 
		{
			img = ImageIO.read(new File("Giraffe.jpg"));
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
		return "Giraffe"; 
	}
  
}