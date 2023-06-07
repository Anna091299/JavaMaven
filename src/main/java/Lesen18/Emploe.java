package Lesen18;

import java.util.Objects;

public abstract class Emploe {
    private String name;
    private int Age;

    public Emploe() {
    }

    public Emploe(String name, int age) {
        this.name = name;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emploe emploe = (Emploe) o;

        if (Age != emploe.Age) return false;
        return Objects.equals(name, emploe.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Age;
        return result;
    }

    @Override
    public String toString() {
        return "Emploe{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }




}
