package com.example.csvconvertertask;

import org.springframework.batch.item.ItemProcessor;

public class PersonProcessor implements ItemProcessor<Person, Person> {

    @Override
    public Person process(Person item) throws Exception {
        int dateOfBirth = Integer.parseInt(item.getDateOfBirth().substring(0,3));
        String age = String.valueOf(2022-dateOfBirth);
        return new Person(item.getName(), item.getSurname(), age);
    }

}
