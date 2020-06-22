package com.springdemo.controller;

import com.springdemo.entity.Customer;
import com.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/list")
    public String listOfCustomer(Model theModel){

        // get customer from DAO
        List<Customer> theCustomers = customerService.customerList();

        theModel.addAttribute("customer", theCustomers);

        return "customer-list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
        // create model attribute to bind the form data
        Customer theCustomer = new Customer();

        theModel.addAttribute("customer", theCustomer);

        return "add-customer";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer){
        customerService.addCustomer(theCustomer);
        return "redirect:/customer/list";
    }

    @GetMapping("/showFormForUpdate")
    public String updateCustomer(@RequestParam("customerId") int theId, Model theModel){
        Customer theCustomer = customerService.getCustomer(theId);

        theModel.addAttribute("customer", theCustomer);

        return "add-customer";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int theId){

        customerService.deleteTheCustomer(theId);

        return "redirect:/customer/list";
    }

    @GetMapping("/search")
    public String searchCustomer(@RequestParam("theSearchName") String name, Model theModel){

        List<Customer> theCustomer = customerService.getCustomerByName(name);

        theModel.addAttribute("customer", theCustomer);

        return "customer-list";
    }
}
