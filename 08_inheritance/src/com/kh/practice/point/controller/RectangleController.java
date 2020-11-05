package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();

	public String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		return r + " / " + 2 * (width + height);
	}

	public String calcArea(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		return r + " / " + width * height;
	}
}
