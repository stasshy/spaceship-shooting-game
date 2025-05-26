package Spaceships;
import java.awt.image.Image;
import MainClass.Main;
public class SpaceShipENEMY extends SpaceShips {
	int x = 700;
	int y = 100;

	public static int cosmosWidth = 800;
	public static int cosmosHeight = 600;
	public static int spaceShipWidth = 100;
	public static int spaceShipHeight = 100;
	public static Image img;
	static {
		try {
			SpaceShipENEMY.img=ImageIO.read(MainClass.class.getResource("../images/ENEMY.png"));
		} catch (Exception e) {
			System.out.println(e);		
	}
	
	public SpaceShipENEMY() {
			SpaceShipName="ENEMY";
			horPace=40;
			verPace=40;
			xCoord=0;
			yCoord=MainClass.cosmosHeight-MainClass.spaceShipHeight-MainClass.yOffSet;
			super.SpaceShipImageIcon=new ImageIcon(SpaceShipENEMY.img);
	}

	@Override
	public int moveUP() {
		if (this.y > 100 && this.y <= (cosmosHeight - spaceShipHeight)) {
			this.y = y - 15;
			System.out.println("SpaceShip ENEMY: Xcoords=" + x + " Ycoords=" + (y));
		} else {
			System.out.println("Can't move outside the frame");
		}
		return 0;
	}

	@Override
	public int moveDOWN() {
		if (this.y > 0 && this.y < (cosmosHeight - spaceShipHeight)) {
			this.y = y + 15;
			System.out.println("SpaceShip ENEMY: Xcoords=" + x + " Ycoords=" + (y));
		} else {
			System.out.println("Can't move outside the frame");
		}
		return 0;
	}

	@Override
	public int moveLEFT() {
		if (this.x <= (cosmosWidth - spaceShipWidth)) {
			this.x = x - 15;
			System.out.println("SpaceShip ENEMY: Xcoords=" + (x) + " Ycoords=" + (y));
		} else {
			System.out.println("Can't move outside the frame");
		}
		return 0;
	}

	@Override
	public int moveRIGHT() {
		if (this.x < (cosmosWidth - spaceShipWidth)) {
			this.x = x + 15;
			System.out.println("SpaceShip ENEMY: Xcoords=" + (x) + " Ycoords=" + (y));
		} else {
			System.out.println("Can't move outside the frame");
		}
		return 0;
	}

}
