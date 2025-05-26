package MainClass;
import java.util.LinkedList;
import java.util.Scanner;

import Spaceships.*;

public class Main {
	public static int cosmsosWidth=800;
	public static int cosmsosHeight=600;
	public static int spaceShipWidth=100;
	public static int spaceShipHeight=100;
    
	public static void main(String[] args) {
		LinkedList<SpaceShips> spaceshiplist = new LinkedList<SpaceShips>();
		SpaceShips z= new SpaceShipZERO();
		SpaceShips a= new SpaceShipALPHA();
		SpaceShips b= new SpaceShipBETA();
		SpaceShips g= new SpaceShipGAMA();
		SpaceShips d= new SpaceShipDELTA();
		SpaceShips e= new SpaceShipENEMY();
		
		spaceshiplist.add(z);
		spaceshiplist.add(a);
		spaceshiplist.add(b);
		spaceshiplist.add(g);
		spaceshiplist.add(d);
		spaceshiplist.add(e);
		System.out.println("Enter command to test spaceships movements:");
		Scanner sc = new Scanner (System.in);
		while (sc.hasNext()) {
			String s1= sc.next();
			System.out.println(s1);
			int i=0;
			while(i<spaceshiplist.size()) {
				if(s1.equals("u"))spaceshiplist.get(i).moveUP();
				if(s1.equals("d"))spaceshiplist.get(i).moveDOWN();
				if(s1.equals("l"))spaceshiplist.get(i).moveLEFT();
				if(s1.equals("r"))spaceshiplist.get(i).moveRIGHT();
				spaceshiplist.get(i).printCoords();
				i++;
			}
		}
		sc.close();

	}

}
