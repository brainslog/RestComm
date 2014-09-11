package org.mobicents.servlet.restcomm.rvd;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class ProjectAwareRvdContext extends RvdContext {

    private String projectName;
    private ProjectLogger projectLogger;

    public ProjectAwareRvdContext(String projectName, HttpServletRequest request, ServletContext servletContext) {
        super(request, servletContext);
        this.projectName = projectName;
        this.projectLogger = new ProjectLogger(projectName, getSettings(), getMarshaler());
    }

    /*
    public Interpreter createInterpreter(String appName, MultivaluedMap<String, String> requestParams) {
        Interpreter interpreter = new Interpreter(appName, request, requestParams);
        interpreter.setProjectStorage(projectStorage);
        interpreter.setRvdSettings(settings);
        interpreter.setProjectLogger(projectLogger);

        return interpreter;
    }
    */

    public ProjectLogger getProjectLogger() {
        return projectLogger;
    }


}