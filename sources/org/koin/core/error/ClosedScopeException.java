package org.koin.core.error;

import jo.p;

/* loaded from: classes4.dex */
public final class ClosedScopeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClosedScopeException(String str) {
        super(str);
        p.h(str, "msg");
    }
}
