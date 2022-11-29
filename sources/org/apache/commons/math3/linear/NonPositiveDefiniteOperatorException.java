package org.apache.commons.math3.linear;

import aq.d;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

/* loaded from: classes4.dex */
public class NonPositiveDefiniteOperatorException extends MathIllegalArgumentException {
    public NonPositiveDefiniteOperatorException() {
        super(d.NON_POSITIVE_DEFINITE_OPERATOR, new Object[0]);
    }
}
