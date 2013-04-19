package com.memcreator.buisness.model;

import java.io.File;


public interface PictureCreator {

	Picture createPicture(File f);
	Picture createPicture(Picture p);
	Picture createPicture(int h, int w);

}
