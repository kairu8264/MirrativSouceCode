package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class n7 {

    /* renamed from: h  reason: collision with root package name */
    public static final x2<n7> f7213h = m7.f6821a;

    /* renamed from: a  reason: collision with root package name */
    public Object f7214a;

    /* renamed from: b  reason: collision with root package name */
    public Object f7215b;

    /* renamed from: c  reason: collision with root package name */
    public int f7216c;

    /* renamed from: d  reason: collision with root package name */
    public long f7217d;

    /* renamed from: e  reason: collision with root package name */
    public long f7218e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7219f;

    /* renamed from: g  reason: collision with root package name */
    public q31 f7220g = q31.f8799c;

    public final n7 a(Object obj, Object obj2, int i10, long j10, long j11, q31 q31Var, boolean z10) {
        this.f7214a = obj;
        this.f7215b = obj2;
        this.f7216c = 0;
        this.f7217d = j10;
        this.f7218e = 0L;
        this.f7220g = q31Var;
        this.f7219f = z10;
        return this;
    }

    public final long b(int i10) {
        long j10 = this.f7220g.a(i10).f1818a;
        return 0L;
    }

    public final int c(int i10) {
        return this.f7220g.a(i10).a(-1);
    }

    public final int d(int i10, int i11) {
        return this.f7220g.a(i10).a(i11);
    }

    public final int e(long j10) {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n7.class.equals(obj.getClass())) {
            n7 n7Var = (n7) obj;
            if (sb.H(this.f7214a, n7Var.f7214a) && sb.H(this.f7215b, n7Var.f7215b) && this.f7216c == n7Var.f7216c && this.f7217d == n7Var.f7217d && this.f7219f == n7Var.f7219f && sb.H(this.f7220g, n7Var.f7220g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(long j10) {
        return -1;
    }

    public final int g(int i10) {
        return this.f7220g.a(i10).f1819b;
    }

    public final long h(int i10, int i11) {
        ad0 a10 = this.f7220g.a(i10);
        return a10.f1819b != -1 ? a10.f1822e[i11] : C.TIME_UNSET;
    }

    public final int hashCode() {
        Object obj = this.f7214a;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.f7215b;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i10 = this.f7216c;
        long j10 = this.f7217d;
        return ((((((((hashCode + hashCode2) * 31) + i10) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 961) + (this.f7219f ? 1 : 0)) * 31) + this.f7220g.hashCode();
    }

    public final long i() {
        long j10 = this.f7220g.f8802a;
        return 0L;
    }

    public final boolean j(int i10) {
        boolean z10 = this.f7220g.a(i10).f1824g;
        return false;
    }

    public final long k(int i10) {
        long j10 = this.f7220g.a(i10).f1823f;
        return 0L;
    }
}
