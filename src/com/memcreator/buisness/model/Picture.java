package com.memcreator.buisness.model;

import java.awt.Point;

import com.memcreator.buisness.util.RGBENUM;

public interface Picture {

	void getPixel(Point p, RGBENUM rgb);
	void setPixel(Point p, RGBENUM rgb);
	
	

}
