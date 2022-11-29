package qf;

import ae.ih;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class b2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49061b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49062c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ih f49063a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_player_collab_user, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new b2((ih) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49064w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(1);
            this.f49064w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49064w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public b2(ih ihVar) {
        super(ihVar.u());
        this.f49063a = ihVar;
    }

    public /* synthetic */ b2(ih ihVar, jo.h hVar) {
        this(ihVar);
    }

    public final void a(ud.t tVar, io.a<wn.v> aVar) {
        jo.p.h(tVar, "bindModel");
        jo.p.h(aVar, "clickListener");
        this.f49063a.B.setImageResource(tVar.a());
        this.f49063a.C.setImageResource(tVar.b());
        AppCompatImageView appCompatImageView = this.f49063a.D;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        de.f.e(appCompatImageView, tVar.d(), Integer.valueOf(nd.y0.X1));
        AppCompatImageView appCompatImageView2 = this.f49063a.D;
        jo.p.g(appCompatImageView2, "binding.profileImageView");
        yd.g1.a(appCompatImageView2, new b(aVar));
        this.f49063a.o();
    }
}
