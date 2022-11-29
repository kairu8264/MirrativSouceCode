package org.apache.commons.math3.exception;

import aq.c;
import aq.d;

/* loaded from: classes4.dex */
public class NullArgumentException extends MathIllegalArgumentException {
    public NullArgumentException() {
        this(d.NULL_NOT_ALLOWED, new Object[0]);
    }

    public NullArgumentException(c cVar, Object... objArr) {
        super(cVar, objArr);
    }
}
