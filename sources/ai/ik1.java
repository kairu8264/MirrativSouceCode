package ai;

import android.graphics.Rect;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ik1 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f5267a;

    /* renamed from: b  reason: collision with root package name */
    public final lx0 f5268b;

    /* renamed from: c  reason: collision with root package name */
    public final ic1 f5269c;

    public ik1(Executor executor, lx0 lx0Var, ic1 ic1Var) {
        this.f5267a = executor;
        this.f5269c = ic1Var;
        this.f5268b = lx0Var;
    }

    public final void a(final rp0 rp0Var) {
        if (rp0Var == null) {
            return;
        }
        this.f5269c.S0(rp0Var.G());
        this.f5269c.y0(new vk(rp0Var) { // from class: ai.dk1

            /* renamed from: w  reason: collision with root package name */
            public final rp0 f3324w;

            {
                this.f3324w = rp0Var;
            }

            @Override // ai.vk
            public final void U(uk ukVar) {
                fr0 i02 = this.f3324w.i0();
                Rect rect = ukVar.f10730d;
                i02.k0(rect.left, rect.top, false);
            }
        }, this.f5267a);
        this.f5269c.y0(new vk(rp0Var) { // from class: ai.ek1

            /* renamed from: w  reason: collision with root package name */
            public final rp0 f3705w;

            {
                this.f3705w = rp0Var;
            }

            @Override // ai.vk
            public final void U(uk ukVar) {
                rp0 rp0Var2 = this.f3705w;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != ukVar.f10736j ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                rp0Var2.j0("onAdVisibilityChanged", hashMap);
            }
        }, this.f5267a);
        this.f5269c.y0(this.f5268b, this.f5267a);
        this.f5268b.a(rp0Var);
        rp0Var.c1("/trackActiveViewUnit", new r30(this) { // from class: ai.gk1

            /* renamed from: a  reason: collision with root package name */
            public final ik1 f4499a;

            {
                this.f4499a = this;
            }

            @Override // ai.r30
            public final void a(Object obj, Map map) {
                this.f4499a.c((rp0) obj, map);
            }
        });
        rp0Var.c1("/untrackActiveViewUnit", new r30(this) { // from class: ai.hk1

            /* renamed from: a  reason: collision with root package name */
            public final ik1 f4884a;

            {
                this.f4884a = this;
            }

            @Override // ai.r30
            public final void a(Object obj, Map map) {
                this.f4884a.b((rp0) obj, map);
            }
        });
    }

    public final /* synthetic */ void b(rp0 rp0Var, Map map) {
        this.f5268b.b();
    }

    public final /* synthetic */ void c(rp0 rp0Var, Map map) {
        this.f5268b.c();
    }
}
