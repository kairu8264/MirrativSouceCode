package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class n6 {

    /* renamed from: j  reason: collision with root package name */
    public static final x2<n6> f7200j = m6.f6814a;

    /* renamed from: a  reason: collision with root package name */
    public final Object f7201a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7202b;

    /* renamed from: c  reason: collision with root package name */
    public final k5 f7203c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f7204d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7205e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7206f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7207g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7208h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7209i;

    public n6(Object obj, int i10, k5 k5Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f7201a = obj;
        this.f7202b = i10;
        this.f7203c = k5Var;
        this.f7204d = obj2;
        this.f7205e = i11;
        this.f7206f = j10;
        this.f7207g = j11;
        this.f7208h = i12;
        this.f7209i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n6.class == obj.getClass()) {
            n6 n6Var = (n6) obj;
            if (this.f7202b == n6Var.f7202b && this.f7205e == n6Var.f7205e && this.f7206f == n6Var.f7206f && this.f7207g == n6Var.f7207g && this.f7208h == n6Var.f7208h && this.f7209i == n6Var.f7209i && hx2.a(this.f7201a, n6Var.f7201a) && hx2.a(this.f7204d, n6Var.f7204d) && hx2.a(this.f7203c, n6Var.f7203c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7201a, Integer.valueOf(this.f7202b), this.f7203c, this.f7204d, Integer.valueOf(this.f7205e), Integer.valueOf(this.f7202b), Long.valueOf(this.f7206f), Long.valueOf(this.f7207g), Integer.valueOf(this.f7208h), Integer.valueOf(this.f7209i)});
    }
}
