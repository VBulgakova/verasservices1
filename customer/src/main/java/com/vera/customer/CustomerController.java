package com.vera.customer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Slf4j
@RestController
@RequestMapping("api/v1/customers")
@AllArgsConstructor
public class CustomerController{

    private final CustomerService customerService;

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
        log.info("new customer registration {}", customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
        List<Integer> l=new ArrayList<>();
//        List<String> immutableList = Collections.unmodifiableList(mutableList);

    }
}
