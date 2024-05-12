public class Slytherin extends Hogwarts{
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int powerLost;

    public Slytherin(String name, int power, int transgression, int cunning, int determination, int ambition, int resourcefulness, int powerLost) {
        super(name, power, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerLost = powerLost;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPowerLost() {
        return powerLost;
    }

    public void innerCompareTo(Slytherin other){
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println("У студента " + other.getName() + " больше очков.");
        } else if (this.scoreSum() > other.scoreSum()) {
            System.out.println("У студента " + this.getName() + " больше очков.");
        } else {
            System.out.println("У студентов равное количество очков");
        }
    }

    private int scoreSum () {
        return cunning + determination + ambition + resourcefulness + powerLost;
    }

    @Override
    public String toString() {
        return super.toString() + ", cunning = " + cunning + ", determination = " + determination + ", ambition = " + ambition + ", resourcefulness = " + resourcefulness + ", powerLost = " + powerLost;
    }
}

