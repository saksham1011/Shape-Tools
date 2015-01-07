package lab6.listeners;

import java.awt.event.MouseEvent;
import lab6.tools.ITool;

public class CanvasListener implements java.awt.event.MouseListener{
private ITool _tool;
public CanvasListener(ITool tool){	
	_tool = tool;
}
    @Override
	
	public void mouseClicked(MouseEvent e) {
	   _tool.apply(e.getPoint());
	    
	
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
