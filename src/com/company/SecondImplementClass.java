package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.xml.datatype.Duration;
import java.io.IOException;

public class SecondImplementClass extends SecondClass {
    @Override
    public void ThrowIt() throws IOException {
        System.out.println("Throwing!");
    }

    @Override
    public void getIt(Duration duration) {
        System.out.println("Geting!");
    }

    public void num() {
        int a = 4 + 3;
    }
}
