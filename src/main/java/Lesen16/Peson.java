package Lesen16;

import java.time.LocalDateTime;

public class Peson {
    private String name;
    private String lastName;
    private String country;
    private LocalDateTime dob;
    private String username;
    private String password;

    public static int qwe = 5;

    public Peson() {
    }

    public Peson(String name, String lastName, String country, LocalDateTime dob, String username, String password) {
        this.name = name;
        this.lastName = lastName;
        this.country = country;
        this.dob = dob;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Peson peson = (Peson) o;

        if (name != null ? !name.equals(peson.name) : peson.name != null) return false;
        if (lastName != null ? !lastName.equals(peson.lastName) : peson.lastName != null) return false;
        if (country != null ? !country.equals(peson.country) : peson.country != null) return false;
        if (dob != null ? !dob.equals(peson.dob) : peson.dob != null) return false;
        if (username != null ? !username.equals(peson.username) : peson.username != null) return false;
        return password != null ? password.equals(peson.password) : peson.password == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Peson{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", dob=" + dob +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}