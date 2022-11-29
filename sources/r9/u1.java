package r9;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class u1 extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f50495a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), q9.h.view_holder_shooter_closet_parts_space, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new u1((s9.e1) e10, null);
        }
    }

    public u1(s9.e1 e1Var) {
        super(e1Var.u());
    }

    public /* synthetic */ u1(s9.e1 e1Var, jo.h hVar) {
        this(e1Var);
    }
}
