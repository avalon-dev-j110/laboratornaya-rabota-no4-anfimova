package ru.avalon.java.dev.j10.labs;

import java.util.Date;

public class PersonToSort implements Person{

    private String name;
    private Date birthDate;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Object o) {
        PersonToSort person = (PersonToSort) o;
        int nameCompare = name.compareTo(person.getName());
        int birthDateCompare = birthDate.compareTo(person.getBirthDate());
        // сначала nameCompare
        // затем, если имена одинаковые, то birthDateCompare
        if (nameCompare == 0) {
            if (birthDate.before(person.getBirthDate())) {
                return -1;
            } else if (birthDate.after(person.getBirthDate())) {
                return 1;
            } else {
                return birthDateCompare;
            }
        }
        return nameCompare;
    }

}
