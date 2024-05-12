import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Griffindor potter = new Griffindor("Garry Potter", 10, 5, 3, 7, 1);
        Slytherin malfoy = new Slytherin("Drako Malfoy", 7, 4, 3, 6,1, 3, 4);
        Hufflepuff sedrik = new Hufflepuff("Sedrik Diggory", 8, 5, 4,3,3);
        Ravenclaw bob = new Ravenclaw("Bob Marley", 10, 5, 7, 3, 2, 6);
        Griffindor germiona = new Griffindor("Germiona Greinjer", 8, 6, 5, 8, 2);
        Griffindor ron = new Griffindor("Ron Uizli", 8, 4, 4, 8, 2);
        Hufflepuff dzhifford = new Hufflepuff("Dzhifford Abbot", 7, 5, 7, 1, 2);
        Hufflepuff siuzen = new Hufflepuff("Siuzen Bounce", 8, 5, 9, 2, 4);
        Ravenclaw badia = new Ravenclaw("Badia Ali", 9, 5, 7, 2, 3,1);
        Ravenclaw randolf = new Ravenclaw("Randolf Barrou", 10, 6, 7, 2, 4, 2);
        Slytherin uchi = new Slytherin("Uchi Akimbo", 10, 5, 8, 3, 5, 3, 6);
        Slytherin san = new Slytherin("San Bakar", 9, 6, 7, 4, 6, 2, 4);


        System.out.println(san);
        System.out.println(uchi);
        System.out.println(randolf);
        System.out.println(badia);
        System.out.println(siuzen);
        System.out.println(dzhifford);
        System.out.println(ron);
        System.out.println(germiona);
        System.out.println(bob);
        System.out.println(sedrik);
        System.out.println(malfoy);
        System.out.println(potter);
        potter.innerCompareTo(germiona);
        germiona.compareTo(malfoy);
        bob.innerCompareTo(badia);
        badia.innerCompareTo(randolf);
        germiona.innerCompareTo(ron);
        malfoy.innerCompareTo(uchi);
        uchi.innerCompareTo(san);
        sedrik.innerCompareTo(dzhifford);
        dzhifford.innerCompareTo(siuzen);
        potter.compareTo(malfoy);
        malfoy.compareTo(siuzen);
        sedrik.compareTo(san);
        siuzen.compareTo(randolf);


    }
}
