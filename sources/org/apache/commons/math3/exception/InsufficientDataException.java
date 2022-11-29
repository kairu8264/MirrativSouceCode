package org.apache.commons.math3.exception;

import aq.c;
import aq.d;

/* loaded from: classes4.dex */
public class InsufficientDataException extends MathIllegalArgumentException {
    public InsufficientDataException() {
        this(d.INSUFFICIENT_DATA, new Object[0]);
    }

    public InsufficientDataException(c cVar, Object... objArr) {
        super(cVar, objArr);
    }
}
