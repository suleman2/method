package com.payment.method.controller;

import com.payment.method.service.StripeService;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController
{
    private StripeService paymentsService;

    @GetMapping("/index")
    public String index()
    {
        return "index";
    }
    @GetMapping("/charge")
    public String charge()
    {
        return "charge";
    }
    @PostMapping("/checkout")
    public String checkout()
    {
        return "checkout";
    }

}
