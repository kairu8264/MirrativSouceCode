package com.mirrativ.llstream.subscribe;

import jo.p;

/* loaded from: classes4.dex */
public final class LLStreamException extends Exception {
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LLStreamException(String str) {
        super(str);
        p.h(str, "message");
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
