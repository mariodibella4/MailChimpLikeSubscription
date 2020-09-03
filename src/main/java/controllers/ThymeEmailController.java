package controllers;

import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import repositories.SubscriptionRepo;

@Controller
public class ThymeEmailController {
    @Autowired
    private SubscriptionRepo subscriptionRepo;

    @GetMapping("/subscribe")
    public String showEmails(Model model) {
        model.addAttribute("email", new User()); // New Book to add
        model.addAttribute("emails", subscriptionRepo.findAll());
        return "emails";
    }

    @PostMapping("/subscribe")
    public String addEmail(@ModelAttribute("email") User email){
        subscriptionRepo.save(email);
        return "Thank you for your subscription!";
    }
}
