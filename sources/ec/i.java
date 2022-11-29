package ec;

import ac.x5;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.p4;

/* loaded from: classes2.dex */
public final class i extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f30424b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f30425c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final x5 f30426a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_floating_comment_gift, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new i((x5) e10, null);
        }
    }

    public i(x5 x5Var) {
        super(x5Var.u());
        this.f30426a = x5Var;
    }

    public /* synthetic */ i(x5 x5Var, jo.h hVar) {
        this(x5Var);
    }

    public final void a(p4 p4Var) {
        jo.p.h(p4Var, "bindModel");
        this.f30426a.C.setText(p4Var.k());
        AppCompatImageView appCompatImageView = this.f30426a.D;
        jo.p.g(appCompatImageView, "binding.profileImage");
        td.a.i(appCompatImageView, p4Var.f());
        if (p4Var.g().length() == 0) {
            AppCompatImageView appCompatImageView2 = this.f30426a.B;
            jo.p.g(appCompatImageView2, "binding.badgeImage");
            appCompatImageView2.setVisibility(4);
        } else {
            AppCompatImageView appCompatImageView3 = this.f30426a.B;
            jo.p.g(appCompatImageView3, "binding.badgeImage");
            appCompatImageView3.setVisibility(0);
            AppCompatImageView appCompatImageView4 = this.f30426a.B;
            jo.p.g(appCompatImageView4, "binding.badgeImage");
            td.a.f(appCompatImageView4, p4Var.g());
        }
        this.f30426a.o();
    }
}
