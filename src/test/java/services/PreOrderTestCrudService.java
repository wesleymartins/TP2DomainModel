/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.tp2domainmodel.domainmodel.model.CustomerPurchase.PreOrder;
import com.tp2domainmodel.domainmodel.services.crud.PreOrderCrudService;
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
public class PreOrderTestCrudService {
       @Mock
    PreOrderCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(PreOrderCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        PreOrder q1 = new PreOrder.Builder("1000123").status("Sony").build();
        PreOrder returnPreOrder = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnPreOrder);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        PreOrder q1 = new PreOrder.Builder("1000123").status("Paid").build();
        PreOrder returnPreOrder = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnPreOrder);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        PreOrder q1 = new PreOrder.Builder("1000123").status("Paid").build();

        PreOrder returnPreOrder = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnPreOrder);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        PreOrder q1 = new PreOrder.Builder("1000123").status("Paid").build();
        PreOrder returnPreOrder = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnPreOrder);
        Mockito.verify(crudService).remove(q1);

    }
}
