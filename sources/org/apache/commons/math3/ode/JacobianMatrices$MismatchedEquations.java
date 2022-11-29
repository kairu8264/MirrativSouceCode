package org.apache.commons.math3.ode;

import aq.d;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

/* loaded from: classes4.dex */
public class JacobianMatrices$MismatchedEquations extends MathIllegalArgumentException {
    public JacobianMatrices$MismatchedEquations() {
        super(d.UNMATCHED_ODE_IN_EXPANDED_SET, new Object[0]);
    }
}
