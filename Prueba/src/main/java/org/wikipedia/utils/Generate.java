package org.wikipedia.utils;

import com.github.javafaker.Faker;
import org.wikipedia.models.CreateCounts;

public class Generate
{
    private static final Faker FAKER = new Faker();

    public static CreateCounts dates()
    {
        return new CreateCounts(FAKER.name().username(),
                FAKER.bothify("??????????????"),
                FAKER.letterify("???????@gmail.com")
        );
    }
}
