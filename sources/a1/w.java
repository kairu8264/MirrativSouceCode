package a1;

/* loaded from: classes.dex */
public final class w implements r1.b, r1.d<w> {

    /* renamed from: w  reason: collision with root package name */
    public final t f356w;

    /* renamed from: x  reason: collision with root package name */
    public w f357x;

    /* renamed from: y  reason: collision with root package name */
    public final m0.e<j> f358y;

    public w(t tVar) {
        jo.p.h(tVar, "focusRequester");
        this.f356w = tVar;
        this.f358y = new m0.e<>(new j[16], 0);
        tVar.b().c(this);
    }

    public final void a(j jVar) {
        jo.p.h(jVar, "focusModifier");
        this.f358y.c(jVar);
        w wVar = this.f357x;
        if (wVar != null) {
            wVar.a(jVar);
        }
    }

    public final void b(m0.e<j> eVar) {
        jo.p.h(eVar, "newModifiers");
        m0.e<j> eVar2 = this.f358y;
        eVar2.e(eVar2.p(), eVar);
        w wVar = this.f357x;
        if (wVar != null) {
            wVar.b(eVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
        if (r7.q(r5) < r7.q(r6)) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a1.j c() {
        /*
            r9 = this;
            m0.e<a1.j> r0 = r9.f358y
            int r1 = r0.p()
            r2 = 0
            if (r1 <= 0) goto L8a
            r3 = 0
            java.lang.Object[] r0 = r0.n()
        Le:
            r4 = r0[r3]
            a1.j r4 = (a1.j) r4
            if (r2 == 0) goto L85
            s1.p r5 = r2.r()
            if (r5 == 0) goto L85
            s1.k r5 = r5.z1()
            if (r5 != 0) goto L21
            goto L85
        L21:
            s1.p r6 = r4.r()
            if (r6 == 0) goto L86
            s1.k r6 = r6.z1()
            if (r6 != 0) goto L2e
            goto L86
        L2e:
            int r7 = r5.Y()
            int r8 = r6.Y()
            if (r7 <= r8) goto L40
            s1.k r5 = r5.u0()
            jo.p.e(r5)
            goto L2e
        L40:
            int r7 = r6.Y()
            int r8 = r5.Y()
            if (r7 <= r8) goto L52
            s1.k r6 = r6.u0()
            jo.p.e(r6)
            goto L40
        L52:
            s1.k r7 = r5.u0()
            s1.k r8 = r6.u0()
            boolean r7 = jo.p.c(r7, r8)
            if (r7 != 0) goto L6f
            s1.k r5 = r5.u0()
            jo.p.e(r5)
            s1.k r6 = r6.u0()
            jo.p.e(r6)
            goto L52
        L6f:
            s1.k r7 = r5.u0()
            jo.p.e(r7)
            m0.e r7 = r7.A0()
            int r5 = r7.q(r5)
            int r6 = r7.q(r6)
            if (r5 >= r6) goto L85
            goto L86
        L85:
            r2 = r4
        L86:
            int r3 = r3 + 1
            if (r3 < r1) goto Le
        L8a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.w.c():a1.j");
    }

    @Override // r1.d
    /* renamed from: f */
    public w getValue() {
        return this;
    }

    public final void g(j jVar) {
        jo.p.h(jVar, "focusModifier");
        this.f358y.u(jVar);
        w wVar = this.f357x;
        if (wVar != null) {
            wVar.g(jVar);
        }
    }

    @Override // r1.d
    public r1.f<w> getKey() {
        return v.b();
    }

    public final void i(m0.e<j> eVar) {
        jo.p.h(eVar, "removedModifiers");
        this.f358y.x(eVar);
        w wVar = this.f357x;
        if (wVar != null) {
            wVar.i(eVar);
        }
    }

    @Override // r1.b
    public void j0(r1.e eVar) {
        jo.p.h(eVar, "scope");
        w wVar = (w) eVar.a(v.b());
        if (jo.p.c(wVar, this.f357x)) {
            return;
        }
        w wVar2 = this.f357x;
        if (wVar2 != null) {
            wVar2.i(this.f358y);
        }
        if (wVar != null) {
            wVar.b(this.f358y);
        }
        this.f357x = wVar;
    }
}
