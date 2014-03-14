/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.services.crud.Impl;

import com.tp2domainmodel.domainmodel.model.Staff.Driver;
import com.tp2domainmodel.domainmodel.services.crud.DriverCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wesley
 */
public class DriverCrudServiceImpl implements DriverCrudService{
    
     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Driver find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Driver persist(Driver entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Driver merge(Driver entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Driver remove(Driver entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Driver> findAll() {
        return null;
    }
    
}
