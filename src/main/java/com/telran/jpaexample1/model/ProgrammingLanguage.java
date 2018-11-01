package com.telran.jpaexample1.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "PROGRAMMING_LANGUAGE")
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "LANGUAGE_NAME", unique = true)
    private String languageName;
    private Integer programmersCount;
}
