package ai;

import android.net.Uri;
import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class uq3 extends q7 {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f10798h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static final k5 f10799i;

    /* renamed from: c  reason: collision with root package name */
    public final long f10800c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10801d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10802e;

    /* renamed from: f  reason: collision with root package name */
    public final k5 f10803f;

    /* renamed from: g  reason: collision with root package name */
    public final h5 f10804g;

    static {
        b5 b5Var = new b5();
        b5Var.a("SinglePeriodTimeline");
        b5Var.b(Uri.EMPTY);
        f10799i = b5Var.c();
    }

    public uq3(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, k5 k5Var, h5 h5Var) {
        this.f10800c = j13;
        this.f10801d = j14;
        this.f10802e = z10;
        this.f10803f = k5Var;
        this.f10804g = h5Var;
    }

    @Override // ai.q7
    public final int a() {
        return 1;
    }

    @Override // ai.q7
    public final p7 f(int i10, p7 p7Var, long j10) {
        u9.c(i10, 0, 1);
        p7Var.a(p7.f8322o, this.f10803f, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, this.f10802e, false, this.f10804g, 0L, this.f10801d, 0, 0, 0L);
        return p7Var;
    }

    @Override // ai.q7
    public final int g() {
        return 1;
    }

    @Override // ai.q7
    public final n7 h(int i10, n7 n7Var, boolean z10) {
        u9.c(i10, 0, 1);
        n7Var.a(null, z10 ? f10798h : null, 0, this.f10800c, 0L, q31.f8799c, false);
        return n7Var;
    }

    @Override // ai.q7
    public final int i(Object obj) {
        return f10798h.equals(obj) ? 0 : -1;
    }

    @Override // ai.q7
    public final Object j(int i10) {
        u9.c(i10, 0, 1);
        return f10798h;
    }
}
