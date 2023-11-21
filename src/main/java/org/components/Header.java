package org.components;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.PageLink;

public class Header {

//    @Component(id = "home", parameters = {"page=Index"})
//    private PageLink index;

    @Parameter
    @Property
    private String name;
}
