package androidx.lifecycle;

import androidx.lifecycle.o;
import uo.d2;

/* loaded from: classes.dex */
public final class LifecycleController {

    /* renamed from: a  reason: collision with root package name */
    public final o f15441a;

    /* renamed from: b  reason: collision with root package name */
    public final o.c f15442b;

    /* renamed from: c  reason: collision with root package name */
    public final i f15443c;

    /* renamed from: d  reason: collision with root package name */
    public final r f15444d;

    public LifecycleController(o oVar, o.c cVar, i iVar, final d2 d2Var) {
        jo.p.h(oVar, "lifecycle");
        jo.p.h(cVar, "minState");
        jo.p.h(iVar, "dispatchQueue");
        jo.p.h(d2Var, "parentJob");
        this.f15441a = oVar;
        this.f15442b = cVar;
        this.f15443c = iVar;
        r rVar = new r() { // from class: androidx.lifecycle.LifecycleController$observer$1
            @Override // androidx.lifecycle.r
            public final void i(u uVar, o.b bVar) {
                o.c cVar2;
                i iVar2;
                i iVar3;
                jo.p.h(uVar, "source");
                jo.p.h(bVar, "$noName_1");
                if (uVar.g().b() == o.c.DESTROYED) {
                    LifecycleController lifecycleController = LifecycleController.this;
                    d2.a.a(d2Var, null, 1, null);
                    lifecycleController.c();
                    return;
                }
                o.c b10 = uVar.g().b();
                cVar2 = LifecycleController.this.f15442b;
                if (b10.compareTo(cVar2) < 0) {
                    iVar3 = LifecycleController.this.f15443c;
                    iVar3.g();
                    return;
                }
                iVar2 = LifecycleController.this.f15443c;
                iVar2.h();
            }
        };
        this.f15444d = rVar;
        if (oVar.b() == o.c.DESTROYED) {
            d2.a.a(d2Var, null, 1, null);
            c();
            return;
        }
        oVar.a(rVar);
    }

    public final void c() {
        this.f15441a.c(this.f15444d);
        this.f15443c.f();
    }
}
