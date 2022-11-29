package wg;

import ai.dt;
import ai.ft;
import ai.hk0;
import ai.nj0;
import ai.ox;
import ai.sv2;
import ai.uj0;
import ai.vt2;
import ai.yu2;
import ai.zj0;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import yg.d2;

/* loaded from: classes3.dex */
public final class i implements Runnable, ai.q {
    public final boolean A;
    public final boolean B;
    public final Executor C;
    public final vt2 D;
    public Context E;
    public final Context F;
    public zj0 G;
    public final zj0 H;
    public final boolean I;
    public int K;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f58712z;

    /* renamed from: w  reason: collision with root package name */
    public final List<Object[]> f58709w = new Vector();

    /* renamed from: x  reason: collision with root package name */
    public final AtomicReference<ai.q> f58710x = new AtomicReference<>();

    /* renamed from: y  reason: collision with root package name */
    public final AtomicReference<ai.q> f58711y = new AtomicReference<>();
    public final CountDownLatch J = new CountDownLatch(1);

    public i(Context context, zj0 zj0Var) {
        this.E = context;
        this.F = context;
        this.G = zj0Var;
        this.H = zj0Var;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.C = newCachedThreadPool;
        boolean booleanValue = ((Boolean) ft.c().c(ox.f8134y1)).booleanValue();
        this.I = booleanValue;
        vt2 a10 = vt2.a(context, newCachedThreadPool, booleanValue);
        this.D = a10;
        this.A = ((Boolean) ft.c().c(ox.f8102u1)).booleanValue();
        this.B = ((Boolean) ft.c().c(ox.f8142z1)).booleanValue();
        if (((Boolean) ft.c().c(ox.f8126x1)).booleanValue()) {
            this.K = 2;
        } else {
            this.K = 1;
        }
        Context context2 = this.E;
        h hVar = new h(this);
        this.f58712z = new sv2(this.E, yu2.b(context2, a10), hVar, ((Boolean) ft.c().c(ox.f8110v1)).booleanValue()).d(1);
        if (((Boolean) ft.c().c(ox.T1)).booleanValue()) {
            hk0.f4878a.execute(this);
            return;
        }
        dt.a();
        if (nj0.n()) {
            hk0.f4878a.execute(this);
        } else {
            run();
        }
    }

    public static final Context o(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // ai.q
    public final String a(Context context, String str, View view) {
        return f(context, str, view, null);
    }

    @Override // ai.q
    public final void b(View view) {
        ai.q n10 = n();
        if (n10 != null) {
            n10.b(view);
        }
    }

    @Override // ai.q
    public final void c(MotionEvent motionEvent) {
        ai.q n10 = n();
        if (n10 != null) {
            l();
            n10.c(motionEvent);
            return;
        }
        this.f58709w.add(new Object[]{motionEvent});
    }

    @Override // ai.q
    public final String d(Context context) {
        ai.q n10;
        if (!i() || (n10 = n()) == null) {
            return "";
        }
        l();
        return n10.d(o(context));
    }

    @Override // ai.q
    public final String e(Context context, View view, Activity activity) {
        if (((Boolean) ft.c().c(ox.U6)).booleanValue()) {
            if (i()) {
                ai.q n10 = n();
                if (((Boolean) ft.c().c(ox.V6)).booleanValue()) {
                    t.d();
                    d2.m(view, 2, null);
                }
                return n10 != null ? n10.e(context, view, null) : "";
            }
            return "";
        }
        ai.q n11 = n();
        if (((Boolean) ft.c().c(ox.V6)).booleanValue()) {
            t.d();
            d2.m(view, 2, null);
        }
        return n11 != null ? n11.e(context, view, null) : "";
    }

    @Override // ai.q
    public final String f(Context context, String str, View view, Activity activity) {
        if (i()) {
            ai.q n10 = n();
            if (((Boolean) ft.c().c(ox.V6)).booleanValue()) {
                t.d();
                d2.m(view, 4, null);
            }
            if (n10 != null) {
                l();
                return n10.f(o(context), str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // ai.q
    public final void g(int i10, int i11, int i12) {
        ai.q n10 = n();
        if (n10 == null) {
            this.f58709w.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
            return;
        }
        l();
        n10.g(i10, i11, i12);
    }

    public final boolean i() {
        try {
            this.J.await();
            return true;
        } catch (InterruptedException e10) {
            uj0.g("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    public final /* synthetic */ void j(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ai.n.m(this.H.f13013w, o(this.F), z10, this.I).q();
        } catch (NullPointerException e10) {
            this.D.c(2027, System.currentTimeMillis() - currentTimeMillis, e10);
        }
    }

    public final int k() {
        if (!this.A || this.f58712z) {
            return this.K;
        }
        return 1;
    }

    public final void l() {
        ai.q n10 = n();
        if (this.f58709w.isEmpty() || n10 == null) {
            return;
        }
        for (Object[] objArr : this.f58709w) {
            int length = objArr.length;
            if (length == 1) {
                n10.c((MotionEvent) objArr[0]);
            } else if (length == 3) {
                n10.g(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f58709w.clear();
    }

    public final void m(boolean z10) {
        this.f58710x.set(ai.t.w(this.G.f13013w, o(this.E), z10, this.K));
    }

    public final ai.q n() {
        return k() == 2 ? this.f58711y.get() : this.f58710x.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, ai.zj0] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            boolean z10 = this.G.f13016z;
            final boolean z11 = false;
            if (!((Boolean) ft.c().c(ox.H0)).booleanValue() && z10) {
                z11 = true;
            }
            if (k() == 1) {
                m(z11);
                if (this.K == 2) {
                    this.C.execute(new Runnable(this, z11) { // from class: wg.g

                        /* renamed from: w  reason: collision with root package name */
                        public final i f58706w;

                        /* renamed from: x  reason: collision with root package name */
                        public final boolean f58707x;

                        {
                            this.f58706w = this;
                            this.f58707x = z11;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f58706w.j(this.f58707x);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    ai.n m10 = ai.n.m(this.G.f13013w, o(this.E), z11, this.I);
                    this.f58711y.set(m10);
                    if (this.B && !m10.n()) {
                        this.K = 1;
                        m(z11);
                    }
                } catch (NullPointerException e10) {
                    this.K = 1;
                    m(z11);
                    this.D.c(2031, System.currentTimeMillis() - currentTimeMillis, e10);
                }
            }
        } finally {
            this.J.countDown();
            this.E = null;
            this.G = null;
        }
    }
}
