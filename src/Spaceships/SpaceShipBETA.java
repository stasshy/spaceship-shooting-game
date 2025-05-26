package Spaceships;
import MainClass.Main;
import java.awt.image.Image;
public class SpaceShipBETA extends SpaceShips {
	int x = 202;
	int y = 500;

	public static int cosmosWidth = 800;
	public static int cosmosHeight = 600;
	public static int spaceShipWidth = 100;
	public static int spaceShipHeight = 100;
	
	public static Image img;
	static {
		try {
			SpaceShipBETA.img=ImageIO.read(MainClass.class.getResource("../images/BETA.png"));
		} catch (Exception e) {
			System.out.println(e);		
	}
	
	public SpaceShipBETA() {
			SpaceShipName="BETA";
			horPace=40;
			verPace=40;
			xCoord=0;
			yCoord=MainClass.cosmosHeight-MainClass.spaceShipHeight-MainClass.yOffSet;
			super.SpaceShipImageIcon=new ImageIcon(SpaceShipBETA.img);
	}

	@Override
	public int moveUP() {
		if (this.y <= (cosmosHeight - spaceShipHeight)) {
			this.y = y - 20;
			System.out.println("SpaceShip BETA: Xcoords=" + x + " Ycoords=" + (y));
		} else {
			System.out.println("Can't move outside the frame");
		}

		return 0;
	}

	@Override
	public int moveDOWN() {
		if (this.y < (cosmosHeight - spaceShipHeight)) {
			this.y = y + 20;
			System.out.println("SpaceShip BETA: Xcoords=" + x + " Ycoords=" + (y));
		} else {
			System.out.println("Can't move outside the frame");
		}
		return 0;
	}

	@Override
	public int moveLEFT() {
		if (this.x > 202 && this.x <= (cosmosWidth - spaceShipWidth)) {
			this.x = x - 20;
			System.out.println("SpaceShip BETA: Xcoords=" + (x) + " Ycoords=" + (y));
		} else {
			System.out.println("Can't move outside the frame");
		}
		return 0;
	}

	@Override
	public int moveRIGHT() {
		if (this.x > 202 && this.x < (cosmosWidth - spaceShipWidth)) {
			this.x = x + 20;
			System.out.println("SpaceShip BETA: Xcoords=" + (x) + " Ycoords=" + (y));
		} else {
			System.out.println("Can't move outside the frame");
		}
		return 0;
	}

}
