public class PersonDemo {
    public static void main(String[] args) {

        // Skapa instanser av klassen Person
        Person p1; // p1 är en referensvariabel
        p1 = new Person(); // ett objekt skapas

        // Skriv ut objektet
        System.out.println(p1); // Hash-kod  Person@23fc625e
        System.out.println(p1.firstName);  // null
        System.out.println(p1.lastName);  // null
        System.out.println(p1.dateOfBirth); // null
        System.out.println(p1.height); // 0.0
        System.out.println(p1.weight); // 0.0

        // Ändra namnet
        p1.firstName = "Aixia";
        p1.lastName = "Zhong";

        // Skriv ut hela namnet m.h.a. en metod
        String name = Person.getName(p1);
        System.out.println(name);

        System.out.println(Person.getName(p1));

        // Arbeta med ålder
        p1.dateOfBirth = "1985-08-27";
        Person.getAge(p1);
        System.out.println("Ålder: " + Person.getAge(p1) + " år");

        // Arbeta med BMI
        double BMI = Person.getBMI(p1);
        System.out.println(BMI); // NaN = Not A Number
        p1.height = 1.60; // m
        p1.weight = 45; // Kg
        System.out.printf("BMI: %.2f \n" , Person.getBMI(p1));

        // Visa viktklassen
        String viktklass = Person.getBMICategory(p1);
        System.out.println("Viktklass: " + viktklass);

    }
}

