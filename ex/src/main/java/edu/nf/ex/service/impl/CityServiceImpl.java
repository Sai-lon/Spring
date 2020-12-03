package edu.nf.ex.service.impl;

import edu.nf.ex.dao.CityDao;
import edu.nf.ex.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("cityService")
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;

    @Autowired
    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public void service() {
        System.out.println("city");
        cityDao.list();
    }
}
