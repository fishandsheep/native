package com.example.demo.converter;

import com.example.demo.enums.SexEnum;
import jakarta.persistence.AttributeConverter;

public class SexEnumConverter implements AttributeConverter<SexEnum, Integer> {

    @Override
    public Integer convertToDatabaseColumn(SexEnum sexEnum) {
        return sexEnum.getCode();
    }

    @Override
    public SexEnum convertToEntityAttribute(Integer code) {
        return SexEnum.fromCode(code);
    }
}
