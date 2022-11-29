package w;

/* loaded from: classes.dex */
public final class e implements m {

    /* renamed from: a  reason: collision with root package name */
    public final u.w<Float> f57621a;

    @co.f(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior", f = "Scrollable.kt", l = {496}, m = "performFling")
    /* loaded from: classes.dex */
    public static final class a extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f57622w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57623x;

        /* renamed from: z  reason: collision with root package name */
        public int f57625z;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f57623x = obj;
            this.f57625z |= Integer.MIN_VALUE;
            return e.this.a(null, 0.0f, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<u.h<Float, u.m>, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ jo.b0 f57626w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ y f57627x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ jo.b0 f57628y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jo.b0 b0Var, y yVar, jo.b0 b0Var2) {
            super(1);
            this.f57626w = b0Var;
            this.f57627x = yVar;
            this.f57628y = b0Var2;
        }

        public final void a(u.h<Float, u.m> hVar) {
            jo.p.h(hVar, "$this$animateDecay");
            float floatValue = hVar.e().floatValue() - this.f57626w.f38128w;
            float a10 = this.f57627x.a(floatValue);
            this.f57626w.f38128w = hVar.e().floatValue();
            this.f57628y.f38128w = hVar.f().floatValue();
            if (Math.abs(floatValue - a10) > 0.5f) {
                hVar.a();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(u.h<Float, u.m> hVar) {
            a(hVar);
            return wn.v.f59242a;
        }
    }

    public e(u.w<Float> wVar) {
        jo.p.h(wVar, "flingDecay");
        this.f57621a = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @Override // w.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(w.y r18, float r19, ao.d<? super java.lang.Float> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof w.e.a
            if (r2 == 0) goto L17
            r2 = r1
            w.e$a r2 = (w.e.a) r2
            int r3 = r2.f57625z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f57625z = r3
            goto L1c
        L17:
            w.e$a r2 = new w.e$a
            r2.<init>(r1)
        L1c:
            r7 = r2
            java.lang.Object r1 = r7.f57623x
            java.lang.Object r2 = bo.c.c()
            int r3 = r7.f57625z
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r7.f57622w
            jo.b0 r2 = (jo.b0) r2
            wn.m.b(r1)
            goto L82
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            wn.m.b(r1)
            float r1 = java.lang.Math.abs(r19)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L85
            jo.b0 r1 = new jo.b0
            r1.<init>()
            r3 = r19
            r1.f38128w = r3
            jo.b0 r5 = new jo.b0
            r5.<init>()
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 28
            r16 = 0
            r9 = r19
            u.k r3 = u.l.b(r8, r9, r10, r12, r14, r15, r16)
            u.w<java.lang.Float> r6 = r0.f57621a
            r8 = 0
            w.e$b r9 = new w.e$b
            r10 = r18
            r9.<init>(r5, r10, r1)
            r10 = 2
            r11 = 0
            r7.f57622w = r1
            r7.f57625z = r4
            r4 = r6
            r5 = r8
            r6 = r9
            r8 = r10
            r9 = r11
            java.lang.Object r3 = u.x0.i(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L81
            return r2
        L81:
            r2 = r1
        L82:
            float r1 = r2.f38128w
            goto L88
        L85:
            r3 = r19
            r1 = r3
        L88:
            java.lang.Float r1 = co.b.c(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e.a(w.y, float, ao.d):java.lang.Object");
    }
}
