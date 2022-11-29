package v0;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: e  reason: collision with root package name */
    public static final a f56484e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f56485f = 8;

    /* renamed from: a  reason: collision with root package name */
    public k f56486a;

    /* renamed from: b  reason: collision with root package name */
    public int f56487b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f56488c;

    /* renamed from: d  reason: collision with root package name */
    public int f56489d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: v0.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0901a implements f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ io.p<Set<? extends Object>, h, wn.v> f56490a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0901a(io.p<? super Set<? extends Object>, ? super h, wn.v> pVar) {
                this.f56490a = pVar;
            }

            @Override // v0.f
            public final void dispose() {
                io.p<Set<? extends Object>, h, wn.v> pVar = this.f56490a;
                synchronized (m.C()) {
                    m.d().remove(pVar);
                    wn.v vVar = wn.v.f59242a;
                }
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ io.l<Object, wn.v> f56491a;

            public b(io.l<Object, wn.v> lVar) {
                this.f56491a = lVar;
            }

            @Override // v0.f
            public final void dispose() {
                io.l<Object, wn.v> lVar = this.f56491a;
                synchronized (m.C()) {
                    m.g().remove(lVar);
                }
                m.b();
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a() {
            return m.z((h) m.j().a(), null, false, 6, null);
        }

        public final h b() {
            return m.B();
        }

        public final void c() {
            m.B().n();
        }

        public final <T> T d(io.l<Object, wn.v> lVar, io.l<Object, wn.v> lVar2, io.a<? extends T> aVar) {
            h f0Var;
            jo.p.h(aVar, "block");
            if (lVar == null && lVar2 == null) {
                return aVar.invoke();
            }
            h hVar = (h) m.j().a();
            if (hVar == null || (hVar instanceof c)) {
                f0Var = new f0(hVar instanceof c ? (c) hVar : null, lVar, lVar2, true, false);
            } else if (lVar == null) {
                return aVar.invoke();
            } else {
                f0Var = hVar.v(lVar);
            }
            try {
                h k10 = f0Var.k();
                T invoke = aVar.invoke();
                f0Var.r(k10);
                return invoke;
            } finally {
                f0Var.d();
            }
        }

        public final f e(io.p<? super Set<? extends Object>, ? super h, wn.v> pVar) {
            jo.p.h(pVar, "observer");
            m.a(m.f());
            synchronized (m.C()) {
                m.d().add(pVar);
            }
            return new C0901a(pVar);
        }

        public final f f(io.l<Object, wn.v> lVar) {
            jo.p.h(lVar, "observer");
            synchronized (m.C()) {
                m.g().add(lVar);
            }
            m.b();
            return new b(lVar);
        }

        public final void g() {
            Set<c0> C;
            boolean z10;
            synchronized (m.C()) {
                z10 = false;
                if (((v0.a) m.e().get()).C() != null) {
                    if (!C.isEmpty()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                m.b();
            }
        }

        public final c h(io.l<Object, wn.v> lVar, io.l<Object, wn.v> lVar2) {
            c N;
            h B = m.B();
            c cVar = B instanceof c ? (c) B : null;
            if (cVar == null || (N = cVar.N(lVar, lVar2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            return N;
        }

        public final h i(io.l<Object, wn.v> lVar) {
            return m.B().v(lVar);
        }
    }

    public h(int i10, k kVar) {
        this.f56486a = kVar;
        this.f56487b = i10;
        this.f56489d = i10 != 0 ? m.U(i10, g()) : -1;
    }

    public /* synthetic */ h(int i10, k kVar, jo.h hVar) {
        this(i10, kVar);
    }

    public final void b() {
        synchronized (m.C()) {
            c();
            q();
            wn.v vVar = wn.v.f59242a;
        }
    }

    public void c() {
        m.r(m.i().p(f()));
    }

    public void d() {
        this.f56488c = true;
        synchronized (m.C()) {
            p();
            wn.v vVar = wn.v.f59242a;
        }
    }

    public final boolean e() {
        return this.f56488c;
    }

    public int f() {
        return this.f56487b;
    }

    public k g() {
        return this.f56486a;
    }

    public abstract io.l<Object, wn.v> h();

    public abstract boolean i();

    public abstract io.l<Object, wn.v> j();

    public h k() {
        h hVar = (h) m.j().a();
        m.j().b(this);
        return hVar;
    }

    public abstract void l(h hVar);

    public abstract void m(h hVar);

    public abstract void n();

    public abstract void o(c0 c0Var);

    public final void p() {
        int i10 = this.f56489d;
        if (i10 >= 0) {
            m.Q(i10);
            this.f56489d = -1;
        }
    }

    public void q() {
        p();
    }

    public void r(h hVar) {
        m.j().b(hVar);
    }

    public final void s(boolean z10) {
        this.f56488c = z10;
    }

    public void t(int i10) {
        this.f56487b = i10;
    }

    public void u(k kVar) {
        jo.p.h(kVar, "<set-?>");
        this.f56486a = kVar;
    }

    public abstract h v(io.l<Object, wn.v> lVar);

    public final int w() {
        int i10 = this.f56489d;
        this.f56489d = -1;
        return i10;
    }

    public final void x() {
        if (!(!this.f56488c)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }
}
