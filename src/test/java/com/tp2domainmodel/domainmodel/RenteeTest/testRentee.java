/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.RenteeTest;

import com.tp2domainmodel.domainmodel.model.Rentals.Rentee;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class testRentee {
    
     public static Rentee service;
    public static Rentee newService;
    
    public testRentee() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void RenteeCreation() {
        
    service = new Rentee.Builder("00012").name("Ben").build();
     Assert.assertEquals(service.getId(),"00012",service.getName());
            
    }
    
    @Test
    public void RenteeGameUpdate() {
        
    newService = new Rentee.Builder("00012").name("Benjamin").build();
     Assert.assertEquals(newService.getId(),"00012",newService.getName());
            
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
