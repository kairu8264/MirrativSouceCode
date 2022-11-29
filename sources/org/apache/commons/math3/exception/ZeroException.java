package org.apache.commons.math3.exception;

import aq.c;
import aq.d;

/* loaded from: classes4.dex */
public class ZeroException extends MathIllegalNumberException {
    public ZeroException() {
        this(d.ZERO_NOT_ALLOWED, new Object[0]);
    }

    public ZeroException(c cVar, Object... objArr) {
        super(cVar, MathIllegalNumberException.f45523y, objArr);
    }
}
