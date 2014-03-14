/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.services.crud.Impl;

import com.tp2domainmodel.domainmodel.model.ItemsForSale.Accessory;
import com.tp2domainmodel.domainmodel.services.crud.AccessoryCrudService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
/**
 *
 * @author Wesley
 */
public class AccessoryCrudServiceImpl implements AccessoryCrudService{
     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Accessory find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Accessory persist(Accessory entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Accessory merge(Accessory entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Accessory remove(Accessory entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Accessory> findAll() {
        return null;
    }
}
