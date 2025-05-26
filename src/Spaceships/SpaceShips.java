package Spaceships;
import MainClass.Main;
abstract public class SpaceShips implements Navigation {
	String s1;
	protected ImpageIcon SaceShipImageIcon;
	public ImageIcon getIcon() {return SpaceShipImageIcon;}
	
	public int getX() {return xCoord;}
	public int getY() {return yCoord;}

	public void setDirection(String direction) {
		this.s1 = direction;
	}

	public void printCoords() {
		if (s1 != null) {
			if (s1.equals("u")) {
				moveUP();
			}

			else if (s1.equals("d")) {
				moveDOWN();
			}

			else if (s1.equals("l")) {
				moveRIGHT();
			}

			else if (s1.equals("r")) {
				moveLEFT();
			}
		}

	}

}
