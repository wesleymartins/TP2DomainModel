/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.tp2domainmodel.domainmodel.model.CustomerPurchase.Credit;
import com.tp2domainmodel.domainmodel.services.crud.CreditCrudService;
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
public class CreditTestCrudService {
     @Mock
    CreditCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CreditCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Credit q1 = new Credit.Builder("1000123").type("Credit").build();
        Credit returnCredit = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnCredit);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        Credit q1 = new Credit.Builder("1000123").type("Credit").build();
        Credit returnCredit = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnCredit);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Credit q1 = new Credit.Builder("1000123").type("Credit").build();

        Credit returnCredit = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnCredit);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        Credit q1 = new Credit.Builder("1000123").type("Credit").build();
        Credit returnCredit = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnCredit);
        Mockito.verify(crudService).remove(q1);

    }
}
