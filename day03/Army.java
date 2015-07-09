package homework;

public class Army {
	Weapon [] w=null;
	private int a=0;
	Army(int a){
	w=new Weapon[a];
	}
	public void addWeapon(Weapon wa){
		if (a>=w.length){
			System.out.println("It's enough");
		}else{
			w[a]=wa;
			a++;
		}
	}
	public void attackAll(){
		for(Weapon wa:w){
			if(wa!=null){
				wa.attack();
			}
		}
	}
	public void moveAll(){
		for(Weapon wa:w){
			if(wa!=null){
				wa.move();
			}
		}
	}	
}
