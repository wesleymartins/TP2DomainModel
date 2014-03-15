/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.tp2domainmodel.domainmodel.model.ItemsForSale.Accessory;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import com.tp2domainmodel.domainmodel.services.crud.AccessoryCrudService;
import static org.mockito.Mockito.when;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Wesley
 */
public class AccessoryTestCrudService {
     @Mock
    AccessoryCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AccessoryCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Accessory q1 = new Accessory.Builder("1000123").name("Sony").build();
        Accessory returnAccessory = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnAccessory);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        Accessory q1 = new Accessory.Builder("1000123").name("Sony").build();
        Accessory returnAccessory = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnAccessory);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        
        
        
        Accessory q1 = new Accessory.Builder("1000123").name("Sony").build();

        Accessory returnAccessory = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnAccessory);
        Mockito.verify(crudService).find(q1.getId());
        
        returnAccessory = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnAccessory);
        Mockito.verify(crudService).merge(q1);
        
       
        

    }

    @Test
    public void testDelete() throws Exception {

        Accessory q1 = new Accessory.Builder("1000123").name("Sony").build();
        Accessory returnAccessory = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnAccessory);
        Mockito.verify(crudService).remove(q1);

    }
}
