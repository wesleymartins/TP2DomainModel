/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.AccessoryTest;

import com.tp2domainmodel.domainmodel.model.ItemsForSale.Accessory;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Wesley
 */
public class testAccessory {
    
    public static Accessory service;
    public static Accessory newService;
    
    public testAccessory() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void AccessoryCreation() {
        
    service = new Accessory.Builder("00012").name("Razor Headphones").build();
     Assert.assertEquals(service.getId(),"00012",service.getName());
            
    }
    
    @Test
    public void AccessoryUpdate() {
        
    newService = new Accessory.Builder("00012").name("Genius Keyboard").build();
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
