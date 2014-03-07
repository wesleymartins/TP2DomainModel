/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.ItemTest;

import static com.tp2domainmodel.domainmodel.CreditTest.testCredit.newService;
import static com.tp2domainmodel.domainmodel.CreditTest.testCredit.service;
import com.tp2domainmodel.domainmodel.model.CustomerPurchase.Credit;
import com.tp2domainmodel.domainmodel.model.ItemsForSale.Item;
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
public class testItem {
    
    public static Item service;
    public static Item newService;
    
    public testItem() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
    public void ItemCreation() {
        
    service = new Item.Builder("00012").type("Accessory").build();
     Assert.assertEquals(service.getId(),"00012",service.getType());
            
    }
    
    @Test
    public void ItemUpdate() {
        
    newService = new Item.Builder("00012").type("Game").build();
     Assert.assertEquals(newService.getId(),"00012",newService.getType());
            
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
