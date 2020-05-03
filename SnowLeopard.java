import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class SnowLeopard extends Animal
{
	public SnowLeopard()
	{
		super();
	}
	
	public Icon Image()
	{
		try 
		{
			img = ImageIO.read(new File("snowleopard.jpg")); 
			
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
		return "Snow Leopard"; 
	}
	
  
}