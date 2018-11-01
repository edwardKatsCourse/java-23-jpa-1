package com.telran.jpaexample1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PLRequest {
    private String programmingLanguage;
    private Integer programmersCount;
}
