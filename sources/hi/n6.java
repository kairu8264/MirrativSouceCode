package hi;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class n6 {

    /* renamed from: a  reason: collision with root package name */
    public final String f35863a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f35864b;

    /* renamed from: c  reason: collision with root package name */
    public final String f35865c;

    /* renamed from: d  reason: collision with root package name */
    public final String f35866d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f35867e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f35868f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f35869g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f35870h;

    /* renamed from: i  reason: collision with root package name */
    public final u6<Context, Boolean> f35871i;

    public n6(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public n6(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, u6<Context, Boolean> u6Var) {
        this.f35863a = null;
        this.f35864b = uri;
        this.f35865c = "";
        this.f35866d = "";
        this.f35867e = z10;
        this.f35868f = false;
        this.f35869g = false;
        this.f35870h = false;
        this.f35871i = null;
    }

    public final n6 a() {
        if (this.f35865c.isEmpty()) {
            return new n6(null, this.f35864b, this.f35865c, this.f35866d, true, false, false, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final q6<Double> b(String str, double d10) {
        return new l6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final q6<Long> c(String str, long j10) {
        return new j6(this, str, Long.valueOf(j10), true);
    }

    public final q6<String> d(String str, String str2) {
        return new m6(this, str, str2, true);
    }

    public final q6<Boolean> e(String str, boolean z10) {
        return new k6(this, str, Boolean.valueOf(z10), true);
    }
}
