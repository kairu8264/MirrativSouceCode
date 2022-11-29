package n1;

import androidx.compose.ui.platform.g2;
import java.util.ArrayList;
import java.util.List;
import uo.q0;
import uo.v1;
import wn.l;

/* loaded from: classes.dex */
public final class n0 extends c0 implements d0, e0, m2.d {
    public m A;
    public final m0.e<a<?>> B;
    public final m0.e<a<?>> C;
    public m D;
    public long E;
    public q0 F;
    public boolean G;

    /* renamed from: y  reason: collision with root package name */
    public final g2 f41462y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ m2.d f41463z;

    /* loaded from: classes.dex */
    public final class a<R> implements n1.c, m2.d, ao.d<R> {
        public final ao.g A;
        public final /* synthetic */ n0 B;

        /* renamed from: w  reason: collision with root package name */
        public final ao.d<R> f41464w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ n0 f41465x;

        /* renamed from: y  reason: collision with root package name */
        public uo.p<? super m> f41466y;

        /* renamed from: z  reason: collision with root package name */
        public o f41467z;

        @co.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {625}, m = "withTimeout")
        /* renamed from: n1.n0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0612a<T> extends co.d {

            /* renamed from: w  reason: collision with root package name */
            public Object f41468w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f41469x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ a<R> f41470y;

