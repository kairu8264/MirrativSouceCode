package org.koin.core.error;

import jo.p;

/* loaded from: classes4.dex */
public final class InstanceCreationException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstanceCreationException(String str, Exception exc) {
        super(str, exc);
        p.h(str, "msg");
        p.h(exc, "parent");
    }
}
