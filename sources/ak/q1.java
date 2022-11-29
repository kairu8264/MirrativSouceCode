package ak;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: k  reason: collision with root package name */
    public static final dk.f f13592k = new dk.f("ExtractorLooper");

    /* renamed from: a  reason: collision with root package name */
    public final k2 f13593a;

    /* renamed from: b  reason: collision with root package name */
    public final k1 f13594b;

    /* renamed from: c  reason: collision with root package name */
    public final y3 f13595c;

    /* renamed from: d  reason: collision with root package name */
    public final a3 f13596d;

    /* renamed from: e  reason: collision with root package name */
    public final f3 f13597e;

    /* renamed from: f  reason: collision with root package name */
    public final n3 f13598f;

    /* renamed from: g  reason: collision with root package name */
    public final r3 f13599g;

    /* renamed from: h  reason: collision with root package name */
    public final dk.b0<u4> f13600h;

    /* renamed from: i  reason: collision with root package name */
    public final n2 f13601i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicBoolean f13602j = new AtomicBoolean(false);

    public q1(k2 k2Var, dk.b0<u4> b0Var, k1 k1Var, y3 y3Var, a3 a3Var, f3 f3Var, n3 n3Var, r3 r3Var, n2 n2Var) {
        this.f13593a = k2Var;
        this.f13600h = b0Var;
        this.f13594b = k1Var;
        this.f13595c = y3Var;
        this.f13596d = a3Var;
        this.f13597e = f3Var;
        this.f13598f = n3Var;
        this.f13599g = r3Var;
        this.f13601i = n2Var;
    }

    public final void a() {
        dk.f fVar = f13592k;
        fVar.a("Run extractor loop", new Object[0]);
        if (!this.f13602j.compareAndSet(false, true)) {
            fVar.e("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            m2 m2Var = null;
            try {
                m2Var = this.f13601i.a();
            } catch (p1 e10) {
                f13592k.b("Error while getting next extraction task: %s", e10.getMessage());
                if (e10.f13580w >= 0) {
                    this.f13600h.zza().q0(e10.f13580w);
                    b(e10.f13580w, e10);
                }
            }
            if (m2Var != null) {
                try {
                    if (m2Var instanceof j1) {
                        this.f13594b.a((j1) m2Var);
                    } else if (m2Var instanceof x3) {
                        this.f13595c.a((x3) m2Var);
                    } else if (m2Var instanceof z2) {
                        this.f13596d.a((z2) m2Var);
                    } else if (m2Var instanceof c3) {
                        this.f13597e.a((c3) m2Var);
                    } else if (m2Var instanceof m3) {
                        this.f13598f.a((m3) m2Var);
                    } else if (m2Var instanceof p3) {
                        this.f13599g.a((p3) m2Var);
                    } else {
                        f13592k.b("Unknown task type: %s", m2Var.getClass().getName());
                    }
                } catch (Exception e11) {
                    f13592k.b("Error during extraction task: %s", e11.getMessage());
                    this.f13600h.zza().q0(m2Var.f13532a);
                    b(m2Var.f13532a, e11);
                }
            } else {
                this.f13602j.set(false);
                return;
            }
        }
    }

    public final void b(int i10, Exception exc) {
        try {
            this.f13593a.m(i10, 5);
            this.f13593a.n(i10);
        } catch (p1 unused) {
            f13592k.b("Error during error handling: %s", exc.getMessage());
        }
    }
}
