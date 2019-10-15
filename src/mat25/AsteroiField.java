package mat25;

import java.util.Random;

class Asteroid extends blobz.PolyBlob {

public Asteroid(int x, int y, double r) {
super(-100, -100, r);
this.setDelta(x, y);
  

Random ran = new Random();
int rad = ran.nextInt(11);
int ver = ran.nextInt(5) + 5;
int[] xArr = new int[ver];
int[] yArr = new int[ver];
double arc = 360/ver;
  
for(int i = 0; i < ver; i++) {

double ang = (arc * i) + (ran.nextDouble() * arc );

double arcRad = (ran.nextInt(rad + 1) + 5);
ang = Math.toRadians(ang);
xArr[i] = (int)Math.round(Math.cos(ang) * arcRad);
yArr[i] = (int)Math.round(Math.sin(ang) * arcRad);
}
  
this.setPolygon(xArr, yArr);
}
  
  
}

public class AsteroidField implements BlobGUI {

public static void main(String[] args) {
new AsteroidField( Integer.parseInt( args[0]));
  
}
  
private final SandBox sandBox;
  
public AsteroidField(int i) {
  
sandBox = new SandBox();
sandBox.setSandBoxMode(SandBoxMode.FLOW);
sandBox.setFrameRate(15);
sandBox.init(this);
}

@Override
public void generate() {

Random ran = new Random();
for(int i = 0; i < 20; i++) {
int x = (ran.nextInt(3) + 1) * (ran.nextBoolean() ? -1: 1);
int y = (ran.nextInt(3) + 1) * (ran.nextBoolean() ? -1: 1);
double r = ran.nextBoolean() ? -.1: .1;
  
sandBox.addBlob(new Asteroid(x,y,r));
}
}
  
}