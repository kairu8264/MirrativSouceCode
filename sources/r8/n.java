package r8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.glide.GlideApp;

/* loaded from: classes.dex */
public final class n extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49964b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49965c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final t8.o0 f49966a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final n a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            t8.o0 T = t8.o0.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new n(T, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o f49967w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ v8.a f49968x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ n f49969y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar, v8.a aVar, n nVar) {
            super(1);
            this.f49967w = oVar;
            this.f49968x = aVar;
            this.f49969y = nVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            o oVar = this.f49967w;
            if (oVar != null) {
                String id2 = this.f49968x.getId();
                AppCompatImageView appCompatImageView = this.f49969y.f49966a.I;
                String N = o3.c0.N(this.f49969y.f49966a.I);
                jo.p.e(N);
                oVar.b(id2, new n3.d<>(appCompatImageView, N));
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o f49970w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ v8.a f49971x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o oVar, v8.a aVar) {
            super(1);
            this.f49970w = oVar;
            this.f49971x = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            o oVar = this.f49970w;
            if (oVar != null) {
                oVar.a(this.f49971x.g());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public n(t8.o0 o0Var) {
        super(o0Var.u());
        this.f49966a = o0Var;
    }

    public /* synthetic */ n(t8.o0 o0Var, jo.h hVar) {
        this(o0Var);
    }

    public final void b(v8.a aVar, o oVar) {
        jo.p.h(aVar, "bindModel");
        this.f49966a.V(aVar);
        GlideApp.with(this.f49966a.B).load(Integer.valueOf(d1.pick_shadow)).apply((e8.a<?>) e8.h.bitmapTransform(new m7.f(new v7.i(), new v7.y(de.m.a(this, 12))))).into(this.f49966a.B);
        this.f49966a.D.setVisibility(aVar.i() ? 0 : 8);
        if (!aVar.a().isEmpty()) {
            this.f49966a.F.h(aVar.a(), de.m.a(this, 12), de.m.a(this, 8));
        }
        View u10 = this.f49966a.u();
        jo.p.g(u10, "binding.root");
        yd.g1.a(u10, new b(oVar, aVar, this));
        AppCompatImageView appCompatImageView = this.f49966a.K;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        yd.g1.a(appCompatImageView, new c(oVar, aVar));
    }
}
