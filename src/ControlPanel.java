import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class ControlPanel extends JPanel implements ChangeListener
{
	JSlider numBalls; 
	MainFrame theFrame;
	
	public ControlPanel(MainFrame theFrameIn)
	{
		numBalls = new JSlider(JSlider.HORIZONTAL,0, 50, 1 );
		numBalls.addChangeListener(this);
		numBalls.setMajorTickSpacing(10);
		numBalls.setMinorTickSpacing(2);
		numBalls.setPaintTicks(true);
		numBalls.setPaintLabels(true);
		
		theFrame = theFrameIn;
		add(numBalls);
		
	}

	@Override
	public void stateChanged(ChangeEvent e)
	{
		theFrame.setNumBalls(numBalls.getValue());
	}
	
}
