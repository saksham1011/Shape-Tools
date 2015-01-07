package lab6.tools;

import java.awt.Cursor;
import java.awt.Point;
import cse115.graphics.DrawingCanvas;

public class CircleTool implements ITool{
private Cursor _cursor;
private DrawingCanvas _canvas;
	
	public CircleTool(DrawingCanvas canvas){
		_canvas = canvas;
		_cursor = _canvas.makeCustomCursor("IMAGES/Circle.png");
		_canvas.setCursor(_cursor);
	}	

	@Override
	public Cursor getCursor() {
						
		return _cursor;
	}


	@Override
	public void apply(Point p) {
		cse115.graphics.Ellipse c= new cse115.graphics.Ellipse();
		c.setDimension(new java.awt.Dimension(100,100));
		c.setLocation(p);
		c.setColor(java.awt.Color.BLUE);
		_canvas.add(c);
				
	}
}