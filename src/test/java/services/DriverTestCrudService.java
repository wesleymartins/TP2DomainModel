/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.tp2domainmodel.domainmodel.model.Staff.Driver;
import com.tp2domainmodel.domainmodel.services.crud.DriverCrudService;
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
public class DriverTestCrudService {
    @Mock
    DriverCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DriverCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Driver q1 = new Driver.Builder("1000123").name("Sony").build();
        Driver returnDriver = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnDriver);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        Driver q1 = new Driver.Builder("1000123").name("Sony").build();
        Driver returnDriver = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnDriver);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
       
        Driver q1 = new Driver.Builder("1000123").name("Sony").build();

        Driver returnDriver = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnDriver);
        Mockito.verify(crudService).find(q1.getId());
        
        returnDriver = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnDriver);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        Driver q1 = new Driver.Builder("1000123").name("Sony").build();
        Driver returnDriver = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnDriver);
        Mockito.verify(crudService).remove(q1);

    }
}
