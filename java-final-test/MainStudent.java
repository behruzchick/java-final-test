public class MainStudent {
    public static void main(String[] args) {
        Person person = new Person("Behruz" , "Jumobozor");
        Student student = new Student("John Doe" , "New York" , "Engineering" , 4 , 2.4);
        Staff staff = new Staff("Elizabate" , "London", "Garvard" , 2000);
        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);

    }
}
