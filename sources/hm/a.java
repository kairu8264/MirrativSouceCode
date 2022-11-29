package hm;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import b3.g;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import rm.k;
import sm.c;
import sm.h;
import tm.d;
import tm.m;

/* loaded from: classes4.dex */
public class a implements Application.ActivityLifecycleCallbacks {
    public static final lm.a M = lm.a.e();
    public static volatile a N;
    public final k C;
    public final sm.a E;
    public g F;
    public h G;
    public h H;
    public boolean L;

    /* renamed from: w  reason: collision with root package name */
    public final WeakHashMap<Activity, Boolean> f36126w = new WeakHashMap<>();

    /* renamed from: x  reason: collision with root package name */
    public final WeakHashMap<Activity, Trace> f36127x = new WeakHashMap<>();

    /* renamed from: y  reason: collision with root package name */
    public final Map<String, Long> f36128y = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    public final Set<WeakReference<b>> f36129z = new HashSet();
    public Set<InterfaceC0458a> A = new HashSet();
    public final AtomicInteger B = new AtomicInteger(0);
    public d I = d.BACKGROUND;
    public boolean J = false;
    public boolean K = true;
    public final im.a D = im.a.f();

    /* renamed from: hm.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0458a {
        void a();
    }

    /* loaded from: classes4.dex */
    public interface b {
        void onUpdateAppState(d dVar);
    }

    public a(k kVar, sm.a aVar) {
        this.L = false;
        this.C = kVar;
        this.E = aVar;
        boolean d10 = d();
        this.L = d10;
        if (d10) {
            this.F = new g();
        }
    }

    public static a b() {
        if (N == null) {
            synchronized (a.class) {
                if (N == null) {
                    N = new a(k.k(), new sm.a());
                }
            }
        }
        return N;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    public d a() {
        return this.I;
    }

    public final boolean d() {
        return true;
    }

    public void e(String str, long j10) {
        synchronized (this.f36128y) {
            Long l10 = this.f36128y.get(str);
            if (l10 == null) {
                this.f36128y.put(str, Long.valueOf(j10));
            } else {
                this.f36128y.put(str, Long.valueOf(l10.longValue() + j10));
            }
        }
    }

    public void f(int i10) {
        this.B.addAndGet(i10);
    }

    public boolean g() {
        return this.K;
    }

    public final boolean h(Activity activity) {
        return this.L;
    }

    public synchronized void i(Context context) {
        if (this.J) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.J = true;
        }
    }

    public void j(InterfaceC0458a interfaceC0458a) {
        synchronized (this.f36129z) {
            this.A.add(interfaceC0458a);
        }
    }

    public void k(WeakReference<b> weakReference) {
        synchronized (this.f36129z) {
            this.f36129z.add(weakReference);
        }
    }

    public final void l() {
        synchronized (this.f36129z) {
            for (InterfaceC0458a interfaceC0458a : this.A) {
                if (interfaceC0458a != null) {
                    interfaceC0458a.a();
                }
            }
        }
    }

    public final void m(Activity activity) {
        Trace trace;
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        if (this.f36127x.containsKey(activity) && (trace = this.f36127x.get(activity)) != null) {
            this.f36127x.remove(activity);
            SparseIntArray[] b10 = this.F.b();
            int i12 = 0;
            if (b10 == null || (sparseIntArray = b10[0]) == null) {
                i10 = 0;
                i11 = 0;
            } else {
                int i13 = 0;
                i10 = 0;
                i11 = 0;
                while (i12 < sparseIntArray.size()) {
                    int keyAt = sparseIntArray.keyAt(i12);
                    int valueAt = sparseIntArray.valueAt(i12);
                    i13 += valueAt;
                    if (keyAt > 700) {
                        i11 += valueAt;
                    }
                    if (keyAt > 16) {
                        i10 += valueAt;
                    }
                    i12++;
                }
                i12 = i13;
            }
            if (i12 > 0) {
                trace.putMetric(sm.b.FRAMES_TOTAL.toString(), i12);
            }
            if (i10 > 0) {
                trace.putMetric(sm.b.FRAMES_SLOW.toString(), i10);
            }
            if (i11 > 0) {
                trace.putMetric(sm.b.FRAMES_FROZEN.toString(), i11);
            }
            if (sm.k.b(activity.getApplicationContext())) {
                M.a("sendScreenTrace name:" + c(activity) + " _fr_tot:" + i12 + " _fr_slo:" + i10 + " _fr_fzn:" + i11);
            }
            trace.stop();
        }
    }

    public final void n(String str, h hVar, h hVar2) {
        if (this.D.I()) {
            m.b I = m.w0().Q(str).N(hVar.d()).O(hVar.c(hVar2)).I(SessionManager.getInstance().perfSession().a());
            int andSet = this.B.getAndSet(0);
            synchronized (this.f36128y) {
                I.K(this.f36128y);
                if (andSet != 0) {
                    I.M(sm.b.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                }
                this.f36128y.clear();
            }
            this.C.C(I.a(), d.FOREGROUND_BACKGROUND);
        }
    }

    public void o(WeakReference<b> weakReference) {
        synchronized (this.f36129z) {
            this.f36129z.remove(weakReference);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (this.f36126w.isEmpty()) {
            this.G = this.E.a();
            this.f36126w.put(activity, Boolean.TRUE);
            p(d.FOREGROUND);
            if (this.K) {
                l();
                this.K = false;
            } else {
                n(c.BACKGROUND_TRACE_NAME.toString(), this.H, this.G);
            }
        } else {
            this.f36126w.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (h(activity) && this.D.I()) {
            this.F.a(activity);
            Trace trace = new Trace(c(activity), this.C, this.E, this);
            trace.start();
            this.f36127x.put(activity, trace);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        if (h(activity)) {
            m(activity);
        }
        if (this.f36126w.containsKey(activity)) {
            this.f36126w.remove(activity);
            if (this.f36126w.isEmpty()) {
                this.H = this.E.a();
                p(d.BACKGROUND);
                n(c.FOREGROUND_TRACE_NAME.toString(), this.G, this.H);
            }
        }
    }

    public final void p(d dVar) {
        this.I = dVar;
        synchronized (this.f36129z) {
            Iterator<WeakReference<b>> it = this.f36129z.iterator();
            while (it.hasNext()) {
                b bVar = it.next().get();
                if (bVar != null) {
                    bVar.onUpdateAppState(this.I);
                } else {
                    it.remove();
                }
            }
        }
    }
}
