package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ContactManagerTest {

    //@Test
    @DisplayName("display contact")
    //@RepeatedTest(5)

    public void ShouldCreateContact(){
        ContactManager contactManager = new ContactManager();
        //Assertions.assume
        contactManager.addContact("mohan","kannan","2334566");
        assertFalse(contactManager.getAllContacts().isEmpty());
        assertEquals(1,contactManager.getAllContacts().size());



    }

    //@Test
    //@Disabled will diable the test case and will not run
    @DisplayName("should not create contact when firstname is null")
    @ParameterizedTest
    //@ValueSource(strings ={"233455","234566","345666666"})
    @MethodSource("phnumberList")
    public void shouldThrowRunTimeExceptionWhenFirstNameisNull(String phnumber){
        ContactManager contactManager = new ContactManager();
        Assertions.assertThrows(RuntimeException.class , ()->{
            contactManager.addContact(null,"dan",phnumber);
        });
    }
    private static List<String> phnumberList(){
        return Arrays.asList("1234455","1234555","1234455555");
    }
}

