package org.apache.commons.math3.exception;

import aq.b;
import aq.c;
import aq.d;

/* loaded from: classes4.dex */
public class MathUnsupportedOperationException extends UnsupportedOperationException {

    /* renamed from: w  reason: collision with root package name */
    public final b f45527w;

    public MathUnsupportedOperationException() {
        this(d.UNSUPPORTED_OPERATION, new Object[0]);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f45527w.c();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f45527w.d();
    }

    public MathUnsupportedOperationException(c cVar, Object... objArr) {
        b bVar = new b(this);
        this.f45527w = bVar;
        bVar.a(cVar, objArr);
    }
}
