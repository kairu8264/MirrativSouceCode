package hf;

import com.dena.mirrorman.net.retrofit.MRRequest;

/* loaded from: classes2.dex */
public final class i0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final MRRequest f35546a;

    /* renamed from: b  reason: collision with root package name */
    public final s f35547b;

    /* renamed from: c  reason: collision with root package name */
    public final kf.p f35548c;

    /* renamed from: d  reason: collision with root package name */
    public final f0 f35549d;

    @co.f(c = "com.dena.mirrorman.helper.NewNoticeRepositoryImpl", f = "NewNoticeRepository.kt", l = {32}, m = "get")
    /* loaded from: classes2.dex */
    public static final class a extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f35550w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f35551x;

        /* renamed from: z  reason: collision with root package name */
        public int f35553z;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f35551x = obj;
            this.f35553z |= Integer.MIN_VALUE;
            return i0.this.g(null, this);
        }
    }

    public i0(MRRequest mRRequest, s sVar, kf.p pVar, f0 f0Var) {
        jo.p.h(mRRequest, "request");
        jo.p.h(sVar, "getCurrentTimeMillis");
        jo.p.h(pVar, "noticePreference");
        jo.p.h(f0Var, "newNoticeCache");
        this.f35546a = mRRequest;
        this.f35547b = sVar;
        this.f35548c = pVar;
        this.f35549d = f0Var;
    }

    @Override // hf.h0
    public void a() {
        this.f35548c.r2(this.f35547b.d() / 1000);
        this.f35549d.a();
    }

    @Override // hf.h0
    public void b() {
        this.f35548c.Z2(this.f35547b.d() / 1000);
        this.f35549d.b();
    }

    @Override // hf.h0
    public void c(long j10, boolean z10) {
        this.f35548c.p(j10);
        if (z10) {
            return;
        }
        this.f35549d.d();
    }

    @Override // hf.h0
    public void d() {
        this.f35549d.clear();
    }

    @Override // hf.h0
    public void e(long j10, boolean z10) {
        this.f35548c.Y2(j10);
        if (z10) {
            return;
        }
        this.f35549d.i();
    }

    @Override // hf.h0
    public void f(long j10, boolean z10) {
        this.f35548c.q0(j10);
        if (z10) {
            return;
        }
        this.f35549d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // hf.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(java.lang.String r25, ao.d<? super jf.e0> r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            boolean r2 = r1 instanceof hf.i0.a
            if (r2 == 0) goto L17
            r2 = r1
            hf.i0$a r2 = (hf.i0.a) r2
            int r3 = r2.f35553z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f35553z = r3
            goto L1c
        L17:
            hf.i0$a r2 = new hf.i0$a
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f35551x
            java.lang.Object r4 = bo.c.c()
            int r3 = r2.f35553z
            r15 = 1
            if (r3 == 0) goto L39
            if (r3 != r15) goto L31
            java.lang.Object r2 = r2.f35550w
            hf.i0 r2 = (hf.i0) r2
            wn.m.b(r1)
            goto L93
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            wn.m.b(r1)
            hf.f0 r1 = r0.f35549d
            jf.e0 r1 = r1.get()
            if (r1 == 0) goto L45
            return r1
        L45:
            com.dena.mirrorman.net.retrofit.MRRequest r3 = r0.f35546a
            kf.p r1 = r0.f35548c
            long r5 = r1.b5()
            kf.p r1 = r0.f35548c
            long r7 = r1.v1()
            kf.p r1 = r0.f35548c
            long r9 = r1.f3()
            kf.p r1 = r0.f35548c
            long r11 = r1.A()
            kf.p r1 = r0.f35548c
            long r13 = r1.i3()
            kf.p r1 = r0.f35548c
            long r16 = r1.l1()
            r1 = r15
            r15 = r16
            kf.p r1 = r0.f35548c
            long r17 = r1.H4()
            kf.p r1 = r0.f35548c
            long r19 = r1.g4()
            kf.p r1 = r0.f35548c
            long r21 = r1.U()
            r2.f35550w = r0
            r1 = 1
            r2.f35553z = r1
            r1 = r4
            r4 = r25
            r23 = r2
            java.lang.Object r2 = r3.getNoticeCounts(r4, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23)
            if (r2 != r1) goto L91
            return r1
        L91:
            r1 = r2
            r2 = r0
        L93:
            com.dena.mirrorman.net.api.response.NoticeCountsResponse r1 = (com.dena.mirrorman.net.api.response.NoticeCountsResponse) r1
            jf.e0$a r3 = jf.e0.f37915i
            com.dena.mirrorman.net.api.response.notice.NoticeCountsParams r1 = r1.getCounts()
            jf.e0 r1 = r3.a(r1)
            hf.f0 r2 = r2.f35549d
            r2.g(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.i0.g(java.lang.String, ao.d):java.lang.Object");
    }

    @Override // hf.h0
    public void h(long j10) {
        this.f35548c.q2(j10);
        this.f35549d.h();
    }

    @Override // hf.h0
    public jf.e0 i() {
        return this.f35549d.get();
    }

    @Override // hf.h0
    public void j(long j10) {
        this.f35548c.w0(j10);
        this.f35549d.f();
    }

    @Override // hf.h0
    public void k(long j10) {
        this.f35548c.U1(j10);
        this.f35549d.e();
    }
}
