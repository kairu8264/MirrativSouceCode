package s1;

/* loaded from: classes.dex */
public final class u implements io.a<wn.v> {
    public boolean A;
    public final m0.e<t> B;

    /* renamed from: w  reason: collision with root package name */
    public final k f51953w;

    /* renamed from: x  reason: collision with root package name */
    public final r1.d<?> f51954x;

    /* renamed from: y  reason: collision with root package name */
    public u f51955y;

    /* renamed from: z  reason: collision with root package name */
    public u f51956z;

    public u(k kVar, r1.d<?> dVar) {
        jo.p.h(kVar, "layoutNode");
        jo.p.h(dVar, "modifier");
        this.f51953w = kVar;
        this.f51954x = dVar;
        this.B = new m0.e<>(new t[16], 0);
    }

    public final void a() {
        this.A = true;
        int i10 = 0;
        j(this.f51954x.getKey(), false);
        m0.e<t> eVar = this.B;
        int p10 = eVar.p();
        if (p10 > 0) {
            t[] n10 = eVar.n();
            do {
                n10[i10].b();
                i10++;
            } while (i10 < p10);
        }
    }

    public final void b() {
        this.A = true;
        y t02 = this.f51953w.t0();
        if (t02 != null) {
            t02.l(this);
        }
        m0.e<t> eVar = this.B;
        int p10 = eVar.p();
        if (p10 > 0) {
            int i10 = 0;
            t[] n10 = eVar.n();
            do {
                n10[i10].c();
                i10++;
            } while (i10 < p10);
        }
    }

    public final void c() {
        this.A = false;
        m0.e<t> eVar = this.B;
        int p10 = eVar.p();
        if (p10 > 0) {
            t[] n10 = eVar.n();
            int i10 = 0;
            do {
                n10[i10].d();
                i10++;
            } while (i10 < p10);
            j(this.f51954x.getKey(), false);
        }
        j(this.f51954x.getKey(), false);
    }

    public final r1.d<?> d(r1.a<?> aVar) {
        u p02;
        r1.d<?> d10;
        jo.p.h(aVar, "local");
        if (jo.p.c(this.f51954x.getKey(), aVar)) {
            return this.f51954x;
        }
        u uVar = this.f51956z;
        if (uVar == null || (d10 = uVar.d(aVar)) == null) {
            k u02 = this.f51953w.u0();
            if (u02 == null || (p02 = u02.p0()) == null) {
                return null;
            }
            return p02.d(aVar);
        }
        return d10;
    }

    public final m0.e<t> e() {
        return this.B;
    }

    public final k f() {
        return this.f51953w;
    }

    public final r1.d<?> g() {
        return this.f51954x;
    }

    public final u h() {
        return this.f51955y;
    }

    public final u i() {
        return this.f51956z;
    }

    @Override // io.a
    public /* bridge */ /* synthetic */ wn.v invoke() {
        k();
        return wn.v.f59242a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(r1.a<?> r6, boolean r7) {
        /*
            r5 = this;
            if (r7 == 0) goto Lf
            r1.d<?> r7 = r5.f51954x
            r1.f r7 = r7.getKey()
            boolean r7 = jo.p.c(r7, r6)
            if (r7 == 0) goto Lf
            return
        Lf:
            m0.e<s1.t> r7 = r5.B
            int r0 = r7.p()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L28
            java.lang.Object[] r7 = r7.n()
            r3 = r1
        L1e:
            r4 = r7[r3]
            s1.t r4 = (s1.t) r4
            r4.g(r6)
            int r3 = r3 + r2
            if (r3 < r0) goto L1e
        L28:
            s1.u r7 = r5.f51955y
            if (r7 == 0) goto L32
            r7.j(r6, r2)
            wn.v r7 = wn.v.f59242a
            goto L33
        L32:
            r7 = 0
        L33:
            if (r7 != 0) goto L53
            s1.k r7 = r5.f51953w
            m0.e r7 = r7.A0()
            int r0 = r7.p()
            if (r0 <= 0) goto L53
            java.lang.Object[] r7 = r7.n()
        L45:
            r3 = r7[r1]
            s1.k r3 = (s1.k) r3
            s1.u r3 = r3.o0()
            r3.j(r6, r2)
            int r1 = r1 + r2
            if (r1 < r0) goto L45
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.u.j(r1.a, boolean):void");
    }

    public void k() {
        if (this.A) {
            j(this.f51954x.getKey(), false);
        }
    }

    public final void l(u uVar) {
        this.f51955y = uVar;
    }

    public final void m(u uVar) {
        this.f51956z = uVar;
    }
}
