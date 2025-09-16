package br.com.mariojp.figureeditor;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class CircleFactory implements ShapeFactory {

	
	
	@Override
	public Shape createShape(int x, int y, int size) {
		int diameter = size;
      
        return new Ellipse2D.Double(x - diameter / 2.0, y - diameter / 2.0, diameter, diameter);
	}

}
