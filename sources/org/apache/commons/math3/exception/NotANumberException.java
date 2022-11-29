package org.apache.commons.math3.exception;

import aq.d;

/* loaded from: classes4.dex */
public class NotANumberException extends MathIllegalNumberException {
    public NotANumberException() {
        super(d.NAN_NOT_ALLOWED, Double.valueOf(Double.NaN), new Object[0]);
    }
}
