/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.PreOrderTest;

import static com.tp2domainmodel.domainmodel.CashTest.testCash.service;
import static com.tp2domainmodel.domainmodel.CreditTest.testCredit.newService;
import com.tp2domainmodel.domainmodel.model.CustomerPurchase.Credit;
import com.tp2domainmodel.domainmodel.model.CustomerPurchase.PreOrder;
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
public class testPreOrder {
    
    public static PreOrder service;
    public static PreOrder newService;
    
    public testPreOrder() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void PreOrderCreation() 
    {
        service = new PreOrder.Builder("0012").status("Not Paid").build();
        Assert.assertEquals(service.getId(),"00012",service.getStatus());
    }
    
    @Test
    public void PreOrderUpdate() {
        
    newService = new PreOrder.Builder("00012").status("Paid").build();
     Assert.assertEquals(newService.getId(),"00012",newService.getStatus());
            
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
