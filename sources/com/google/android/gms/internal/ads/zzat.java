package com.google.android.gms.internal.ads;

import ai.bc;
import ai.tw2;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public class zzat extends zzak {

    /* renamed from: x  reason: collision with root package name */
    public final bc f27261x;

    public zzat(bc bcVar, int i10, int i11) {
        super(b(2008, 1));
        this.f27261x = bcVar;
    }

    public static zzat a(IOException iOException, bc bcVar, int i10) {
        String message = iOException.getMessage();
        int i11 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = AnalyticsListener.EVENT_DOWNSTREAM_FORMAT_CHANGED;
        } else if (message != null && tw2.a(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        }
        if (i11 == 2007) {
            return new zzas(iOException, bcVar);
        }
        return new zzat(iOException, bcVar, i11, i10);
    }

    public static int b(int i10, int i11) {
        return i10 == 2000 ? i11 != 1 ? 2000 : 2001 : i10;
    }

    public zzat(IOException iOException, bc bcVar, int i10, int i11) {
        super(iOException, b(i10, i11));
        this.f27261x = bcVar;
    }

    public zzat(String str, bc bcVar, int i10, int i11) {
        super(str, b(2001, 1));
        this.f27261x = bcVar;
    }

    @Deprecated
    public zzat(String str, IOException iOException, bc bcVar, int i10) {
        this(str, iOException, bcVar, 2000, 1);
    }

    public zzat(String str, IOException iOException, bc bcVar, int i10, int i11) {
        super(str, iOException, b(i10, 1));
        this.f27261x = bcVar;
    }
}
