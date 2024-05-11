public class Hufflepuff extends Hogwarts{
    private final int hardworking;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int power, int transgression, int hardworking, int loyalty, int honesty) {
        super(name, power, transgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void innerCompareTo(Hufflepuff other){
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println("У студента " + other.getName() + " больше очков.");
        } else if (this.scoreSum() > other.scoreSum()) {
            System.out.println("У студента " + this.getName() + " больше очков.");
        } else {
            System.out.println("У студентов равное количество очков");
        }
    }

    private int scoreSum () {
        return hardworking + loyalty + honesty;
    }

    @Override
    public String toString() {
        return super.toString() + ", hardworking = " + hardworking + ", loyalty = " + loyalty + ", honesty = " + honesty;
    }
}
