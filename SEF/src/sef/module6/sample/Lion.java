package sef.module6.sample;

//Lion class implements Moveable interface
public class Lion implements Moveable,Sleep {

	// implements move() method from the Moveable interface
	public void move(){
		System.out.println("Lions can walk/run");
	}
	public void sleeps(){
		System.out.println("Lions can SLEEEEP");
	}


}
