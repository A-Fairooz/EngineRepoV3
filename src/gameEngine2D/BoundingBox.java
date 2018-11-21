package gameEngine2D;
import processing.core.PVector;


public class BoundingBox {
	public BoundingBox() {
		
	}

	public BoundingBox(int bLeft, int bRight, int bTop, int bBottom) {
		this.left = bLeft;
		this.right = bRight;
		this.top = bTop;
		this.bottom = bBottom;
		this.center_x = 0;
		this.center_y = 0;
	}
	
	public void fromSize(PVector size) {
		this.left = -size.x / 2f;
		this.right = size.x / 2f;
		this.top = size.y / 2f;
		this.bottom = -size.y / 2f;
		this.center_x = 0;
		this.center_y = 0;
		
	}
	
	public float center_x;
	public float center_y;
	public float left;
	public float right;
	public float top;
	public float bottom;
	
	
}
