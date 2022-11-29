package org.apache.commons.math3.exception;

import aq.c;
import aq.d;

/* loaded from: classes4.dex */
public class ConvergenceException extends MathIllegalStateException {
    public ConvergenceException() {
        this(d.CONVERGENCE_FAILED, new Object[0]);
    }

    public ConvergenceException(c cVar, Object... objArr) {
        a().a(cVar, objArr);
    }
}
