import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Griffindor potter = new Griffindor("Garry Potter", 10, 5, 3, 7, 1);
        Slytherin malfoy = new Slytherin("Drako Malfoy", 7, 4, 3, 6,1, 3, 4);
        Hufflepuff sedrik = new Hufflepuff("Sedrik Diggory", 8, 5, 4,3,3);
        Ravenclaw bob = new Ravenclaw("Bob Marley", 10, 5, 7, 3, 2, 6);
        Griffindor germiona = new Griffindor("Germiona Greinjer", 8, 6, 5, 8, 2);


        System.out.println(potter);
        potter.innerCompareTo(germiona);
        germiona.compareTo(malfoy);
    }
}