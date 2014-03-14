/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.tp2domainmodel.domainmodel.model.Rentals.Rentee;
import com.tp2domainmodel.domainmodel.services.crud.RenteeCrudService;
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
public class RenteeTestCrudService {
       @Mock
    RenteeCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(RenteeCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Rentee q1 = new Rentee.Builder("1000123").name("Sony").build();
        Rentee returnRentee = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnRentee);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        Rentee q1 = new Rentee.Builder("1000123").name("Sony").build();
        Rentee returnRentee = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnRentee);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Rentee q1 = new Rentee.Builder("1000123").name("Sony").build();

        Rentee returnRentee = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnRentee);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        Rentee q1 = new Rentee.Builder("1000123").name("Sony").build();
        Rentee returnRentee = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnRentee);
        Mockito.verify(crudService).remove(q1);

    }
}
