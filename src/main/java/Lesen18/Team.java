package Lesen18;

import java.util.ArrayList;
import java.util.Objects;

public class Team <T> {
    private String name;
    ArrayList<T>emploes=new ArrayList<>();

    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
        public void setName(String name) {
        this.name = name;
    }
    public void addEmploe(T e ){
        emploes.add (e);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        if (!Objects.equals(name, team.name)) return false;
        return Objects.equals(emploes, team.emploes);
    }
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (emploes != null ? emploes.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", emploes=" + emploes +
                '}';
    }
}
