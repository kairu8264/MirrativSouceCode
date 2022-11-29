package org.apache.commons.math3.exception;

import aq.c;
import aq.d;

/* loaded from: classes4.dex */
public class NoDataException extends MathIllegalArgumentException {
    public NoDataException() {
        this(d.NO_DATA);
    }

    public NoDataException(c cVar) {
        super(cVar, new Object[0]);
    }
}
