package yes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Food {
    @Value("apple")
    public String name;

    public String getName() {
        return name;
    }
}
