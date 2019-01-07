package com.example;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * https://github.com/FasterXML/jackson-dataformat-xml
 */
@Controller
public class StudentController {

    private Student student = new Student(1, "text", 20, "234242141423");

    /**
     * using Jackson to xml
     */
    @RequestMapping(name = "/jack", method = RequestMethod.GET)
    @ResponseBody
    public Student jacksonHandle() {
        return student;
    }

    /**
     * using JAXB to xml
     */
    @RequestMapping(name = "/jaxb", method = RequestMethod.GET, consumes = MediaType.TEXT_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public Student jaxbHandle() {
        return student;
    }

    @RequestMapping(name = "/jaxb", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public Student jaxbPostHandle(@RequestBody Student student) {
        System.out.println(student);
        return student;
    }
    /*
    <xml>
        <id>234</id>
        <name>txt</name>
        <age>20</age>
        <phone>234242141423</phone>
    </xml>
     */
}
