package qf;

import ae.k7;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.glide.GlideApp;
import oq.a;
import ud.d4;
import ud.f4;

/* loaded from: classes3.dex */
public final class j extends RecyclerView.e0 implements oq.a {

    /* renamed from: x  reason: collision with root package name */
    public static final a f49234x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f49235y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final k7 f49236w;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.item_commentlist_cast, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new j((k7) e10, null);
        }
    }

    public j(k7 k7Var) {
        super(k7Var.u());
        this.f49236w = k7Var;
    }

    public /* synthetic */ j(k7 k7Var, jo.h hVar) {
        this(k7Var);
    }

    public final void a(d4 d4Var) {
        jo.p.h(d4Var, "bindModel");
        this.f49236w.B.setVisibility(8);
        this.f49236w.C.u().setVisibility(0);
        this.f49236w.C.G.setVisibility(0);
        this.f49236w.C.G.setText(d4Var.c());
        this.f49236w.C.D.setTypeface(null, 0);
        this.f49236w.C.D.setText(d4Var.a());
        if (d4Var.d() == 123456) {
            GlideApp.with(this.f49236w.C.F).load(Integer.valueOf(nd.y0.f42251g2)).apply((e8.a<?>) new e8.h().circleCrop()).into(this.f49236w.C.F);
        } else {
            AppCompatImageView appCompatImageView = this.f49236w.C.F;
            jo.p.g(appCompatImageView, "binding.commentNotSelectable.profileImage");
            de.f.e(appCompatImageView, d4Var.f(), Integer.valueOf(nd.y0.U1));
        }
        if (d4Var.d() == 123456) {
            this.f49236w.C.B.setVisibility(0);
            this.f49236w.C.B.setImageResource(nd.y0.ic_official_badge);
        } else if (TextUtils.isEmpty(d4Var.g())) {
            this.f49236w.C.B.setVisibility(4);
        } else {
            this.f49236w.C.B.setVisibility(0);
            of.f fVar = of.f.f45394a;
            Context context = this.f49236w.u().getContext();
            jo.p.g(context, "binding.root.context");
            fVar.c(context, d4Var.g(), this.f49236w.C.B);
        }
        boolean z10 = d4Var instanceof f4;
        if (z10 && ((f4) d4Var).m()) {
            this.f49236w.C.E.setVisibility(8);
            k7 k7Var = this.f49236w;
            k7Var.C.G.setTextColor(c3.a.d(k7Var.u().getContext(), nd.w0.U0));
        } else if (z10 && ((f4) d4Var).k()) {
            this.f49236w.C.E.setVisibility(0);
            k7 k7Var2 = this.f49236w;
            k7Var2.C.G.setTextColor(c3.a.d(k7Var2.u().getContext(), nd.w0.f42241s0));
        } else if (z10 && ((f4) d4Var).l()) {
            this.f49236w.C.E.setVisibility(0);
            k7 k7Var3 = this.f49236w;
            k7Var3.C.G.setTextColor(c3.a.d(k7Var3.u().getContext(), nd.w0.W));
        } else {
            this.f49236w.C.E.setVisibility(8);
            k7 k7Var4 = this.f49236w;
            k7Var4.C.G.setTextColor(c3.a.d(k7Var4.u().getContext(), nd.w0.M0));
        }
        this.f49236w.o();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
