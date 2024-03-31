package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito. *;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.Equals;
import org.mockito.internal.verification.VerificationModeFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class CalculaterServiceTest {

    //CalculatorService calculatorService;written in inject mocks/



    @Mock
    AddService addService;

    @InjectMocks
    CalculatorService calculatorService;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testCalcService(){
        System.out.println("test executing::::");
        //AddService addService = Mockito.mock(AddService.class);/mocked this in Mock and used beforeeach
        //CalculatorService calculatorService = new CalculatorService(addService);
        when(addService.add(12,8)).thenReturn(20);
        int result =  CalculatorService.calculate(12,8);
        assertEquals(20,result);


    }
    @Test

    public void verifyInteractions(){
        List<String> mockedList=Mockito.mock(List.class);

        mockedList.add("one");
        mockedList.add("two");
        mockedList.add("three");
        mockedList.add("three");
        mockedList.clear();
        verify(mockedList).add("one");
        verify(mockedList).add("two");
        //verify(mockedList).add("three");
        //when(mockedList.contains("three")).
        // with this we can check a number or string is added how many times//
        verify(mockedList, VerificationModeFactory.times(2)).add("three");




    }
    @Test

    public void testspy(){
        List<String>  list = new ArrayList<>();
        List<String> spylist = spy(list);

        spylist.add("element - 1");
        System.out.println(spylist.get(0));
        assertEquals("element - 1",spylist.get(0));
        when(spylist.get(0)).thenReturn("element - 2");
        System.out.println(spylist.get(0));
        assertEquals("element - 2",spylist.get(0));
        //when(spylist.get(0)).thenReturn("element - 2");



    }
}
