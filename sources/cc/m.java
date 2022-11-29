package cc;

import ac.l6;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.e1;

/* loaded from: classes2.dex */
public final class m extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19079b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f19080c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final l6 f19081a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_gift_ranking_rank_up_roulette_user, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new m((l6) e10, null);
        }
    }

    public m(l6 l6Var) {
        super(l6Var.u());
        this.f19081a = l6Var;
    }

    public /* synthetic */ m(l6 l6Var, jo.h hVar) {
        this(l6Var);
    }

    public final void a(e1 e1Var) {
        jo.p.h(e1Var, "bindModel");
        this.f19081a.T(e1Var);
    }
}
