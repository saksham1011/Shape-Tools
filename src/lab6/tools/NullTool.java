package lab6.tools;

import java.awt.Cursor;
import java.awt.Point;

public class NullTool implements ITool{

	@Override
	public void apply(Point p) {

	}

	@Override
	public Cursor getCursor() {
		return Cursor.getDefaultCursor();
	}
}
