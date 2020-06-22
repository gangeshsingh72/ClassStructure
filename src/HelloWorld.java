public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        Person firstObjectPerson = new Person();
        Person secondObjectPerson = new Person();
        firstObjectPerson.setFirstName("Gangesh");
        firstObjectPerson.setLastName("Singh");
        firstObjectPerson.setAge(25);

        System.out.println("My first object details are "+ firstObjectPerson.getFirstName() + " " + firstObjectPerson.getLastName());
    }
}
