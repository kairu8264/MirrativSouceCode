package com.google.protobuf;

import java.util.List;

/* loaded from: classes4.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: w  reason: collision with root package name */
    public final List<String> f28078w;

    public UninitializedMessageException(d0 d0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f28078w = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
