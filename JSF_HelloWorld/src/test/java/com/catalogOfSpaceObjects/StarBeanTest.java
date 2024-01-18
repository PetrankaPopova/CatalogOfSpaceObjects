package com.catalogOfSpaceObjects;

import com.journaldev.domain.entity.Star;
import com.journaldev.domain.entity.enums.StarClass;
import com.journaldev.jsf.beans.StarBean;
import com.journaldev.service.StarService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class StarBeanTest {
    @Mock
    private StarService starService;

    @InjectMocks
    private StarBean starBean;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRegisterStar() {
        starBean.setName("Test Star");
        starBean.setStarClass(StarClass.B);
        starBean.setMass(150.0);
        starBean.setSize(80.0);
        starBean.setTemperature(30);
        starBean.setCompatibility(true);
        String result = starBean.registerStar();
        assertEquals("Expected registration to be successful", "success", result);
        verify(starService, times(1)).registerStar("Test Star", StarClass.B, 150.0, 80.0, 30, true);
    }

    @Test
    public void testGetRegisteredStarStatistics() {

        List<Star> mockStarList = new ArrayList<>();
        mockStarList.add(new Star());
        mockStarList.add(new Star());

        when(starService.getAllStar()).thenReturn(mockStarList);


        String statistics = starBean.getRegisteredStarStatistics();
        assertEquals("Total Stars: 2", statistics);
    }

    @Test
    public void testInit() {
        starBean.init();
        verify(starService, times(100000)).registerStar(any(Star.class));
    }
}
