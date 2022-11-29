package v0;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class c extends h {

    /* renamed from: g  reason: collision with root package name */
    public final io.l<Object, wn.v> f56450g;

    /* renamed from: h  reason: collision with root package name */
    public final io.l<Object, wn.v> f56451h;

    /* renamed from: i  reason: collision with root package name */
    public Set<c0> f56452i;

    /* renamed from: j  reason: collision with root package name */
    public k f56453j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f56454k;

    /* renamed from: l  reason: collision with root package name */
    public int f56455l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f56456m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, k kVar, io.l<Object, wn.v> lVar, io.l<Object, wn.v> lVar2) {
        super(i10, kVar, null);
        jo.p.h(kVar, "invalid");
        this.f56450g = lVar;
        this.f56451h = lVar2;
        this.f56453j = k.A.a();
        this.f56454k = new int[0];
        this.f56455l = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed A[LOOP:0: B:30:0x00eb->B:31:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108 A[LOOP:1: B:36:0x0106->B:37:0x0108, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v0.i A() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.c.A():v0.i");
    }

    public final boolean B() {
        return this.f56456m;
    }

    public Set<c0> C() {
        return this.f56452i;
    }

    public final k D() {
        return this.f56453j;
    }

    public final int[] E() {
        return this.f56454k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
        r8 = v0.m.N(r6, f(), r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v0.i F(int r12, java.util.Map<v0.d0, ? extends v0.d0> r13, v0.k r14) {
        /*
            r11 = this;
            java.lang.String r0 = "invalidSnapshots"
            jo.p.h(r14, r0)
            v0.k r0 = r11.g()
            int r1 = r11.f()
            v0.k r0 = r0.u(r1)
            v0.k r1 = r11.f56453j
            v0.k r0 = r0.t(r1)
            java.util.Set r1 = r11.C()
            jo.p.e(r1)
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
            r4 = r3
        L24:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lc1
            java.lang.Object r5 = r2.next()
            v0.c0 r5 = (v0.c0) r5
            v0.d0 r6 = r5.d()
            v0.d0 r7 = v0.m.o(r6, r12, r14)
            if (r7 != 0) goto L3b
            goto L24
        L3b:
            int r8 = r11.f()
            v0.d0 r8 = v0.m.o(r6, r8, r0)
            if (r8 != 0) goto L46
            goto L24
        L46:
            boolean r9 = jo.p.c(r7, r8)
            if (r9 != 0) goto L24
            int r9 = r11.f()
            v0.k r10 = r11.g()
            v0.d0 r6 = v0.m.o(r6, r9, r10)
            if (r6 == 0) goto Lb8
            if (r13 == 0) goto L64
            java.lang.Object r9 = r13.get(r7)
            v0.d0 r9 = (v0.d0) r9
            if (r9 != 0) goto L68
        L64:
            v0.d0 r9 = r5.k(r8, r7, r6)
        L68:
            if (r9 != 0) goto L70
            v0.i$a r12 = new v0.i$a
            r12.<init>(r11)
            return r12
        L70:
            boolean r6 = jo.p.c(r9, r6)
            if (r6 != 0) goto L24
            boolean r6 = jo.p.c(r9, r7)
            if (r6 == 0) goto L99
            if (r3 != 0) goto L83
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L83:
            v0.d0 r6 = r7.b()
            wn.k r6 = wn.q.a(r5, r6)
            r3.add(r6)
            if (r4 != 0) goto L95
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L95:
            r4.add(r5)
            goto L24
        L99:
            if (r3 != 0) goto La0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        La0:
            boolean r6 = jo.p.c(r9, r8)
            if (r6 != 0) goto Lab
            wn.k r5 = wn.q.a(r5, r9)
            goto Lb3
        Lab:
            v0.d0 r6 = r8.b()
            wn.k r5 = wn.q.a(r5, r6)
        Lb3:
            r3.add(r5)
            goto L24
        Lb8:
            v0.m.n()
            kotlin.KotlinNothingValueException r12 = new kotlin.KotlinNothingValueException
            r12.<init>()
            throw r12
        Lc1:
            if (r3 == 0) goto Lfe
            r11.z()
            r12 = 0
            int r13 = r3.size()
        Lcb:
            if (r12 >= r13) goto Lfe
            java.lang.Object r14 = r3.get(r12)
            wn.k r14 = (wn.k) r14
            java.lang.Object r0 = r14.a()
            v0.c0 r0 = (v0.c0) r0
            java.lang.Object r14 = r14.b()
            v0.d0 r14 = (v0.d0) r14
            int r2 = r11.f()
            r14.f(r2)
            java.lang.Object r2 = v0.m.C()
            monitor-enter(r2)
            v0.d0 r5 = r0.d()     // Catch: java.lang.Throwable -> Lfb
            r14.e(r5)     // Catch: java.lang.Throwable -> Lfb
            r0.j(r14)     // Catch: java.lang.Throwable -> Lfb
            wn.v r14 = wn.v.f59242a     // Catch: java.lang.Throwable -> Lfb
            monitor-exit(r2)
            int r12 = r12 + 1
            goto Lcb
        Lfb:
            r12 = move-exception
            monitor-exit(r2)
            throw r12
        Lfe:
            if (r4 == 0) goto L103
            r1.removeAll(r4)
        L103:
            v0.i$b r12 = v0.i.b.f56493a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.c.F(int, java.util.Map, v0.k):v0.i");
    }

    public final void G(int i10) {
        synchronized (m.C()) {
            this.f56453j = this.f56453j.u(i10);
            wn.v vVar = wn.v.f59242a;
        }
    }

    public final void H(k kVar) {
        jo.p.h(kVar, "snapshots");
        synchronized (m.C()) {
            this.f56453j = this.f56453j.t(kVar);
            wn.v vVar = wn.v.f59242a;
        }
    }

    public final void I(int i10) {
        if (i10 >= 0) {
            this.f56454k = xn.n.u(this.f56454k, i10);
        }
    }

    public final void J(int[] iArr) {
        jo.p.h(iArr, "handles");
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.f56454k;
        if (iArr2.length == 0) {
            this.f56454k = iArr;
        } else {
            this.f56454k = xn.n.v(iArr2, iArr);
        }
    }

    public final void K() {
        int length = this.f56454k.length;
        for (int i10 = 0; i10 < length; i10++) {
            m.Q(this.f56454k[i10]);
        }
    }

    public final void L(boolean z10) {
        this.f56456m = z10;
    }

    public void M(Set<c0> set) {
        this.f56452i = set;
    }

    public c N(io.l<Object, wn.v> lVar, io.l<Object, wn.v> lVar2) {
        int i10;
        d dVar;
        io.l G;
        int i11;
        x();
        P();
        G(f());
        synchronized (m.C()) {
            i10 = m.f56510e;
            m.f56510e = i10 + 1;
            m.f56509d = m.f56509d.u(i10);
            k g10 = g();
            u(g10.u(i10));
            k v10 = m.v(g10, f() + 1, i10);
            io.l F = m.F(lVar, h(), false, 4, null);
            G = m.G(lVar2, j());
            dVar = new d(i10, v10, F, G, this);
        }
        if (!B() && !e()) {
            int f10 = f();
            synchronized (m.C()) {
                i11 = m.f56510e;
                m.f56510e = i11 + 1;
                t(i11);
                m.f56509d = m.f56509d.u(f());
                wn.v vVar = wn.v.f59242a;
            }
            u(m.v(g(), f10 + 1, f()));
        }
        return dVar;
    }

    public final void O() {
        if (!(!this.f56456m)) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
        if ((r0 >= 0) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P() {
        /*
            r3 = this;
            boolean r0 = r3.f56456m
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L11
            int r0 = v0.h.a(r3)
            if (r0 < 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L12
        L11:
            r1 = r2
        L12:
            if (r1 == 0) goto L15
            return
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unsupported operation on a disposed or applied snapshot"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.c.P():void");
    }

    @Override // v0.h
    public void c() {
        m.f56509d = m.f56509d.p(f()).m(this.f56453j);
    }

    @Override // v0.h
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        m(this);
    }

    @Override // v0.h
    public io.l<Object, wn.v> h() {
        return this.f56450g;
    }

    @Override // v0.h
    public boolean i() {
        return false;
    }

    @Override // v0.h
    public io.l<Object, wn.v> j() {
        return this.f56451h;
    }

    @Override // v0.h
    public void l(h hVar) {
        jo.p.h(hVar, "snapshot");
        this.f56455l++;
    }

    @Override // v0.h
    public void m(h hVar) {
        jo.p.h(hVar, "snapshot");
        int i10 = this.f56455l;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.f56455l = i11;
            if (i11 != 0 || this.f56456m) {
                return;
            }
            y();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // v0.h
    public void n() {
        if (this.f56456m || e()) {
            return;
        }
        z();
    }

    @Override // v0.h
    public void o(c0 c0Var) {
        jo.p.h(c0Var, "state");
        Set<c0> C = C();
        if (C == null) {
            C = new HashSet<>();
            M(C);
        }
        C.add(c0Var);
    }

    @Override // v0.h
    public void q() {
        K();
        super.q();
    }

    @Override // v0.h
    public h v(io.l<Object, wn.v> lVar) {
        int i10;
        e eVar;
        int i11;
        x();
        P();
        int f10 = f();
        G(f());
        synchronized (m.C()) {
            i10 = m.f56510e;
            m.f56510e = i10 + 1;
            m.f56509d = m.f56509d.u(i10);
            eVar = new e(i10, m.v(g(), f10 + 1, i10), lVar, this);
        }
        if (!B() && !e()) {
            int f11 = f();
            synchronized (m.C()) {
                i11 = m.f56510e;
                m.f56510e = i11 + 1;
                t(i11);
                m.f56509d = m.f56509d.u(f());
                wn.v vVar = wn.v.f59242a;
            }
            u(m.v(g(), f11 + 1, f()));
        }
        return eVar;
    }

    public final void y() {
        Set<c0> C = C();
        if (C != null) {
            O();
            M(null);
            int f10 = f();
            for (c0 c0Var : C) {
                for (d0 d10 = c0Var.d(); d10 != null; d10 = d10.c()) {
                    if (d10.d() == f10 || xn.a0.O(this.f56453j, Integer.valueOf(d10.d()))) {
                        d10.f(0);
                    }
                }
            }
        }
        b();
    }

    public final void z() {
        int i10;
        G(f());
        wn.v vVar = wn.v.f59242a;
        if (B() || e()) {
            return;
        }
        int f10 = f();
        synchronized (m.C()) {
            i10 = m.f56510e;
            m.f56510e = i10 + 1;
            t(i10);
            m.f56509d = m.f56509d.u(f());
        }
        u(m.v(g(), f10 + 1, f()));
    }
}
