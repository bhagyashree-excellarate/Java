import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowHandler implements WindowListener {

	
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void windowClosing(WindowEvent e) {
		MyFrame mf = (MyFrame)e.getSource();
		mf.dispose();
		
	}

	
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
