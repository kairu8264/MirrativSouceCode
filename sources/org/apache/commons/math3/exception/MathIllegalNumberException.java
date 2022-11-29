package org.apache.commons.math3.exception;

import aq.c;

/* loaded from: classes4.dex */
public class MathIllegalNumberException extends MathIllegalArgumentException {

    /* renamed from: y  reason: collision with root package name */
    public static final Integer f45523y = 0;

    /* renamed from: x  reason: collision with root package name */
    public final Number f45524x;

    public MathIllegalNumberException(c cVar, Number number, Object... objArr) {
        super(cVar, number, objArr);
        this.f45524x = number;
    }
}
