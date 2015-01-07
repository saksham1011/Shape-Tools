package lab6.tools;

import java.awt.Cursor;
import java.awt.Point;
import cse115.graphics.DrawingCanvas;

public class TriangleTool implements ITool{
private Cursor _cursor;
private DrawingCanvas _canvas;
	
	public TriangleTool(DrawingCanvas canvas){
		_canvas = canvas;
		_cursor = _canvas.makeCustomCursor("IMAGES/Triangle.png");
		_canvas.setCursor(_cursor);
	}	

	@Override
	public Cursor getCursor() {
						
		return _cursor;
	}


	@Override
	public void apply(Point p) {
		cse115.graphics.Triangle t= new cse115.graphics.Triangle();
		t.setDimension(new java.awt.Dimension(100,100));
		t.setLocation(p);
		t.setColor(java.awt.Color.GREEN);
		_canvas.add(t);
				
	}
}
