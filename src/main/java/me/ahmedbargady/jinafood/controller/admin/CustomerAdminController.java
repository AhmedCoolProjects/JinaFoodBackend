package me.ahmedbargady.jinafood.controller.admin;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import me.ahmedbargady.jinafood.model.Customer;
import me.ahmedbargady.jinafood.model.Gender;
import me.ahmedbargady.jinafood.service.CustomerService;

@Controller
@RequestMapping("/api/v1/admin/customers")
public class CustomerAdminController {
    private final CustomerService customerService;

    public CustomerAdminController(CustomerService customerService) {
        super();
        this.customerService = customerService;
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    @GetMapping
    public String customers(Model model) {
        model.addAttribute("title", "customers");
        model.addAttribute("customers", customerService.getall());
        return "admin/customers";
    }

    @PostMapping
    public void addCustomer(HttpServletRequest request, HttpServletResponse response) {
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        Gender gender = Gender.valueOf(request.getParameter("gender"));
        String adress = request.getParameter("adress");

        Customer em = new Customer(first_name, last_name, email, phone, gender, adress);
        customerService.add(em);
        try {
            response.sendRedirect("/api/v1/admin/customers");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/update/{id}")
    public void updateCustomer(HttpServletRequest request, HttpServletResponse response, @PathVariable String id) {
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        Gender gender = Gender.valueOf(request.getParameter("gender"));
        String adress = request.getParameter("adress");

        Customer em = new Customer(first_name, last_name, email, phone, gender, adress);
        em.setId(id);
        customerService.add(em);
        try {
            response.sendRedirect("/api/v1/admin/customers");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/delete/{id}")
    public void deleteCustomer(HttpServletResponse response, @PathVariable String id) {
        customerService.delete(id);
        try {
            response.sendRedirect("/api/v1/admin/customers");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
