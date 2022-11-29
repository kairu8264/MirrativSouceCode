package ai;

import android.os.Handler;

/* loaded from: classes3.dex */
public final class ej1 {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f3681a;

    /* renamed from: b  reason: collision with root package name */
    public final fk1 f3682b;

    public ej1(Handler handler, fk1 fk1Var) {
        this.f3681a = fk1Var == null ? null : handler;
        this.f3682b = fk1Var;
    }

    public final void a(final on onVar) {
        Handler handler = this.f3681a;
        if (handler != null) {
            handler.post(new Runnable(this, onVar) { // from class: ai.v81

                /* renamed from: w  reason: collision with root package name */
                public final ej1 f11004w;

                /* renamed from: x  reason: collision with root package name */
                public final on f11005x;

                {
                    this.f11004w = this;
                    this.f11005x = onVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11004w.t(this.f11005x);
                }
            });
        }
    }

    public final void b(final String str, final long j10, final long j11) {
        Handler handler = this.f3681a;
        if (handler != null) {
            handler.post(new Runnable(this, str, j10, j11) { // from class: ai.w91

                /* renamed from: w  reason: collision with root package name */
                public final ej1 f11519w;

                /* renamed from: x  reason: collision with root package name */
                public final String f11520x;

                /* renamed from: y  reason: collision with root package name */
                public final long f11521y;

                /* renamed from: z  reason: collision with root package name */
                public final long f11522z;

                {
                    this.f11519w = this;
                    this.f11520x = str;
                    this.f11521y = j10;
                    this.f11522z = j11;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11519w.s(this.f11520x, this.f11521y, this.f11522z);
                }
            });
        }
    }

    public final void c(final v4 v4Var, final qo qoVar) {
        Handler handler = this.f3681a;
        if (handler != null) {
            handler.post(new Runnable(this, v4Var, qoVar) { // from class: ai.xa1

                /* renamed from: w  reason: collision with root package name */
                public final ej1 f11898w;

                /* renamed from: x  reason: collision with root package name */
                public final v4 f11899x;

                /* renamed from: y  reason: collision with root package name */
                public final qo f11900y;

                {
                    this.f11898w = this;
                    this.f11899x = v4Var;
                    this.f11900y = qoVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11898w.r(this.f11899x, this.f11900y);
                }
            });
        }
    }

    public final void d(final long j10) {
        Handler handler = this.f3681a;
        if (handler != null) {
            handler.post(new Runnable(this, j10) { // from class: ai.yb1

                /* renamed from: w  reason: collision with root package name */
                public final ej1 f12517w;

                /* renamed from: x  reason: collision with root package name */
                public final long f12518x;

                {
                    this.f12517w = this;
                    this.f12518x = j10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f12517w.q(this.f12518x);
                }
            });
        }
    }

    public final void e(final int i10, final long j10, final long j11) {
        Handler handler = this.f3681a;
        if (handler != null) {
            handler.post(new Runnable(this, i10, j10, j11) { // from class: ai.zc1

                /* renamed from: w  reason: collision with root package name */
                public final ej1 f12936w;

                /* renamed from: x  reason: collision with root package name */
                public final int f12937x;

                /* renamed from: y  reason: collision with root package name */
                public final long f12938y;

                /* renamed from: z  reason: collision with root package name */
                public final long f12939z;

                {
                    this.f12936w = this;
                    this.f12937x = i10;
                    this.f12938y = j10;
                    this.f12939z = j11;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f12936w.p(this.f12937x, this.f12938y, this.f12939z);
                }
            });
        }
    }

    public final void f(final String str) {
        Handler handler = this.f3681a;
        if (handler != null) {
            handler.post(new Runnable(this, str) { // from class: ai.ae1

                /* renamed from: w  reason: collision with root package name */
                public final ej1 f1828w;

                /* renamed from: x  reason: collision with root package name */
                public final String f1829x;

                {
                    this.f1828w = this;
                    this.f1829x = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f1828w.o(this.f1829x);
                }
            });
        }
    }

