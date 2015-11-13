import java.awt.Color;
import java.awt.Image;

public abstract class PongItem {
	
	protected int posX;
	protected int posY;
	protected int width;
	protected int height;
	protected int speedX;
	protected int speedY;
	protected Image sprite; // a débattre
	

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSpeedX() {
		return speedX;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public int getSpeedY() {
		return speedY;
	}

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}

	public Image getSprite() {
		return sprite;
	}

	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}
	
	
	
	protected boolean collision(PongItem b){
		if( ((this.posX + this.width) >= b.posX) && ((this.posY <= (b.posY + b.height)) && (this.posY >= b.posY)) ||
				(((this.posY + this.height) >= b.posY) && ((this.posY + this.height) <= (b.posY + b.height))))
			return true;
		if ( ((this.posX <= (b.posX + b.width)) && ((this.posY <= (b.posY + b.height)) && (this.posY >= b.posY)) ||
				(((this.posY + this.height) >= b.posY) && ((this.posY + this.height) <= (b.posY + b.height)))))
			return true;
		return false;
	}
	
	protected void move(){
		posX += speedX;
		posY += speedY;
	}
	
}
