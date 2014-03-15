/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.tp2domainmodel.domainmodel.model.ItemsForSale.PsGame;
import com.tp2domainmodel.domainmodel.services.crud.PsGameCrudService;
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
public class PsGameTestCrudService {
       @Mock
    PsGameCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(PsGameCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        PsGame q1 = new PsGame.Builder("1000123").name("Sony").build();
        PsGame returnPsGame = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnPsGame);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        PsGame q1 = new PsGame.Builder("1000123").name("Sony").build();
        PsGame returnPsGame = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnPsGame);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
      
        PsGame q1 = new PsGame.Builder("1000123").name("Sony").build();

        PsGame returnPsGame = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnPsGame);
        Mockito.verify(crudService).find(q1.getId());
        
        returnPsGame = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnPsGame);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        PsGame q1 = new PsGame.Builder("1000123").name("Sony").build();
        PsGame returnPsGame = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnPsGame);
        Mockito.verify(crudService).remove(q1);

    }
}
