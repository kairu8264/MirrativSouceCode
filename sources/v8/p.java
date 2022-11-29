package v8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.glide.GlideApp;
import jo.q;
import o3.c0;
import r8.d1;
import r8.f1;
import t8.k1;
import v7.y;
import wn.v;
import yd.g1;

/* loaded from: classes.dex */
public final class p extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56965b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f56966c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final k1 f56967a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), f1.view_holder_group_shot_gallery_vertical, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new p((k1) e10, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e f56968w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l f56969x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ p f56970y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, l lVar, p pVar) {
            super(1);
            this.f56968w = eVar;
            this.f56969x = lVar;
            this.f56970y = pVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            e eVar = this.f56968w;
            if (eVar != null) {
                String id2 = this.f56969x.getId();
                AppCompatImageView appCompatImageView = this.f56970y.f56967a.K;
                String N = c0.N(this.f56970y.f56967a.K);
                jo.p.e(N);
                eVar.b(id2, new n3.d<>(appCompatImageView, N));
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e f56971w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l f56972x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e eVar, l lVar) {
            super(1);
            this.f56971w = eVar;
            this.f56972x = lVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            e eVar = this.f56971w;
            if (eVar != null) {
                eVar.a(this.f56972x.h());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    public p(k1 k1Var) {
        super(k1Var.u());
        this.f56967a = k1Var;
    }

    public /* synthetic */ p(k1 k1Var, jo.h hVar) {
        this(k1Var);
    }

    public final void b(l lVar, e eVar) {
        jo.p.h(lVar, "bindModel");
        this.f56967a.T(lVar);
        GlideApp.with(this.f56967a.C).load(Integer.valueOf(d1.pick_shadow)).apply((e8.a<?>) e8.h.bitmapTransform(new m7.f(new v7.i(), new y(de.m.a(this, 12))))).into(this.f56967a.C);
        this.f56967a.F.setVisibility(lVar.j() ? 0 : 8);
        if (!lVar.a().isEmpty()) {
            this.f56967a.H.h(lVar.a(), de.m.a(this, 12), de.m.a(this, 8));
        }
        CardView cardView = this.f56967a.D;
        jo.p.g(cardView, "binding.cardView");
        g1.a(cardView, new b(eVar, lVar, this));
        AppCompatImageView appCompatImageView = this.f56967a.M;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        g1.a(appCompatImageView, new c(eVar, lVar));
    }
}
