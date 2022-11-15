package com.example.struts1;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginAction extends Action {
    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {

        LoginForm formBean = (LoginForm) form;
        String name = formBean.getName();
        String email = formBean.getEmail();

        if ((name == null) ||             // name parameter does not exist
                email == null ||             // email parameter does not exist
                name.equals("") ||            // name parameter is empty
                !email.contains("@")) {   // email lacks '@'
            formBean.setError();
            return mapping.findForward(FAILURE);
        }

        return mapping.findForward(SUCCESS);
    }
}
