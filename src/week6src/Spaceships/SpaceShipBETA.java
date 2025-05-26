package Spaceships;

public class SpaceShipBETA extends SpaceShips{
	int x=202; 
	int y=500;

	public static int cosmosWidth=800;
	public static int cosmosHeight=600;
	public static int spaceShipWidth=100;
	public static int spaceShipHeight=100;

	@Override
	public int moveUP() {
		if (this.y<=(cosmosHeight-spaceShipHeight)) {
			this.y=y-20;
		    System.out.println("SpaceShip BETA: Xcoords="+ x +" Ycoords="+(y));
			}
		else {
			System.out.println("Can't move outside the frame");
			}
		
		return 0;
	}

	@Override
	public int moveDOWN() {
		if (this.y<(cosmosHeight-spaceShipHeight)) {
			this.y=y+20;
		    System.out.println("SpaceShip BETA: Xcoords="+ x +" Ycoords="+ (y));
		}
		else { 
			System.out.println("Can't move outside the frame");
			}
		return 0;
	}

	@Override
	public int moveLEFT() {
		if(this.x>202 && this.x<=(cosmosWidth-spaceShipWidth)) {
			this.x=x-20;
		    System.out.println("SpaceShip BETA: Xcoords="+ (x) +" Ycoords="+ (y));
			}
		else { 
			System.out.println("Can't move outside the frame");
			}
		return 0;
	}

	@Override
	public int moveRIGHT() {
		if (this.x>202 && this.x<(cosmosWidth-spaceShipWidth)) {
			this.x=x+20;
		    System.out.println("SpaceShip BETA: Xcoords="+ (x) +" Ycoords="+(y));
			}
		else { 
			System.out.println("Can't move outside the frame");
			}
		return 0;
	}

	

}
