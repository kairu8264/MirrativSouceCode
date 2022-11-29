package org.apache.commons.math3.exception;

import aq.b;
import aq.c;
import aq.d;

/* loaded from: classes4.dex */
public class MathIllegalStateException extends IllegalStateException {

    /* renamed from: w  reason: collision with root package name */
    public final b f45525w;

    public MathIllegalStateException(c cVar, Object... objArr) {
        b bVar = new b(this);
        this.f45525w = bVar;
        bVar.a(cVar, objArr);
    }

    public b a() {
        return this.f45525w;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f45525w.c();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f45525w.d();
    }

    public MathIllegalStateException() {
        this(d.ILLEGAL_STATE, new Object[0]);
    }
}
