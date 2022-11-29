package org.apache.commons.math3.exception;

import aq.b;
import aq.c;

/* loaded from: classes4.dex */
public class MathIllegalArgumentException extends IllegalArgumentException {

    /* renamed from: w  reason: collision with root package name */
    public final b f45522w;

    public MathIllegalArgumentException(c cVar, Object... objArr) {
        b bVar = new b(this);
        this.f45522w = bVar;
        bVar.a(cVar, objArr);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f45522w.c();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f45522w.d();
    }
}
