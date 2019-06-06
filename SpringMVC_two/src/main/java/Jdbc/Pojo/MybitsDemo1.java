package Jdbc.Pojo;

public class MybitsDemo1 {
    private String name;
    private int id;
    private String age;

    @Override
    public String toString() {
        return "MybitsDemo1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
