package org.koin.core.error;

import jo.p;

/* loaded from: classes4.dex */
public final class DefinitionOverrideException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefinitionOverrideException(String str) {
        super(str);
        p.h(str, "msg");
    }
}
