package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfaw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tr1 {

    /* renamed from: f  reason: collision with root package name */
    public final Context f10390f;

    /* renamed from: g  reason: collision with root package name */
    public final WeakReference<Context> f10391g;

    /* renamed from: h  reason: collision with root package name */
    public final mn1 f10392h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f10393i;

    /* renamed from: j  reason: collision with root package name */
    public final Executor f10394j;

    /* renamed from: k  reason: collision with root package name */
    public final ScheduledExecutorService f10395k;

    /* renamed from: l  reason: collision with root package name */
    public final yp1 f10396l;

    /* renamed from: m  reason: collision with root package name */
    public final zj0 f10397m;

    /* renamed from: o  reason: collision with root package name */
    public final rb1 f10399o;

    /* renamed from: a  reason: collision with root package name */
    public boolean f10385a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10386b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10387c = false;

    /* renamed from: e  reason: collision with root package name */
    public final mk0<Boolean> f10389e = new mk0<>();

    /* renamed from: n  reason: collision with root package name */
    public final Map<String, d50> f10398n = new ConcurrentHashMap();

    /* renamed from: p  reason: collision with root package name */
    public boolean f10400p = true;

    /* renamed from: d  reason: collision with root package name */
    public final long f10388d = wg.t.k().elapsedRealtime();

    public tr1(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, mn1 mn1Var, ScheduledExecutorService scheduledExecutorService, yp1 yp1Var, zj0 zj0Var, rb1 rb1Var) {
        this.f10392h = mn1Var;
        this.f10390f = context;
        this.f10391g = weakReference;
        this.f10393i = executor2;
        this.f10395k = scheduledExecutorService;
        this.f10394j = executor;
        this.f10396l = yp1Var;
        this.f10397m = zj0Var;
        this.f10399o = rb1Var;
        u("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* synthetic */ void k(final tr1 tr1Var, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final Object obj = new Object();
                final mk0 mk0Var = new mk0();
                s43 h10 = j43.h(mk0Var, ((Long) ft.c().c(ox.f8014j1)).longValue(), TimeUnit.SECONDS, tr1Var.f10395k);
                tr1Var.f10396l.a(next);
                tr1Var.f10399o.v(next);
                final long elapsedRealtime = wg.t.k().elapsedRealtime();
                Iterator<String> it = keys;
                h10.c(new Runnable(tr1Var, obj, mk0Var, next, elapsedRealtime) { // from class: ai.mr1
                    public final long A;

                    /* renamed from: w  reason: collision with root package name */
                    public final tr1 f7011w;

                    /* renamed from: x  reason: collision with root package name */
                    public final Object f7012x;

                    /* renamed from: y  reason: collision with root package name */
                    public final mk0 f7013y;

                    /* renamed from: z  reason: collision with root package name */
                    public final String f7014z;

                    {
                        this.f7011w = tr1Var;
                        this.f7012x = obj;
                        this.f7013y = mk0Var;
                        this.f7014z = next;
                        this.A = elapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7011w.p(this.f7012x, this.f7013y, this.f7014z, this.A);
                    }
                }, tr1Var.f10393i);
                arrayList.add(h10);
                final sr1 sr1Var = new sr1(tr1Var, obj, next, elapsedRealtime, mk0Var);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                }
                            }
                            arrayList2.add(new l50(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                tr1Var.u(next, false, "", 0);
                try {
                    try {
                        final pm2 b10 = tr1Var.f10392h.b(next, new JSONObject());
                        tr1Var.f10394j.execute(new Runnable(tr1Var, b10, sr1Var, arrayList2, next) { // from class: ai.or1
                            public final String A;

                            /* renamed from: w  reason: collision with root package name */
                            public final tr1 f7887w;

                            /* renamed from: x  reason: collision with root package name */
                            public final pm2 f7888x;

                            /* renamed from: y  reason: collision with root package name */
                            public final h50 f7889y;

                            /* renamed from: z  reason: collision with root package name */
                            public final List f7890z;

                            {
                                this.f7887w = tr1Var;
                                this.f7888x = b10;
                                this.f7889y = sr1Var;
                                this.f7890z = arrayList2;
                                this.A = next;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f7887w.n(this.f7888x, this.f7889y, this.f7890z, this.A);
                            }
                        });
                    } catch (zzfaw unused2) {
                        sr1Var.s("Failed to create Adapter.");
                    }
                } catch (RemoteException e10) {
                    uj0.d("", e10);
                }
                keys = it;
            }
            j43.m(arrayList).a(new Callable(tr1Var) { // from class: ai.nr1

                /* renamed from: a  reason: collision with root package name */
                public final tr1 f7445a;

                {
                    this.f7445a = tr1Var;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.f7445a.o();
                    return null;
                }
            }, tr1Var.f10393i);
        } catch (JSONException e11) {
            yg.p1.l("Malformed CLD response", e11);
        }
    }

    public final void g() {
        this.f10400p = false;
    }

    public final void h(final k50 k50Var) {
        this.f10389e.c(new Runnable(this, k50Var) { // from class: ai.hr1

            /* renamed from: w  reason: collision with root package name */
            public final tr1 f4949w;

            /* renamed from: x  reason: collision with root package name */
            public final k50 f4950x;

            {
                this.f4949w = this;
                this.f4950x = k50Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                tr1 tr1Var = this.f4949w;
                try {
                    this.f4950x.y2(tr1Var.j());
                } catch (RemoteException e10) {
                    uj0.d("", e10);
                }
            }
        }, this.f10394j);
    }

    public final void i() {
        if (!hz.f5044a.e().booleanValue()) {
            if (this.f10397m.f13015y >= ((Integer) ft.c().c(ox.f8006i1)).intValue() && this.f10400p) {
                if (this.f10385a) {
                    return;
                }
                synchronized (this) {
                    if (this.f10385a) {
                        return;
                    }
                    this.f10396l.d();
                    this.f10399o.d();
                    this.f10389e.c(new Runnable(this) { // from class: ai.jr1

                        /* renamed from: w  reason: collision with root package name */
                        public final tr1 f5896w;

                        {
                            this.f5896w = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f5896w.s();
                        }
                    }, this.f10393i);
                    this.f10385a = true;
                    s43<String> t10 = t();
                    this.f10395k.schedule(new Runnable(this) { // from class: ai.lr1

                        /* renamed from: w  reason: collision with root package name */
                        public final tr1 f6649w;

                        {
                            this.f6649w = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f6649w.q();
                        }
                    }, ((Long) ft.c().c(ox.f8022k1)).longValue(), TimeUnit.SECONDS);
                    j43.p(t10, new rr1(this), this.f10393i);
                    return;
                }
            }
        }
        if (this.f10385a) {
            return;
        }
        u("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.f10389e.d(Boolean.FALSE);
        this.f10385a = true;
        this.f10386b = true;
    }

    public final List<d50> j() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f10398n.keySet()) {
            d50 d50Var = this.f10398n.get(str);
            arrayList.add(new d50(str, d50Var.f3148x, d50Var.f3149y, d50Var.f3150z));
        }
        return arrayList;
    }

    public final boolean m() {
        return this.f10386b;
    }

    public final /* synthetic */ void n(pm2 pm2Var, h50 h50Var, List list, String str) {
        try {
            try {
                Context context = this.f10391g.get();
                if (context == null) {
                    context = this.f10390f;
                }
                pm2Var.B(context, h50Var, list);
            } catch (RemoteException e10) {
                uj0.d("", e10);
            }
        } catch (zzfaw unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 74);
            sb2.append("Failed to initialize adapter. ");
            sb2.append(str);
            sb2.append(" does not implement the initialize() method.");
            h50Var.s(sb2.toString());
        }
    }

    public final /* synthetic */ Object o() throws Exception {
        this.f10389e.d(Boolean.TRUE);
        return null;
    }

    public final /* synthetic */ void p(Object obj, mk0 mk0Var, String str, long j10) {
        synchronized (obj) {
            if (!mk0Var.isDone()) {
                u(str, false, "Timeout.", (int) (wg.t.k().elapsedRealtime() - j10));
                this.f10396l.c(str, "timeout");
                this.f10399o.l0(str, "timeout");
                mk0Var.d(Boolean.FALSE);
            }
        }
    }

    public final /* synthetic */ void q() {
        synchronized (this) {
            if (this.f10387c) {
                return;
            }
            u("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (wg.t.k().elapsedRealtime() - this.f10388d));
            this.f10389e.e(new Exception());
        }
    }

    public final /* synthetic */ void r(final mk0 mk0Var) {
        this.f10393i.execute(new Runnable(this, mk0Var) { // from class: ai.pr1

            /* renamed from: w  reason: collision with root package name */
            public final tr1 f8532w;

            /* renamed from: x  reason: collision with root package name */
            public final mk0 f8533x;

            {
                this.f8532w = this;
                this.f8533x = mk0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                mk0 mk0Var2 = this.f8533x;
                String d10 = wg.t.h().p().n().d();
                if (!TextUtils.isEmpty(d10)) {
                    mk0Var2.d(d10);
                } else {
                    mk0Var2.e(new Exception());
                }
            }
        });
    }

    public final /* synthetic */ void s() {
        this.f10396l.e();
        this.f10399o.c();
        this.f10386b = true;
    }

    public final synchronized s43<String> t() {
        String d10 = wg.t.h().p().n().d();
        if (!TextUtils.isEmpty(d10)) {
            return j43.a(d10);
        }
        final mk0 mk0Var = new mk0();
        wg.t.h().p().f(new Runnable(this, mk0Var) { // from class: ai.kr1

            /* renamed from: w  reason: collision with root package name */
            public final tr1 f6342w;

            /* renamed from: x  reason: collision with root package name */
            public final mk0 f6343x;

            {
                this.f6342w = this;
                this.f6343x = mk0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6342w.r(this.f6343x);
            }
        });
        return mk0Var;
    }

    public final void u(String str, boolean z10, String str2, int i10) {
        this.f10398n.put(str, new d50(str, z10, i10, str2));
    }
}
