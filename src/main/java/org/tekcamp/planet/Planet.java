package org.tekcamp.planet;

public abstract class Planet {

    private String planetName;
    private String circumference;
    private String distanceFromSun;

    public Planet(String planetName, String circumference, String distanceFromSun) {
        this.planetName = planetName;
        this.circumference = circumference;
        this.distanceFromSun = distanceFromSun;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "planetName='" + planetName + '\'' +
                ", circumference='" + circumference + '\'' +
                ", distanceFromSun='" + distanceFromSun + '\'' +
                '}';
    }

    /*
	Properties :
		- planetName;
		- circumference;
		- distanceFromSun;
	*/
}
