package qf;

import ae.mf;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class x0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49429b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49430c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final mf f49431a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final x0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_gift_item_detail_page, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …  false\n                )");
            return new x0((mf) e10, null);
        }
    }

    public x0(mf mfVar) {
        super(mfVar.u());
        this.f49431a = mfVar;
    }

    public /* synthetic */ x0(mf mfVar, jo.h hVar) {
        this(mfVar);
    }

    public final void a(ud.u0 u0Var) {
        jo.p.h(u0Var, "bindModel");
        this.f49431a.T(u0Var);
        AppCompatImageView appCompatImageView = this.f49431a.H;
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        int d10 = (int) (this.f49431a.u().getContext().getResources().getDisplayMetrics().density * u0Var.d());
        layoutParams.height = d10;
        layoutParams.width = d10;
        appCompatImageView.setLayoutParams(layoutParams);
        Integer h10 = u0Var.h();
        if (h10 != null) {
            this.f49431a.J.setStarCountAndApply(h10.intValue());
        }
        ud.x0 c10 = u0Var.c();
        if (c10 != null) {
            this.f49431a.C.a(c10);
        }
    }
}
