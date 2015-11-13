
public class Ball extends PongItem {
		
	public Ball (String Image,  int posX, int posY){
		super(Image, posX, posY);
	}
	
	private Ball ball = new PongItem();
	
	private Point ball_position = new Point(0, 0);
	
	ball_position.translate(this.getSpeedX(), this.getSpeedY());
	
	public void animate() {
		
		if (this.getPosY() > SIZE_PONG_Y - this.getHeight()){
			this.setPosY(SIZE_PONG_Y - this.getHeight());
			this.setSpeedY(- this.getSpeedY());
		}
	
		if (this.getPosY() < SIZE_PONG_Y + this.getHeight()){
			this.setPosY(SIZE_PONG_Y + this.getHeight());
			this.setSpeedY(- this.getSpeedY());
		}
		
		if (collision(ball)){
			this.setSpeedX(- this.getSpeedX);
		}
	}
