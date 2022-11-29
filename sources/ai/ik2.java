package ai;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ik2 extends qt2 implements k61, y41, v41, l51, h71, qi2, nc1 {

    /* renamed from: w  reason: collision with root package name */
    public final fn2 f5270w;

    /* renamed from: x  reason: collision with root package name */
    public final AtomicReference<qt2> f5271x = new AtomicReference<>();

    /* renamed from: y  reason: collision with root package name */
    public final AtomicReference<zf0> f5272y = new AtomicReference<>();

    /* renamed from: z  reason: collision with root package name */
    public final AtomicReference<vf0> f5273z = new AtomicReference<>();
    public final AtomicReference<ff0> A = new AtomicReference<>();
    public final AtomicReference<bg0> B = new AtomicReference<>();
    public final AtomicReference<af0> C = new AtomicReference<>();
    public final AtomicReference<iv> D = new AtomicReference<>();

    public ik2(fn2 fn2Var) {
        this.f5270w = fn2Var;
    }

    public final void A(qt2 qt2Var) {
        this.f5271x.set(qt2Var);
    }

    @Override // ai.v41
    public final void B(final ye0 ye0Var, final String str, final String str2) {
        hi2.a(this.f5273z, new gi2(ye0Var) { // from class: ai.oj2

            /* renamed from: a  reason: collision with root package name */
            public final ye0 f7832a;

            {
                this.f7832a = ye0Var;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ye0 ye0Var2 = this.f7832a;
                ((vf0) obj).G2(new jg0(ye0Var2.zzb(), ye0Var2.b()));
            }
        });
        hi2.a(this.B, new gi2(ye0Var, str, str2) { // from class: ai.pj2

            /* renamed from: a  reason: collision with root package name */
            public final ye0 f8443a;

            /* renamed from: b  reason: collision with root package name */
            public final String f8444b;

            /* renamed from: c  reason: collision with root package name */
            public final String f8445c;

            {
                this.f8443a = ye0Var;
                this.f8444b = str;
                this.f8445c = str2;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ye0 ye0Var2 = this.f8443a;
                ((bg0) obj).M1(new jg0(ye0Var2.zzb(), ye0Var2.b()), this.f8444b, this.f8445c);
            }
        });
        hi2.a(this.A, new gi2(ye0Var) { // from class: ai.qj2

            /* renamed from: a  reason: collision with root package name */
            public final ye0 f8987a;

            {
                this.f8987a = ye0Var;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((ff0) obj).b2(this.f8987a);
            }
        });
        hi2.a(this.C, new gi2(ye0Var, str, str2) { // from class: ai.rj2

            /* renamed from: a  reason: collision with root package name */
            public final ye0 f9475a;

            /* renamed from: b  reason: collision with root package name */
            public final String f9476b;

            /* renamed from: c  reason: collision with root package name */
            public final String f9477c;

            {
                this.f9475a = ye0Var;
                this.f9476b = str;
                this.f9477c = str2;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((af0) obj).M1(this.f9475a, this.f9476b, this.f9477c);
            }
        });
    }

    public final void K(iv ivVar) {
        this.D.set(ivVar);
    }

    @Deprecated
    public final void M(ff0 ff0Var) {
        this.A.set(ff0Var);
    }

    public final void N(bg0 bg0Var) {
        this.B.set(bg0Var);
    }

    @Deprecated
    public final void R(af0 af0Var) {
        this.C.set(af0Var);
    }

    @Override // ai.k61
    public final void a() {
        hi2.a(this.f5272y, lj2.f6581a);
        hi2.a(this.A, wj2.f11646a);
    }

    @Override // ai.v41
    public final void e() {
        hi2.a(this.f5273z, ck2.f2857a);
        hi2.a(this.A, dk2.f3325a);
        hi2.a(this.f5273z, ek2.f3706a);
    }

    @Override // ai.v41
    public final void g() {
        hi2.a(this.A, mj2.f6959a);
    }

    @Override // ai.v41
    public final void h() {
        this.f5270w.b();
        hi2.a(this.f5273z, gk2.f4500a);
        hi2.a(this.A, hk2.f4885a);
    }

    @Override // ai.v41
    public final void j() {
        hi2.a(this.A, nj2.f7370a);
    }

    @Override // ai.v41
    public final void k() {
        hi2.a(this.A, sj2.f9848a);
    }

    @Override // ai.l51
    public final void n(final sr srVar) {
        hi2.a(this.f5273z, new gi2(srVar) { // from class: ai.tj2

            /* renamed from: a  reason: collision with root package name */
            public final sr f10328a;

            {
                this.f10328a = srVar;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((vf0) obj).Q4(this.f10328a);
            }
        });
        hi2.a(this.f5273z, new gi2(srVar) { // from class: ai.uj2

            /* renamed from: a  reason: collision with root package name */
            public final sr f10726a;

            {
                this.f10726a = srVar;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((vf0) obj).c0(this.f10726a.f9916w);
            }
        });
    }

    @Override // ai.h71
    public final void p(final hs hsVar) {
        hi2.a(this.D, new gi2(hsVar) { // from class: ai.xj2

            /* renamed from: a  reason: collision with root package name */
            public final hs f11969a;

            {
                this.f11969a = hsVar;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((iv) obj).d4(this.f11969a);
            }
        });
    }

    @Override // ai.qi2
    public final void s(qi2 qi2Var) {
        throw null;
    }

    @Override // ai.qt2
    public final void t() {
        hi2.a(this.f5271x, vj2.f11110a);
    }

    public final void u(zf0 zf0Var) {
        this.f5272y.set(zf0Var);
    }

    public final void y(vf0 vf0Var) {
        this.f5273z.set(vf0Var);
    }

    @Override // ai.y41
    public final void z(final sr srVar) {
        final int i10 = srVar.f9916w;
        hi2.a(this.f5272y, new gi2(srVar) { // from class: ai.zj2

            /* renamed from: a  reason: collision with root package name */
            public final sr f13018a;

            {
                this.f13018a = srVar;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((zf0) obj).B(this.f13018a);
            }
        });
        hi2.a(this.f5272y, new gi2(i10) { // from class: ai.ak2

            /* renamed from: a  reason: collision with root package name */
            public final int f1890a;

            {
                this.f1890a = i10;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((zf0) obj).E(this.f1890a);
            }
        });
        hi2.a(this.A, new gi2(i10) { // from class: ai.bk2

            /* renamed from: a  reason: collision with root package name */
            public final int f2386a;

            {
                this.f2386a = i10;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((ff0) obj).f0(this.f2386a);
            }
        });
    }

    @Override // ai.nc1
    public final void zzb() {
        hi2.a(this.f5273z, yj2.f12638a);
    }
}
