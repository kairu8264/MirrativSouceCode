package pi;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class m9 extends f4 {

    /* renamed from: c  reason: collision with root package name */
    public Handler f48048c;

    /* renamed from: d  reason: collision with root package name */
    public final l9 f48049d;

    /* renamed from: e  reason: collision with root package name */
    public final k9 f48050e;

    /* renamed from: f  reason: collision with root package name */
    public final h9 f48051f;

    public m9(b5 b5Var) {
        super(b5Var);
        this.f48049d = new l9(this);
        this.f48050e = new k9(this);
        this.f48051f = new h9(this);
    }

    public static /* bridge */ /* synthetic */ void o(m9 m9Var, long j10) {
        m9Var.f();
        m9Var.q();
        m9Var.f48285a.r().u().b("Activity paused, time", Long.valueOf(j10));
        m9Var.f48051f.a(j10);
        if (m9Var.f48285a.y().C()) {
            m9Var.f48050e.b(j10);
        }
    }

    public static /* bridge */ /* synthetic */ void p(m9 m9Var, long j10) {
        m9Var.f();
        m9Var.q();
        m9Var.f48285a.r().u().b("Activity resumed, time", Long.valueOf(j10));
        if (m9Var.f48285a.y().C() || m9Var.f48285a.E().f47837q.b()) {
            m9Var.f48050e.c(j10);
        }
        m9Var.f48051f.b();
        l9 l9Var = m9Var.f48049d;
        l9Var.f48031a.f();
        if (l9Var.f48031a.f48285a.m()) {
            l9Var.b(l9Var.f48031a.f48285a.c().currentTimeMillis(), false);
        }
    }

    @Override // pi.f4
    public final boolean l() {
        return false;
    }

    public final void q() {
        f();
        if (this.f48048c == null) {
            this.f48048c = new hi.a1(Looper.getMainLooper());
        }
    }
}
