package guru.springframework.model;

public class LombokAppRunner {

    public static void main(String[] args) {

        User user = new User();
        user.setFirstName("First");
        user.setLastName("Last");
        user.setEmail("user@gmail.com");
        System.out.println(user);

        User alex = new User("Alex", "Tester", "spam@gmail.com");
        System.out.println(user);

        User jack = User.builder()
                .firstName("Jack")
                .lastName("QA")
                .email("jack@yahoo.com")
                .build();
        System.out.println(jack);
    }
}
