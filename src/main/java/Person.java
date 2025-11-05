public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person that) {
        int compareLastName = this.lastName.compareTo(that.lastName);
        int compareFirstName = this.firstName.compareTo(that.firstName);
        if (compareLastName == 0){
            return compareFirstName;
        }
        if (compareLastName == 0 && compareFirstName == 0){
            if(this.age < that.age) {
                return -1;
            }
            if (this.age > that.age) {
                return 1;
            }
            return 0;
        }
        return compareLastName;
    }

    @Override
    public String toString(){
        return String.format("%s %s, %d", lastName, firstName, age);
    }

}
