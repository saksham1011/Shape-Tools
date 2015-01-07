package lab6.tools;

import java.awt.Cursor;
import java.awt.Point;
import cse115.graphics.DrawingCanvas;

public class EraserTool implements ITool{
private Cursor _cursor;
private DrawingCanvas _canvas;
	
	public EraserTool(DrawingCanvas canvas){
		_canvas = canvas;
		_cursor = _canvas.makeCustomCursor("IMAGES/Eraser.png");
		_canvas.setCursor(_cursor);
	}	

	@Override
	public Cursor getCursor() {
	    return _cursor;
	}


	@Override
	public void apply(Point p) {
		cse115.graphics.Graphic g = _canvas.getGraphic(p);
		_canvas.remove(g);
				
	}
}