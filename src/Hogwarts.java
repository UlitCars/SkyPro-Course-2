public abstract class Hogwarts {
    public final String name;
    public final int power;
    public final int transgression;

    public Hogwarts(String name, int power, int transgression) {
        this.name = name;
        this.power = power;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getTransgression() {
        return transgression;
    }

    public void compareTo(Hogwarts other){
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println("У студента " + other.getName() + " больше очков.");
        } else if (this.scoreSum() > other.scoreSum()) {
            System.out.println("У студента " + this.getName() + " больше очков.");
        } else {
            System.out.println("У студентов равное количество очков");
        }
    }

    private int scoreSum(){
        return power + transgression;
    }

    @Override
    public String toString() {
        return "name = " + name + '\'' +
                ", power = " + power +
                ", transgression = " + transgression;
    }
}

