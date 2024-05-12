public class Ravenclaw extends Hogwarts {
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(String name, int power, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, power, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void innerCompareTo(Ravenclaw other) {
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println("У студента " + other.getName() + " больше очков.");
        } else if (this.scoreSum() > other.scoreSum()) {
            System.out.println("У студента " + this.getName() + " больше очков.");
        } else {
            System.out.println("У студентов равное количество очков");
        }
    }

    private int scoreSum() {
        return intelligence + wisdom + wit + creativity;
    }

    @Override
    public String toString() {
        return super.toString() + ", intelligence = " + intelligence + ", wisdom = "
                + wisdom + ", wit = " + wit + ", creativity = " + creativity;
    }
}
