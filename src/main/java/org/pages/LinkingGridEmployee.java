package org.pages;

import org.apache.tapestry5.annotations.Property;

import java.util.List;

public class LinkingGridEmployee {

    @Property
    private String name;



    // The code

    void onActivate(String name) {
        this.name = name;
    }

    String onPassivate() {
        return name;
    }

}
