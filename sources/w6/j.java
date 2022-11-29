package w6;

import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;
import jo.q;
import l0.c2;
import l0.s0;
import l0.u1;
import l0.z1;
import uo.a0;
import uo.y;

/* loaded from: classes.dex */
public final class j implements i {
    public final c2 A;
    public final c2 B;
    public final c2 C;

    /* renamed from: w  reason: collision with root package name */
    public final y<s6.d> f58169w = a0.b(null, 1, null);

    /* renamed from: x  reason: collision with root package name */
    public final s0 f58170x;

    /* renamed from: y  reason: collision with root package name */
    public final s0 f58171y;

    /* renamed from: z  reason: collision with root package name */
    public final c2 f58172z;

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf((j.this.getValue() == null && j.this.k() == null) ? false : true);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(j.this.k() != null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<Boolean> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(j.this.getValue() == null && j.this.k() == null);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.a<Boolean> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(j.this.getValue() != null);
        }
    }

    public j() {
        s0 e10;
        s0 e11;
        e10 = z1.e(null, null, 2, null);
        this.f58170x = e10;
        e11 = z1.e(null, null, 2, null);
        this.f58171y = e11;
        this.f58172z = u1.b(new c());
        this.A = u1.b(new a());
        this.B = u1.b(new b());
        this.C = u1.b(new d());
    }

    public final synchronized void d(s6.d dVar) {
        p.h(dVar, "composition");
        if (q()) {
            return;
        }
        t(dVar);
        this.f58169w.F(dVar);
    }

    public final synchronized void j(Throwable th2) {
        p.h(th2, MRLog.PAYLOAD_KEY_ERROR);
        if (q()) {
            return;
        }
        s(th2);
        this.f58169w.a(th2);
    }

    public Throwable k() {
        return (Throwable) this.f58171y.getValue();
    }

    @Override // l0.c2
    /* renamed from: p */
    public s6.d getValue() {
        return (s6.d) this.f58170x.getValue();
    }

    public boolean q() {
        return ((Boolean) this.A.getValue()).booleanValue();
    }

    public boolean r() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    public final void s(Throwable th2) {
        this.f58171y.setValue(th2);
    }

    public final void t(s6.d dVar) {
        this.f58170x.setValue(dVar);
    }
}
