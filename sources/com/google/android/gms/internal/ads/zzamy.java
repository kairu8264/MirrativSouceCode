package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzamy extends Exception {
    public zzamy(int i10, String str, Throwable th2, int i11) {
        super(null, th2);
    }

    public static zzamy a(Exception exc, int i10) {
        return new zzamy(1, null, exc, i10);
    }

    public static zzamy b(IOException iOException) {
        return new zzamy(0, null, iOException, -1);
    }

    public static zzamy c(RuntimeException runtimeException) {
        return new zzamy(2, null, runtimeException, -1);
    }
}
