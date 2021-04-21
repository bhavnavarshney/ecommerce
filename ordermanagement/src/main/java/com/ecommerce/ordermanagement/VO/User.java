package com.ecommerce.ordermanagement.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Long ID;
    private String name;
    private String password;
    private String address;
    private String contactNo;
    private String emailAddress;
}