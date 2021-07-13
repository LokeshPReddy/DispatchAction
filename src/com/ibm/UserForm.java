package com.ibm;

public class UserForm extends org.apache.struts.action.ActionForm {

    private String message;
    /**
     *
     */
    public UserForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

   
}
