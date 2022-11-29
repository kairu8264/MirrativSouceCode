package nh;

import android.util.Log;

/* loaded from: classes3.dex */
public class g0 {

    /* renamed from: d  reason: collision with root package name */
    public static final g0 f43549d = new g0(true, null, null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f43550a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43551b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f43552c;

    public g0(boolean z10, String str, Throwable th2) {
        this.f43550a = z10;
        this.f43551b = str;
        this.f43552c = th2;
    }

    public static g0 b() {
        return f43549d;
    }

    public static g0 c(String str) {
        return new g0(false, str, null);
    }

    public static g0 d(String str, Throwable th2) {
        return new g0(false, str, th2);
    }

    public String a() {
        return this.f43551b;
    }

    public final void e() {
        if (this.f43550a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f43552c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f43552c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
