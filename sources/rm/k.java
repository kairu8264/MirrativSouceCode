package rm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.firebase.perf.session.SessionManager;
import hm.a;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import tm.c;
import tm.i;
import tm.m;

/* loaded from: classes4.dex */
public class k implements a.b {
    public static final lm.a N = lm.a.e();
    public static final k O = new k();
    public gm.c A;
    public yl.f B;
    public xl.b<zf.g> C;
    public b D;
    public Context F;
    public im.a G;
    public d H;
    public hm.a I;
    public c.b J;
    public String K;
    public String L;

    /* renamed from: w  reason: collision with root package name */
    public final Map<String, Integer> f51602w;

    /* renamed from: z  reason: collision with root package name */
    public pk.c f51605z;

    /* renamed from: x  reason: collision with root package name */
    public final ConcurrentLinkedQueue<c> f51603x = new ConcurrentLinkedQueue<>();

    /* renamed from: y  reason: collision with root package name */
    public final AtomicBoolean f51604y = new AtomicBoolean(false);
    public boolean M = false;
    public ExecutorService E = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f51602w = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static k k() {
        return O;
    }

    public static String l(tm.g gVar) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(gVar.c0()), Integer.valueOf(gVar.Z()), Integer.valueOf(gVar.Y()));
    }

    public static String m(tm.h hVar) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %.4fms)", hVar.v0(), hVar.y0() ? String.valueOf(hVar.l0()) : "UNKNOWN", Double.valueOf((hVar.C0() ? hVar.t0() : 0L) / 1000.0d));
    }

    public static String n(tm.j jVar) {
        if (jVar.m()) {
            return o(jVar.n());
        }
        if (jVar.f()) {
            return m(jVar.g());
        }
        return jVar.b() ? l(jVar.o()) : "log";
    }

    public static String o(m mVar) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %.4fms)", mVar.n0(), Double.valueOf(mVar.j0() / 1000.0d));
    }

    public static String p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(c cVar) {
        F(cVar.f51570a, cVar.f51571b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(m mVar, tm.d dVar) {
        F(tm.i.W().J(mVar), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(tm.h hVar, tm.d dVar) {
        F(tm.i.W().I(hVar), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(tm.g gVar, tm.d dVar) {
        F(tm.i.W().H(gVar), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.H.a(this.M);
    }

    public void A(final tm.g gVar, final tm.d dVar) {
        this.E.execute(new Runnable() { // from class: rm.h
            @Override // java.lang.Runnable
            public final void run() {
                k.this.y(gVar, dVar);
            }
        });
    }

    public void B(final tm.h hVar, final tm.d dVar) {
        this.E.execute(new Runnable() { // from class: rm.i
            @Override // java.lang.Runnable
            public final void run() {
                k.this.x(hVar, dVar);
            }
        });
    }

    public void C(final m mVar, final tm.d dVar) {
        this.E.execute(new Runnable() { // from class: rm.j
            @Override // java.lang.Runnable
            public final void run() {
                k.this.w(mVar, dVar);
            }
        });
    }

    public final tm.i D(i.b bVar, tm.d dVar) {
        G();
        c.b K = this.J.K(dVar);
        if (bVar.m()) {
            K = K.clone().H(j());
        }
        return bVar.G(K).a();
    }

    public final void E() {
        Context h10 = this.f51605z.h();
        this.F = h10;
        this.K = h10.getPackageName();
        this.G = im.a.f();
        this.H = new d(this.F, new sm.f(100L, 1L, TimeUnit.MINUTES), 500L);
        this.I = hm.a.b();
        this.D = new b(this.C, this.G.a());
        h();
    }

    public final void F(i.b bVar, tm.d dVar) {
        if (!u()) {
            if (s(bVar)) {
                N.b("Transport is not initialized yet, %s will be queued for to be dispatched later", n(bVar));
                this.f51603x.add(new c(bVar, dVar));
                return;
            }
            return;
        }
        tm.i D = D(bVar, dVar);
        if (t(D)) {
            g(D);
            SessionManager.getInstance().updatePerfSessionIfExpired();
        }
    }

    public final void G() {
        if (this.G.I()) {
            if (!this.J.G() || this.M) {
                String str = null;
                try {
                    str = (String) vi.j.b(this.B.getId(), DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    N.d("Task to retrieve Installation Id is interrupted: %s", e10.getMessage());
                } catch (ExecutionException e11) {
                    N.d("Unable to retrieve Installation Id: %s", e11.getMessage());
                } catch (TimeoutException e12) {
                    N.d("Task to retrieve Installation Id is timed out: %s", e12.getMessage());
                }
                if (!TextUtils.isEmpty(str)) {
                    this.J.J(str);
                } else {
                    N.j("Firebase Installation Id is empty, contact Firebase Support for debugging.");
                }
            }
        }
    }

    public final void H() {
        if (this.A == null && u()) {
            this.A = gm.c.c();
        }
    }

    public final void g(tm.i iVar) {
        if (iVar.m()) {
            N.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", n(iVar), i(iVar.n()));
        } else {
            N.g("Logging %s", n(iVar));
        }
        this.D.b(iVar);
    }

    public final void h() {
        this.I.k(new WeakReference<>(O));
        c.b d02 = tm.c.d0();
        this.J = d02;
        d02.L(this.f51605z.k().c()).I(tm.a.W().G(this.K).H(gm.a.f33662b).I(p(this.F)));
        this.f51604y.set(true);
        while (!this.f51603x.isEmpty()) {
            final c poll = this.f51603x.poll();
            if (poll != null) {
                this.E.execute(new Runnable() { // from class: rm.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.this.v(poll);
                    }
                });
            }
        }
    }

    public final String i(m mVar) {
        String n02 = mVar.n0();
        if (n02.startsWith("_st_")) {
            return lm.b.c(this.L, this.K, n02);
        }
        return lm.b.a(this.L, this.K, n02);
    }

    public final Map<String, String> j() {
        H();
        gm.c cVar = this.A;
        if (cVar != null) {
            return cVar.b();
        }
        return Collections.emptyMap();
    }

    @Override // hm.a.b
    public void onUpdateAppState(tm.d dVar) {
        this.M = dVar == tm.d.FOREGROUND;
        if (u()) {
            this.E.execute(new Runnable() { // from class: rm.f
                @Override // java.lang.Runnable
                public final void run() {
                    k.this.z();
                }
            });
        }
    }

    public final void q(tm.i iVar) {
        if (iVar.m()) {
            this.I.e(sm.b.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (iVar.f()) {
            this.I.e(sm.b.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    public void r(pk.c cVar, yl.f fVar, xl.b<zf.g> bVar) {
        this.f51605z = cVar;
        this.L = cVar.k().e();
        this.B = fVar;
        this.C = bVar;
        this.E.execute(new Runnable() { // from class: rm.e
            @Override // java.lang.Runnable
            public final void run() {
                k.this.E();
            }
        });
    }

    public final boolean s(tm.j jVar) {
        int intValue = this.f51602w.get("KEY_AVAILABLE_TRACES_FOR_CACHING").intValue();
        int intValue2 = this.f51602w.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING").intValue();
        int intValue3 = this.f51602w.get("KEY_AVAILABLE_GAUGES_FOR_CACHING").intValue();
        if (jVar.m() && intValue > 0) {
            this.f51602w.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        } else if (jVar.f() && intValue2 > 0) {
            this.f51602w.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        } else if (jVar.b() && intValue3 > 0) {
            this.f51602w.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            return true;
        } else {
            N.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", n(jVar), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3));
            return false;
        }
    }

    public final boolean t(tm.i iVar) {
        if (!this.G.I()) {
            N.g("Performance collection is not enabled, dropping %s", n(iVar));
            return false;
        } else if (!iVar.U().Z()) {
            N.k("App Instance ID is null or empty, dropping %s", n(iVar));
            return false;
        } else if (!nm.e.b(iVar, this.F)) {
            N.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", n(iVar));
            return false;
        } else if (this.H.b(iVar)) {
            return true;
        } else {
            q(iVar);
            if (iVar.m()) {
                N.g("Rate Limited - %s", o(iVar.n()));
            } else if (iVar.f()) {
                N.g("Rate Limited - %s", m(iVar.g()));
            }
            return false;
        }
    }

    public boolean u() {
        return this.f51604y.get();
    }
}
