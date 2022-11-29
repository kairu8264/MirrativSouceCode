package org.apache.commons.lang3.exception;

import xp.a;
import xp.b;

/* loaded from: classes4.dex */
public class ContextedException extends Exception implements b {

    /* renamed from: w  reason: collision with root package name */
    public final b f45519w = new a();

    @Override // xp.b
    public String a(String str) {
        return this.f45519w.a(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return a(super.getMessage());
    }
}
