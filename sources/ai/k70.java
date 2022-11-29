package ai;

import android.content.Context;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;

/* loaded from: classes3.dex */
public final class k70 {

    /* renamed from: b  reason: collision with root package name */
    public final Context f6107b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6108c;

    /* renamed from: d  reason: collision with root package name */
    public final zj0 f6109d;

    /* renamed from: e  reason: collision with root package name */
    public final yg.f0<e60> f6110e;

    /* renamed from: f  reason: collision with root package name */
    public final yg.f0<e60> f6111f;

    /* renamed from: g  reason: collision with root package name */
    public j70 f6112g;

    /* renamed from: a  reason: collision with root package name */
    public final Object f6106a = new Object();

    /* renamed from: h  reason: collision with root package name */
    public int f6113h = 1;

    public k70(Context context, zj0 zj0Var, String str, yg.f0<e60> f0Var, yg.f0<e60> f0Var2) {
        this.f6108c = str;
        this.f6107b = context.getApplicationContext();
        this.f6109d = zj0Var;
        this.f6110e = f0Var;
        this.f6111f = f0Var2;
    }

    public final j70 f(u uVar) {
        final j70 j70Var = new j70(this.f6111f);
        hk0.f4882e.execute(new Runnable(this, null, j70Var) { // from class: ai.o60

            /* renamed from: w  reason: collision with root package name */
            public final k70 f7667w;

            /* renamed from: x  reason: collision with root package name */
            public final j70 f7668x;

            {
                this.f7667w = this;
                this.f7668x = j70Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7667w.i(null, this.f7668x);
            }
        });
        j70Var.b(new z60(this, j70Var), new a70(this, j70Var));
        return j70Var;
    }

    public final e70 g(u uVar) {
        synchronized (this.f6106a) {
            synchronized (this.f6106a) {
                j70 j70Var = this.f6112g;
                if (j70Var != null && this.f6113h == 0) {
                    j70Var.b(new qk0(this) { // from class: ai.p60

                        /* renamed from: a  reason: collision with root package name */
                        public final k70 f8319a;

                        {
                            this.f8319a = this;
                        }

                        @Override // ai.qk0
                        public final void a(Object obj) {
                            this.f8319a.h((e60) obj);
                        }
                    }, q60.f8838a);
                }
            }
            j70 j70Var2 = this.f6112g;
            if (j70Var2 != null && j70Var2.e() != -1) {
                int i10 = this.f6113h;
                if (i10 == 0) {
                    return this.f6112g.f();
                } else if (i10 == 1) {
                    this.f6113h = 2;
                    f(null);
                    return this.f6112g.f();
                } else {
                    return this.f6112g.f();
                }
            }
            this.f6113h = 2;
            j70 f10 = f(null);
            this.f6112g = f10;
            return f10.f();
        }
    }

    public final /* synthetic */ void h(e60 e60Var) {
        if (e60Var.g()) {
            this.f6113h = 1;
        }
    }

    public final /* synthetic */ void i(u uVar, final j70 j70Var) {
        try {
            final m60 m60Var = new m60(this.f6107b, this.f6109d, null, null);
            m60Var.f(new d60(this, j70Var, m60Var) { // from class: ai.s60

                /* renamed from: a  reason: collision with root package name */
                public final k70 f9748a;

                /* renamed from: b  reason: collision with root package name */
                public final j70 f9749b;

                /* renamed from: c  reason: collision with root package name */
                public final e60 f9750c;

                {
                    this.f9748a = this;
                    this.f9749b = j70Var;
                    this.f9750c = m60Var;
                }

                @Override // ai.d60
                public final void zza() {
                    final k70 k70Var = this.f9748a;
                    final j70 j70Var2 = this.f9749b;
                    final e60 e60Var = this.f9750c;
                    yg.d2.f61866i.postDelayed(new Runnable(k70Var, j70Var2, e60Var) { // from class: ai.t60

                        /* renamed from: w  reason: collision with root package name */
                        public final k70 f10154w;

                        /* renamed from: x  reason: collision with root package name */
                        public final j70 f10155x;

                        /* renamed from: y  reason: collision with root package name */
                        public final e60 f10156y;

                        {
                            this.f10154w = k70Var;
                            this.f10155x = j70Var2;
                            this.f10156y = e60Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f10154w.j(this.f10155x, this.f10156y);
                        }
                    }, 10000L);
                }
            });
            m60Var.x0("/jsLoaded", new v60(this, j70Var, m60Var));
            yg.f1 f1Var = new yg.f1();
            w60 w60Var = new w60(this, null, m60Var, f1Var);
            f1Var.b(w60Var);
            m60Var.x0("/requestReload", w60Var);
            if (this.f6108c.endsWith(".js")) {
                m60Var.A(this.f6108c);
            } else if (this.f6108c.startsWith("<html>")) {
                m60Var.R(this.f6108c);
            } else {
                m60Var.s(this.f6108c);
            }
            yg.d2.f61866i.postDelayed(new y60(this, j70Var, m60Var), DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
        } catch (Throwable th2) {
            uj0.d("Error creating webview.", th2);
            wg.t.h().k(th2, "SdkJavascriptFactory.loadJavascriptEngine");
            j70Var.d();
        }
    }

    public final /* synthetic */ void j(j70 j70Var, e60 e60Var) {
        synchronized (this.f6106a) {
            if (j70Var.e() != -1 && j70Var.e() != 1) {
                j70Var.d();
                hk0.f4882e.execute(u60.a(e60Var));
                yg.p1.k("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
