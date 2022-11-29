package qf;

import ae.uh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class l2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49286b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49287c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final uh f49288a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_profile_image, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new l2((uh) e10, null);
        }
    }

    public l2(uh uhVar) {
        super(uhVar.u());
        this.f49288a = uhVar;
    }

    public /* synthetic */ l2(uh uhVar, jo.h hVar) {
        this(uhVar);
    }

    public final void a(ud.f3 f3Var) {
        jo.p.h(f3Var, "bindModel");
        AppCompatImageView appCompatImageView = this.f49288a.C;
        jo.p.g(appCompatImageView, "binding.imageView");
        td.a.c(appCompatImageView, f3Var.b());
        if (f3Var.a() == null) {
            this.f49288a.B.setVisibility(8);
        } else {
            this.f49288a.B.setBackground(f3Var.a());
        }
    }
}
