package com.okta.springbootvue.ex1;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Hello {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String message;

}