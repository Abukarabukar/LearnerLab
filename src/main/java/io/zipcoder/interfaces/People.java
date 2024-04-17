package io.zipcoder.interfaces;

import java.util.Iterator;
import java.util.List;

import static io.zipcoder.interfaces.Person.personList;

public class People implements Iterable<Person>{


    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person) {
        for (Person p : personList) {
            if (p.equals(person)) {
                return true;
            }
        }
        return false;
    }

    public void remove(Person person) {
        personList.remove(person);
    }


    public void remove(long id) {
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }

    public void removeAll () {
            personList.clear();

    }

    public int count () {
      return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }




    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
