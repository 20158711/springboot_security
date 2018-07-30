package com.example.demo.po;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Permission {

    @Getter @Setter
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Setter @Getter
    private String name;

    @Setter @Getter
    private String description;

    @Setter @Getter
    private String url;

    @Setter @Getter
    private Integer pid;

}
