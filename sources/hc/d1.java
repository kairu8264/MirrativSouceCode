package hc;

import ac.v6;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class d1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f35080b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f35081c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final v6 f35082a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_group_shot_viewer, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new d1((v6) e10, null);
        }
    }

    public d1(v6 v6Var) {
        super(v6Var.u());
        this.f35082a = v6Var;
    }

    public /* synthetic */ d1(v6 v6Var, jo.h hVar) {
        this(v6Var);
    }

    public final void a(c1 c1Var) {
        jo.p.h(c1Var, "bindModel");
        this.f35082a.T(c1Var);
    }
}
