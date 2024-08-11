package su.beehelit.codetask.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import su.beehelit.codetask.personality.LoginForm;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import org.springframework.validation.Errors;

@Controller
@RequestMapping("/login")
public class LoginController {
    @ModelAttribute(name = "loginForm")
    public LoginForm loginForm() {
        return new LoginForm();
    }

    @GetMapping
    public String showLoginForm() {
        return "login";
    }

    @PostMapping
    public String processLoginForm(@Valid LoginForm loginForm, Errors errors) {
        if (errors.hasErrors()) {
            return "login";
        }
        
        return "redirect:/";
    }
    
}