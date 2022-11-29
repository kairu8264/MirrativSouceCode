package com.neovisionaries.ws.client;

import hn.o0;

/* loaded from: classes4.dex */
public class WebSocketException extends Exception {

    /* renamed from: w  reason: collision with root package name */
    public final o0 f28258w;

    public WebSocketException(o0 o0Var, String str) {
        super(str);
        this.f28258w = o0Var;
    }

    public o0 a() {
        return this.f28258w;
    }

    public WebSocketException(o0 o0Var, String str, Throwable th2) {
        super(str, th2);
        this.f28258w = o0Var;
    }
}
