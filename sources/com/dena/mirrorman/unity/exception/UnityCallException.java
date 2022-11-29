package com.dena.mirrorman.unity.exception;

import jo.p;

/* loaded from: classes3.dex */
public final class UnityCallException extends RuntimeException {
    public static final int $stable = 0;
    private final String msg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityCallException(String str) {
        super(str);
        p.h(str, "msg");
        this.msg = str;
    }

    public final String getMsg() {
        return this.msg;
    }
}
