package com.space.jsf.beans;

import com.space.domain.entity.Moon;
import com.space.jsf.beans.MoonBean;
import com.space.service.MoonService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MoonBeanTest {
    @Mock
    private MoonService moonService;

    @InjectMocks
    private MoonBean moonBean;

    @Captor
    private ArgumentCaptor<String> nameCaptor;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRegisterMoon() {
        String expectedNavigationOutcome = "success";
        String testName = "Test Moon";
        moonBean.setName(testName);
        doNothing().when(moonService).registerMoon(nameCaptor.capture());
        String actualNavigationOutcome = moonBean.registerMoon();
        verify(moonService).registerMoon(nameCaptor.getValue());
        assertEquals(expectedNavigationOutcome, actualNavigationOutcome);
    }

    @Test
    public void testGetRegisteredMoonStatistics() {
        List<Moon> testMoons = new ArrayList<>();
        testMoons.add(new Moon());
        testMoons.add(new Moon());
        when(moonService.getAllMoon()).thenReturn(testMoons);
        String statistics = moonBean.getRegisteredMoonStatistics();
        verify(moonService).getAllMoon();
        String expectedStatistics = "Total Moons: 2";
        assertEquals(expectedStatistics, statistics);
    }
}
