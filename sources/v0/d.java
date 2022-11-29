package v0;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: n  reason: collision with root package name */
    public final c f56457n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f56458o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, k kVar, io.l<Object, wn.v> lVar, io.l<Object, wn.v> lVar2, c cVar) {
        super(i10, kVar, lVar, lVar2);
        jo.p.h(kVar, "invalid");
        jo.p.h(cVar, "parent");
        this.f56457n = cVar;
        cVar.l(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x00bb, TryCatch #0 {, blocks: (B:13:0x002d, B:15:0x0032, B:18:0x0039, B:22:0x0053, B:24:0x005b, B:25:0x0065, B:27:0x006c, B:29:0x0074, B:30:0x0079, B:26:0x0069), top: B:39:0x002d }] */
    @Override // v0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v0.i A() {
        /*
            r6 = this;
            v0.c r0 = r6.f56457n
            boolean r0 = r0.B()
            if (r0 != 0) goto Lbe
            v0.c r0 = r6.f56457n
            boolean r0 = r0.e()
            if (r0 == 0) goto L12
            goto Lbe
        L12:
            java.util.Set r0 = r6.C()
            int r1 = r6.f()
            if (r0 == 0) goto L27
            v0.c r2 = r6.f56457n
            v0.k r3 = r2.g()
            java.util.Map r2 = v0.m.m(r2, r6, r3)
            goto L28
        L27:
            r2 = 0
        L28:
            java.lang.Object r3 = v0.m.C()
            monitor-enter(r3)
            v0.m.u(r6)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L69
            int r4 = r0.size()     // Catch: java.lang.Throwable -> Lbb
            if (r4 != 0) goto L39
            goto L69
        L39:
            v0.c r4 = r6.f56457n     // Catch: java.lang.Throwable -> Lbb
            int r4 = r4.f()     // Catch: java.lang.Throwable -> Lbb
            v0.c r5 = r6.f56457n     // Catch: java.lang.Throwable -> Lbb
            v0.k r5 = r5.g()     // Catch: java.lang.Throwable -> Lbb
            v0.i r2 = r6.F(r4, r2, r5)     // Catch: java.lang.Throwable -> Lbb
            v0.i$b r4 = v0.i.b.f56493a     // Catch: java.lang.Throwable -> Lbb
            boolean r4 = jo.p.c(r2, r4)     // Catch: java.lang.Throwable -> Lbb
            if (r4 != 0) goto L53
            monitor-exit(r3)
            return r2
        L53:
            v0.c r2 = r6.f56457n     // Catch: java.lang.Throwable -> Lbb
            java.util.Set r2 = r2.C()     // Catch: java.lang.Throwable -> Lbb
            if (r2 != 0) goto L65
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lbb
            r2.<init>()     // Catch: java.lang.Throwable -> Lbb
            v0.c r4 = r6.f56457n     // Catch: java.lang.Throwable -> Lbb
            r4.M(r2)     // Catch: java.lang.Throwable -> Lbb
        L65:
            r2.addAll(r0)     // Catch: java.lang.Throwable -> Lbb
            goto L6c
        L69:
            r6.b()     // Catch: java.lang.Throwable -> Lbb
        L6c:
            v0.c r0 = r6.f56457n     // Catch: java.lang.Throwable -> Lbb
            int r0 = r0.f()     // Catch: java.lang.Throwable -> Lbb
            if (r0 >= r1) goto L79
            v0.c r0 = r6.f56457n     // Catch: java.lang.Throwable -> Lbb
            r0.z()     // Catch: java.lang.Throwable -> Lbb
        L79:
            v0.c r0 = r6.f56457n     // Catch: java.lang.Throwable -> Lbb
            v0.k r2 = r0.g()     // Catch: java.lang.Throwable -> Lbb
            v0.k r2 = r2.p(r1)     // Catch: java.lang.Throwable -> Lbb
            v0.k r4 = r6.D()     // Catch: java.lang.Throwable -> Lbb
            v0.k r2 = r2.m(r4)     // Catch: java.lang.Throwable -> Lbb
            r0.u(r2)     // Catch: java.lang.Throwable -> Lbb
            v0.c r0 = r6.f56457n     // Catch: java.lang.Throwable -> Lbb
            r0.G(r1)     // Catch: java.lang.Throwable -> Lbb
            v0.c r0 = r6.f56457n     // Catch: java.lang.Throwable -> Lbb
            int r1 = r6.w()     // Catch: java.lang.Throwable -> Lbb
            r0.I(r1)     // Catch: java.lang.Throwable -> Lbb
            v0.c r0 = r6.f56457n     // Catch: java.lang.Throwable -> Lbb
            v0.k r1 = r6.D()     // Catch: java.lang.Throwable -> Lbb
            r0.H(r1)     // Catch: java.lang.Throwable -> Lbb
            v0.c r0 = r6.f56457n     // Catch: java.lang.Throwable -> Lbb
            int[] r1 = r6.E()     // Catch: java.lang.Throwable -> Lbb
            r0.J(r1)     // Catch: java.lang.Throwable -> Lbb
            wn.v r0 = wn.v.f59242a     // Catch: java.lang.Throwable -> Lbb
            monitor-exit(r3)
            r0 = 1
            r6.L(r0)
            r6.Q()
            v0.i$b r0 = v0.i.b.f56493a
            return r0
        Lbb:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        Lbe:
            v0.i$a r0 = new v0.i$a
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.d.A():v0.i");
    }

    public final void Q() {
        if (this.f56458o) {
            return;
        }
        this.f56458o = true;
        this.f56457n.m(this);
    }

    @Override // v0.c, v0.h
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        Q();
    }
}
