import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Tiger extends Animal
{
	public Tiger()
	{
		super();
	}
	

	public Icon Image()
	{
		try 
		{
			img = ImageIO.read(new File("tiger.jpg")); 
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
		return "Tiger"; 
	}
	
	
}
