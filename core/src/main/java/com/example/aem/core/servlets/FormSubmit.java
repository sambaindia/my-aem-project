package com.example.aem.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

//@Component(service = { Servlet.class })
//@SlingServletPaths("/bin/mysite/formsubmit")
//@ServiceDescription("Form Submission Servlet")

@Component(
        service = { Servlet.class },
        property = { "sling.servlet.paths=/bin/mysite/formsubmit",
        "sling.servlet.methods=" + HttpConstants.METHOD_GET }
)
@ServiceDescription("From Submit Servlet")

public class FormSubmit extends SlingAllMethodsServlet {

    @Override
    protected void doGet(final SlingHttpServletRequest request, final SlingHttpServletResponse response)
            throws ServletException, IOException {

        // Read form parameters
//        String firstName = request.getParameter("firstName");
//        String lastName = request.getParameter("lastName");
//        String email = request.getParameter("email");

        // Log or process the form data
//        System.out.println("Form submitted:");
//        System.out.println("First Name: " + firstName);
//        System.out.println("Last Name: " + lastName);
//        System.out.println("Email: " + email);

        // You can also store data in JCR, send an email, etc.
        // Example: Use a service to persist data in repository

        // Send response
        response.setContentType("application/html");
        response.getWriter().write("{\"status\": \"success\", \"message\": \"Form submitted successfully\"}");
    }
}