    public final void g(final on onVar) {
        onVar.a();
        Handler handler = this.f3681a;
        if (handler != null) {
            handler.post(new Runnable(this, onVar) { // from class: ai.af1

                /* renamed from: w  reason: collision with root package name */
                public final ej1 f1839w;

                /* renamed from: x  reason: collision with root package name */
                public final on f1840x;

                {
                    this.f1839w = this;
                    this.f1840x = onVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f1839w.n(this.f1840x);
                }
            });
        }
    }

    public final void h(final boolean z10) {
        Handler handler = this.f3681a;
        if (handler != null) {
            handler.post(new Runnable(this, z10) { // from class: ai.bg1

                /* renamed from: w  reason: collision with root package name */
                public final ej1 f2338w;

                /* renamed from: x  reason: collision with root package name */
                public final boolean f2339x;

                {
                    this.f2338w = this;
                    this.f2339x = z10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f2338w.m(this.f2339x);
                }
            });
        }
    }

    public final void i(final Exception exc) {
        Handler handler = this.f3681a;
        if (handler != null) {
            handler.post(new Runnable(this, exc) { // from class: ai.ch1

                /* renamed from: w  reason: collision with root package name */
                public final ej1 f2828w;

                /* renamed from: x  reason: collision with root package name */
                public final Exception f2829x;

                {
                    this.f2828w = this;
                    this.f2829x = exc;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f2828w.l(this.f2829x);
                }
            });
        }
    }

    public final void j(final Exception exc) {
        Handler handler = this.f3681a;
        if (handler != null) {
            handler.post(new Runnable(this, exc) { // from class: ai.di1

                /* renamed from: w  reason: collision with root package name */
                public final ej1 f3300w;

                /* renamed from: x  reason: collision with root package name */
                public final Exception f3301x;

                {
                    this.f3300w = this;
                    this.f3301x = exc;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f3300w.k(this.f3301x);
                }
            });
        }
    }

    public final /* synthetic */ void k(Exception exc) {
        fk1 fk1Var = this.f3682b;
        int i10 = sb.f9778a;
        fk1Var.B(exc);
    }

    public final /* synthetic */ void l(Exception exc) {
        fk1 fk1Var = this.f3682b;
        int i10 = sb.f9778a;
        fk1Var.C(exc);
    }

    public final /* synthetic */ void m(boolean z10) {
        fk1 fk1Var = this.f3682b;
        int i10 = sb.f9778a;
        fk1Var.n(z10);
    }

    public final /* synthetic */ void n(on onVar) {
        onVar.a();
        fk1 fk1Var = this.f3682b;
        int i10 = sb.f9778a;
        fk1Var.w(onVar);
    }

    public final /* synthetic */ void o(String str) {
        fk1 fk1Var = this.f3682b;
        int i10 = sb.f9778a;
        fk1Var.d(str);
    }

    public final /* synthetic */ void p(int i10, long j10, long j11) {
        fk1 fk1Var = this.f3682b;
        int i11 = sb.f9778a;
        fk1Var.g(i10, j10, j11);
    }

    public final /* synthetic */ void q(long j10) {
        fk1 fk1Var = this.f3682b;
        int i10 = sb.f9778a;
        fk1Var.k(j10);
    }

    public final /* synthetic */ void r(v4 v4Var, qo qoVar) {
        int i10 = sb.f9778a;
        this.f3682b.A(v4Var, qoVar);
    }

    public final /* synthetic */ void s(String str, long j10, long j11) {
        fk1 fk1Var = this.f3682b;
        int i10 = sb.f9778a;
        fk1Var.j(str, j10, j11);
    }

    public final /* synthetic */ void t(on onVar) {
        fk1 fk1Var = this.f3682b;
        int i10 = sb.f9778a;
        fk1Var.e(onVar);
    }
}
