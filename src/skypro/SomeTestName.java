package skypro;

public class SomeTestName {
    private String name;

    public SomeTestName(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SomeTestName{" + "name=" + name + '}';
    }
}
