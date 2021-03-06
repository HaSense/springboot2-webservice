package com.fourirsw.springboot.web;

import com.fourirsw.springboot.dto.PostsResponseDto;
import com.fourirsw.springboot.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor //추가
@Controller
public class IndexController {

    private final PostsService postsService;

//    @GetMapping("/")
//    public String index() {
//        return "index";
//    }

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("posts", postsService.findAllDesc());

        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }
}
