package d2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Object f29084a = a.b(null);

    /* renamed from: b  reason: collision with root package name */
    public final c2.b<b, a> f29085b = new c2.b<>(16);

    /* renamed from: c  reason: collision with root package name */
    public final c2.c<b, a> f29086c = new c2.c<>(0, 1, null);

    /* renamed from: d  reason: collision with root package name */
    public final g2.l f29087d = g2.k.a();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f29088a;

        public /* synthetic */ a(Object obj) {
            this.f29088a = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public static Object b(Object obj) {
            return obj;
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && jo.p.c(obj, ((a) obj2).g());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            return obj == null;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f29088a, obj);
        }

        public final /* synthetic */ Object g() {
            return this.f29088a;
        }

        public int hashCode() {
            return d(this.f29088a);
        }

        public String toString() {
            return f(this.f29088a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final k f29089a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f29090b;

        public b(k kVar, Object obj) {
            jo.p.h(kVar, "font");
            this.f29089a = kVar;
            this.f29090b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(this.f29089a, bVar.f29089a) && jo.p.c(this.f29090b, bVar.f29090b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f29089a.hashCode() * 31;
            Object obj = this.f29090b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.f29089a + ", loaderKey=" + this.f29090b + ')';
        }
    }

    @co.f(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {399}, m = "runCached")
    /* loaded from: classes.dex */
    public static final class c extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f29091w;

        /* renamed from: x  reason: collision with root package name */
        public Object f29092x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f29093y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f29094z;

        public c(ao.d<? super c> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f29094z = obj;
            this.B |= Integer.MIN_VALUE;
            return h.this.g(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void f(h hVar, k kVar, b0 b0Var, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        hVar.e(kVar, b0Var, obj, z10);
    }

    public final a d(k kVar, b0 b0Var) {
        a d10;
        jo.p.h(kVar, "font");
        jo.p.h(b0Var, "platformFontLoader");
        b bVar = new b(kVar, b0Var.a());
        synchronized (this.f29087d) {
            d10 = this.f29085b.d(bVar);
            if (d10 == null) {
                d10 = this.f29086c.b(bVar);
            }
        }
        return d10;
    }

    public final void e(k kVar, b0 b0Var, Object obj, boolean z10) {
        jo.p.h(kVar, "font");
        jo.p.h(b0Var, "platformFontLoader");
        b bVar = new b(kVar, b0Var.a());
        synchronized (this.f29087d) {
            try {
                if (obj == null) {
                    this.f29086c.h(bVar, a.a(this.f29084a));
                } else if (z10) {
                    this.f29086c.h(bVar, a.a(a.b(obj)));
                } else {
                    this.f29085b.e(bVar, a.a(a.b(obj)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(d2.k r6, d2.b0 r7, boolean r8, io.l<? super ao.d<java.lang.Object>, ? extends java.lang.Object> r9, ao.d<java.lang.Object> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof d2.h.c
            if (r0 == 0) goto L13
            r0 = r10
            d2.h$c r0 = (d2.h.c) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            d2.h$c r0 = new d2.h$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f29094z
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.B
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r8 = r0.f29093y
            java.lang.Object r6 = r0.f29092x
            d2.h$b r6 = (d2.h.b) r6
            java.lang.Object r7 = r0.f29091w
            d2.h r7 = (d2.h) r7
            wn.m.b(r10)
            goto L7a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            wn.m.b(r10)
            d2.h$b r10 = new d2.h$b
            java.lang.Object r7 = r7.a()
            r10.<init>(r6, r7)
            g2.l r6 = r5.f29087d
            monitor-enter(r6)
            c2.b<d2.h$b, d2.h$a> r7 = r5.f29085b     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r7 = r7.d(r10)     // Catch: java.lang.Throwable -> Lb0
            d2.h$a r7 = (d2.h.a) r7     // Catch: java.lang.Throwable -> Lb0
            if (r7 != 0) goto L5c
            c2.c<d2.h$b, d2.h$a> r7 = r5.f29086c     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r7 = r7.b(r10)     // Catch: java.lang.Throwable -> Lb0
            d2.h$a r7 = (d2.h.a) r7     // Catch: java.lang.Throwable -> Lb0
        L5c:
            if (r7 == 0) goto L64
            java.lang.Object r7 = r7.g()     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r6)
            return r7
        L64:
            wn.v r7 = wn.v.f59242a     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r6)
            r0.f29091w = r5
            r0.f29092x = r10
            r0.f29093y = r8
            r0.B = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L76
            return r1
        L76:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L7a:
            g2.l r9 = r7.f29087d
            monitor-enter(r9)
            if (r10 != 0) goto L8d
            c2.c<d2.h$b, d2.h$a> r8 = r7.f29086c     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r7 = r7.f29084a     // Catch: java.lang.Throwable -> L8b
            d2.h$a r7 = d2.h.a.a(r7)     // Catch: java.lang.Throwable -> L8b
            r8.h(r6, r7)     // Catch: java.lang.Throwable -> L8b
            goto Laa
        L8b:
            r6 = move-exception
            goto Lae
        L8d:
            if (r8 == 0) goto L9d
            c2.c<d2.h$b, d2.h$a> r7 = r7.f29086c     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = d2.h.a.b(r10)     // Catch: java.lang.Throwable -> L8b
            d2.h$a r8 = d2.h.a.a(r8)     // Catch: java.lang.Throwable -> L8b
            r7.h(r6, r8)     // Catch: java.lang.Throwable -> L8b
            goto Laa
        L9d:
            c2.b<d2.h$b, d2.h$a> r7 = r7.f29085b     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = d2.h.a.b(r10)     // Catch: java.lang.Throwable -> L8b
            d2.h$a r8 = d2.h.a.a(r8)     // Catch: java.lang.Throwable -> L8b
            r7.e(r6, r8)     // Catch: java.lang.Throwable -> L8b
        Laa:
            wn.v r6 = wn.v.f59242a     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r9)
            return r10
        Lae:
            monitor-exit(r9)
            throw r6
        Lb0:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.h.g(d2.k, d2.b0, boolean, io.l, ao.d):java.lang.Object");
    }
}
