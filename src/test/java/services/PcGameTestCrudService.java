/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.tp2domainmodel.domainmodel.model.ItemsForSale.PcGame;
import com.tp2domainmodel.domainmodel.services.crud.PcGameCrudService;
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
public class PcGameTestCrudService {
  @Mock
    PcGameCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(PcGameCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        PcGame q1 = new PcGame.Builder("1000123").name("Sony").build();
        PcGame returnPcGame = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnPcGame);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        PcGame q1 = new PcGame.Builder("1000123").name("Sony").build();
        PcGame returnPcGame = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnPcGame);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        PcGame q1 = new PcGame.Builder("1000123").name("Sony").build();

        PcGame returnPcGame = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnPcGame);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        PcGame q1 = new PcGame.Builder("1000123").name("Sony").build();
        PcGame returnPcGame = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnPcGame);
        Mockito.verify(crudService).remove(q1);

    }
}
