package w;

import u.x0;

/* loaded from: classes.dex */
public final class x {

    @co.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {40}, m = "animateScrollBy")
    /* loaded from: classes.dex */
    public static final class a extends co.d {

        /* renamed from: w */
        public Object f57858w;

        /* renamed from: x */
        public /* synthetic */ Object f57859x;

        /* renamed from: y */
        public int f57860y;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f57859x = obj;
            this.f57860y |= Integer.MIN_VALUE;
            return x.a(null, 0.0f, null, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<y, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ jo.b0 A;

        /* renamed from: w */
        public int f57861w;

        /* renamed from: x */
        public /* synthetic */ Object f57862x;

        /* renamed from: y */
        public final /* synthetic */ float f57863y;

        /* renamed from: z */
        public final /* synthetic */ u.i<Float> f57864z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.p<Float, Float, wn.v> {

            /* renamed from: w */
            public final /* synthetic */ jo.b0 f57865w;

            /* renamed from: x */
            public final /* synthetic */ y f57866x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jo.b0 b0Var, y yVar) {
                super(2);
                this.f57865w = b0Var;
                this.f57866x = yVar;
            }

            public final void a(float f10, float f11) {
                jo.b0 b0Var = this.f57865w;
                float f12 = b0Var.f38128w;
                b0Var.f38128w = f12 + this.f57866x.a(f10 - f12);
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ wn.v invoke(Float f10, Float f11) {
                a(f10.floatValue(), f11.floatValue());
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, u.i<Float> iVar, jo.b0 b0Var, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f57863y = f10;
            this.f57864z = iVar;
            this.A = b0Var;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(y yVar, ao.d<? super wn.v> dVar) {
            return ((b) create(yVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.f57863y, this.f57864z, this.A, dVar);
            bVar.f57862x = obj;
            return bVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57861w;
            if (i10 == 0) {
                wn.m.b(obj);
                float f10 = this.f57863y;
                u.i<Float> iVar = this.f57864z;
                a aVar = new a(this.A, (y) this.f57862x);
                this.f57861w = 1;
                if (x0.e(0.0f, f10, 0.0f, iVar, aVar, this, 4, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(w.b0 r7, float r8, u.i<java.lang.Float> r9, ao.d<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof w.x.a
            if (r0 == 0) goto L13
            r0 = r10
            w.x$a r0 = (w.x.a) r0
            int r1 = r0.f57860y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57860y = r1
            goto L18
        L13:
            w.x$a r0 = new w.x$a
            r0.<init>(r10)
        L18:
            r4 = r0
            java.lang.Object r10 = r4.f57859x
            java.lang.Object r0 = bo.c.c()
            int r1 = r4.f57860y
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r7 = r4.f57858w
            jo.b0 r7 = (jo.b0) r7
            wn.m.b(r10)
            goto L57
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            wn.m.b(r10)
            jo.b0 r10 = new jo.b0
            r10.<init>()
            r3 = 0
            w.x$b r5 = new w.x$b
            r1 = 0
            r5.<init>(r8, r9, r10, r1)
            r8 = 1
            r6 = 0
            r4.f57858w = r10
            r4.f57860y = r2
            r1 = r7
            r2 = r3
            r3 = r5
            r5 = r8
            java.lang.Object r7 = w.b0.b(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L56
            return r0
        L56:
            r7 = r10
        L57:
            float r7 = r7.f38128w
            java.lang.Float r7 = co.b.c(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w.x.a(w.b0, float, u.i, ao.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(b0 b0Var, float f10, u.i iVar, ao.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = u.j.g(0.0f, 0.0f, null, 7, null);
        }
        return a(b0Var, f10, iVar, dVar);
    }
}
