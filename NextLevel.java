import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class NextLevel extends JFrame implements ActionListener
{
	JFrame f = new JFrame();
	JButton b = new JButton("Continue"); 
	
	public NextLevel()
	{
		f.setTitle("Continue");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(b); 
		
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String actionCommand = e.getActionCommand();
				
				if(actionCommand.equals("Continue"))
				{
					f.dispose(); 
					MemoryGame.gui.dispose(); 
				}
			}
		});
		
		f.setSize(100, 100);
		f.setVisible(true);
		
		
	}

}
