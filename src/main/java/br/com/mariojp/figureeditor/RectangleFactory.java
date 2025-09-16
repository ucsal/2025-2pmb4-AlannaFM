package br.com.mariojp.figureeditor;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class RectangleFactory implements ShapeFactory {

	@Override
	public Shape createShape(int x, int y, int size) {
		
		return new Rectangle2D.Double(x - size / 2.0, y - size / 2.0, size, size);
	}

}