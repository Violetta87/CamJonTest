package com.example.camjontest.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="Camella")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Dog {

    @Id
            @GeneratedValue()
    Long id;
    @Column
    String name;
    @Column
    String race;
    @Column
    int age;
    @Column
    Double price;

    public Dog(String name, String race, int age, Double price) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.price = price;
    }
}
