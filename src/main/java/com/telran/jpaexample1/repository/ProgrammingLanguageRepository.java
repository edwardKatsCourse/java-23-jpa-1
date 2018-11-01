package com.telran.jpaexample1.repository;

import com.telran.jpaexample1.model.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
    boolean existsByLanguageName(String languageName);
    ProgrammingLanguage findByLanguageName(String languageName);
}
