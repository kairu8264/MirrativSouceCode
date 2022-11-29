package e1;

import b1.l;
import b1.m;
import c1.d0;
import c1.f0;
import c1.k0;
import c1.r;
import c1.u;
import c1.u0;
import c1.v0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import m2.k;
import m2.p;
import m2.q;

/* loaded from: classes.dex */
public interface e extends m2.d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f30042e = a.f30043a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f30043a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f30044b = r.f18740b.B();

        /* renamed from: c  reason: collision with root package name */
        public static final int f30045c = f0.f18658a.a();

        public final int a() {
            return f30044b;
        }

        public final int b() {
            return f30045c;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
    }

    static /* synthetic */ void A(e eVar, k0 k0Var, long j10, long j11, long j12, long j13, float f10, f fVar, d0 d0Var, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long a10 = (i12 & 2) != 0 ? k.f40528b.a() : j10;
        long a11 = (i12 & 4) != 0 ? p.a(k0Var.getWidth(), k0Var.getHeight()) : j11;
        eVar.y(k0Var, a10, a11, (i12 & 8) != 0 ? k.f40528b.a() : j12, (i12 & 16) != 0 ? a11 : j13, (i12 & 32) != 0 ? 1.0f : f10, (i12 & 64) != 0 ? i.f30046a : fVar, (i12 & 128) != 0 ? null : d0Var, (i12 & 256) != 0 ? f30042e.a() : i10, (i12 & 512) != 0 ? f30042e.b() : i11);
    }

    static /* synthetic */ void B(e eVar, u uVar, long j10, long j11, long j12, float f10, f fVar, d0 d0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long c10 = (i11 & 2) != 0 ? b1.f.f16721b.c() : j10;
        eVar.F0(uVar, c10, (i11 & 4) != 0 ? eVar.D0(eVar.c(), c10) : j11, (i11 & 8) != 0 ? b1.a.f16715a.a() : j12, (i11 & 16) != 0 ? 1.0f : f10, (i11 & 32) != 0 ? i.f30046a : fVar, (i11 & 64) != 0 ? null : d0Var, (i11 & 128) != 0 ? f30042e.a() : i10);
    }

    static /* synthetic */ void D(e eVar, long j10, float f10, long j11, float f11, f fVar, d0 d0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        eVar.d0(j10, (i11 & 2) != 0 ? l.h(eVar.c()) / 2.0f : f10, (i11 & 4) != 0 ? eVar.U0() : j11, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? i.f30046a : fVar, (i11 & 32) != 0 ? null : d0Var, (i11 & 64) != 0 ? f30042e.a() : i10);
    }

    private default long D0(long j10, long j11) {
        return m.a(l.i(j10) - b1.f.m(j11), l.g(j10) - b1.f.n(j11));
    }

    static /* synthetic */ void J0(e eVar, u uVar, long j10, long j11, float f10, int i10, v0 v0Var, float f11, d0 d0Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        eVar.H0(uVar, j10, j11, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? j.f30047f.a() : i10, (i12 & 32) != 0 ? null : v0Var, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : d0Var, (i12 & 256) != 0 ? f30042e.a() : i11);
    }

    static /* synthetic */ void K(e eVar, long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, f fVar, d0 d0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long c10 = (i11 & 16) != 0 ? b1.f.f16721b.c() : j11;
        eVar.b1(j10, f10, f11, z10, c10, (i11 & 32) != 0 ? eVar.D0(eVar.c(), c10) : j12, (i11 & 64) != 0 ? 1.0f : f12, (i11 & 128) != 0 ? i.f30046a : fVar, (i11 & 256) != 0 ? null : d0Var, (i11 & 512) != 0 ? f30042e.a() : i10);
    }

    static /* synthetic */ void K0(e eVar, u0 u0Var, u uVar, float f10, f fVar, d0 d0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            fVar = i.f30046a;
        }
        f fVar2 = fVar;
        if ((i11 & 16) != 0) {
            d0Var = null;
        }
        d0 d0Var2 = d0Var;
        if ((i11 & 32) != 0) {
            i10 = f30042e.a();
        }
        eVar.B0(u0Var, uVar, f11, fVar2, d0Var2, i10);
    }

    static /* synthetic */ void L0(e eVar, long j10, long j11, long j12, float f10, f fVar, d0 d0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long c10 = (i11 & 2) != 0 ? b1.f.f16721b.c() : j11;
        eVar.O(j10, c10, (i11 & 4) != 0 ? eVar.D0(eVar.c(), c10) : j12, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? i.f30046a : fVar, (i11 & 32) != 0 ? null : d0Var, (i11 & 64) != 0 ? f30042e.a() : i10);
    }

    static /* synthetic */ void i0(e eVar, k0 k0Var, long j10, float f10, f fVar, d0 d0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        eVar.V0(k0Var, (i11 & 2) != 0 ? b1.f.f16721b.c() : j10, (i11 & 4) != 0 ? 1.0f : f10, (i11 & 8) != 0 ? i.f30046a : fVar, (i11 & 16) != 0 ? null : d0Var, (i11 & 32) != 0 ? f30042e.a() : i10);
    }

    static /* synthetic */ void u0(e eVar, long j10, long j11, long j12, float f10, int i10, v0 v0Var, float f11, d0 d0Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        eVar.w0(j10, j11, j12, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? j.f30047f.a() : i10, (i12 & 32) != 0 ? null : v0Var, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : d0Var, (i12 & 256) != 0 ? f30042e.a() : i11);
    }

    static /* synthetic */ void x(e eVar, u uVar, long j10, long j11, float f10, f fVar, d0 d0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long c10 = (i11 & 2) != 0 ? b1.f.f16721b.c() : j10;
        eVar.I(uVar, c10, (i11 & 4) != 0 ? eVar.D0(eVar.c(), c10) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? i.f30046a : fVar, (i11 & 32) != 0 ? null : d0Var, (i11 & 64) != 0 ? f30042e.a() : i10);
    }

    void B0(u0 u0Var, u uVar, float f10, f fVar, d0 d0Var, int i10);

    void C0(long j10, long j11, long j12, long j13, f fVar, float f10, d0 d0Var, int i10);

    void F0(u uVar, long j10, long j11, long j12, float f10, f fVar, d0 d0Var, int i10);

    void H0(u uVar, long j10, long j11, float f10, int i10, v0 v0Var, float f11, d0 d0Var, int i11);

    void I(u uVar, long j10, long j11, float f10, f fVar, d0 d0Var, int i10);

    d M0();

    void O(long j10, long j11, long j12, float f10, f fVar, d0 d0Var, int i10);

    default long U0() {
        return m.b(M0().c());
    }

    void V0(k0 k0Var, long j10, float f10, f fVar, d0 d0Var, int i10);

    void b1(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, f fVar, d0 d0Var, int i10);

    default long c() {
        return M0().c();
    }

    void d0(long j10, float f10, long j11, float f11, f fVar, d0 d0Var, int i10);

    q getLayoutDirection();

    void q0(u0 u0Var, long j10, float f10, f fVar, d0 d0Var, int i10);

    void w0(long j10, long j11, long j12, float f10, int i10, v0 v0Var, float f11, d0 d0Var, int i11);

    default void y(k0 k0Var, long j10, long j11, long j12, long j13, float f10, f fVar, d0 d0Var, int i10, int i11) {
        jo.p.h(k0Var, "image");
        jo.p.h(fVar, TtmlNode.TAG_STYLE);
        A(this, k0Var, j10, j11, j12, j13, f10, fVar, d0Var, i10, 0, 512, null);
    }
}
