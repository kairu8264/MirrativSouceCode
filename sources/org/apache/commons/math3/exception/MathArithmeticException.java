package org.apache.commons.math3.exception;

import aq.b;
import aq.d;

/* loaded from: classes4.dex */
public class MathArithmeticException extends ArithmeticException {

    /* renamed from: w  reason: collision with root package name */
    public final b f45521w;

    public MathArithmeticException() {
        b bVar = new b(this);
        this.f45521w = bVar;
        bVar.a(d.ARITHMETIC_EXCEPTION, new Object[0]);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f45521w.c();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f45521w.d();
    }
}
