package ai;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class ku3 {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f6364a;

    /* renamed from: b  reason: collision with root package name */
    public final lu3 f6365b;

    public ku3(Handler handler, lu3 lu3Var) {
        this.f6364a = lu3Var == null ? null : handler;
        this.f6365b = lu3Var;
    }

    public final void a(final on onVar) {
        Handler handler = this.f6364a;
        if (handler != null) {
            handler.post(new Runnable(this, onVar) { // from class: ai.au3

                /* renamed from: w  reason: collision with root package name */
                public final ku3 f2133w;

                /* renamed from: x  reason: collision with root package name */
                public final on f2134x;

                {
                    this.f2133w = this;
                    this.f2134x = onVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f2133w.t(this.f2134x);
                }
            });
        }
    }

    public final void b(final String str, final long j10, final long j11) {
        Handler handler = this.f6364a;
        if (handler != null) {
            handler.post(new Runnable(this, str, j10, j11) { // from class: ai.bu3

                /* renamed from: w  reason: collision with root package name */
                public final ku3 f2556w;

                /* renamed from: x  reason: collision with root package name */
                public final String f2557x;

                /* renamed from: y  reason: collision with root package name */
                public final long f2558y;

                /* renamed from: z  reason: collision with root package name */
                public final long f2559z;

                {
                    this.f2556w = this;
                    this.f2557x = str;
                    this.f2558y = j10;
                    this.f2559z = j11;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f2556w.s(this.f2557x, this.f2558y, this.f2559z);
                }
            });
        }
    }

    public final void c(final v4 v4Var, final qo qoVar) {
        Handler handler = this.f6364a;
        if (handler != null) {
            handler.post(new Runnable(this, v4Var, qoVar) { // from class: ai.cu3

                /* renamed from: w  reason: collision with root package name */
                public final ku3 f3042w;

                /* renamed from: x  reason: collision with root package name */
                public final v4 f3043x;

                /* renamed from: y  reason: collision with root package name */
                public final qo f3044y;

                {
                    this.f3042w = this;
                    this.f3043x = v4Var;
                    this.f3044y = qoVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f3042w.r(this.f3043x, this.f3044y);
                }
            });
        }
    }

    public final void d(final int i10, final long j10) {
        Handler handler = this.f6364a;
        if (handler != null) {
            handler.post(new Runnable(this, i10, j10) { // from class: ai.du3

                /* renamed from: w  reason: collision with root package name */
                public final ku3 f3409w;

                /* renamed from: x  reason: collision with root package name */
                public final int f3410x;

                /* renamed from: y  reason: collision with root package name */
                public final long f3411y;

                {
                    this.f3409w = this;
                    this.f3410x = i10;
                    this.f3411y = j10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f3409w.q(this.f3410x, this.f3411y);
                }
            });
        }
    }

    public final void e(final long j10, final int i10) {
        Handler handler = this.f6364a;
        if (handler != null) {
            handler.post(new Runnable(this, j10, i10) { // from class: ai.eu3

                /* renamed from: w  reason: collision with root package name */
                public final ku3 f3788w;

                /* renamed from: x  reason: collision with root package name */
                public final long f3789x;

                /* renamed from: y  reason: collision with root package name */
                public final int f3790y;

                {
                    this.f3788w = this;
                    this.f3789x = j10;
                    this.f3790y = i10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f3788w.p(this.f3789x, this.f3790y);
                }
            });
        }
    }

    public final void f(final s54 s54Var) {
        Handler handler = this.f6364a;
        if (handler != null) {
            handler.post(new Runnable(this, s54Var) { // from class: ai.fu3

                /* renamed from: w  reason: collision with root package name */
                public final ku3 f4213w;

                /* renamed from: x  reason: collision with root package name */
                public final s54 f4214x;

                {
                    this.f4213w = this;
                    this.f4214x = s54Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f4213w.o(this.f4214x);
                }
            });
        }
    }

    public final void g(final Object obj) {
        if (this.f6364a != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f6364a.post(new Runnable(this, obj, elapsedRealtime) { // from class: ai.gu3

                /* renamed from: w  reason: collision with root package name */
                public final ku3 f4592w;

                /* renamed from: x  reason: collision with root package name */
                public final Object f4593x;

                /* renamed from: y  reason: collision with root package name */
                public final long f4594y;

                {
                    this.f4592w = this;
                    this.f4593x = obj;
                    this.f4594y = elapsedRealtime;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f4592w.n(this.f4593x, this.f4594y);
                }
            });
        }
    }

    public final void h(final String str) {
        Handler handler = this.f6364a;
        if (handler != null) {
            handler.post(new Runnable(this, str) { // from class: ai.hu3

                /* renamed from: w  reason: collision with root package name */
                public final ku3 f5005w;

                /* renamed from: x  reason: collision with root package name */
                public final String f5006x;

                {
                    this.f5005w = this;
                    this.f5006x = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f5005w.m(this.f5006x);
                }
            });
        }
    }

    public final void i(final on onVar) {
        onVar.a();
        Handler handler = this.f6364a;
        if (handler != null) {
            handler.post(new Runnable(this, onVar) { // from class: ai.iu3

                /* renamed from: w  reason: collision with root package name */
                public final ku3 f5419w;

                /* renamed from: x  reason: collision with root package name */
                public final on f5420x;

                {
                    this.f5419w = this;
                    this.f5420x = onVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f5419w.l(this.f5420x);
                }
            });
        }
    }

    public final void j(final Exception exc) {
        Handler handler = this.f6364a;
        if (handler != null) {
            handler.post(new Runnable(this, exc) { // from class: ai.ju3

                /* renamed from: w  reason: collision with root package name */
                public final ku3 f5930w;

                /* renamed from: x  reason: collision with root package name */
                public final Exception f5931x;

                {
                    this.f5930w = this;
                    this.f5931x = exc;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f5930w.k(this.f5931x);
                }
            });
        }
    }

    public final /* synthetic */ void k(Exception exc) {
        lu3 lu3Var = this.f6365b;
        int i10 = sb.f9778a;
        lu3Var.u(exc);
    }

    public final /* synthetic */ void l(on onVar) {
        onVar.a();
        lu3 lu3Var = this.f6365b;
        int i10 = sb.f9778a;
        lu3Var.c(onVar);
    }

    public final /* synthetic */ void m(String str) {
        lu3 lu3Var = this.f6365b;
        int i10 = sb.f9778a;
        lu3Var.C0(str);
    }

    public final /* synthetic */ void n(Object obj, long j10) {
        lu3 lu3Var = this.f6365b;
        int i10 = sb.f9778a;
        lu3Var.h(obj, j10);
    }

    public final /* synthetic */ void o(s54 s54Var) {
        lu3 lu3Var = this.f6365b;
        int i10 = sb.f9778a;
        lu3Var.o(s54Var);
    }

    public final /* synthetic */ void p(long j10, int i10) {
        lu3 lu3Var = this.f6365b;
        int i11 = sb.f9778a;
        lu3Var.t(j10, i10);
    }

    public final /* synthetic */ void q(int i10, long j10) {
        lu3 lu3Var = this.f6365b;
        int i11 = sb.f9778a;
        lu3Var.m(i10, j10);
    }

    public final /* synthetic */ void r(v4 v4Var, qo qoVar) {
        int i10 = sb.f9778a;
        this.f6365b.x(v4Var, qoVar);
    }

    public final /* synthetic */ void s(String str, long j10, long j11) {
        lu3 lu3Var = this.f6365b;
        int i10 = sb.f9778a;
        lu3Var.y(str, j10, j11);
    }

    public final /* synthetic */ void t(on onVar) {
        lu3 lu3Var = this.f6365b;
        int i10 = sb.f9778a;
        lu3Var.i(onVar);
    }
}
