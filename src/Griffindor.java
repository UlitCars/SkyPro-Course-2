public class Griffindor extends Hogwarts {
    int nobility;
    int honor;
    int braveriy;

    public Griffindor(String name, int power, int transgression, int nobility, int honor, int braveriy) {
        super(name, power, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.braveriy = braveriy;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBraveriy() {
        return braveriy;
    }

    public void innerCompareTo(Griffindor other){
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println("У студента " + other.getName() + " больше очков.");
        } else if (this.scoreSum() > other.scoreSum()) {
            System.out.println("У студента " + this.getName() + " больше очков.");
        } else {
            System.out.println("У студентов равное количество очков");
        }
    }

    private int scoreSum () {
        return nobility + honor + braveriy;
    }

    @Override
    public String toString(){
        return super.toString() + ", nobility = " + nobility + ", honor = " + honor + ", bravery = " + braveriy;
    }
}
