package com.fastcampus.javaallinone.project3.mycontact.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RenameNotPermittedException extends RuntimeException{
    private static final String MSG = "名前の変更を許可しません。";

    public RenameNotPermittedException() {
        super(MSG);
        log.error(MSG);
    }
}
