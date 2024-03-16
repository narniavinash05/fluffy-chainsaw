package org.studyeasy.SpringStarter.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.studyeasy.SpringStarter.Models.Post;
import org.studyeasy.SpringStarter.services.PostService;

@Controller
public class HomeController {

    @Autowired
    private PostService postservice;

    @GetMapping("/")
    public String home(Model model){
        List<Post> posts = postservice.getAll(); 
        model.addAttribute("posts", posts);
        return "home";
    }

}
