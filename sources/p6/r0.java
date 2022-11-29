package p6;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import q6.b;

/* loaded from: classes.dex */
public class r0 implements a0, b.a {

    /* renamed from: b  reason: collision with root package name */
    public q6.b f46069b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<x> f46070c;

    /* renamed from: d  reason: collision with root package name */
    public List<p6.c> f46071d;

    /* renamed from: e  reason: collision with root package name */
    public AtomicBoolean f46072e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f46073f;

    /* renamed from: g  reason: collision with root package name */
    public Context f46074g;

    /* renamed from: a  reason: collision with root package name */
    public r6.h f46068a = new r6.d("PackageHandler");

    /* renamed from: h  reason: collision with root package name */
    public z f46075h = k.h();

    /* renamed from: i  reason: collision with root package name */
    public t f46076i = k.k();

    /* renamed from: j  reason: collision with root package name */
    public t f46077j = k.g();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.r();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p6.c f46079w;

        public b(p6.c cVar) {
            this.f46079w = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.o(this.f46079w);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.t();
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.u();
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.f46075h.g("Package handler can send", new Object[0]);
            r0.this.f46072e.set(false);
            r0.this.e();
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ y0 f46084w;

        public f(y0 y0Var) {
            this.f46084w = y0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.v(this.f46084w);
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.p();
        }
    }

    public r0(x xVar, Context context, boolean z10, q6.b bVar) {
        c(xVar, context, z10, bVar);
        this.f46068a.submit(new a());
    }

    @Override // p6.a0
    public void a() {
        this.f46073f = true;
    }

    @Override // p6.a0
    public void b() {
        this.f46073f = false;
    }

    @Override // p6.a0
    public void c(x xVar, Context context, boolean z10, q6.b bVar) {
        this.f46070c = new WeakReference<>(xVar);
        this.f46074g = context;
        this.f46073f = !z10;
        this.f46069b = bVar;
    }

    @Override // q6.b.a
    public void d(v0 v0Var) {
        long D;
        this.f46075h.d("Got response in PackageHandler", new Object[0]);
        x xVar = this.f46070c.get();
        if (xVar != null && v0Var.f46131h == b1.OPTED_OUT) {
            xVar.j();
        }
        if (!v0Var.f46125b) {
            this.f46068a.submit(new d());
            if (xVar != null) {
                xVar.i(v0Var);
                return;
            }
            return;
        }
        if (xVar != null) {
            xVar.i(v0Var);
        }
        e eVar = new e();
        p6.c cVar = v0Var.f46136m;
        if (cVar == null) {
            eVar.run();
            return;
        }
        int r10 = cVar.r();
        a1 a1Var = new a1(this.f46074g);
        if (v0Var.f46136m.a() == p6.b.SESSION && !a1Var.f()) {
            D = c1.D(r10, this.f46077j);
        } else {
            D = c1.D(r10, this.f46076i);
        }
        this.f46075h.g("Waiting for %s seconds before retrying the %d time", c1.f45890a.format(D / 1000.0d), Integer.valueOf(r10));
        this.f46068a.a(eVar, D);
    }

    @Override // p6.a0
    public void e() {
        this.f46068a.submit(new c());
    }

    @Override // p6.a0
    public void f(p6.c cVar) {
        this.f46068a.submit(new b(cVar));
    }

    @Override // p6.a0
    public void flush() {
        this.f46068a.submit(new g());
    }

    @Override // p6.a0
    public void g(y0 y0Var) {
        this.f46068a.submit(new f(y0Var != null ? y0Var.a() : null));
    }

    public final void o(p6.c cVar) {
        this.f46071d.add(cVar);
        this.f46075h.d("Added package %d (%s)", Integer.valueOf(this.f46071d.size()), cVar);
        this.f46075h.g("%s", cVar.g());
        w();
    }

    public final void p() {
        this.f46071d.clear();
        w();
    }

    public final Map<String, String> q() {
        HashMap hashMap = new HashMap();
        p0.i(hashMap, "sent_at", c1.f45891b.format(Long.valueOf(System.currentTimeMillis())));
        int size = this.f46071d.size() - 1;
        if (size > 0) {
            p0.g(hashMap, "queue_size", size);
        }
        return hashMap;
    }

    public final void r() {
        this.f46072e = new AtomicBoolean();
        s();
    }

    public final void s() {
        try {
            this.f46071d = (List) c1.W(this.f46074g, "AdjustIoPackageQueue", "Package queue", List.class);
        } catch (Exception e10) {
            this.f46075h.c("Failed to read %s file (%s)", "Package queue", e10.getMessage());
            this.f46071d = null;
        }
        List<p6.c> list = this.f46071d;
        if (list != null) {
            this.f46075h.d("Package handler read %d packages", Integer.valueOf(list.size()));
        } else {
            this.f46071d = new ArrayList();
        }
    }

    public final void t() {
        if (this.f46071d.isEmpty()) {
            return;
        }
        if (this.f46073f) {
            this.f46075h.d("Package handler is paused", new Object[0]);
        } else if (this.f46072e.getAndSet(true)) {
            this.f46075h.g("Package handler is already sending", new Object[0]);
        } else {
            Map<String, String> q10 = q();
            this.f46069b.a(this.f46071d.get(0), q10, this);
        }
    }

    public final void u() {
        if (this.f46071d.isEmpty()) {
            return;
        }
        this.f46071d.remove(0);
        w();
        this.f46072e.set(false);
        this.f46075h.g("Package handler can send", new Object[0]);
        t();
    }

    public void v(y0 y0Var) {
        if (y0Var == null) {
            return;
        }
        this.f46075h.d("Updating package handler queue", new Object[0]);
        this.f46075h.g("Session callback parameters: %s", y0Var.f46170a);
        this.f46075h.g("Session partner parameters: %s", y0Var.f46171b);
        for (p6.c cVar : this.f46071d) {
            Map<String, String> m10 = cVar.m();
            p0.h(m10, "callback_params", c1.T(y0Var.f46170a, cVar.b(), "Callback"));
            p0.h(m10, "partner_params", c1.T(y0Var.f46171b, cVar.n(), "Partner"));
        }
        w();
    }

    public final void w() {
        c1.c0(this.f46071d, this.f46074g, "AdjustIoPackageQueue", "Package queue");
        this.f46075h.d("Package handler wrote %d packages", Integer.valueOf(this.f46071d.size()));
    }
}
