package com.i4bchile.passwordstrengthmvvm;


import com.i4bchile.passwordstrengthmvvm.model.Verifier;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VerifierTester {


    Verifier verifier = Verifier.getInstance();


    @Test
    public void matchesRule1_OK() {

        boolean resultado = verifier.matchRule1("esteban");
        assertTrue(resultado);
    }

    @Test
    public void matchesRule1_noOK() {

        boolean resultado = verifier.matchRule1("este");
        Assert.assertFalse(resultado);
    }

    @Test
    public void matchesRule2_OK() {

        boolean resultado = verifier.matchRule2("esTeban");

    }

    @Test
    public void matchesRule2_noOK() {

        boolean resultado = verifier.matchRule2("esteba1");
        Assert.assertFalse(resultado);
    }

    @Test
    public void matchesRule3_OK() {
        boolean resultado = verifier.matchRule3("Est3ban");
        assertTrue(resultado);
    }

    @Test
    public void matchesRule3_noOK() {

        boolean resultado = verifier.matchRule3("Esteban");
        Assert.assertFalse(resultado);
    }

    @Test
    public void verifynoRules() {

        int resultado = verifier.verifyPassword("este");
        assertEquals(0, resultado);
    }

    @Test
    public void verifyRule1() {

        int resultado = verifier.verifyPassword("esteba1");
        assertEquals(1, resultado);
    }

    @Test
    public void verifyRule2() {

        int resultado = verifier.verifyPassword("esTeban");
        assertEquals(2, resultado);
    }

    @Test
    public void verifyRule3() {

        int resultado = verifier.verifyPassword("Est3ban");
        assertEquals(3, resultado);
    }
}
