package com.example.demo.dao;

import com.example.demo.converter.SexEnumConverter;
import com.example.demo.enums.SexEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDao {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "user_name")
    private String userName;

    @Convert(converter = SexEnumConverter.class)
    @Column
    private SexEnum sex;

    private String desc;


}
