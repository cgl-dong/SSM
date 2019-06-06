package yes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("peo")
public class People {
    /*注解的位置不同，可以在变量前，也可以在set方法前*/
    @Value("Jack")
    private String name;
    private int age;
    private String sex;
    private int height;
    @Resource
    private Car c;
    @Value("21")
    public void setAge(int age) {
        this.age = age;
    }


    @Value("男")
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Value("173")
    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name: "+name+" age: "+age+" height: "+height+" sex: "+sex);
    }

    public void disPlay(){
        System.out.println(c.name);
    }
}
