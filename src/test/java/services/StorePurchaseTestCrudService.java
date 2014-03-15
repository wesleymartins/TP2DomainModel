/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.tp2domainmodel.domainmodel.model.CustomerPurchase.StorePurchase;
import com.tp2domainmodel.domainmodel.services.crud.StorePurchaseCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
public class StorePurchaseTestCrudService {
       @Mock
    StorePurchaseCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(StorePurchaseCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        StorePurchase q1 = new StorePurchase.Builder("1000123").time("12:34").build();
        StorePurchase returnStorePurchase = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnStorePurchase);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        StorePurchase q1 = new StorePurchase.Builder("1000123").time("12:23").build();
        StorePurchase returnStorePurchase = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnStorePurchase);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
     
        StorePurchase q1 = new StorePurchase.Builder("1000123").time("12:34").build();

        StorePurchase returnStorePurchase = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnStorePurchase);
        Mockito.verify(crudService).find(q1.getId());
        
        returnStorePurchase = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnStorePurchase);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        StorePurchase q1 = new StorePurchase.Builder("1000123").time("12:34").build();
        StorePurchase returnStorePurchase = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnStorePurchase);
        Mockito.verify(crudService).remove(q1);

    }
}
