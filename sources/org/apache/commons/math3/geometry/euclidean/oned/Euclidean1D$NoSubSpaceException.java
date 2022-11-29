package org.apache.commons.math3.geometry.euclidean.oned;

import aq.d;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;

/* loaded from: classes4.dex */
public class Euclidean1D$NoSubSpaceException extends MathUnsupportedOperationException {
    public Euclidean1D$NoSubSpaceException() {
        super(d.NOT_SUPPORTED_IN_DIMENSION_N, 1);
    }
}
