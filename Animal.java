import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class Animal
{
	
	protected BufferedImage img; 
	protected ImageIcon icon; 
	protected String type; 
	protected boolean flipped; 
	
	public Animal()
	{
		this.img = null; 
		this.icon = null; 
		this.type = null; 
	}
	
	public void setFlipped(boolean flipped)
	{
		this.flipped = flipped; 
	}
	
	
	public boolean getFlipped()
	{
		return flipped; 
	}
	
	
	public boolean equals(Object other)
	{
		if (this.getClass() == other.getClass())
		{
			return true;
		}
		else
		{
			return false; 
		}
	}


	public abstract Icon Image(); 
	public abstract String Type();

 
}