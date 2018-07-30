package com.example.demo.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor @AllArgsConstructor
public class Msg {

    @Id
    private String title;
    private String content;
    private String etraInfo;

}
