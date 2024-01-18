package com.journaldev.controller;

import com.journaldev.domain.entity.Star;
import com.journaldev.domain.entity.enums.StarClass;
import com.journaldev.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stars")
public class StarController {
    @Autowired
    private StarService starService;

    @GetMapping("/search")
    public ResponseEntity<List<Star>> searchStars(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) StarClass starClass) {
        List<Star> result = starService.searchStars(name, starClass);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/starPage")
    public String showStarPage() {
        return "starPage";
    }
}


