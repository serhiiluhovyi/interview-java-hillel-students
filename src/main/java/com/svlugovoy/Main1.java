package com.svlugovoy;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Main1 {
    public static void main(String[] args) {
        Employee employee1 =
            new Employee(12L, "Ivan", "Ivanov", LocalDate.of(1990, 10, 10), "IT");

        Employee employee2 =
            new Employee(12L, "Petr", "Petrov", LocalDate.of(1995, 11, 11), "Finance");

        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println(employee1.equals(employee2));

    }
}

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birth;
    private String department;

    public boolean equals(Employee employee) {
        return this.id.equals(employee.id);
    }

//    public int hashCode() {
//        return 42;
//    }

    public int hashCode() {
        return ThreadLocalRandom.current().nextInt(0,1_000_000);
    }
}


