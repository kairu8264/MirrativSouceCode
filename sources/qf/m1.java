package qf;

import ae.kg;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class m1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49293b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49294c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final kg f49295a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_live_gift_ranking, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new m1((kg) e10, null);
        }
    }

    public m1(kg kgVar) {
        super(kgVar.u());
        this.f49295a = kgVar;
    }

    public /* synthetic */ m1(kg kgVar, jo.h hVar) {
        this(kgVar);
    }

    public final void a(ud.y1 y1Var) {
        jo.p.h(y1Var, "bindModel");
        this.f49295a.T(y1Var);
        this.f49295a.N.a(y1Var.k(), y1Var.j());
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(this.f49295a.B);
        cVar.l(this.f49295a.G.getId(), de.m.a(this, y1Var.c()));
        cVar.m(this.f49295a.G.getId(), de.m.a(this, y1Var.c()));
        cVar.c(this.f49295a.B);
        this.f49295a.o();
    }
}
