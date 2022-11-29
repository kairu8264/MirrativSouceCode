package cc;

import ac.j6;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.d1;

/* loaded from: classes2.dex */
public final class l extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19075b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f19076c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final j6 f19077a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_gift_ranking_rank_up_roulette_dummy_user, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new l((j6) e10, null);
        }
    }

    public l(j6 j6Var) {
        super(j6Var.u());
        this.f19077a = j6Var;
    }

    public /* synthetic */ l(j6 j6Var, jo.h hVar) {
        this(j6Var);
    }

    public final void a(d1 d1Var) {
        jo.p.h(d1Var, "bindModel");
        this.f19077a.T(d1Var);
    }
}
