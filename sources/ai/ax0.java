package ai;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ax0 implements vk, q51, xg.q, p51 {
    public final Executor A;
    public final vh.f B;

    /* renamed from: w  reason: collision with root package name */
    public final vw0 f2140w;

    /* renamed from: x  reason: collision with root package name */
    public final ww0 f2141x;

    /* renamed from: z  reason: collision with root package name */
    public final k80<JSONObject, JSONObject> f2143z;

    /* renamed from: y  reason: collision with root package name */
    public final Set<rp0> f2142y = new HashSet();
    public final AtomicBoolean C = new AtomicBoolean(false);
    public final zw0 D = new zw0();
    public boolean E = false;
    public WeakReference<?> F = new WeakReference<>(this);

    public ax0(h80 h80Var, ww0 ww0Var, Executor executor, vw0 vw0Var, vh.f fVar) {
        this.f2140w = vw0Var;
        s70<JSONObject> s70Var = v70.f10994b;
        this.f2143z = h80Var.a("google.afma.activeView.handleUpdate", s70Var, s70Var);
        this.f2141x = ww0Var;
        this.A = executor;
        this.B = fVar;
    }

    @Override // xg.q
    public final synchronized void B4() {
        this.D.f13225b = false;
        a();
    }

    @Override // xg.q
    public final void D5(int i10) {
    }

    @Override // ai.vk
    public final synchronized void U(uk ukVar) {
        zw0 zw0Var = this.D;
        zw0Var.f13224a = ukVar.f10736j;
        zw0Var.f13229f = ukVar;
        a();
    }

    public final synchronized void a() {
        if (this.F.get() != null) {
            if (this.E || !this.C.get()) {
                return;
            }
            try {
                this.D.f13227d = this.B.elapsedRealtime();
                final JSONObject b10 = this.f2141x.b(this.D);
                for (final rp0 rp0Var : this.f2142y) {
                    this.A.execute(new Runnable(rp0Var, b10) { // from class: ai.yw0

                        /* renamed from: w  reason: collision with root package name */
                        public final rp0 f12757w;

                        /* renamed from: x  reason: collision with root package name */
                        public final JSONObject f12758x;

                        {
                            this.f12757w = rp0Var;
                            this.f12758x = b10;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12757w.l0("AFMA_updateActiveView", this.f12758x);
                        }
                    });
                }
                kk0.b(this.f2143z.b(b10), "ActiveViewListener.callActiveViewJs");
                return;
            } catch (Exception e10) {
                yg.p1.l("Failed to call ActiveViewJS", e10);
                return;
            }
        }
        b();
    }

    public final synchronized void b() {
        k();
        this.E = true;
    }

    @Override // xg.q
    public final void c() {
    }

    @Override // xg.q
    public final void d() {
    }

    @Override // ai.p51
    public final synchronized void f() {
        if (this.C.compareAndSet(false, true)) {
            this.f2140w.c(this);
            a();
        }
    }

    @Override // xg.q
    public final synchronized void f4() {
        this.D.f13225b = true;
        a();
    }

    public final synchronized void h(rp0 rp0Var) {
        this.f2142y.add(rp0Var);
        this.f2140w.d(rp0Var);
    }

    public final void j(Object obj) {
        this.F = new WeakReference<>(obj);
    }

    public final void k() {
        for (rp0 rp0Var : this.f2142y) {
            this.f2140w.e(rp0Var);
        }
        this.f2140w.f();
    }

    @Override // ai.q51
    public final synchronized void p(Context context) {
        this.D.f13225b = true;
        a();
    }

    @Override // xg.q
    public final void s0() {
    }

    @Override // ai.q51
    public final synchronized void t(Context context) {
        this.D.f13228e = "u";
        a();
        k();
        this.E = true;
    }

    @Override // ai.q51
    public final synchronized void y(Context context) {
        this.D.f13225b = false;
        a();
    }
}
