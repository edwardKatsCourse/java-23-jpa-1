package com.telran.jpaexample1.controller;

import com.telran.jpaexample1.dto.PLRequest;
import com.telran.jpaexample1.model.ProgrammingLanguage;
import com.telran.jpaexample1.repository.ProgrammingLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgrammingLanguageController {

    //User
    //UserAccount
    //UserCredentials
    //UserInfo

    //id, firstName, lastName, lastLoginDate

    @Autowired
    private ProgrammingLanguageRepository repository;

    @PostMapping("pl/save")
    public ProgrammingLanguage save(@RequestBody PLRequest plRequest) {


        ProgrammingLanguage language = repository.findByLanguageName(plRequest.getProgrammingLanguage());

        if (language == null) {
            language = ProgrammingLanguage
                    .builder()
                    .languageName(plRequest.getProgrammingLanguage())
                    .programmersCount(plRequest.getProgrammersCount())
                    .build();
            repository.save(language);
        }


        return language;
    }

    @GetMapping("pl/all")
    public List<ProgrammingLanguage> getAll() {
        return repository.findAll();
    }
}
