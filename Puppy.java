import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Puppy extends Animal
{
	public Puppy()
	{
		super();
	}

	
	public Icon Image()
	{
		try 
		{
			img = ImageIO.read(new File("puppy.jpg")); 
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
		return "Puppy"; 
	}
	

}


