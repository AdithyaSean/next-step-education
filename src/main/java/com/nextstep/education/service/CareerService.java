package com.nextstep.education.service;

import com.nextstep.education.model.Career;
import com.nextstep.education.repository.CareerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CareerService {
    
    @Autowired
    private CareerRepository careerRepository;
    
    public List<Career> getAllCareers() {
        return careerRepository.findAll();
    }
    
    public Optional<Career> getCareerById(Long id) {
        return careerRepository.findById(id);
    }
    
    public Career createCareer(Career career) {
        return careerRepository.save(career);
    }
    
    public Career updateCareer(Long id, Career career) {
        career.setId(id);
        return careerRepository.save(career);
    }
    
    public void deleteCareer(Long id) {
        careerRepository.deleteById(id);
    }
} 