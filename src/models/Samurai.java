package models;

public class Samurai extends Human {
	public static int numOfSamurai = 0;
	public Samurai() {
		// TODO Auto-generated constructor stub
		this.setHealth(200);
		numOfSamurai += 1;
	}
	public void deathBlow(Human human) {
		human.setHealth(0);
		this.setHealth(this.getHealth() / 2);
	}
	public void meditate() {
		this.setHealth(200);
	}
	public static int howMany() {
		System.out.println(numOfSamurai);
		return numOfSamurai;
	}
}