            /* renamed from: z  reason: collision with root package name */
            public int f41471z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0612a(a<R> aVar, ao.d<? super C0612a> dVar) {
                super(dVar);
                this.f41470y = aVar;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                this.f41469x = obj;
                this.f41471z |= Integer.MIN_VALUE;
                return this.f41470y.h0(0L, null, this);
            }
        }

        @co.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {617, 618}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f41472w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ long f41473x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ a<R> f41474y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j10, a<R> aVar, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f41473x = j10;
                this.f41474y = aVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f41473x, this.f41474y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
            @Override // co.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = bo.c.c()
                    int r1 = r8.f41472w
                    r2 = 1
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r5) goto L1c
                    if (r1 != r4) goto L14
                    wn.m.b(r9)
                    goto L38
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    wn.m.b(r9)
                    goto L2f
                L20:
                    wn.m.b(r9)
                    long r6 = r8.f41473x
                    long r6 = r6 - r2
                    r8.f41472w = r5
                    java.lang.Object r9 = uo.b1.a(r6, r8)
                    if (r9 != r0) goto L2f
                    return r0
                L2f:
                    r8.f41472w = r4
                    java.lang.Object r9 = uo.b1.a(r2, r8)
                    if (r9 != r0) goto L38
                    return r0
                L38:
                    n1.n0$a<R> r9 = r8.f41474y
                    uo.p r9 = n1.n0.a.e(r9)
                    if (r9 == 0) goto L54
                    wn.l$a r0 = wn.l.f59224w
                    androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                    long r1 = r8.f41473x
                    r0.<init>(r1)
                    java.lang.Object r0 = wn.m.a(r0)
                    java.lang.Object r0 = wn.l.a(r0)
                    r9.resumeWith(r0)
                L54:
                    wn.v r9 = wn.v.f59242a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: n1.n0.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @co.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {597}, m = "withTimeoutOrNull")
        /* loaded from: classes.dex */
        public static final class c<T> extends co.d {

            /* renamed from: w  reason: collision with root package name */
            public /* synthetic */ Object f41475w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ a<R> f41476x;

            /* renamed from: y  reason: collision with root package name */
            public int f41477y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a<R> aVar, ao.d<? super c> dVar) {
                super(dVar);
                this.f41476x = aVar;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                this.f41475w = obj;
                this.f41477y |= Integer.MIN_VALUE;
                return this.f41476x.H(0L, null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(n0 n0Var, ao.d<? super R> dVar) {
            jo.p.h(dVar, "completion");
            this.B = n0Var;
            this.f41464w = dVar;
            this.f41465x = n0Var;
            this.f41467z = o.Main;
            this.A = ao.h.f16651w;
        }

        public final void C(Throwable th2) {
            uo.p<? super m> pVar = this.f41466y;
            if (pVar != null) {
                pVar.u(th2);
            }
            this.f41466y = null;
        }

        public final void E(m mVar, o oVar) {
            uo.p<? super m> pVar;
            jo.p.h(mVar, "event");
            jo.p.h(oVar, "pass");
            if (oVar != this.f41467z || (pVar = this.f41466y) == null) {
                return;
            }
            this.f41466y = null;
            l.a aVar = wn.l.f59224w;
            pVar.resumeWith(wn.l.a(mVar));
        }

        @Override // m2.d
        public float G0() {
            return this.f41465x.G0();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        @Override // n1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object H(long r5, io.p<? super n1.c, ? super ao.d<? super T>, ? extends java.lang.Object> r7, ao.d<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof n1.n0.a.c
                if (r0 == 0) goto L13
                r0 = r8
                n1.n0$a$c r0 = (n1.n0.a.c) r0
                int r1 = r0.f41477y
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f41477y = r1
                goto L18
            L13:
                n1.n0$a$c r0 = new n1.n0$a$c
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.f41475w
                java.lang.Object r1 = bo.c.c()
                int r2 = r0.f41477y
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                wn.m.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                goto L3e
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                wn.m.b(r8)
                r0.f41477y = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                java.lang.Object r8 = r4.h0(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                if (r8 != r1) goto L3e
                return r1
            L3d:
                r8 = 0
            L3e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.n0.a.H(long, io.p, ao.d):java.lang.Object");
        }

        @Override // m2.d
        public float I0(float f10) {
            return this.f41465x.I0(f10);
        }

        @Override // m2.d
        public int N0(long j10) {
            return this.f41465x.N0(j10);
        }

        @Override // n1.c
        public long S() {
            return this.B.S();
        }

        @Override // m2.d
        public long W0(long j10) {
            return this.f41465x.W0(j10);
        }

        @Override // m2.d
        public int X(float f10) {
            return this.f41465x.X(f10);
        }

        @Override // n1.c
        public long a() {
            return this.B.E;
        }

        @Override // m2.d
        public float c0(long j10) {
            return this.f41465x.c0(j10);
        }

        @Override // m2.d
        public long f(long j10) {
            return this.f41465x.f(j10);
        }

        @Override // ao.d
        public ao.g getContext() {
            return this.A;
        }

        @Override // m2.d
        public float getDensity() {
            return this.f41465x.getDensity();
        }

        @Override // n1.c
        public g2 getViewConfiguration() {
            return this.B.getViewConfiguration();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
        /* JADX WARN: Type inference failed for: r12v0, types: [long] */
        /* JADX WARN: Type inference failed for: r12v1, types: [uo.d2] */
        /* JADX WARN: Type inference failed for: r12v3, types: [uo.d2] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        @Override // n1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object h0(long r12, io.p<? super n1.c, ? super ao.d<? super T>, ? extends java.lang.Object> r14, ao.d<? super T> r15) {
            /*
                r11 = this;
                boolean r0 = r15 instanceof n1.n0.a.C0612a
                if (r0 == 0) goto L13
                r0 = r15
                n1.n0$a$a r0 = (n1.n0.a.C0612a) r0
                int r1 = r0.f41471z
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f41471z = r1
                goto L18
            L13:
                n1.n0$a$a r0 = new n1.n0$a$a
                r0.<init>(r11, r15)
            L18:
                java.lang.Object r15 = r0.f41469x
                java.lang.Object r1 = bo.c.c()
                int r2 = r0.f41471z
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r12 = r0.f41468w
                uo.d2 r12 = (uo.d2) r12
                wn.m.b(r15)     // Catch: java.lang.Throwable -> L2e
                goto L75
            L2e:
                r13 = move-exception
                goto L79
            L30:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L38:
                wn.m.b(r15)
                r5 = 0
                int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r15 > 0) goto L57
                uo.p<? super n1.m> r15 = r11.f41466y
                if (r15 == 0) goto L57
                wn.l$a r2 = wn.l.f59224w
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r12)
                java.lang.Object r2 = wn.m.a(r2)
                java.lang.Object r2 = wn.l.a(r2)
                r15.resumeWith(r2)
            L57:
                n1.n0 r15 = r11.B
                uo.q0 r5 = r15.l1()
                r6 = 0
                r7 = 0
                n1.n0$a$b r8 = new n1.n0$a$b
                r8.<init>(r12, r11, r4)
                r9 = 3
                r10 = 0
                uo.d2 r12 = uo.j.d(r5, r6, r7, r8, r9, r10)
                r0.f41468w = r12     // Catch: java.lang.Throwable -> L2e
                r0.f41471z = r3     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r15 = r14.invoke(r11, r0)     // Catch: java.lang.Throwable -> L2e
                if (r15 != r1) goto L75
                return r1
            L75:
                uo.d2.a.a(r12, r4, r3, r4)
                return r15
            L79:
                uo.d2.a.a(r12, r4, r3, r4)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.n0.a.h0(long, io.p, ao.d):java.lang.Object");
        }

        @Override // n1.c
        public m o0() {
            return this.B.A;
        }

        @Override // ao.d
        public void resumeWith(Object obj) {
            m0.e eVar = this.B.B;
            n0 n0Var = this.B;
            synchronized (eVar) {
                n0Var.B.u(this);
                wn.v vVar = wn.v.f59242a;
            }
            this.f41464w.resumeWith(obj);
        }

        @Override // m2.d
        public float s(int i10) {
            return this.f41465x.s(i10);
        }

        @Override // m2.d
        public float t(float f10) {
            return this.f41465x.t(f10);
        }

        @Override // n1.c
        public Object t0(o oVar, ao.d<? super m> dVar) {
            uo.q qVar = new uo.q(bo.b.b(dVar), 1);
            qVar.y();
            this.f41467z = oVar;
            this.f41466y = qVar;
            Object t10 = qVar.t();
            if (t10 == bo.c.c()) {
                co.h.c(dVar);
            }
            return t10;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41478a;

        static {
            int[] iArr = new int[o.values().length];
            iArr[o.Initial.ordinal()] = 1;
            iArr[o.Final.ordinal()] = 2;
            iArr[o.Main.ordinal()] = 3;
            f41478a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<Throwable, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a<R> f41479w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a<R> aVar) {
            super(1);
            this.f41479w = aVar;
        }

        public final void a(Throwable th2) {
            this.f41479w.C(th2);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            a(th2);
            return wn.v.f59242a;
        }
    }

    public n0(g2 g2Var, m2.d dVar) {
        m mVar;
        jo.p.h(g2Var, "viewConfiguration");
        jo.p.h(dVar, "density");
        this.f41462y = g2Var;
        this.f41463z = dVar;
        mVar = o0.f41480a;
        this.A = mVar;
        this.B = new m0.e<>(new a[16], 0);
        this.C = new m0.e<>(new a[16], 0);
        this.E = m2.o.f40537b.a();
        this.F = v1.f56093w;
    }

    @Override // n1.c0
    public boolean C() {
        return this.G;
    }

    @Override // m2.d
    public float G0() {
        return this.f41463z.G0();
    }

    @Override // m2.d
    public float I0(float f10) {
        return this.f41463z.I0(f10);
    }

    @Override // n1.e0
    public <R> Object N(io.p<? super n1.c, ? super ao.d<? super R>, ? extends Object> pVar, ao.d<? super R> dVar) {
        uo.q qVar = new uo.q(bo.b.b(dVar), 1);
        qVar.y();
        a aVar = new a(this, qVar);
        synchronized (this.B) {
            this.B.c(aVar);
            ao.d<wn.v> a10 = ao.f.a(pVar, aVar, aVar);
            l.a aVar2 = wn.l.f59224w;
            a10.resumeWith(wn.l.a(wn.v.f59242a));
        }
        qVar.M(new c(aVar));
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10;
    }

    @Override // m2.d
    public int N0(long j10) {
        return this.f41463z.N0(j10);
    }

    @Override // n1.c0
    public void P0() {
        boolean z10;
        m mVar = this.D;
        if (mVar == null) {
            return;
        }
        List<w> c10 = mVar.c();
        int size = c10.size();
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= size) {
                break;
            } else if (!(true ^ c10.get(i10).g())) {
                z10 = false;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            return;
        }
        List<w> c11 = mVar.c();
        ArrayList arrayList = new ArrayList(c11.size());
        int size2 = c11.size();
        for (int i11 = 0; i11 < size2; i11++) {
            w wVar = c11.get(i11);
            arrayList.add(new w(wVar.e(), wVar.l(), wVar.f(), false, wVar.l(), wVar.f(), wVar.g(), wVar.g(), 0, 0L, 768, (jo.h) null));
        }
        m mVar2 = new m(arrayList);
        this.A = mVar2;
        k1(mVar2, o.Initial);
        k1(mVar2, o.Main);
        k1(mVar2, o.Final);
        this.D = null;
    }

    public long S() {
        long W0 = W0(getViewConfiguration().d());
        long a10 = a();
        return b1.m.a(Math.max(0.0f, b1.l.i(W0) - m2.o.g(a10)) / 2.0f, Math.max(0.0f, b1.l.g(W0) - m2.o.f(a10)) / 2.0f);
    }

    @Override // m2.d
    public long W0(long j10) {
        return this.f41463z.W0(j10);
    }

    @Override // m2.d
    public int X(float f10) {
        return this.f41463z.X(f10);
    }

    @Override // m2.d
    public float c0(long j10) {
        return this.f41463z.c0(j10);
    }

    @Override // n1.c0
    public void e1(m mVar, o oVar, long j10) {
        jo.p.h(mVar, "pointerEvent");
        jo.p.h(oVar, "pass");
        this.E = j10;
        if (oVar == o.Initial) {
            this.A = mVar;
        }
        k1(mVar, oVar);
        List<w> c10 = mVar.c();
        int size = c10.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!n.d(c10.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (!(!z10)) {
            mVar = null;
        }
        this.D = mVar;
    }

    @Override // m2.d
    public long f(long j10) {
        return this.f41463z.f(j10);
    }

    @Override // m2.d
    public float getDensity() {
        return this.f41463z.getDensity();
    }

    @Override // n1.e0
    public g2 getViewConfiguration() {
        return this.f41462y;
    }

    public final void k1(m mVar, o oVar) {
        m0.e<a<?>> eVar;
        int p10;
        synchronized (this.B) {
            m0.e<a<?>> eVar2 = this.C;
            eVar2.e(eVar2.p(), this.B);
        }
        try {
            int i10 = b.f41478a[oVar.ordinal()];
            if (i10 == 1 || i10 == 2) {
                m0.e<a<?>> eVar3 = this.C;
                int p11 = eVar3.p();
                if (p11 > 0) {
                    int i11 = 0;
                    a<?>[] n10 = eVar3.n();
                    do {
                        n10[i11].E(mVar, oVar);
                        i11++;
                    } while (i11 < p11);
                }
            } else if (i10 == 3 && (p10 = (eVar = this.C).p()) > 0) {
                int i12 = p10 - 1;
                a<?>[] n11 = eVar.n();
                do {
                    n11[i12].E(mVar, oVar);
                    i12--;
                } while (i12 >= 0);
            }
        } finally {
            this.C.h();
        }
    }

    public final q0 l1() {
        return this.F;
    }

    public final void m1(q0 q0Var) {
        jo.p.h(q0Var, "<set-?>");
        this.F = q0Var;
    }

    @Override // m2.d
    public float s(int i10) {
        return this.f41463z.s(i10);
    }

    @Override // m2.d
    public float t(float f10) {
        return this.f41463z.t(f10);
    }

    @Override // n1.d0
    public c0 z0() {
        return this;
    }
}
