/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.tp2domainmodel.domainmodel.model.CustomerPurchase.Customer;
import com.tp2domainmodel.domainmodel.services.crud.CustomerCrudService;
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
public class CustomerTestCrudService {
     @Mock
    CustomerCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CustomerCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Customer q1 = new Customer.Builder("1000123").fName("Sony").build();
        Customer returnCustomer = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnCustomer);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        Customer q1 = new Customer.Builder("1000123").fName("Sony").build();
        Customer returnCustomer = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnCustomer);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
    

        Customer q1 = new Customer.Builder("1000123").fName("Sony").build();

         Customer returnCustomer = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnCustomer);
        Mockito.verify(crudService).find(q1.getId());
        
        returnCustomer = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnCustomer);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        Customer q1 = new Customer.Builder("1000123").fName("Sony").build();
        Customer returnCustomer = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnCustomer);
        Mockito.verify(crudService).remove(q1);

    }
}
