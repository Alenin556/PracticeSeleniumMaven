package data;


import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import lombok.Value;
import java.util.Locale;


public class Data {

    static Faker faker = new Faker();
    static FakeValuesService fakeValuesService = new FakeValuesService(
            new Locale("en-GB"), new RandomService());

    public static String generateName () {
        var name = fakeValuesService.regexify("[a-z1-9]{10}");
        return name;
    }

    public static String generateEmail () {
        var email = fakeValuesService.bothify("????##@gmail.com");
        return email;
    }

    public static String generatePassword () {
        var password = fakeValuesService.regexify("[a-z1-9]{10}");
        return password;
    }

    public static String generateDate () {
        var password = faker.date().birthday().toString();
        return password;
    }


    public static UserInformation validUserInformation() {
        return new UserInformation (generateName(),generateEmail(),generatePassword());
    }


    @Value
    public static class UserInformation {
        private String name, email, password;
    }
}
