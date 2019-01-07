package com.example;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@JacksonXmlRootElement(localName = "xml") //jackson
@XmlRootElement //jaxb
public class Student {
    private long id;
    private String name;
    private long age;
    private String phone;

    public Student(long id, String name, long age, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
}
