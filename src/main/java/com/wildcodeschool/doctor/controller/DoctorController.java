package com.wildcodeschool.doctor.controller;

import com.wildcodeschool.doctor.model.Doctor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import com.wildcodeschool.doctor.model.Doctor;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class DoctorController {

    @GetMapping("/doctor/{number}")
    @ResponseBody
    public Doctor getDoctorByNumber(@PathVariable("number") String number) {
        int num = Integer.parseInt(number);
        if (num == 13) {
            Doctor doctor = new Doctor(13, "Jodie Whittaker");
            return doctor;
        } else if (num >= 1 && num <= 12) {
            throw new ResponseStatusException(HttpStatus.SEE_OTHER, "error 303");
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Doctor Not Found");
        }
    }
}
