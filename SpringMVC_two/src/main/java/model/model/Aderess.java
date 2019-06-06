package model.model;

        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.stereotype.Component;

@Component
public class Aderess {
    public String country;
    public String city;

    public Aderess(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }
}
