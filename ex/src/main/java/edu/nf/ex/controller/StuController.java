package edu.nf.ex.controller;

import edu.nf.ex.service.StuService;

public class StuController {

    private StuService service;

    public void setService(StuService service) {
        this.service = service;
    }

    public void eat(){
        service.add();
    }
}
