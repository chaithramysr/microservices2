package com.example.ratingService.controller;


import com.example.ratingService.entity.Rating;
import com.example.ratingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/addRating")
    public String addRating(@RequestBody Rating rating) {
        return ratingService.addRating(rating);
    }

    @GetMapping("/getAllRatings")
    public List<Rating> getAllRatings() {
        return ratingService.getAllRatings();
    }

   @GetMapping("/getRatingByRatingId/{ratingId}")
    public Rating getRatingByRatingId(@PathVariable String ratingId) {
        return ratingService.getRatingByRatingId(ratingId);
    }
    @PutMapping("/updateRating")
    public String updateRating(@RequestBody Rating rating) {
        return ratingService.updateRating(rating);
    }
    @DeleteMapping("/deleteRating/{ratingId}")
    public String deleteRating(@PathVariable String ratingId) {
        return ratingService.deleteRating(ratingId);
    }

}
