package guru.springframework.model;

/**
 * Created by jt on 2018-12-09.
 */
public class UserCommand {
    private String firstName;
    private String lastName;
    private String email;

    private String desc;

    public UserCommand() {
    }

    public UserCommand(String firstName, String lastName, String email, String desc) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.desc = desc;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "UserCommand{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
