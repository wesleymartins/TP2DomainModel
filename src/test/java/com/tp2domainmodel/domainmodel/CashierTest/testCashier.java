/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.CashierTest;

import com.tp2domainmodel.domainmodel.model.Staff.Cashier;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class testCashier {
    
    public static Cashier service;
    public static Cashier newService;
    
    public testCashier() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void CashierCreation() {
        
    service = new Cashier.Builder("00012").name("Ben").build();
     Assert.assertEquals(service.getId(),"00012",service.getName());
            
    }
    
    @Test
    public void CashierGameUpdate() {
        
    newService = new Cashier.Builder("00012").name("Benjamin").build();
     Assert.assertEquals(newService.getId(),"00012",newService.getName());
            
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
