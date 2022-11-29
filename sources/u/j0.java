package u;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import l0.c2;
import l0.z1;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f54028e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final m0.e<a<?, ?>> f54029a = new m0.e<>(new a[16], 0);

    /* renamed from: b  reason: collision with root package name */
    public final l0.s0 f54030b;

    /* renamed from: c  reason: collision with root package name */
    public long f54031c;

    /* renamed from: d  reason: collision with root package name */
    public final l0.s0 f54032d;

    /* loaded from: classes.dex */
    public final class a<T, V extends p> implements c2<T> {
        public final l0.s0 A;
        public y0<T, V> B;
        public boolean C;
        public boolean D;
        public long E;
        public final /* synthetic */ j0 F;

        /* renamed from: w  reason: collision with root package name */
        public T f54033w;

        /* renamed from: x  reason: collision with root package name */
        public T f54034x;

        /* renamed from: y  reason: collision with root package name */
        public final c1<T, V> f54035y;

        /* renamed from: z  reason: collision with root package name */
        public i<T> f54036z;

        public a(j0 j0Var, T t10, T t11, c1<T, V> c1Var, i<T> iVar) {
            l0.s0 e10;
            jo.p.h(j0Var, "this$0");
            jo.p.h(c1Var, "typeConverter");
            jo.p.h(iVar, "animationSpec");
            this.F = j0Var;
            this.f54033w = t10;
            this.f54034x = t11;
            this.f54035y = c1Var;
            this.f54036z = iVar;
            e10 = z1.e(t10, null, 2, null);
            this.A = e10;
            this.B = new y0<>(this.f54036z, c1Var, this.f54033w, this.f54034x, null, 16, null);
        }

        public final T d() {
            return this.f54033w;
        }

        @Override // l0.c2
        public T getValue() {
            return this.A.getValue();
        }

        public final T j() {
            return this.f54034x;
        }

        public final boolean k() {
            return this.C;
        }

        public final void p(long j10) {
            this.F.i(false);
            if (this.D) {
                this.D = false;
                this.E = j10;
            }
            long j11 = j10 - this.E;
            q(this.B.f(j11));
            this.C = this.B.c(j11);
        }

        public void q(T t10) {
            this.A.setValue(t10);
        }

        public final void r(T t10, T t11, i<T> iVar) {
            jo.p.h(iVar, "animationSpec");
            this.f54033w = t10;
            this.f54034x = t11;
            this.f54036z = iVar;
            this.B = new y0<>(iVar, this.f54035y, t10, t11, null, 16, null);
            this.F.i(true);
            this.C = false;
            this.D = true;
        }
    }

    @co.f(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f54037w;

        /* loaded from: classes.dex */
        public /* synthetic */ class a extends jo.m implements io.l<Long, wn.v> {
            public a(Object obj) {
                super(1, obj, j0.class, "onFrame", "onFrame(J)V", 0);
            }

            public final void i(long j10) {
                ((j0) this.f38131x).f(j10);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(Long l10) {
                i(l10.longValue());
                return wn.v.f59242a;
            }
        }

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object c10 = bo.c.c();
            int i10 = this.f54037w;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wn.m.b(obj);
            do {
                aVar = new a(j0.this);
                this.f54037w = 1;
            } while (h0.a(aVar, this) != c10);
            return c10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f54040x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10) {
            super(2);
            this.f54040x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            j0.this.h(iVar, this.f54040x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public j0() {
        l0.s0 e10;
        l0.s0 e11;
        e10 = z1.e(Boolean.FALSE, null, 2, null);
        this.f54030b = e10;
        this.f54031c = Long.MIN_VALUE;
        e11 = z1.e(Boolean.TRUE, null, 2, null);
        this.f54032d = e11;
    }

    public final void c(a<?, ?> aVar) {
        jo.p.h(aVar, "animation");
        this.f54029a.c(aVar);
        i(true);
    }

    public final boolean d() {
        return ((Boolean) this.f54030b.getValue()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) this.f54032d.getValue()).booleanValue();
    }

    public final void f(long j10) {
        boolean z10;
        if (this.f54031c == Long.MIN_VALUE) {
            this.f54031c = j10;
        }
        long j11 = j10 - this.f54031c;
        m0.e<a<?, ?>> eVar = this.f54029a;
        int p10 = eVar.p();
        if (p10 > 0) {
            a<?, ?>[] n10 = eVar.n();
            z10 = true;
            int i10 = 0;
            do {
                a<?, ?> aVar = n10[i10];
                if (!aVar.k()) {
                    aVar.p(j11);
                }
                if (!aVar.k()) {
                    z10 = false;
                }
                i10++;
            } while (i10 < p10);
        } else {
            z10 = true;
        }
        j(!z10);
    }

    public final void g(a<?, ?> aVar) {
        jo.p.h(aVar, "animation");
        this.f54029a.u(aVar);
    }

    public final void h(l0.i iVar, int i10) {
        l0.i h10 = iVar.h(2102343854);
        if (e() || d()) {
            l0.c0.c(this, new b(null), h10, 8);
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new c(i10));
    }

    public final void i(boolean z10) {
        this.f54030b.setValue(Boolean.valueOf(z10));
    }

    public final void j(boolean z10) {
        this.f54032d.setValue(Boolean.valueOf(z10));
    }
}
