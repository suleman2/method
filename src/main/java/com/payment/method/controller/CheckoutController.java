package com.payment.method.controller;

import com.stripe.Stripe;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/*
* creating a controller to prepare the model with the necessary information that the checkout form needs
* define STRIPE_PUBLIC_KEY as an environment variable
* set a product/sale id that could be used to fetch the actual values
*  */
@Controller
public class CheckoutController
{
    //@Value("${pk_test_8Z1vSrzQpUGNbKFixRLOaaf800PGkpibW2}")
    private String publicKey;
    @RequestMapping("/checkout")
    public String checkout(Model model)
    {
        Stripe.apiKey="pk_test_8Z1vSrzQpUGNbKFixRLOaaf800PGkpibW2";
        model.addAttribute("amount", 50 * 100); // in cents
        model.addAttribute("stripePublicKey", Stripe.apiKey);
        model.addAttribute("currency", ChargeRequest.Currency.EUR);
        return "checkout";
    }
}
