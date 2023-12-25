package com.prakashdev.photos.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class PhotosController {
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}