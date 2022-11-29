package hc;

import ac.n6;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class g extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f35113a = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_group_shot_background_setting_from_gallery, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new g((n6) e10, null);
        }
    }

    public g(n6 n6Var) {
        super(n6Var.u());
    }

    public /* synthetic */ g(n6 n6Var, jo.h hVar) {
        this(n6Var);
    }
}
