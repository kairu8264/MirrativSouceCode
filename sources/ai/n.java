package ai;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzfkf;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class n implements q {
    public static n K;
    public final l0 A;
    public final vt2 B;
    public final Executor C;
    public final rv2 D;
    public volatile boolean H;
    public final int J;

    /* renamed from: w  reason: collision with root package name */
    public final Context f7121w;

    /* renamed from: x  reason: collision with root package name */
    public final kv2 f7122x;

    /* renamed from: y  reason: collision with root package name */
    public final sv2 f7123y;

    /* renamed from: z  reason: collision with root package name */
    public final tv2 f7124z;
    public volatile long F = 0;
    public final Object G = new Object();
    public volatile boolean I = false;
    public final CountDownLatch E = new CountDownLatch(1);

    public n(Context context, vt2 vt2Var, kv2 kv2Var, sv2 sv2Var, tv2 tv2Var, l0 l0Var, Executor executor, rt2 rt2Var, int i10) {
        this.f7121w = context;
        this.B = vt2Var;
        this.f7122x = kv2Var;
        this.f7123y = sv2Var;
        this.f7124z = tv2Var;
        this.A = l0Var;
        this.C = executor;
        this.J = i10;
        this.D = new l(this, rt2Var);
    }

    @Deprecated
    public static synchronized n l(String str, Context context, Executor executor, boolean z10, boolean z11) {
        n nVar;
        synchronized (n.class) {
            if (K == null) {
                wt2 d10 = xt2.d();
                d10.a(str);
                d10.b(z10);
                xt2 d11 = d10.d();
                vt2 a10 = vt2.a(context, executor, z11);
                w b10 = ((Boolean) ft.c().c(ox.W1)).booleanValue() ? w.b(context) : null;
                pu2 a11 = pu2.a(context, executor, a10, d11);
                k0 k0Var = new k0(context);
                l0 l0Var = new l0(d11, a11, new y0(context, k0Var), k0Var, b10);
                int b11 = yu2.b(context, a10);
                rt2 rt2Var = new rt2();
                n nVar2 = new n(context, a10, new kv2(context, b11), new sv2(context, b11, new k(a10), ((Boolean) ft.c().c(ox.f8110v1)).booleanValue()), new tv2(context, l0Var, a10, rt2Var), l0Var, executor, rt2Var, b11);
                K = nVar2;
                nVar2.o();
                K.q();
            }
            nVar = K;
        }
        return nVar;
    }

    public static synchronized n m(String str, Context context, boolean z10, boolean z11) {
        n l10;
        synchronized (n.class) {
            l10 = l(str, context, Executors.newCachedThreadPool(), z10, z11);
        }
        return l10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4.B().C().equals(r5.C()) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void p(ai.n r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.n.p(ai.n):void");
    }

    @Override // ai.q
    public final String a(Context context, String str, View view) {
        return f(context, str, view, null);
    }

    @Override // ai.q
    public final void b(View view) {
        this.A.a(view);
    }

    @Override // ai.q
    public final void c(MotionEvent motionEvent) {
        yt2 b10 = this.f7124z.b();
        if (b10 != null) {
            try {
                b10.b(null, motionEvent);
            } catch (zzfkf e10) {
                this.B.c(e10.a(), -1L, e10);
            }
        }
    }

    @Override // ai.q
    public final String d(Context context) {
        q();
        yt2 b10 = this.f7124z.b();
        if (b10 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String a10 = b10.a(context, null);
            this.B.d(5001, System.currentTimeMillis() - currentTimeMillis, a10, null);
            return a10;
        }
        return "";
    }

    @Override // ai.q
    public final String e(Context context, View view, Activity activity) {
        q();
        yt2 b10 = this.f7124z.b();
        if (b10 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String c10 = b10.c(context, null, view, null);
            this.B.d(5002, System.currentTimeMillis() - currentTimeMillis, c10, null);
            return c10;
        }
        return "";
    }

    @Override // ai.q
    public final String f(Context context, String str, View view, Activity activity) {
        q();
        yt2 b10 = this.f7124z.b();
        if (b10 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String d10 = b10.d(context, null, str, view, activity);
            this.B.d(5000, System.currentTimeMillis() - currentTimeMillis, d10, null);
            return d10;
        }
        return "";
    }

    @Override // ai.q
    public final void g(int i10, int i11, int i12) {
    }

    public final synchronized boolean n() {
        return this.I;
    }

    public final synchronized void o() {
        long currentTimeMillis = System.currentTimeMillis();
        jv2 r10 = r(1);
        if (r10 != null) {
            if (this.f7124z.a(r10)) {
                this.I = true;
                this.E.countDown();
                return;
            }
            return;
        }
        this.B.b(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    public final void q() {
        if (this.H) {
            return;
        }
        synchronized (this.G) {
            if (!this.H) {
                if ((System.currentTimeMillis() / 1000) - this.F < 3600) {
                    return;
                }
                jv2 c10 = this.f7124z.c();
                if ((c10 == null || c10.e(3600L)) && yu2.a(this.J)) {
                    this.C.execute(new m(this));
                }
            }
        }
    }

    public final jv2 r(int i10) {
        if (yu2.a(this.J)) {
            if (((Boolean) ft.c().c(ox.f8094t1)).booleanValue()) {
                return this.f7123y.c(1);
            }
            return this.f7122x.c(1);
        }
        return null;
    }
}
