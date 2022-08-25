package com.example.apitest;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tag {
    private long tagId;
    private String tagName;
    private String tagInfo;


}
