package org.apache.commons.lang3.exception;

import xp.a;
import xp.b;

/* loaded from: classes4.dex */
public class ContextedRuntimeException extends RuntimeException implements b {

    /* renamed from: w  reason: collision with root package name */
    public final b f45520w = new a();

    @Override // xp.b
    public String a(String str) {
        return this.f45520w.a(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return a(super.getMessage());
    }
}
