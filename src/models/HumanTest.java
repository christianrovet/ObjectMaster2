package models;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human christian = new Human();
		System.out.println(christian.getHealth());
		Human bob = new Human();
		bob.attack(christian);
		System.out.println(christian.getHealth());
		Ninja karate = new Ninja();
		karate.steal(christian);
		System.out.println(christian.getHealth());
		karate.runAway();
		System.out.println(karate.getHealth());
		Samurai sam = new Samurai();
		sam.deathBlow(christian);
		System.out.println(christian.getHealth());
		System.out.println(sam.getHealth());
		sam.meditate();
		System.out.println(sam.getHealth());
		Samurai.howMany();
		Samurai rick = new Samurai();
		Samurai.howMany();
		Wizard wanda = new Wizard();
		wanda.fireball(christian);
		System.out.println(christian.getHealth());
		wanda.heal(christian);
		wanda.heal(christian);
		System.out.println(christian.getHealth());
	}

}
