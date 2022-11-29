package org.apache.commons.math3.exception;

import aq.b;

/* loaded from: classes4.dex */
public class MathRuntimeException extends RuntimeException {

    /* renamed from: w  reason: collision with root package name */
    public final b f45526w;

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f45526w.c();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f45526w.d();
    }
}
