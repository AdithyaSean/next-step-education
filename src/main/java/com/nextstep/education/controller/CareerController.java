package com.nextstep.education.controller;

import com.nextstep.education.model.Career;
import com.nextstep.education.service.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/careers")
public class CareerController {
    
    @Autowired
    private CareerService careerService;
    
    @GetMapping
    public List<Career> getAllCareers() {
        return careerService.getAllCareers();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Career> getCareerById(@PathVariable Long id) {
        return careerService.getCareerById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public Career createCareer(@RequestBody Career career) {
        return careerService.createCareer(career);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Career> updateCareer(@PathVariable Long id, @RequestBody Career career) {
        return careerService.getCareerById(id)
                .map(existingCareer -> ResponseEntity.ok(careerService.updateCareer(id, career)))
                .orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCareer(@PathVariable Long id) {
        return careerService.getCareerById(id)
                .map(career -> {
                    careerService.deleteCareer(id);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
