package org.aptech.t2208e.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Employee {
    private Long id;
    private String full_name;
    private Date birth_day;
    private String address;
    private String department;
    private String position;
}
