package qf;

import ae.of;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class w0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49414b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49415c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final of f49416a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_gift_item_detail_page_emomo_quest, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …  false\n                )");
            return new w0((of) e10, null);
        }
    }

    public w0(of ofVar) {
        super(ofVar.u());
        this.f49416a = ofVar;
    }

    public /* synthetic */ w0(of ofVar, jo.h hVar) {
        this(ofVar);
    }

    public final void a(ud.v0 v0Var) {
        jo.p.h(v0Var, "bindModel");
        this.f49416a.T(v0Var);
        AppCompatImageView appCompatImageView = this.f49416a.L;
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        int d10 = (int) (this.f49416a.u().getContext().getResources().getDisplayMetrics().density * v0Var.d());
        layoutParams.height = d10;
        layoutParams.width = d10;
        appCompatImageView.setLayoutParams(layoutParams);
        Integer h10 = v0Var.h();
        if (h10 != null) {
            this.f49416a.O.setStarCountAndApply(h10.intValue());
        }
        RecyclerView recyclerView = this.f49416a.Q;
        rd.c0 c0Var = new rd.c0();
        ud.x0 c10 = v0Var.c();
        c0Var.d(c10 != null ? c10.a() : null);
        recyclerView.setAdapter(c0Var);
    }
}
