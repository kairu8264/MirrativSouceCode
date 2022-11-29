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
import t8.i1;
import v7.y;
import wn.v;
import yd.g1;

/* loaded from: classes.dex */
public final class n extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56951b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f56952c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final i1 f56953a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final n a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), f1.view_holder_group_shot_gallery_small, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new n((i1) e10, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e f56954w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l f56955x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ n f56956y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, l lVar, n nVar) {
            super(1);
            this.f56954w = eVar;
            this.f56955x = lVar;
            this.f56956y = nVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            e eVar = this.f56954w;
            if (eVar != null) {
                String id2 = this.f56955x.getId();
                AppCompatImageView appCompatImageView = this.f56956y.f56953a.J;
                String N = c0.N(this.f56956y.f56953a.J);
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
        public final /* synthetic */ e f56957w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l f56958x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e eVar, l lVar) {
            super(1);
            this.f56957w = eVar;
            this.f56958x = lVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            e eVar = this.f56957w;
            if (eVar != null) {
                eVar.a(this.f56958x.h());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    public n(i1 i1Var) {
        super(i1Var.u());
        this.f56953a = i1Var;
    }

    public /* synthetic */ n(i1 i1Var, jo.h hVar) {
        this(i1Var);
    }

    public final void b(l lVar, e eVar) {
        jo.p.h(lVar, "bindModel");
        this.f56953a.T(lVar);
        GlideApp.with(this.f56953a.B).load(Integer.valueOf(d1.pick_shadow)).apply((e8.a<?>) e8.h.bitmapTransform(new m7.f(new v7.i(), new y(de.m.a(this, 12))))).into(this.f56953a.B);
        this.f56953a.E.setVisibility(lVar.j() ? 0 : 8);
        if (!lVar.a().isEmpty()) {
            this.f56953a.G.h(lVar.a(), de.m.a(this, 12), de.m.a(this, 8));
        }
        CardView cardView = this.f56953a.C;
        jo.p.g(cardView, "binding.cardView");
        g1.a(cardView, new b(eVar, lVar, this));
        AppCompatImageView appCompatImageView = this.f56953a.L;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        g1.a(appCompatImageView, new c(eVar, lVar));
    }
}
