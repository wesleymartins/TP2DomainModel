/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.PsGameTest;

import com.tp2domainmodel.domainmodel.model.ItemsForSale.PsGame;
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
public class testPsGame {
    
     public static PsGame service;
    public static PsGame newService;
    
    public testPsGame() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void PsGameCreation() {
        
    service = new PsGame.Builder("00012").name("Infamous 2").build();
     Assert.assertEquals(service.getId(),"00012",service.getName());
            
    }
    
    @Test
    public void PsGameUpdate() {
        
    newService = new PsGame.Builder("00012").name("Killzone: ShadowFall").build();
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
