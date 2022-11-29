package ai;

import android.net.Uri;
import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class p7 {

    /* renamed from: o  reason: collision with root package name */
    public static final Object f8322o = new Object();

    /* renamed from: p  reason: collision with root package name */
    public static final Object f8323p = new Object();

    /* renamed from: q  reason: collision with root package name */
    public static final k5 f8324q;

    /* renamed from: r  reason: collision with root package name */
    public static final x2<p7> f8325r;

    /* renamed from: a  reason: collision with root package name */
    public Object f8326a = f8322o;

    /* renamed from: b  reason: collision with root package name */
    public k5 f8327b = f8324q;

    /* renamed from: c  reason: collision with root package name */
    public long f8328c;

    /* renamed from: d  reason: collision with root package name */
    public long f8329d;

    /* renamed from: e  reason: collision with root package name */
    public long f8330e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8331f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8332g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public boolean f8333h;

    /* renamed from: i  reason: collision with root package name */
    public h5 f8334i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8335j;

    /* renamed from: k  reason: collision with root package name */
    public long f8336k;

    /* renamed from: l  reason: collision with root package name */
    public long f8337l;

    /* renamed from: m  reason: collision with root package name */
    public int f8338m;

    /* renamed from: n  reason: collision with root package name */
    public int f8339n;

    static {
        b5 b5Var = new b5();
        b5Var.a("com.google.android.exoplayer2.Timeline");
        b5Var.b(Uri.EMPTY);
        f8324q = b5Var.c();
        f8325r = o7.f7673a;
    }

    public final p7 a(Object obj, k5 k5Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, h5 h5Var, long j13, long j14, int i10, int i11, long j15) {
        this.f8326a = obj;
        this.f8327b = k5Var != null ? k5Var : f8324q;
        this.f8328c = C.TIME_UNSET;
        this.f8329d = C.TIME_UNSET;
        this.f8330e = C.TIME_UNSET;
        this.f8331f = z10;
        this.f8332g = z11;
        this.f8333h = h5Var != null;
        this.f8334i = h5Var;
        this.f8336k = 0L;
        this.f8337l = j14;
        this.f8338m = 0;
        this.f8339n = 0;
        this.f8335j = false;
        return this;
    }

    public final boolean b() {
        u9.d(this.f8333h == (this.f8334i != null));
        return this.f8334i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p7.class.equals(obj.getClass())) {
            p7 p7Var = (p7) obj;
            if (sb.H(this.f8326a, p7Var.f8326a) && sb.H(this.f8327b, p7Var.f8327b) && sb.H(null, null) && sb.H(this.f8334i, p7Var.f8334i) && this.f8328c == p7Var.f8328c && this.f8329d == p7Var.f8329d && this.f8330e == p7Var.f8330e && this.f8331f == p7Var.f8331f && this.f8332g == p7Var.f8332g && this.f8335j == p7Var.f8335j && this.f8337l == p7Var.f8337l && this.f8338m == p7Var.f8338m && this.f8339n == p7Var.f8339n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f8326a.hashCode() + 217) * 31) + this.f8327b.hashCode()) * 961;
        h5 h5Var = this.f8334i;
        int hashCode2 = h5Var == null ? 0 : h5Var.hashCode();
        long j10 = this.f8328c;
        long j11 = this.f8329d;
        long j12 = this.f8330e;
        boolean z10 = this.f8331f;
        boolean z11 = this.f8332g;
        boolean z12 = this.f8335j;
        long j13 = this.f8337l;
        return (((((((((((((((((((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + (z10 ? 1 : 0)) * 31) + (z11 ? 1 : 0)) * 31) + (z12 ? 1 : 0)) * 961) + ((int) ((j13 >>> 32) ^ j13))) * 31) + this.f8338m) * 31) + this.f8339n) * 31;
    }
}
