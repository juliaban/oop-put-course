public class BaseActor {
    private String firstName;
    private String lastName;

    public BaseActor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return String.format("%s %s", this.firstName, this.lastName);
    }
}