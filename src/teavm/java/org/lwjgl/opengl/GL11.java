package org.lwjgl.opengl;

public class GL11 extends EaglerAdapterGL30 {

	public static void glPixelStorei(int glUnpackAlignment, int i) {
		webgl.pixelStorei(glUnpackAlignment, i);
	}

}
