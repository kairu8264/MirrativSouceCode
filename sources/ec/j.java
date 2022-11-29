package ec;

import ac.b6;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.glide.GlideApp;
import ud.d4;

/* loaded from: classes2.dex */
public final class j extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f30427b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f30428c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final b6 f30429a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_floating_comment_live_comment, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new j((b6) e10, null);
        }
    }

    public j(b6 b6Var) {
        super(b6Var.u());
        this.f30429a = b6Var;
    }

    public /* synthetic */ j(b6 b6Var, jo.h hVar) {
        this(b6Var);
    }

    public final void a(d4 d4Var) {
        jo.p.h(d4Var, "bindModel");
        this.f30429a.F.setText(d4Var.c());
        this.f30429a.C.setText(d4Var.a());
        if (d4Var.d() == 123456) {
            GlideApp.with(this.f30429a.D).load(Integer.valueOf(xb.n.f59962i0)).apply((e8.a<?>) new e8.h().circleCrop()).into(this.f30429a.D);
        } else {
            AppCompatImageView appCompatImageView = this.f30429a.D;
            jo.p.g(appCompatImageView, "binding.profileImage");
            td.a.i(appCompatImageView, d4Var.f());
        }
        if (d4Var.g().length() == 0) {
            AppCompatImageView appCompatImageView2 = this.f30429a.B;
            jo.p.g(appCompatImageView2, "binding.badgeImage");
            appCompatImageView2.setVisibility(4);
        } else {
            AppCompatImageView appCompatImageView3 = this.f30429a.B;
            jo.p.g(appCompatImageView3, "binding.badgeImage");
            appCompatImageView3.setVisibility(0);
            AppCompatImageView appCompatImageView4 = this.f30429a.B;
            jo.p.g(appCompatImageView4, "binding.badgeImage");
            td.a.f(appCompatImageView4, d4Var.g());
        }
        this.f30429a.o();
    }
}
