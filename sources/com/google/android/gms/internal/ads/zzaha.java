package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public class zzaha extends IOException {

    /* renamed from: w  reason: collision with root package name */
    public final boolean f27251w;

    /* renamed from: x  reason: collision with root package name */
    public final int f27252x;

    public zzaha(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f27251w = z10;
        this.f27252x = i10;
    }

    public static zzaha a(String str, Throwable th2) {
        return new zzaha(str, th2, true, 0);
    }

    public static zzaha b(String str, Throwable th2) {
        return new zzaha(str, th2, true, 1);
    }

    public static zzaha c(String str) {
        return new zzaha(str, null, false, 1);
    }
}
