package p6;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class w0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f46145a;

    /* renamed from: b  reason: collision with root package name */
    public z f46146b;

    /* renamed from: c  reason: collision with root package name */
    public t f46147c;

    /* renamed from: d  reason: collision with root package name */
    public List<p6.c> f46148d;

    /* renamed from: e  reason: collision with root package name */
    public r6.h f46149e;

    /* renamed from: f  reason: collision with root package name */
    public WeakReference<x> f46150f;

    /* renamed from: g  reason: collision with root package name */
    public q6.b f46151g;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p6.c f46152w;

        public a(p6.c cVar) {
            this.f46152w = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            w0.this.f46148d.add(this.f46152w);
            w0.this.f46146b.d("Added sdk_click %d", Integer.valueOf(w0.this.f46148d.size()));
            w0.this.f46146b.g("%s", this.f46152w.g());
            w0.this.o();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x xVar = (x) w0.this.f46150f.get();
            a1 a1Var = new a1(xVar.getContext());
            try {
                JSONArray l10 = a1Var.l();
                boolean z10 = false;
                for (int i10 = 0; i10 < l10.length(); i10++) {
                    JSONArray jSONArray = l10.getJSONArray(i10);
                    if (jSONArray.optInt(2, -1) == 0) {
                        String optString = jSONArray.optString(0, null);
                        long optLong = jSONArray.optLong(1, -1L);
                        jSONArray.put(2, 1);
                        w0.this.d(q0.d(optString, optLong, xVar.g(), xVar.h(), xVar.getDeviceInfo(), xVar.a()));
                        z10 = true;
                    }
                }
                if (z10) {
                    a1Var.y(l10);
                }
            } catch (JSONException e10) {
                w0.this.f46146b.c("Send saved raw referrers error (%s)", e10.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f46155w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f46156x;

        public c(String str, String str2) {
            this.f46155w = str;
            this.f46156x = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            x xVar = (x) w0.this.f46150f.get();
            if (xVar == null) {
                return;
            }
            w0.this.d(q0.c(this.f46155w, this.f46156x, xVar.g(), xVar.h(), xVar.getDeviceInfo(), xVar.a()));
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w0.this.p();
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p6.c f46159w;

        public e(p6.c cVar) {
            this.f46159w = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            w0.this.q(this.f46159w);
            w0.this.o();
        }
    }

    public w0(x xVar, boolean z10, q6.b bVar) {
        c(xVar, z10, bVar);
        this.f46146b = k.h();
        this.f46147c = k.l();
        this.f46149e = new r6.d("SdkClickHandler");
    }

    @Override // p6.c0
    public void a() {
        this.f46145a = true;
    }

    @Override // p6.c0
    public void b() {
        this.f46145a = false;
        o();
    }

    @Override // p6.c0
    public void c(x xVar, boolean z10, q6.b bVar) {
        this.f46145a = !z10;
        this.f46148d = new ArrayList();
        this.f46150f = new WeakReference<>(xVar);
        this.f46151g = bVar;
    }

    @Override // p6.c0
    public void d(p6.c cVar) {
        this.f46149e.submit(new a(cVar));
    }

    @Override // p6.c0
    public void e() {
        this.f46149e.submit(new b());
    }

    @Override // p6.c0
    public void f(String str, String str2) {
        this.f46149e.submit(new c(str, str2));
    }

    public final Map<String, String> m() {
        HashMap hashMap = new HashMap();
        p0.i(hashMap, "sent_at", c1.f45891b.format(Long.valueOf(System.currentTimeMillis())));
        int size = this.f46148d.size() - 1;
        if (size > 0) {
            p0.g(hashMap, "queue_size", size);
        }
        return hashMap;
    }

    public final void n(p6.c cVar) {
        this.f46146b.c("Retrying sdk_click package for the %d time", Integer.valueOf(cVar.r()));
        d(cVar);
    }

    public final void o() {
        this.f46149e.submit(new d());
    }

    public final void p() {
        x xVar = this.f46150f.get();
        if (xVar.g() == null || xVar.g().f45901z || this.f46145a || this.f46148d.isEmpty()) {
            return;
        }
        p6.c remove = this.f46148d.remove(0);
        int p10 = remove.p();
        e eVar = new e(remove);
        if (p10 <= 0) {
            eVar.run();
            return;
        }
        long D = c1.D(p10, this.f46147c);
        this.f46146b.g("Waiting for %s seconds before retrying sdk_click for the %d time", c1.f45890a.format(D / 1000.0d), Integer.valueOf(p10));
        this.f46149e.a(eVar, D);
    }

    public final void q(p6.c cVar) {
        String str;
        Boolean bool;
        long j10;
        long j11;
        long j12;
        long j13;
        String str2;
        long j14;
        String str3;
        x xVar = this.f46150f.get();
        String str4 = cVar.m().get("source");
        boolean z10 = str4 != null && str4.equals("reftag");
        String str5 = cVar.m().get("raw_referrer");
        if (z10 && new a1(xVar.getContext()).k(str5, cVar.c()) == null) {
            return;
        }
        boolean z11 = str4 != null && str4.equals("install_referrer");
        String str6 = null;
        if (z11) {
            long d10 = cVar.d();
            long j15 = cVar.j();
            str6 = cVar.m().get("referrer");
            long e10 = cVar.e();
            long k10 = cVar.k();
            String l10 = cVar.l();
            Boolean i10 = cVar.i();
            str2 = cVar.m().get("referrer_api");
            j10 = k10;
            str = l10;
            bool = i10;
            j12 = e10;
            j11 = j15;
            j13 = d10;
        } else {
            str = null;
            bool = null;
            j10 = -1;
            j11 = -1;
            j12 = -1;
            j13 = -1;
            str2 = null;
        }
        String str7 = str2;
        boolean z12 = str4 != null && str4.equals("preinstall");
        v0 b10 = this.f46151g.b(cVar, m());
        if (b10 instanceof x0) {
            x0 x0Var = (x0) b10;
            if (x0Var.f46125b) {
                n(cVar);
            } else if (xVar == null) {
            } else {
                if (x0Var.f46131h == b1.OPTED_OUT) {
                    xVar.j();
                    return;
                }
                if (z10) {
                    j14 = j10;
                    new a1(xVar.getContext()).u(str5, cVar.c());
                } else {
                    j14 = j10;
                }
                if (z11) {
                    x0Var.f46162p = j13;
                    x0Var.f46163q = j11;
                    x0Var.f46164r = str6;
                    x0Var.f46165s = j12;
                    x0Var.f46166t = j14;
                    x0Var.f46167u = str;
                    x0Var.f46168v = bool;
                    x0Var.f46169w = str7;
                    x0Var.f46161o = true;
                }
                if (z12 && (str3 = cVar.m().get("found_location")) != null && !str3.isEmpty()) {
                    a1 a1Var = new a1(xVar.getContext());
                    if ("system_installer_referrer".equalsIgnoreCase(str3)) {
                        a1Var.s();
                    } else {
                        a1Var.C(s0.k(str3, a1Var.h()));
                    }
                }
                xVar.i(x0Var);
            }
        }
    }
}
