package cn.com.ldci.plants;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;

public class MidlerZomebie extends Zomebie{
	Bitmap[] MidlerZomebieBitmap;
	
	MidlerZomebie(Context context,float y) {
		eatlifes = 10;
		moveLength = 1;
		currentX = 480;
		currentY = y ;
	}
	

	
	@Override
	protected void eat() {
		
	}

	@Override
	protected void hit() {
		
	}
}
