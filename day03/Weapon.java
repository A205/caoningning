package homework;

public abstract class Weapon implements Assaultable,Mobile {
	public abstract void attack();
	public abstract void move();
	int num;
	String name;
}
