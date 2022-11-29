package org.apache.commons.math3.optim.linear;

import aq.d;
import org.apache.commons.math3.exception.MathIllegalStateException;

/* loaded from: classes4.dex */
public class NoFeasibleSolutionException extends MathIllegalStateException {
    public NoFeasibleSolutionException() {
        super(d.NO_FEASIBLE_SOLUTION, new Object[0]);
    }
}
