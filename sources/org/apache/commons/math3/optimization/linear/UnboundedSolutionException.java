package org.apache.commons.math3.optimization.linear;

import aq.d;
import org.apache.commons.math3.exception.MathIllegalStateException;

@Deprecated
/* loaded from: classes4.dex */
public class UnboundedSolutionException extends MathIllegalStateException {
    public UnboundedSolutionException() {
        super(d.UNBOUNDED_SOLUTION, new Object[0]);
    }
}
