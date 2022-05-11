package Opgave3;

public class AnvendPersonAdmin {
    public static void main(String[] args) {
        Person p1 = new Person("bob",2);
        Person p2 = new Person("Hans",9);
        Person p3 = new Person("Bollette",7);

        PersonAdminstrator personAdminstrator1 = PersonAdminstrator.getInstance();
        PersonAdminstrator personAdminstrator2 = PersonAdminstrator.getInstance();

        personAdminstrator1.addPerson(p1);
        personAdminstrator1.addPerson(p2);
        personAdminstrator1.addPerson(p3);

        System.out.println(personAdminstrator2.getPersonSet());

    }
}
