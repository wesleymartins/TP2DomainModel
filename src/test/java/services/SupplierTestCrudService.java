/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.tp2domainmodel.domainmodel.model.Suppliers.Supplier;
import com.tp2domainmodel.domainmodel.services.crud.SuppliersCrudService;
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
public class SupplierTestCrudService {
       @Mock
    SuppliersCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(SuppliersCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Supplier q1 = new Supplier.Builder("1000123").name("Sony").build();
        Supplier returnSupplier = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnSupplier);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        Supplier q1 = new Supplier.Builder("1000123").name("Sony").build();
        Supplier returnSupplier = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnSupplier);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
       
        Supplier q1 = new Supplier.Builder("1000123").name("Sony").build();

        Supplier returnSupplier = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnSupplier);
        Mockito.verify(crudService).find(q1.getId());
        
        returnSupplier = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnSupplier);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        Supplier q1 = new Supplier.Builder("1000123").name("Sony").build();
        Supplier returnSupplier = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnSupplier);
        Mockito.verify(crudService).remove(q1);

    }
}
