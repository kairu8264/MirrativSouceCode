package com.dena.mirrorman.net.bcsvr;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import jo.h;
import jo.p;
import so.e;
import so.n;

/* loaded from: classes2.dex */
public final class BcsvrCommand {
    public static final String ACK = "ACK";
    public static final String ERROR = "ERR";
    public static final String MESSAGE = "MSG";
    private final String[] mTokens;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final BcsvrCommand parse(String str) {
            p.h(str, "rawData");
            return new BcsvrCommand(str);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Name {
    }

    public BcsvrCommand(String str) {
        p.h(str, "mRawData");
        Object[] array = new e("\t").d(str, 3).toArray(new String[0]);
        p.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.mTokens = (String[]) array;
    }

    public final String getMessage(String str) {
        p.h(str, "key");
        String[] strArr = this.mTokens;
        if (strArr.length >= 2 && p.c(strArr[1], str)) {
            return this.mTokens[2];
        }
        return null;
    }

    public final String getMessageInJson(String str) {
        p.h(str, "key");
        String message = getMessage(str);
        if (message == null || !n.C(message, "{", false, 2, null)) {
            return null;
        }
        return message;
    }

    public final String getName() {
        return this.mTokens[0];
    }

    public final boolean isMessage() {
        return p.c(MESSAGE, getName());
    }
}
