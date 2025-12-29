import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Student("Ali", "Arystan", 2.3));
        people.add(new Employee("Sultanali", "Rakhmetolla", "Cybersecurity", 27045.78));
        people.add(new Student("Dmitrii", "Gagarin", 3.5));
        people.add(new Employee("Abylay", "Opayev", "Software Engineer", 50000.00));

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.println(
                    p.toString() + " earns " +
                            String.format("%.2f", p.getPaymentAmount()) +
                            " tenge"
            );
        }
    }
}
