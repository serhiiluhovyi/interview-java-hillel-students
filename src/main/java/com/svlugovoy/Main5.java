package com.svlugovoy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main5 {

  public static void main(String[] args) {

    Date date = new Date();
    List<String> phones = new ArrayList<String>() {{
      add("111");
      add("222");
    }};

    ImmutablePerson person = new ImmutablePerson("John", date, phones);

    System.out.println(person);

//    person.setName("Anna");
//    System.out.println(person);
//
//    date.setTime(22222222L);
//    System.out.println(person);
//
//    person.getDate().setTime(123456L);
//    person.getPhones().add("333");
//    phones.remove(0);
//    phones.add(0, "777");
//    System.out.println(person);

  }

}


class ImmutablePerson {

  private String name;
  private Date date;
  private List<String> phones;

  public ImmutablePerson(String name, Date date, List<String> phones) {
    this.name = name;
    this.date = date;
    this.phones = phones;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public List<String> getPhones() {
    return phones;
  }

  public void setPhones(List<String> phones) {
    this.phones = phones;
  }

  @Override
  public String toString() {
    return "ImmutablePerson{" +
        "name='" + name + '\'' +
        ", date=" + date +
        ", phones=" + phones +
        '}';
  }
}


