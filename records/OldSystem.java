package records;

import java.util.Objects;

public class OldSystem {

    private final int age;
    private final String name;

    public OldSystem(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OldSystem oldSystem)) return false;
        return age == oldSystem.age && Objects.equals(name, oldSystem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "OldSystem{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
