# spaceship-shooting-game

A 2D Java Swing-based space shooter game featuring multiple playable ships with unique movement mechanics and keyboard controls.


## Features 
- **5 Selectable Spaceships** (ALPHA, BETA, etc.) with different speeds
- **Smooth Keyboard Controls** (Arrow keys for movement)
- **Dynamic UI** with ship selection screen
- **Object-Oriented Design** using:
  - Inheritance (`SpaceShips` base class)
  - Polymorphism (ship-specific movement)
  - Interfaces (`Navigation`)
- **Responsive Game Frame** (800x600 resolution)

## How to Run ▶
1. **Requirements**:
   - Java JDK 11+
   - Image files in `/images` folder

2. **Compile & Execute**:
   ```bash
   javac src/MainClass/Main.java
   java -cp src MainClass.Main
