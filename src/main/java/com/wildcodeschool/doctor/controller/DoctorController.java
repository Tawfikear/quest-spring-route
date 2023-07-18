package com.wildcodeschool.doctor.controller;

import com.wildcodeschool.doctor.model.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import com.wildcodeschool.doctor.model.Doctor;
@Controller
public class DoctorController {
    
    @GetMapping("/doctor{number}/")
    @ResponseBody
    public Doctor getDoctorByNumber(@PathVariable("number")String number) {
        if (number.equals("13")){
            Doctor doctor = new Doctor(13, "Jodie whittaker");
            return doctor;
        } else{ return null;
        }

        
    }
}
