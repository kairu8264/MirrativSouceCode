package org.apache.commons.math3.linear;

import aq.d;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

/* loaded from: classes4.dex */
public class SingularMatrixException extends MathIllegalArgumentException {
    public SingularMatrixException() {
        super(d.SINGULAR_MATRIX, new Object[0]);
    }
}
