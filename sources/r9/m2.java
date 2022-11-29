package r9;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class m2 extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f50257a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), q9.h.view_holder_shooter_parts_category_divider, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new m2((s9.g1) e10, null);
        }
    }

    public m2(s9.g1 g1Var) {
        super(g1Var.u());
    }

    public /* synthetic */ m2(s9.g1 g1Var, jo.h hVar) {
        this(g1Var);
    }
}
