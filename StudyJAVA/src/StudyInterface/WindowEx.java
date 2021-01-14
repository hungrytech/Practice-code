package StudyInterface;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

// this와 interface 제조사 클래스 이용방법 공부
public class WindowEx extends Frame implements MouseListener, WindowListener{
	JButton jbtn = new JButton("Click");
	public WindowEx() {
		this.add("North", jbtn);
		jbtn.addMouseListener(this);
		this.setBounds(new Rectangle(new Point(100, 100), new Dimension(900,900)));
		this.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		int Answer = JOptionPane.showConfirmDialog(this, "OK Click");
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Are you sure you wish to exit?");
        int Answer = JOptionPane.showConfirmDialog(this, "Are you sure want to exit?", "Quit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           if (Answer == JOptionPane.YES_OPTION) {
               System.exit(0);
           }
	}

	//아직 구현 못한부분
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
