package Spaceships;
import java.awt.image.Image;
import MainClass.Main;

public class SpaceShipALPHA extends SpaceShips {
	int x = 101; // arxikopoio me vasi to telos(apo pano aristera) toy koutioy-spaceship
	int y = 500;

	public static int cosmosWidth = 800;
	public static int cosmosHeight = 600;
	public static int spaceShipWidth = 100;
	public static int spaceShipHeight = 100;
	
	public static Image img;
	static {
		try {
			SpaceShipALPHA.img=ImageIO.read(MainClass.class.getResource("../images/ALPHA.png"));
		} catch (Exception e) {
			System.out.println(e);		
	}
	
	public SpaceShipALPHA() {
			SpaceShipName="ALPHA";
			horPace=40;
			verPace=40;
			xCoord=0;
			yCoord=MainClass.cosmosHeight-MainClass.spaceShipHeight-MainClass.yOffSet;
			super.SpaceShipImageIcon=new ImageIcon(SpaceShipALPHA.img);
	}

	@Override
	public int moveUP() {
		if (this.y <= (cosmosHeight - spaceShipHeight)) {
			this.y = y - 10;
			System.out.println("SpaceShip ALPHA: Xcoords=" + x + " Ycoords=" + (y));
		} else {
			System.out.println("Can't move outside the frame");
		}

		return 0;
	}

	@Override
	public int moveDOWN() {
		if (this.y < (cosmosHeight - spaceShipHeight)) {
			this.y = y + 10;
			System.out.println("SpaceShip ALPHA: Xcoords=" + x + " Ycoords=" + (y));
		} else {
			System.out.println("Can't move outside the frame");
		}

		return 0;
	}

	@Override
	public int moveLEFT() {
		if (this.x > 101 && this.x <= (cosmosWidth - spaceShipWidth)) {
			this.x = x - 10;
			System.out.println("SpaceShip ALPHA: Xcoords=" + (x) + " Ycoords=" + (y));
		} else {
			System.out.println("Can't move outside the frame");
		}
		return 0;
	}

	@Override
	public int moveRIGHT() {
		if (this.x > 101 && this.x < (cosmosWidth - spaceShipWidth)) {
			this.x = x + 10;
			System.out.println("SpaceShip ALPHA: Xcoords=" + (x) + " Ycoords=" + (y));
		} else {
			System.out.println("Can't move outside the frame");
		}
		return 0;
	}

}
