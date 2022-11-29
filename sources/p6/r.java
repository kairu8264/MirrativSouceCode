package p6;

import android.net.Uri;
import com.dena.mirrorman.net.api.Referer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import q6.b;

/* loaded from: classes.dex */
public class r implements y, b.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f46052a;

    /* renamed from: b  reason: collision with root package name */
    public String f46053b;

    /* renamed from: c  reason: collision with root package name */
    public q6.b f46054c;

    /* renamed from: g  reason: collision with root package name */
    public WeakReference<x> f46058g;

    /* renamed from: d  reason: collision with root package name */
    public z f46055d = k.h();

    /* renamed from: f  reason: collision with root package name */
    public r6.h f46057f = new r6.d("AttributionHandler");

    /* renamed from: e  reason: collision with root package name */
    public r6.j f46056e = new r6.j(new a(), "Attribution timer");

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.x();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.f46053b = "sdk";
            r.this.w(0L);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ z0 f46061w;

        public c(z0 z0Var) {
            this.f46061w = z0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            x xVar = (x) r.this.f46058g.get();
            if (xVar == null) {
                return;
            }
            r.this.u(xVar, this.f46061w);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0 f46063w;

        public d(x0 x0Var) {
            this.f46063w = x0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            x xVar = (x) r.this.f46058g.get();
            if (xVar == null) {
                return;
            }
            r.this.t(xVar, this.f46063w);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.y();
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v0 f46066w;

        public f(v0 v0Var) {
            this.f46066w = v0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            x xVar = (x) r.this.f46058g.get();
            if (xVar == null) {
                return;
            }
            v0 v0Var = this.f46066w;
            if (v0Var.f46131h == b1.OPTED_OUT) {
                xVar.j();
            } else if (v0Var instanceof s) {
                r.this.r(xVar, (s) v0Var);
            }
        }
    }

    public r(x xVar, boolean z10, q6.b bVar) {
        c(xVar, z10, bVar);
    }

    @Override // p6.y
    public void a() {
        this.f46052a = true;
    }

    @Override // p6.y
    public void b() {
        this.f46052a = false;
    }

    @Override // p6.y
    public void c(x xVar, boolean z10, q6.b bVar) {
        this.f46058g = new WeakReference<>(xVar);
        this.f46052a = !z10;
        this.f46054c = bVar;
    }

    @Override // q6.b.a
    public void d(v0 v0Var) {
        this.f46057f.submit(new f(v0Var));
    }

    @Override // p6.y
    public void e() {
        this.f46057f.submit(new b());
    }

    @Override // p6.y
    public void f(z0 z0Var) {
        this.f46057f.submit(new c(z0Var));
    }

    @Override // p6.y
    public void g(x0 x0Var) {
        this.f46057f.submit(new d(x0Var));
    }

    public final p6.c p() {
        long currentTimeMillis = System.currentTimeMillis();
        x xVar = this.f46058g.get();
        p6.c j10 = new p0(xVar.h(), xVar.getDeviceInfo(), xVar.g(), xVar.a(), currentTimeMillis).j(this.f46053b);
        this.f46053b = null;
        return j10;
    }

    public final void q(x xVar, v0 v0Var) {
        if (v0Var.f46129f == null) {
            return;
        }
        Long l10 = v0Var.f46133j;
        if (l10 != null && l10.longValue() >= 0) {
            xVar.e(true);
            this.f46053b = "backend";
            w(l10.longValue());
            return;
        }
        xVar.e(false);
    }

    public final void r(x xVar, s sVar) {
        q(xVar, sVar);
        s(sVar);
        xVar.d(sVar);
    }

    public final void s(s sVar) {
        JSONObject optJSONObject;
        String optString;
        JSONObject jSONObject = sVar.f46129f;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("attribution")) == null || (optString = optJSONObject.optString(Referer.DEEPLINK, null)) == null) {
            return;
        }
        sVar.f46087o = Uri.parse(optString);
    }

    public final void t(x xVar, x0 x0Var) {
        q(xVar, x0Var);
        xVar.f(x0Var);
    }

    public final void u(x xVar, z0 z0Var) {
        q(xVar, z0Var);
        xVar.b(z0Var);
    }

    public final Map<String, String> v() {
        HashMap hashMap = new HashMap();
        p0.i(hashMap, "sent_at", c1.f45891b.format(Long.valueOf(System.currentTimeMillis())));
        return hashMap;
    }

    public final void w(long j10) {
        if (this.f46056e.g() > j10) {
            return;
        }
        if (j10 != 0) {
            this.f46055d.d("Waiting to query attribution in %s seconds", c1.f45890a.format(j10 / 1000.0d));
        }
        this.f46056e.h(j10);
    }

    public final void x() {
        this.f46057f.submit(new e());
    }

    public final void y() {
        if (this.f46058g.get().g().f45901z) {
            return;
        }
        if (this.f46052a) {
            this.f46055d.d("Attribution handler is paused", new Object[0]);
            return;
        }
        p6.c p10 = p();
        this.f46055d.g("%s", p10.g());
        this.f46054c.a(p10, v(), this);
    }
}
