package lab6.tools;

import java.awt.Cursor;
import java.awt.Point;
import cse115.graphics.DrawingCanvas;

public class SquareTool implements ITool{
private Cursor _cursor;
private DrawingCanvas _canvas;
	
	public SquareTool(DrawingCanvas canvas){
		_canvas = canvas;
		_cursor = _canvas.makeCustomCursor("IMAGES/Square.png");
		_canvas.setCursor(_cursor);
	}	

	@Override
	public Cursor getCursor() {
				
		return _cursor;
	}


	@Override
	public void apply(Point p) {
		cse115.graphics.Rectangle r= new cse115.graphics.Rectangle();
		r.setDimension(new java.awt.Dimension(100,100));
		r.setLocation(p);
		r.setColor(java.awt.Color.RED);
		_canvas.add(r);
				
	}
}
