// this class serves for creating a list of students
public class Wilder {

    // attributes
    private String firstName;
    private boolean present;

    // constructors
    public Wilder(String firstName) {
        this.firstName = firstName;
    }

    public Wilder(String firstName, boolean present) {
        this.firstName = firstName;
        this.present = present;
    }

    // getters
    public String getFirstName () {
        return this.firstName;
    }

    public boolean isPresent() {
        return this.present;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    // message to caller
    public String whoAmI() {
        if (this.present) {
            return ("My name is " + this.getFirstName() + " and I'm present");
        }
            else {
            return ("My name is " + this.getFirstName() + " and I'm not present");
        }
    }
}
