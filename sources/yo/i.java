package yo;

import java.util.concurrent.atomic.AtomicInteger;
import uo.q0;
import wo.b0;
import xn.f0;

/* loaded from: classes4.dex */
public final class i {

    @co.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {57, 79, 82}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ xo.c<T>[] C;
        public final /* synthetic */ io.a<T[]> D;
        public final /* synthetic */ io.q<xo.d<? super R>, T[], ao.d<? super wn.v>, Object> E;
        public final /* synthetic */ xo.d<R> F;

        /* renamed from: w  reason: collision with root package name */
        public Object f62111w;

        /* renamed from: x  reason: collision with root package name */
        public Object f62112x;

        /* renamed from: y  reason: collision with root package name */
        public int f62113y;

        /* renamed from: z  reason: collision with root package name */
        public int f62114z;

        @co.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: yo.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C1066a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ wo.i<f0<Object>> A;

            /* renamed from: w  reason: collision with root package name */
            public int f62115w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ xo.c<T>[] f62116x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f62117y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f62118z;

            /* renamed from: yo.i$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C1067a<T> implements xo.d {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ wo.i<f0<Object>> f62119w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ int f62120x;

                @co.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {35, 36}, m = "emit")
                /* renamed from: yo.i$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C1068a extends co.d {

                    /* renamed from: w  reason: collision with root package name */
                    public /* synthetic */ Object f62121w;

                    /* renamed from: x  reason: collision with root package name */
                    public final /* synthetic */ C1067a<T> f62122x;

                    /* renamed from: y  reason: collision with root package name */
                    public int f62123y;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C1068a(C1067a<? super T> c1067a, ao.d<? super C1068a> dVar) {
                        super(dVar);
                        this.f62122x = c1067a;
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        this.f62121w = obj;
                        this.f62123y |= Integer.MIN_VALUE;
                        return this.f62122x.emit(null, this);
                    }
                }

                public C1067a(wo.i<f0<Object>> iVar, int i10) {
                    this.f62119w = iVar;
                    this.f62120x = i10;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
                @Override // xo.d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T r7, ao.d<? super wn.v> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof yo.i.a.C1066a.C1067a.C1068a
                        if (r0 == 0) goto L13
                        r0 = r8
                        yo.i$a$a$a$a r0 = (yo.i.a.C1066a.C1067a.C1068a) r0
                        int r1 = r0.f62123y
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f62123y = r1
                        goto L18
                    L13:
                        yo.i$a$a$a$a r0 = new yo.i$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f62121w
                        java.lang.Object r1 = bo.c.c()
                        int r2 = r0.f62123y
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        wn.m.b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        wn.m.b(r8)
                        goto L4d
                    L38:
                        wn.m.b(r8)
                        wo.i<xn.f0<java.lang.Object>> r8 = r6.f62119w
                        xn.f0 r2 = new xn.f0
                        int r5 = r6.f62120x
                        r2.<init>(r5, r7)
                        r0.f62123y = r4
                        java.lang.Object r7 = r8.r(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f62123y = r3
                        java.lang.Object r7 = uo.l3.a(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        wn.v r7 = wn.v.f59242a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: yo.i.a.C1066a.C1067a.emit(java.lang.Object, ao.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1066a(xo.c<? extends T>[] cVarArr, int i10, AtomicInteger atomicInteger, wo.i<f0<Object>> iVar, ao.d<? super C1066a> dVar) {
                super(2, dVar);
                this.f62116x = cVarArr;
                this.f62117y = i10;
                this.f62118z = atomicInteger;
                this.A = iVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new C1066a(this.f62116x, this.f62117y, this.f62118z, this.A, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((C1066a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object c10 = bo.c.c();
                int i10 = this.f62115w;
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        xo.c[] cVarArr = this.f62116x;
                        int i11 = this.f62117y;
                        xo.c cVar = cVarArr[i11];
                        C1067a c1067a = new C1067a(this.A, i11);
                        this.f62115w = 1;
                        if (cVar.a(c1067a, this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        b0.a.a(this.A, null, 1, null);
                    }
                    return wn.v.f59242a;
                } finally {
                    if (this.f62118z.decrementAndGet() == 0) {
                        b0.a.a(this.A, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(xo.c<? extends T>[] cVarArr, io.a<T[]> aVar, io.q<? super xo.d<? super R>, ? super T[], ? super ao.d<? super wn.v>, ? extends Object> qVar, xo.d<? super R> dVar, ao.d<? super a> dVar2) {
            super(2, dVar2);
            this.C = cVarArr;
            this.D = aVar;
            this.E = qVar;
            this.F = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.C, this.D, this.E, this.F, dVar);
            aVar.B = obj;
            return aVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ed A[LOOP:0: B:28:0x00ed->B:35:0x0111, LOOP_START, PHI: r3 r10 
          PHI: (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:25:0x00e8, B:35:0x0111] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v5 xn.f0) = (r10v4 xn.f0), (r10v18 xn.f0) binds: [B:25:0x00e8, B:35:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r11v1, types: [xo.c<T>[], xo.c[]] */
        /* JADX WARN: Type inference failed for: r2v12, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Type inference failed for: r7v0, types: [xo.c<T>[]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0136 -> B:20:0x00c8). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x016b -> B:46:0x0167). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 369
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: yo.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <R, T> Object a(xo.d<? super R> dVar, xo.c<? extends T>[] cVarArr, io.a<T[]> aVar, io.q<? super xo.d<? super R>, ? super T[], ? super ao.d<? super wn.v>, ? extends Object> qVar, ao.d<? super wn.v> dVar2) {
        Object a10 = l.a(new a(cVarArr, aVar, qVar, dVar, null), dVar2);
        return a10 == bo.c.c() ? a10 : wn.v.f59242a;
    }
}
