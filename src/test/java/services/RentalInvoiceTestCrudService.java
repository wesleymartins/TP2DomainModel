/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.tp2domainmodel.domainmodel.model.Rentals.RentalInvoice;
import com.tp2domainmodel.domainmodel.services.crud.RentalInvoiceCrudService;
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
public class RentalInvoiceTestCrudService {
       @Mock
    RentalInvoiceCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(RentalInvoiceCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        RentalInvoice q1 = new RentalInvoice.Builder("1000123").dateRented("Sony").build();
        RentalInvoice returnRentalInvoice = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnRentalInvoice);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        RentalInvoice q1 = new RentalInvoice.Builder("1000123").dateRented("12 February 2014").build();
        RentalInvoice returnRentalInvoice = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnRentalInvoice);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        
        RentalInvoice q1 = new RentalInvoice.Builder("1000123").dateRented("12 February 2014").build();

        RentalInvoice returnRentalInvoice = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnRentalInvoice);
        Mockito.verify(crudService).find(q1.getId());
        
        returnRentalInvoice = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnRentalInvoice);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        RentalInvoice q1 = new RentalInvoice.Builder("1000123").dateRented("12 February 2014").build();
        RentalInvoice returnRentalInvoice = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnRentalInvoice);
        Mockito.verify(crudService).remove(q1);

    }
}
