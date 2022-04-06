package com.fastcampus.javaallinone.project3.mycontact.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonNotFoundException extends RuntimeException{

    private static final String MESSAGE = "PersonEntityがありません。";

    public PersonNotFoundException() {
        super(MESSAGE);
        log.error(MESSAGE);
    }
}
