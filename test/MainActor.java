public class MainActor implements Actor {
    private String firstName;
    private String lastName;

    public MainActor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return String.format("%s %s - MAIN", this.firstName, this.lastName);
    }

}
