package homework6;


public enum Planets implements Comparable<Planets> {
    MERCURY("Mercury", 1, 0, false, 0.06), VENUS("Venus", 2, 0, false, 0.82), EARTH("Earth", 3, 1, false, 1),
    MARS("Mars", 4, 2, false, 0.11), JUPITER("Jupiter", 5, 67, true, 317.8), SATURN("Saturn", 6, 62, true, 95.2),
    URANUS("Uranus", 7, 27, true, 14.6), NEPTUNE("Neptune", 8, 14, true, 17.2);

    private int number;
    private double mass;
    private boolean rings;
    private int moons;
    private String name;


    private Planets(String name, int number, int moons, boolean rings, double mass){
        this.number = number;
        this.moons = moons;
        this.rings = rings;
        this.mass = mass;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return String.format("Name = %s, number = %d, mass = %.2f, " +
                "moons = %d, rings = %b", name, number, mass, moons, rings);
    }
}
