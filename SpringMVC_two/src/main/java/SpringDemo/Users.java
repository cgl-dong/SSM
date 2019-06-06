package SpringDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Users {
    @Value("TomCat")
    private String name;

    public void show(){
        System.out.println("name: "+name);
    }
}
