package homework;

public class Test {
	public static void main(String[] args){
		Army army1=new Army(7);
		army1.addWeapon(new Tank());
		army1.addWeapon(new Flighter());
		army1.addWeapon(new WarShip());
		army1.attackAll();
		army1.moveAll();
	}
}
