/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.tp2domainmodel.domainmodel.model.ItemsForSale.Item;
import com.tp2domainmodel.domainmodel.services.crud.ItemCrudService;
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
public class ItemTestCrudService {
     @Mock
    ItemCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ItemCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Item q1 = new Item.Builder("1000123").type("Sony").build();
        Item returnItem = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnItem);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        Item q1 = new Item.Builder("1000123").type("Sony").build();
        Item returnItem = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnItem);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Item q1 = new Item.Builder("1000123").type("Sony").build();

        Item returnItem = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnItem);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        Item q1 = new Item.Builder("1000123").type("Sony").build();
        Item returnItem = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnItem);
        Mockito.verify(crudService).remove(q1);

    }
}
