package com.google.gson.stream;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class MalformedJsonException extends IOException {
    private static final long serialVersionUID = 1;

    public MalformedJsonException(String str) {
        super(str);
    }

    public MalformedJsonException(String str, Throwable th2) {
        super(str);
        initCause(th2);
    }

    public MalformedJsonException(Throwable th2) {
        initCause(th2);
    }
}
