package org.apache.commons.math3.linear;

import aq.d;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

/* loaded from: classes4.dex */
public class SingularOperatorException extends MathIllegalArgumentException {
    public SingularOperatorException() {
        super(d.SINGULAR_OPERATOR, new Object[0]);
    }
}
