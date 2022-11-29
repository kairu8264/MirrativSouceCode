package d2;

import l0.c2;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final g2.l f29121a = g2.k.a();

    /* renamed from: b  reason: collision with root package name */
    public final c2.b<m0, o0> f29122b = new c2.b<>(16);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<o0, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ m0 f29124x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m0 m0Var) {
            super(1);
            this.f29124x = m0Var;
        }

        public final void a(o0 o0Var) {
            jo.p.h(o0Var, "finalResult");
            g2.l b10 = n0.this.b();
            n0 n0Var = n0.this;
            m0 m0Var = this.f29124x;
            synchronized (b10) {
                if (o0Var.b()) {
                    n0Var.f29122b.e(m0Var, o0Var);
                } else {
                    n0Var.f29122b.f(m0Var);
                }
                wn.v vVar = wn.v.f59242a;
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(o0 o0Var) {
            a(o0Var);
            return wn.v.f59242a;
        }
    }

    public final g2.l b() {
        return this.f29121a;
    }

    public final c2<Object> c(m0 m0Var, io.l<? super io.l<? super o0, wn.v>, ? extends o0> lVar) {
        jo.p.h(m0Var, "typefaceRequest");
        jo.p.h(lVar, "resolveTypeface");
        synchronized (this.f29121a) {
            o0 d10 = this.f29122b.d(m0Var);
            if (d10 != null) {
                if (d10.b()) {
                    return d10;
                }
                this.f29122b.f(m0Var);
            }
            try {
                o0 invoke = lVar.invoke(new a(m0Var));
                synchronized (this.f29121a) {
                    if (this.f29122b.d(m0Var) == null && invoke.b()) {
                        this.f29122b.e(m0Var, invoke);
                    }
                    wn.v vVar = wn.v.f59242a;
                }
                return invoke;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
