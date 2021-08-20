public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be less than 0");
        }
        this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    public Person build() {
        if (this.name == null || this.surname == null) {
            StringBuilder sb = new StringBuilder();
            if (this.name == null) {
                sb.append("name is empty");
                if (this.surname == null){
                    sb.append(" and ");
                }
            }
            if (this.surname == null){
                sb.append("surname is empty");
            }
            throw new IllegalStateException(sb.toString());
        }
        return new Person(name, surname, age, city);
    }

}
