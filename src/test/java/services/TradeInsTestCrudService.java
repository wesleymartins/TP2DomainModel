/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.tp2domainmodel.domainmodel.model.TradeIns.TradeItem;
import com.tp2domainmodel.domainmodel.services.crud.TradeItemCrudService;
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
public class TradeInsTestCrudService {
    
     @Mock
    TradeItemCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(TradeItemCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        TradeItem q1 = new TradeItem.Builder("1000123").name("Sony").build();
        TradeItem returnTradeItem = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnTradeItem);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        TradeItem q1 = new TradeItem.Builder("1000123").name("Sony").build();
        TradeItem returnTradeItem = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnTradeItem);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        TradeItem q1 = new TradeItem.Builder("1000123").name("Sony").build();

        TradeItem returnTradeItem = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnTradeItem);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        TradeItem q1 = new TradeItem.Builder("1000123").name("Sony").build();
        TradeItem returnTradeItem = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnTradeItem);
        Mockito.verify(crudService).remove(q1);

    }
}
