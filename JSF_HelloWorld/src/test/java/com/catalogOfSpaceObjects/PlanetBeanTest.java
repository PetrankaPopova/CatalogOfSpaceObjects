package com.catalogOfSpaceObjects;

import com.journaldev.domain.entity.Planet;
import com.journaldev.domain.entity.enums.PlanetType;
import com.journaldev.jsf.beans.PlanetBean;
import com.journaldev.service.PlanetService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.verification.VerificationMode;


import java.util.ArrayList;

import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class PlanetBeanTest {
    @Mock
    private PlanetService planetService;

    @InjectMocks
    private PlanetBean planetBean;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRegisterPlanet() {
        String planetName = "Test Planet";
        PlanetType planetType = PlanetType.GAS_GIANT;
        boolean habitable = false;

        planetBean.setName(planetName);
        planetBean.setType(planetType);
        planetBean.setHabitable(habitable);

        String result = planetBean.registerPlanet();
        assertEquals("Expected registration to be successful", "success", result);
        verify(planetService, times(1)).registerPlanet(planetName, planetType, habitable);
    }

    @Test
    public void testGetRegisteredPlanetStatistics() {
        List<Planet> mockPlanetList = new ArrayList<>();
        mockPlanetList.add(new Planet());
        mockPlanetList.add(new Planet());

        when(planetService.getAllPlanet()).thenReturn(mockPlanetList);
        String statistics = planetBean.getRegisteredPlanetStatistics();
        assertEquals("Total Planets: 2", statistics);
    }

    @Test
    public void testInit() {
        planetBean.init();
        verify(planetService, times(100000)).registerPlanet(ArgumentMatchers.any());
    }
}
