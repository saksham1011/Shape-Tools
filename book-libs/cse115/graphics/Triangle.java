package cse115.graphics;

import java.awt.Point;

/**
 * @author <a href="mailto:alphonce@buffalo.edu">Carl Alphonce</a>
 * 
 * Created on: Oct 30, 2010 Triangle.java
 */
public class Triangle extends Polygon {

	/**
	 * Creates a new instance of the Triangle Graphic with dimension (0,0) and
	 * location(0,0)
	 */
	public Triangle() {
		super.addPoint(new java.awt.Point(0,1));
		super.addPoint(new java.awt.Point(1,0));
		super.addPoint(new java.awt.Point(2,1));
	}

	/* (non-Javadoc)
	 * @see cse115.graphics.Polygon#addPoint(java.awt.Point)
	 */
	@Override
	public void addPoint(Point p) {
		// DO NOTHING
	}

	/* (non-Javadoc)
	 * @see cse115.graphics.Polygon#removePoint(java.awt.Point)
	 */
	@Override
	public void removePoint(Point p) {
		// DO NOTHING
	}

}
