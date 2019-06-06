package Demo;

public class Users {
    private String name;

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
