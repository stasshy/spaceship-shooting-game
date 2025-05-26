package gui;
import javax.swing.JPanel;
import Spaceships.*;

public class GamePlayScreen extends JPanel implements KeyListener {
	private static final long serialVersionUID = 1L;
	//se afth tin klash kano ta pano kato me ta keys-praxeis-listener
	private SpaceShips userSpaceShip;
	GamePlayScreen{
		addKeyListener(this);
		this.setVisible(true);
		this.setBackground(Color.BLACK);
		
	}
	@Override
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		userSpaceShip.getIcon().paintIcon(this, g, userSpaceShip.getX(), userSpaceShip.getY());
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()== KeyEvent.VK_UP) userSpaceShip.moveUP();
		if (e.getKeyCode()== KeyEvent.VK_DOWN) userSpaceShip.moveDOWN();
		if (e.getKeyCode()== KeyEvent.VK_LEFT) userSpaceShip.moveLEFT();
		if (e.getKeyCode()== KeyEvent.VK_RIGHT) userSpaceShip.moveRIGHT();
		this.repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {}
	
	@Override
	public void keyTyped (KeyEvent e) {}
	void setUserSpaceShip(SpaceShips usel){
		userSpaceShip=usel;
	}



}
