package lab6.tools;

import java.awt.Cursor;
import java.awt.Point;

import cse115.graphics.DrawingCanvas;

public class ToolProxy implements ITool {
	private ITool _currentTool;
    private DrawingCanvas _canvas;
	public ToolProxy(ITool t, DrawingCanvas c){
	_currentTool = t;
	_canvas = c;		
	
	}
	
	public void setTool(ITool tool){
	_currentTool = tool;
	_canvas.setCursor(_currentTool.getCursor());
	}
	
    @Override
	
	
	public void apply(Point p) {
    	_currentTool.apply(p);
		
	}

	@Override
	public Cursor getCursor() {		
		return _currentTool.getCursor();
	}
}
