package program.int007.java;

// Make class as final 
// Make variable as final and private
// No setter method
// Make deep copy for object

public final class CustomeImmutable {
	private final int id;
	private final String name;
	private final Engine engine;

	public CustomeImmutable(int i, String s, Engine e) {
		this.id = i;
		this.name = s;
		Engine newEngine = new Engine(e.speed);
		this.engine = newEngine;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Engine getEngine() {
		return engine;
	}

	public static void main(String[] args) {
		Engine e = new Engine(50);
		CustomeImmutable im = new CustomeImmutable(1, "Ashish", e);
		System.out.println(im.engine.speed);
		e.speed = 35;
		System.out.println(im.getId() + "  " + im.getName() + " " + im.engine.speed);

	}

}

class Engine {
	int speed;

	public Engine(int s) {
		this.speed = s;
	}
}