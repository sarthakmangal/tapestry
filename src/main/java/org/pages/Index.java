package org.pages;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

//import org.apache.tapestry5.Link;
import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.PageLink;
import org.apache.tapestry5.corelib.components.TextField;
import org.apache.tapestry5.http.Link;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.PageRenderLinkSource;
import org.components.Footer;
import org.components.Header;


//@Import(stylesheet = "css/examples/plain.css")
public class Index {

    @Property
//    @NotNull
//    @Size(max = 10)
    private String userName;

    @Property
//    @NotNull
//    @Size(max = 10)
    private String password;

    private String str;

    // Other pages

    @InjectPage
    private EmployeeDetails employeesDetailsPage;

    // Generally useful bits and pieces

    @InjectComponent("names")
    private Form form;

    @InjectComponent("userName")
    private TextField firstNameField;

    @Inject
    private PageRenderLinkSource pageRenderLinkSource;

    Link pageLink = pageRenderLinkSource.createPageRenderLinkWithContext(EmployeeDetails.class);

    // The code

    void onValidateFromNames() {

        // Note, this method is triggered even if server-side validation has already found error(s).

        if (userName == null && !(userName.equals("admin")) && !(password.equals("admin"))) {
            form.recordError(firstNameField, "First Name must not be Acme.");
        }

    }

    void setupRender() {
        str = "test123";
    }

    public String getStr() {
        return str.substring(0,4) + "Sarthak";
    }

    public void setStr(String str) {
        this.str = str;
    }
    @Component
    private Header headComp;

    @Component
    private Footer footerComp;

//    @Component(id = "home", parameters = {"page=Index"})
//    private PageLink index;

    Object onSuccess() {
//       employeesDetailsPage.set(userName, password);
       return employeesDetailsPage;
    }


}