package io.loop.test.day8;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;


public class T2_java_faker {
    @Test
    public void java_faker() {
        Faker faker = new Faker();
        System.out.println("faker.name(),fullName() = " + faker.name().fullName());
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("202-###-####"));
        System.out.println("faker.letterify(\"???????\") = " + faker.letterify("?????????"));
        System.out.println("faker.bothify(\"#??#\") = " + faker.bothify("#??#"));
        System.out.println("faker.address() = " + faker.address().fullAddress());
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.chuckNorries().fact() = " + faker.chuckNorris().fact().replace("Chuck Norries", "Feyruz"));


    }
    }

