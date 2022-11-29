package qf;

import ae.kf;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class u0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49395b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49396c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final kf f49397a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_gift_item_attribute_emomo_quest, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new u0((kf) e10, null);
        }
    }

    public u0(kf kfVar) {
        super(kfVar.u());
        this.f49397a = kfVar;
    }

    public /* synthetic */ u0(kf kfVar, jo.h hVar) {
        this(kfVar);
    }

    public final void a(ud.t0 t0Var) {
        jo.p.h(t0Var, "bindModel");
        this.f49397a.T(t0Var);
    }
}
