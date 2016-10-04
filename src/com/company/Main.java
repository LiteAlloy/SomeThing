package com.company;

import javax.swing.*;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.Duration;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;

import static javax.swing.JFrame.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        System.out.println("22 in pocket");

        SimpleClass sc = new SimpleClass();
        SecondImplementClass sic = new SecondImplementClass();
        sic.ThrowIt();
        sic.getIt(new Duration() {
            @Override
            public int getSign() {
                return 0;
            }

            @Override
            public Number getField(DatatypeConstants.Field field) {
                return null;
            }

            @Override
            public boolean isSet(DatatypeConstants.Field field) {
                return false;
            }

            @Override
            public Duration add(Duration rhs) {
                return null;
            }

            @Override
            public void addTo(Calendar calendar) {

            }

            @Override
            public Duration multiply(BigDecimal factor) {
                return null;
            }

            @Override
            public Duration negate() {
                return null;
            }

            @Override
            public Duration normalizeWith(Calendar startTimeInstant) {
                return null;
            }

            @Override
            public int compare(Duration duration) {
                return 0;
            }

            @Override
            public int hashCode() {
                return 0;
            }
        });
        
        //11

        //22

        //Commit to check the state
    }
}
