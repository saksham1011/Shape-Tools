package lab6.tools;

import java.awt.Cursor;
import java.awt.Point;

public interface ITool {
	public void apply(Point p);
	public Cursor getCursor();
}
