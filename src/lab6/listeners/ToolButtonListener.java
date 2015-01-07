package lab6.listeners;

import java.awt.event.ActionEvent;
import lab6.tools.ITool;
import lab6.tools.ToolProxy;

public class ToolButtonListener implements java.awt.event.ActionListener{
	private ITool _tool;
	private ToolProxy _proxy;	
	public ToolButtonListener(ITool t, ToolProxy p){
		_tool = t;
		_proxy = p;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		_proxy.setTool(_tool);
		
	}
}