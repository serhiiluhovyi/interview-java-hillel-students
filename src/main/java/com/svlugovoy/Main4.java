package com.svlugovoy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Main4 {

  public static void main(String[] args) {

    List<Person> persons = returnTenPersons();

    List<Person> list1 = getPersonsWithSalaryGreatThen(persons, 6000);
    System.out.println(list1);
//    //[Person(id=5, firstName=Sergey, lastName=Sergeev, email=sergeev@gmail.com, salary=10000, gender=MALE),
//    // Person(id=6, firstName=Anna, lastName=Smith, email=anna@yahoo.com, salary=7000, gender=FEMALE),
//    // Person(id=10, firstName=Oksana, lastName=Ksu, email=ksuoks@gmail.com, salary=6500, gender=FEMALE)]


//    List<String> list2 = getOrderedPersonFirstNamesWithEmailContains(persons, "@gmail.com");
//    System.out.println(list2);
//    //[Anton, Ivan, Oksana, Petr, Rita, Sergey, Zina]


//    Map<String, Long> map = calculateLetterCount(Arrays.asList("a", "b", "a", "b", "a", "c"));
//    System.out.println(map);
//    //{a=3, b=2, c=1}


//    Map<Gender, List<Long>> list3 = getPersonIdsListsGroupByGender(persons);
//    System.out.println(list3);
//    //{FEMALE=[2, 4, 6, 8, 10], MALE=[1, 3, 5, 7, 9]}

  }



  private static List<Person> getPersonsWithSalaryGreatThen(List<Person> list, int salary) {
    //todo
    throw new RuntimeException("Please implement me!!!");
  }


  private static List<String> getOrderedPersonFirstNamesWithEmailContains(List<Person> list,
      String str) {
    //todo
    throw new RuntimeException("Please implement me!!!");
  }


  private static Map<String, Long> calculateLetterCount(List<String> letters) {

    //todo
    throw new RuntimeException("Please implement me!!!");
  }


  private static Map<Gender, List<Long>> getPersonIdsListsGroupByGender(List<Person> list) {
    //todo
    throw new RuntimeException("Please implement me!!!");
  }


  private static List<Person> returnTenPersons() {
    List<Person> list = new ArrayList<Person>() {{
      add(new Person(1L, "Ivan", "Ivanov", "ivan@gmail.com", 2000, Gender.MALE));
      add(new Person(2L, "Sveta", "Ivanova", "sveta@ukr.net", 3000, Gender.FEMALE));
      add(new Person(3L, "Petr", "Petrov", "petro@gmail.com", 5000, Gender.MALE));
      add(new Person(4L, "Zina", "Sidorova", "zina@gmail.com", 2500, Gender.FEMALE));
      add(new Person(5L, "Sergey", "Sergeev", "sergeev@gmail.com", 10000, Gender.MALE));
      add(new Person(6L, "Anna", "Smith", "anna@yahoo.com", 7000, Gender.FEMALE));
      add(new Person(7L, "Igor", "Igorev", "igor@ukr.net", 4500, Gender.MALE));
      add(new Person(8L, "Rita", "Rock", "rock@gmail.com", 3000, Gender.FEMALE));
      add(new Person(9L, "Anton", "Antonov", "anton@gmail.com", 5500, Gender.MALE));
      add(new Person(10L, "Oksana", "Ksu", "ksuoks@gmail.com", 6500, Gender.FEMALE));
    }};
    return list;
  }
}

@AllArgsConstructor
@Getter
@Setter
@ToString
class Person {

  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private int salary;
  private Gender gender;

}

enum Gender {
  MALE,
  FEMALE
}
