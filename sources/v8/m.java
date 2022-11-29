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
import t8.g1;
import v7.y;
import wn.v;

/* loaded from: classes.dex */
public final class m extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56943b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f56944c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final g1 f56945a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), f1.view_holder_group_shot_gallery_large, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new m((g1) e10, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e f56946w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l f56947x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ m f56948y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, l lVar, m mVar) {
            super(1);
            this.f56946w = eVar;
            this.f56947x = lVar;
            this.f56948y = mVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            e eVar = this.f56946w;
            if (eVar != null) {
                String id2 = this.f56947x.getId();
                AppCompatImageView appCompatImageView = this.f56948y.f56945a.J;
                String N = c0.N(this.f56948y.f56945a.J);
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
        public final /* synthetic */ e f56949w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l f56950x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e eVar, l lVar) {
            super(1);
            this.f56949w = eVar;
            this.f56950x = lVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            e eVar = this.f56949w;
            if (eVar != null) {
                eVar.a(this.f56950x.h());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    public m(g1 g1Var) {
        super(g1Var.u());
        this.f56945a = g1Var;
    }

    public /* synthetic */ m(g1 g1Var, jo.h hVar) {
        this(g1Var);
    }

    public final void b(l lVar, e eVar) {
        jo.p.h(lVar, "bindModel");
        this.f56945a.T(lVar);
        GlideApp.with(this.f56945a.B).load(Integer.valueOf(d1.pick_shadow)).apply((e8.a<?>) e8.h.bitmapTransform(new m7.f(new v7.i(), new y(de.m.a(this, 12))))).into(this.f56945a.B);
        this.f56945a.E.setVisibility(lVar.j() ? 0 : 8);
        if (!lVar.a().isEmpty()) {
            this.f56945a.G.h(lVar.a(), de.m.a(this, 12), de.m.a(this, 8));
        }
        CardView cardView = this.f56945a.C;
        jo.p.g(cardView, "binding.cardView");
        yd.g1.a(cardView, new b(eVar, lVar, this));
        AppCompatImageView appCompatImageView = this.f56945a.L;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        yd.g1.a(appCompatImageView, new c(eVar, lVar));
    }
}
