package edu.nf.ch17.service.impl;

import edu.nf.ch17.service.StuService;
import org.springframework.stereotype.Service;

@Service("stuService")
public class StuServiceImpl implements StuService {
    @Override
    public String save(String name) {
        System.out.println("插入："+name);
        return "success";
    }
}
