package xo;

/* loaded from: classes4.dex */
public final class h0<T> extends yo.a<j0> implements s<T>, c, yo.n<T> {
    public int A;
    private volatile /* synthetic */ Object _state;

    @co.f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, 403}, m = "collect")
    /* loaded from: classes4.dex */
    public static final class a extends co.d {
        public Object A;
        public /* synthetic */ Object B;
        public final /* synthetic */ h0<T> C;
        public int D;

        /* renamed from: w  reason: collision with root package name */
        public Object f60508w;

        /* renamed from: x  reason: collision with root package name */
        public Object f60509x;

        /* renamed from: y  reason: collision with root package name */
        public Object f60510y;

        /* renamed from: z  reason: collision with root package name */
        public Object f60511z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0<T> h0Var, ao.d<? super a> dVar) {
            super(dVar);
            this.C = h0Var;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return this.C.a(null, this);
        }
    }

    public h0(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
        if (jo.p.c(r11, r12) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:58:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [yo.c] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00d5 -> B:34:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e7 -> B:34:0x00a6). Please submit an issue!!! */
    @Override // xo.w, xo.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(xo.d<? super T> r11, ao.d<?> r12) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.h0.a(xo.d, ao.d):java.lang.Object");
    }

    @Override // xo.r
    public boolean b(T t10) {
        setValue(t10);
        return true;
    }

    @Override // yo.n
    public c<T> d(ao.g gVar, int i10, wo.h hVar) {
        return i0.d(this, gVar, i10, hVar);
    }

    @Override // xo.s
    public boolean e(T t10, T t11) {
        if (t10 == null) {
            t10 = (T) yo.q.f62129a;
        }
        if (t11 == null) {
            t11 = (T) yo.q.f62129a;
        }
        return q(t10, t11);
    }

    @Override // xo.r, xo.d
    public Object emit(T t10, ao.d<? super wn.v> dVar) {
        setValue(t10);
        return wn.v.f59242a;
    }

    @Override // xo.r
    public void f() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // xo.s, xo.g0
    public T getValue() {
        zo.k0 k0Var = yo.q.f62129a;
        T t10 = (T) this._state;
        if (t10 == k0Var) {
            return null;
        }
        return t10;
    }

    @Override // yo.a
    /* renamed from: o */
    public j0 j() {
        return new j0();
    }

    @Override // yo.a
    /* renamed from: p */
    public j0[] k(int i10) {
        return new j0[i10];
    }

    public final boolean q(Object obj, Object obj2) {
        int i10;
        j0[] n10;
        n();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !jo.p.c(obj3, obj)) {
                return false;
            }
            if (jo.p.c(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i11 = this.A;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.A = i12;
                j0[] n11 = n();
                wn.v vVar = wn.v.f59242a;
                while (true) {
                    j0[] j0VarArr = n11;
                    if (j0VarArr != null) {
                        int length = j0VarArr.length;
                        int i13 = 0;
                        while (i13 < length) {
                            j0 j0Var = j0VarArr[i13];
                            i13++;
                            if (j0Var != null) {
                                j0Var.f();
                            }
                        }
                    }
                    synchronized (this) {
                        i10 = this.A;
                        if (i10 == i12) {
                            this.A = i12 + 1;
                            return true;
                        }
                        n10 = n();
                        wn.v vVar2 = wn.v.f59242a;
                    }
                    n11 = n10;
                    i12 = i10;
                }
            } else {
                this.A = i11 + 2;
                return true;
            }
        }
    }

    @Override // xo.s
    public void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) yo.q.f62129a;
        }
        q(null, t10);
    }
}
