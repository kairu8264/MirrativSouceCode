package ai;

import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lx0 implements vk {
    public boolean A = false;
    public boolean B = false;
    public final zw0 C = new zw0();

    /* renamed from: w  reason: collision with root package name */
    public rp0 f6715w;

    /* renamed from: x  reason: collision with root package name */
    public final Executor f6716x;

    /* renamed from: y  reason: collision with root package name */
    public final ww0 f6717y;

    /* renamed from: z  reason: collision with root package name */
    public final vh.f f6718z;

    public lx0(Executor executor, ww0 ww0Var, vh.f fVar) {
        this.f6716x = executor;
        this.f6717y = ww0Var;
        this.f6718z = fVar;
    }

    @Override // ai.vk
    public final void U(uk ukVar) {
        zw0 zw0Var = this.C;
        zw0Var.f13224a = this.B ? false : ukVar.f10736j;
        zw0Var.f13227d = this.f6718z.elapsedRealtime();
        this.C.f13229f = ukVar;
        if (this.A) {
            h();
        }
    }

    public final void a(rp0 rp0Var) {
        this.f6715w = rp0Var;
    }

    public final void b() {
        this.A = false;
    }

    public final void c() {
        this.A = true;
        h();
    }

    public final void d(boolean z10) {
        this.B = z10;
    }

    public final /* synthetic */ void f(JSONObject jSONObject) {
        this.f6715w.l0("AFMA_updateActiveView", jSONObject);
    }

    public final void h() {
        try {
            final JSONObject b10 = this.f6717y.b(this.C);
            if (this.f6715w != null) {
                this.f6716x.execute(new Runnable(this, b10) { // from class: ai.jx0

                    /* renamed from: w  reason: collision with root package name */
                    public final lx0 f5948w;

                    /* renamed from: x  reason: collision with root package name */
                    public final JSONObject f5949x;

                    {
                        this.f5948w = this;
                        this.f5949x = b10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5948w.f(this.f5949x);
                    }
                });
            }
        } catch (JSONException e10) {
            yg.p1.l("Failed to call video active view js", e10);
        }
    }
}
