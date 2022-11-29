package com.google.android.gms.common.api;

/* loaded from: classes3.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: w  reason: collision with root package name */
    public final nh.c f27179w;

    public UnsupportedApiCallException(nh.c cVar) {
        this.f27179w = cVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f27179w));
    }
}
