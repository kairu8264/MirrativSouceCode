package ai;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cw1 extends zd0 {
    public final ArrayDeque<zv1> A;
    public final ue0 B;
    public final hw1 C;

    /* renamed from: w  reason: collision with root package name */
    public final Context f3055w;

    /* renamed from: x  reason: collision with root package name */
    public final Executor f3056x;

    /* renamed from: y  reason: collision with root package name */
    public final te0 f3057y;

    /* renamed from: z  reason: collision with root package name */
    public final hv0 f3058z;

    /* JADX WARN: Multi-variable type inference failed */
    public cw1(Context context, Context context2, Executor executor, ue0 ue0Var, hv0 hv0Var, te0 te0Var, ArrayDeque<zv1> arrayDeque, hw1 hw1Var) {
        ox.a(context);
        this.f3055w = context;
        this.f3056x = context2;
        this.B = executor;
        this.f3057y = hv0Var;
        this.f3058z = ue0Var;
        this.A = te0Var;
        this.C = arrayDeque;
    }

    public static s43<JSONObject> W5(ie0 ie0Var, cq2 cq2Var, final qd2 qd2Var) {
        p33 p33Var = new p33(qd2Var) { // from class: ai.qv1

            /* renamed from: a  reason: collision with root package name */
            public final qd2 f9207a;

            {
                this.f9207a = qd2Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f9207a.a().a(wg.t.d().S((Bundle) obj));
            }
        };
        return cq2Var.e(wp2.GMS_SIGNALS, j43.a(ie0Var.f5201w)).c(p33Var).b(rv1.f9602a).i();
    }

    public static s43<le0> X5(s43<JSONObject> s43Var, cq2 cq2Var, y70 y70Var) {
        return cq2Var.e(wp2.BUILD_URL, s43Var).c(y70Var.a("AFMA_getAdDictionary", v70.f10994b, sv1.f10002a)).i();
    }

    @Override // ai.ae0
    public final void E4(ie0 ie0Var, ee0 ee0Var) {
        Y5(U5(ie0Var, Binder.getCallingUid()), ee0Var);
    }

    @Override // ai.ae0
    public final void G3(ie0 ie0Var, ee0 ee0Var) {
        s43<InputStream> R5 = R5(ie0Var, Binder.getCallingUid());
        Y5(R5, ee0Var);
        R5.c(new Runnable(this) { // from class: ai.tv1

            /* renamed from: w  reason: collision with root package name */
            public final cw1 f10473w;

            {
                this.f10473w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10473w.i();
            }
        }, this.f3056x);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ai.s43<java.io.InputStream> R5(ai.ie0 r12, int r13) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.cw1.R5(ai.ie0, int):ai.s43");
    }

    public final s43<InputStream> S5(final ie0 ie0Var, int i10) {
        if (!iz.f5450a.e().booleanValue()) {
            return j43.c(new Exception("Split request is disabled."));
        }
        rn2 rn2Var = ie0Var.E;
        if (rn2Var == null) {
            return j43.c(new Exception("Pool configuration missing from request."));
        }
        if (rn2Var.A != 0 && rn2Var.B != 0) {
            y70 a10 = wg.t.q().a(this.f3055w, zj0.p());
            qd2 a11 = this.f3058z.a(ie0Var, i10);
            cq2 c10 = a11.c();
            final s43<JSONObject> W5 = W5(ie0Var, c10, a11);
            final s43<le0> X5 = X5(W5, c10, a10);
            return c10.f(wp2.GET_URL_AND_CACHE_KEY, W5, X5).a(new Callable(this, X5, W5, ie0Var) { // from class: ai.uv1

                /* renamed from: a  reason: collision with root package name */
                public final cw1 f10851a;

                /* renamed from: b  reason: collision with root package name */
                public final s43 f10852b;

                /* renamed from: c  reason: collision with root package name */
                public final s43 f10853c;

                /* renamed from: d  reason: collision with root package name */
                public final ie0 f10854d;

                {
                    this.f10851a = this;
                    this.f10852b = X5;
                    this.f10853c = W5;
                    this.f10854d = ie0Var;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f10851a.V5(this.f10852b, this.f10853c, this.f10854d);
                }
            }).i();
        }
        return j43.c(new Exception("Caching is disabled."));
    }

    public final s43<InputStream> T5(String str) {
        zv1 b62;
        if (!iz.f5450a.e().booleanValue()) {
            return j43.c(new Exception("Split request is disabled."));
        }
        xv1 xv1Var = new xv1(this);
        if (iz.f5453d.e().booleanValue()) {
            b62 = a6(str);
        } else {
            b62 = b6(str);
        }
        if (b62 == null) {
            String valueOf = String.valueOf(str);
            return j43.c(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
        }
        return j43.a(xv1Var);
    }

    public final s43<InputStream> U5(ie0 ie0Var, int i10) {
        y70 a10 = wg.t.q().a(this.f3055w, zj0.p());
        if (!nz.f7582a.e().booleanValue()) {
            return j43.c(new Exception("Signal collection disabled."));
        }
        qd2 a11 = this.f3058z.a(ie0Var, i10);
        final bd2<JSONObject> b10 = a11.b();
        return a11.c().e(wp2.GET_SIGNALS, j43.a(ie0Var.f5201w)).c(new p33(b10) { // from class: ai.vv1

            /* renamed from: a  reason: collision with root package name */
            public final bd2 f11386a;

            {
                this.f11386a = b10;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f11386a.a(wg.t.d().S((Bundle) obj));
            }
        }).j(wp2.JS_SIGNALS).c(a10.a("google.afma.request.getSignals", v70.f10994b, v70.f10995c)).i();
    }

    public final /* synthetic */ InputStream V5(s43 s43Var, s43 s43Var2, ie0 ie0Var) throws Exception {
        String i10 = ((le0) s43Var.get()).i();
        String str = ie0Var.D;
        Z5(new zv1((le0) s43Var.get(), (JSONObject) s43Var2.get(), str, i10));
        return new ByteArrayInputStream(i10.getBytes(zw2.f13232c));
    }

    public final void Y5(s43<InputStream> s43Var, ee0 ee0Var) {
        j43.p(j43.i(s43Var, new p33(this) { // from class: ai.wv1

            /* renamed from: a  reason: collision with root package name */
            public final cw1 f11780a;

            {
                this.f11780a = this;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return j43.a(sm2.a((InputStream) obj));
            }
        }, hk0.f4878a), new yv1(this, ee0Var), hk0.f4883f);
    }

    @Override // ai.ae0
    public final void Z2(String str, ee0 ee0Var) {
        Y5(T5(str), ee0Var);
    }

    public final synchronized void Z5(zv1 zv1Var) {
        o();
        this.A.addLast(zv1Var);
    }

    public final synchronized zv1 a6(String str) {
        Iterator<zv1> it = this.A.iterator();
        while (it.hasNext()) {
            zv1 next = it.next();
            if (next.f13210c.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public final synchronized zv1 b6(String str) {
        Iterator<zv1> it = this.A.iterator();
        while (it.hasNext()) {
            zv1 next = it.next();
            if (next.f13211d.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public final /* synthetic */ void i() {
        kk0.a(this.f3057y.a(), "persistFlags");
    }

    @Override // ai.ae0
    public final void m4(ie0 ie0Var, ee0 ee0Var) {
        Y5(S5(ie0Var, Binder.getCallingUid()), ee0Var);
    }

    public final synchronized void o() {
        int intValue = iz.f5452c.e().intValue();
        while (this.A.size() >= intValue) {
            this.A.removeFirst();
        }
    }
}
