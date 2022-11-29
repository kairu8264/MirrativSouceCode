package rm;

import android.content.Context;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import tm.l;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final im.a f51572a;

    /* renamed from: b  reason: collision with root package name */
    public final float f51573b;

    /* renamed from: c  reason: collision with root package name */
    public a f51574c;

    /* renamed from: d  reason: collision with root package name */
    public a f51575d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f51576e;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static final lm.a f51577k = lm.a.e();

        /* renamed from: l  reason: collision with root package name */
        public static final long f51578l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a  reason: collision with root package name */
        public final sm.a f51579a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f51580b;

        /* renamed from: c  reason: collision with root package name */
        public sm.h f51581c;

        /* renamed from: d  reason: collision with root package name */
        public sm.f f51582d;

        /* renamed from: e  reason: collision with root package name */
        public long f51583e;

        /* renamed from: f  reason: collision with root package name */
        public long f51584f;

        /* renamed from: g  reason: collision with root package name */
        public sm.f f51585g;

        /* renamed from: h  reason: collision with root package name */
        public sm.f f51586h;

        /* renamed from: i  reason: collision with root package name */
        public long f51587i;

        /* renamed from: j  reason: collision with root package name */
        public long f51588j;

        public a(sm.f fVar, long j10, sm.a aVar, im.a aVar2, String str, boolean z10) {
            this.f51579a = aVar;
            this.f51583e = j10;
            this.f51582d = fVar;
            this.f51584f = j10;
            this.f51581c = aVar.a();
            g(aVar2, str, z10);
            this.f51580b = z10;
        }

        public static long c(im.a aVar, String str) {
            if (str == "Trace") {
                return aVar.C();
            }
            return aVar.o();
        }

        public static long d(im.a aVar, String str) {
            if (str == "Trace") {
                return aVar.r();
            }
            return aVar.r();
        }

        public static long e(im.a aVar, String str) {
            if (str == "Trace") {
                return aVar.D();
            }
            return aVar.p();
        }

        public static long f(im.a aVar, String str) {
            if (str == "Trace") {
                return aVar.r();
            }
            return aVar.r();
        }

        public synchronized void a(boolean z10) {
            this.f51582d = z10 ? this.f51585g : this.f51586h;
            this.f51583e = z10 ? this.f51587i : this.f51588j;
        }

        public synchronized boolean b(tm.i iVar) {
            double c10 = this.f51581c.c(this.f51579a.a()) * this.f51582d.a();
            long j10 = f51578l;
            long max = Math.max(0L, (long) (c10 / j10));
            this.f51584f = Math.min(this.f51584f + max, this.f51583e);
            if (max > 0) {
                this.f51581c = new sm.h(this.f51581c.d() + ((long) ((max * j10) / this.f51582d.a())));
            }
            long j11 = this.f51584f;
            if (j11 > 0) {
                this.f51584f = j11 - 1;
                return true;
            }
            if (this.f51580b) {
                f51577k.j("Exceeded log rate limit, dropping the log.");
            }
            return false;
        }

        public final void g(im.a aVar, String str, boolean z10) {
            long f10 = f(aVar, str);
            long e10 = e(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            sm.f fVar = new sm.f(e10, f10, timeUnit);
            this.f51585g = fVar;
            this.f51587i = e10;
            if (z10) {
                f51577k.b("Foreground %s logging rate:%f, burst capacity:%d", str, fVar, Long.valueOf(e10));
            }
            long d10 = d(aVar, str);
            long c10 = c(aVar, str);
            sm.f fVar2 = new sm.f(c10, d10, timeUnit);
            this.f51586h = fVar2;
            this.f51588j = c10;
            if (z10) {
                f51577k.b("Background %s logging rate:%f, capacity:%d", str, fVar2, Long.valueOf(c10));
            }
        }
    }

    public d(Context context, sm.f fVar, long j10) {
        this(fVar, j10, new sm.a(), c(), im.a.f());
        this.f51576e = sm.k.b(context);
    }

    public static float c() {
        return new Random().nextFloat();
    }

    public void a(boolean z10) {
        this.f51574c.a(z10);
        this.f51575d.a(z10);
    }

    public boolean b(tm.i iVar) {
        if (!iVar.m() || f() || d(iVar.n().o0())) {
            if (!iVar.f() || e() || d(iVar.g().n0())) {
                if (g(iVar)) {
                    if (iVar.f()) {
                        return this.f51575d.b(iVar);
                    }
                    if (iVar.m()) {
                        return this.f51574c.b(iVar);
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d(List<tm.k> list) {
        return list.size() > 0 && list.get(0).V() > 0 && list.get(0).U(0) == l.GAUGES_AND_SYSTEM_EVENTS;
    }

    public final boolean e() {
        return this.f51573b < this.f51572a.q();
    }

    public final boolean f() {
        return this.f51573b < this.f51572a.E();
    }

    public boolean g(tm.i iVar) {
        return (!iVar.m() || (!(iVar.n().n0().equals(sm.c.FOREGROUND_TRACE_NAME.toString()) || iVar.n().n0().equals(sm.c.BACKGROUND_TRACE_NAME.toString())) || iVar.n().f0() <= 0)) && !iVar.b();
    }

    public d(sm.f fVar, long j10, sm.a aVar, float f10, im.a aVar2) {
        this.f51574c = null;
        this.f51575d = null;
        boolean z10 = false;
        this.f51576e = false;
        if (0.0f <= f10 && f10 < 1.0f) {
            z10 = true;
        }
        sm.k.a(z10, "Sampling bucket ID should be in range [0.0f, 1.0f).");
        this.f51573b = f10;
        this.f51572a = aVar2;
        this.f51574c = new a(fVar, j10, aVar, aVar2, "Trace", this.f51576e);
        this.f51575d = new a(fVar, j10, aVar, aVar2, "Network", this.f51576e);
    }
}
