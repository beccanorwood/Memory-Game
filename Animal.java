import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;

interface Equal
{
	boolean Equals(Animal a);
	
}

public abstract class Animal implements Equal
{

	protected BufferedImage img; 
	protected ImageIcon icon; 
	protected String type; 
	protected boolean flipped = false; 
	
	public Animal()
	{
		this.img = null; 
		this.icon = null; 
		this.type = null; 
	}
	
	public void setFlipped()
	{
		this.flipped = true; 
	}
	
	public void resetFlipped()
	{
		this.flipped = false;
	}
	
	public boolean getFlipped()
	{
		return flipped; 
	}
	
	@Override
	public boolean Equals(Animal a)
	{
		boolean same; 
		
		if(this.Type().equals(a.Type()))
		{
			same = true; 
		}
		else
		{
			same = false; 
		}
		
		return same; 
	}
	
	
	
	protected abstract Icon Image(); 
	protected abstract String Type();

 
}