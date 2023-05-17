package StreamPractice;

import java.util.Objects;
import java.util.Optional;

public class OptionalExample {

    public static  Optional<String> getName(){
        String name ="Raju singh";
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {

        String str ="This is an optional class";
        String str2 = null;
        Optional<String> objects = Optional.of(str);
        System.out.println(objects.isPresent());
        System.out.println(objects.get());
        System.out.println(objects.orElse("No value found"));

        Optional<String> object = Optional.ofNullable(str2);
        System.out.println(object.isPresent());
       // System.out.println(object.get());
        System.out.println(object.orElse("No value found"));

        Optional<String> name = getName();
        System.out.println(name.orElse("No name available"));
    }
}
