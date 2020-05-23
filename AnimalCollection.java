import java.util.*;
import javax.swing.Icon;

public class AnimalCollection
{

	ArrayList<Animal> AnimalPack = new ArrayList<Animal>(6);
	public static final int ANIMAL_SIZE = 6; 
	
	
	public AnimalCollection()
	{
		super();
	}
  
  
  public void addAnimals(int row, int col)
  {
	  
	  int numofAnimals = row * col; 
	  int loopincrement = numofAnimals / ANIMAL_SIZE;
	  
	  
	  for(int i = 0; i < loopincrement; i++)
	  {
		  AnimalPack.add(new SnowLeopard());
		  AnimalPack.add(new Puppy());
		  AnimalPack.add(new Giraffe()); 
		  AnimalPack.add(new Penguin()); 
		  AnimalPack.add(new Tiger());
		  AnimalPack.add(new Otter());
	  }
	  

	  this.Randomize(); 
  }
  
  public int Size()
  {
	  return AnimalPack.size(); 
  }
  
  
  public void setFlip(int position)
  {
	  AnimalPack.get(position).setFlipped();
  }
  
  
  public boolean Flipped(int position)
  {
	  return AnimalPack.get(position).getFlipped(); 
  }
  
  public void reset(int position)
  {
	  AnimalPack.get(position).resetFlipped();
  }

  public String Type(int position)
  {
	  return AnimalPack.get(position).Type(); 
  }
  
  public int Position(int position)
  {
	  return position; 
  }

  public Icon AnimalPic(int position)
  {
	  return AnimalPack.get(position).Image(); 
  }
  
  public void Randomize()
  {
    Collections.shuffle(AnimalPack); 
  }

  public boolean equals(int position1, int position2) 
  {
	  
	 boolean equal = AnimalPack.get(position1).Equals(AnimalPack.get(position2)); 
	
	  return equal; 
	  
  }

}