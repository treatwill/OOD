package org.tekcamp.planet;

public class PlanetApp {

	public static void main(String[] args) {
//		Create instances of the 9 planets.  (mercury, venus, earth, mars, ...).
//		Because there can only be 1 of each type of main.java.org.tekcamp.planet in the solar system, make each Planet Instantiable only ONE TIME.
/*
		Planet mercury = new Planet("Mercury", "9,525.1 mi", "35.98 million mi");
		Planet venus = new Planet("Venus", "23,628 mi", "67.24 million mi");
		Planet earth = new Planet("Earth", "24,901 mi", "92.96 million mi");
		Planet mars = new Planet("Mars", "13,263 mi", "151.34 million mi");
		Planet jupiter = new Planet("Jupiter", "272,946 mi", "483.8 million mi");
		Planet uranus = new Planet("Uranus", "99,786 mi", "1.784 billion mi");
		Planet saturn = new Planet("Saturn", "235,298 mi", "890.8 million mi");
		Planet neptune = new Planet("Neptune", "96,685.4 mi", "2.793 billion mi");
		Planet pluto = new Planet("Pluto", "4,494 mi", "39.5 astronomical units");



 */
		Earth earth = new Earth("Earth", "24,901 mi", "92.96 million mi");
		Uranus uranus = new Uranus("Uranus", "99,786 mi", "1.784 billion mi");
		Saturn saturn = new Saturn("Saturn", "235,298 mi", "890.8 million mi");
		Neptune neptune = new Neptune("Neptune", "96,685.4 mi", "2.793 billion mi");
		Jupiter jupiter = new Jupiter("Jupiter", "272,946 mi", "483.8 million mi");
		Venus venus = new Venus("Venus", "23,628 mi", "67.24 million mi");
		Mercury mercury = new Mercury("Mercury", "9,525.1 mi", "35.98 million mi");
		Mars mars = new Mars("Mars", "13,263 mi", "151.34 million mi");
		Pluto pluto = new Pluto("Pluto", "4,494 mi", "39.5 astronomical units");

		System.out.println(mercury);
		System.out.println(venus);
		System.out.println(earth);
		System.out.println(mars);
		System.out.println(jupiter);
		System.out.println(uranus);
		System.out.println(saturn);
		System.out.println(neptune);
		System.out.println(pluto);



	}


}
