package Spaceships;

public class SpaceShipALPHA extends SpaceShips {
	int x=101; //arxikopoio me vasi to telos(apo pano aristera) toy koutioy-spaceship
	int y=500;

	public static int cosmosWidth=800;
	public static int cosmosHeight=600;
	public static int spaceShipWidth=100;
	public static int spaceShipHeight=100;

	@Override
	public int moveUP() {
		if (this.y<=(cosmosHeight-spaceShipHeight)) {
			this.y=y-10;
		    System.out.println("SpaceShip ALPHA: Xcoords="+ x +" Ycoords="+(y));
			}
		else {
			System.out.println("Can't move outside the frame");
			}
		
		return 0;
	}

	@Override
	public int moveDOWN() {
		if (this.y<(cosmosHeight-spaceShipHeight)) {
			this.y=y+10;
		    System.out.println("SpaceShip ALPHA: Xcoords="+ x +" Ycoords="+ (y));
		}
		else { 
			System.out.println("Can't move outside the frame");
			}
		
		return 0;
	}

	@Override
	public int moveLEFT() {
		if(this.x>101 && this.x<=(cosmosWidth-spaceShipWidth)) {
			this.x=x-10;
		    System.out.println("SpaceShip ALPHA: Xcoords="+ (x) +" Ycoords="+ (y));
			}
		else { 
			System.out.println("Can't move outside the frame");
			}
		return 0;
	}

	@Override
	public int moveRIGHT() {
		if (this.x>101 && this.x<(cosmosWidth-spaceShipWidth)) {
			this.x=x+10;
		    System.out.println("SpaceShip ALPHA: Xcoords="+ (x) +" Ycoords="+(y));
			}
		else { 
			System.out.println("Can't move outside the frame");
			}
		return 0;
	}

	
	

}
