package com.gvt.ruleengine.drool;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Validation  implements Serializable
{
    public FpmlMessage fpmlMessage;
    public ValidationError validationError ;

    public FpmlMessage getFpmlMessage() {
        return fpmlMessage;
    }

    public void setFpmlMessage(FpmlMessage fpmlMessage) {
        this.fpmlMessage = fpmlMessage;
    }

    public ValidationError getValidationError() {
        return validationError;
    }

    public void setValidationError(ValidationError validationError) {
        this.validationError = validationError;
    }

    public Validation(FpmlMessage fpmlMessage)
    {
        super();
        this.fpmlMessage = fpmlMessage;
    }

    public Validation()
    { super(); }
}
