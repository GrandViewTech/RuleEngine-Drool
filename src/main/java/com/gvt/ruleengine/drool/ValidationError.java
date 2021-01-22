package com.gvt.ruleengine.drool;

public class ValidationError
{
    public String message;
    public String ruleName;

    public String getMessage()
    { return message; }

    public void setMessage(String message)
    { this.message = message; }

    public String getRuleName()
    { return ruleName; }

    public void setRuleName(String ruleName)
    { this.ruleName = ruleName; }
}
