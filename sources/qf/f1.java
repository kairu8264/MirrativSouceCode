package qf;

import ae.ag;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class f1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49139b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49140c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ag f49141a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_landing_page_reward_detail, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new f1((ag) e10, null);
        }
    }

    public f1(ag agVar) {
        super(agVar.u());
        this.f49141a = agVar;
    }

    public /* synthetic */ f1(ag agVar, jo.h hVar) {
        this(agVar);
    }

    public final void a(ud.s1 s1Var) {
        jo.p.h(s1Var, "bindModel");
        this.f49141a.T(s1Var);
        AppCompatImageView appCompatImageView = this.f49141a.M;
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        int h10 = (int) (this.f49141a.u().getContext().getResources().getDisplayMetrics().density * s1Var.h());
        layoutParams.height = h10;
        layoutParams.width = h10;
        appCompatImageView.setLayoutParams(layoutParams);
        this.f49141a.J.setStarCountAndApply(s1Var.j());
        ud.x0 e10 = s1Var.e();
        if (e10 != null) {
            this.f49141a.E.a(e10);
        }
        this.f49141a.o();
    }
}
