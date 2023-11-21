package org.components;

import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;

public class Footer {

    @Parameter
    private String time;


    public String getTime() {
        return new java.util.Date() + ".";
    }
}
