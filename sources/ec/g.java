package ec;

import ac.v5;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.n4;

/* loaded from: classes2.dex */
public final class g extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30420a = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_floating_comment_end, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new g((v5) e10, null);
        }
    }

    public g(v5 v5Var) {
        super(v5Var.u());
    }

    public /* synthetic */ g(v5 v5Var, jo.h hVar) {
        this(v5Var);
    }

    public final void a(n4 n4Var) {
        jo.p.h(n4Var, "bindModel");
    }
}
