public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Ann")
                .setSurname("Wolf")
                .setAge(31)
                .setAddress("Sidney")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Tony")
                .build();
        System.out.println(mom + " has son " + son);

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
