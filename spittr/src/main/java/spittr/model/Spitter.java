package spittr.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by lssemail on 2018/1/5.
 */
public class Spitter {

    private Long id;

    @NotNull
    @Size(min = 5, max = 10, message = "{firstname.size}")
    private String firstname;

    @NotNull
    @Size(min = 5, max = 10, message = "{lastname.size}")
    private String lastname;

    @NotNull
    @Size(min = 5, max = 10, message = "{username.size}")
    private String username;

    @NotNull
    @Size(min = 5, max = 10, message = "{password.size}")
    private String password;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Spitter{" +
                "firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
