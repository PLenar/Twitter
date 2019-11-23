package pl.piotrlenar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.piotrlenar.entities.User;
import pl.piotrlenar.repositories.UserRepository;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @ModelAttribute("user")
    public User createUser(){
        return new User();
    }


    @GetMapping("/add")
    public String addUser(){
        return "user-form";
    }

    @PostMapping("/add") //TODO: Jak zrealizować zalogowanie użytkownika??
    public String processUser(@Valid @ModelAttribute User user, BindingResult result, Model model){
        if (result.hasErrors()){
            return "user-form";
        }
        userRepository.save(user);
        model.addAttribute("user", user);
        return "user-success";
    }


}
