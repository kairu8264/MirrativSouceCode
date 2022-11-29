package qf;

import ae.ad;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class q extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49335b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49336c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ad f49337a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_emomo_collab_user, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new q((ad) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49338w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(1);
            this.f49338w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49338w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public q(ad adVar) {
        super(adVar.u());
        this.f49337a = adVar;
    }

    public /* synthetic */ q(ad adVar, jo.h hVar) {
        this(adVar);
    }

    public final void a(ud.z zVar, io.a<wn.v> aVar) {
        jo.p.h(zVar, "bindModel");
        jo.p.h(aVar, "clickListener");
        this.f49337a.B.setImageResource(zVar.a());
        AppCompatImageView appCompatImageView = this.f49337a.E;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        td.a.c(appCompatImageView, zVar.b());
        if (zVar.c()) {
            this.f49337a.D.setVisibility(0);
            this.f49337a.C.setVisibility(0);
        } else {
            this.f49337a.D.setVisibility(8);
            this.f49337a.C.setVisibility(8);
        }
        AppCompatImageView appCompatImageView2 = this.f49337a.E;
        jo.p.g(appCompatImageView2, "binding.profileImageView");
        yd.g1.a(appCompatImageView2, new b(aVar));
        this.f49337a.o();
    }
}
