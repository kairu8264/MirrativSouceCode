package v8;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import r8.f1;
import t8.e1;

/* loaded from: classes.dex */
public final class h extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f56933a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), f1.view_holder_group_shot_gallery_empty, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new h((e1) e10, null);
        }
    }

    public h(e1 e1Var) {
        super(e1Var.u());
    }

    public /* synthetic */ h(e1 e1Var, jo.h hVar) {
        this(e1Var);
    }
}
