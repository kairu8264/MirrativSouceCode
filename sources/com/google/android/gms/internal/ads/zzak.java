package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public class zzak extends IOException {

    /* renamed from: w  reason: collision with root package name */
    public final int f27256w;

    public zzak(int i10) {
        this.f27256w = i10;
    }

    public zzak(String str, int i10) {
        super(str);
        this.f27256w = i10;
    }

    public zzak(String str, Throwable th2, int i10) {
        super(str, th2);
        this.f27256w = i10;
    }

    public zzak(Throwable th2, int i10) {
        super(th2);
        this.f27256w = i10;
    }
}
