package com.catalogOfSpaceObjects;


import com.journaldev.domain.entity.enums.AgeUnit;
import com.journaldev.domain.entity.enums.GalaxyType;
import com.journaldev.jsf.beans.GalaxyBean;
import com.journaldev.service.GalaxyService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

public class GalaxyBeanTest {

    @Mock
    private GalaxyService galaxyService;

    @InjectMocks
    private GalaxyBean galaxyBean;

    @Captor
    private ArgumentCaptor<String> nameCaptor;

    @Captor
    private ArgumentCaptor<GalaxyType> typeCaptor;

    @Captor
    private ArgumentCaptor<Double> ageCaptor;

    @Captor
    private ArgumentCaptor<AgeUnit> ageUnitCaptor;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRegisterGalaxy() {
        String expectedNavigationOutcome = "success";
        String testName = "Test Galaxy";
        GalaxyType testType = GalaxyType.SPIRAL;
        double testAge = 4.5;
        AgeUnit testAgeUnit = AgeUnit.BILLIONS;

        galaxyBean.setName(testName);
        galaxyBean.setType(testType);
        galaxyBean.setAge(testAge);
        galaxyBean.setAgeUnit(testAgeUnit);

        doNothing().when(galaxyService).registerGalaxy(nameCaptor.capture(), typeCaptor.capture(), ageCaptor.capture(), ageUnitCaptor.capture());
        String actualNavigationOutcome = galaxyBean.registerGalaxy();

        verify(galaxyService).registerGalaxy(nameCaptor.getValue(), typeCaptor.getValue(), ageCaptor.getValue(), ageUnitCaptor.getValue());


        assertEquals(expectedNavigationOutcome, actualNavigationOutcome);
    }
}
