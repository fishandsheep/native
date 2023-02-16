package com.example.demo.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum SexEnum {

    MAN(1),

    WOMAN(0);

    private int code;

    SexEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static SexEnum fromCode(int code) {
        for (SexEnum value : SexEnum.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        return null;
    }

}
