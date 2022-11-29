package qf;

import ae.Cif;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class v0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49405b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49406c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final Cif f49407a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final v0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_gift_item_attribute, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new v0((Cif) e10, null);
        }
    }

    public v0(Cif cif) {
        super(cif.u());
        this.f49407a = cif;
    }

    public /* synthetic */ v0(Cif cif, jo.h hVar) {
        this(cif);
    }

    public final void a(ud.s0 s0Var) {
        jo.p.h(s0Var, "bindModel");
        this.f49407a.F.setTextSize(2, s0Var.c());
        this.f49407a.G.setTextSize(2, s0Var.c());
        this.f49407a.T(s0Var);
    }
}
