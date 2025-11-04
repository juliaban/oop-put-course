public class SupportingActor implements Actor {
    private String firstName;
    private String lastName;

    public SupportingActor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return String.format("%s %s", this.firstName, this.lastName);
    }

}
