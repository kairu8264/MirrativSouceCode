package y8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import jo.p;
import l7.k;
import l7.n;
import m7.l;
import r8.f1;
import r8.g1;
import t8.s1;
import v7.i;
import v7.y;

/* loaded from: classes.dex */
public final class h extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61307b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f61308c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final s1 f61309a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), f1.view_holder_my_app_has_outline, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new h((s1) e10, null);
        }
    }

    public h(s1 s1Var) {
        super(s1Var.u());
        this.f61309a = s1Var;
    }

    public /* synthetic */ h(s1 s1Var, jo.h hVar) {
        this(s1Var);
    }

    public final void a(g gVar) {
        p.h(gVar, "bindModel");
        GlideRequest<Drawable> optionalTransform = GlideApp.with(this.f61309a.D).load(gVar.b()).placeholder(g1.f49913e).optionalTransform(k.class, (l) new n(new i()));
        AppCompatImageView appCompatImageView = this.f61309a.D;
        p.g(appCompatImageView, "binding.appImageView");
        GlideRequest<Drawable> optionalTransform2 = optionalTransform.optionalTransform(k.class, (l) new n(new y(de.n.b(appCompatImageView, 10)))).optionalTransform((l<Bitmap>) new i());
        AppCompatImageView appCompatImageView2 = this.f61309a.D;
        p.g(appCompatImageView2, "binding.appImageView");
        optionalTransform2.optionalTransform((l<Bitmap>) new y(de.n.b(appCompatImageView2, 10))).into(this.f61309a.D);
        this.f61309a.G.setVisibility(gVar.e() ? 0 : 8);
        if (gVar.d()) {
            this.f61309a.E.setVisibility(0);
            this.f61309a.E.r();
            this.f61309a.F.setVisibility(0);
            this.f61309a.F.r();
        } else {
            this.f61309a.E.setVisibility(8);
            this.f61309a.E.h();
            this.f61309a.F.setVisibility(8);
            this.f61309a.F.h();
        }
        if (gVar.c()) {
            this.f61309a.C.setAlpha(1.0f);
            this.f61309a.F.setAlpha(1.0f);
            return;
        }
        this.f61309a.C.setAlpha(0.4f);
        this.f61309a.F.setAlpha(0.4f);
    }
}
