package qf;

import ae.ei;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;
import j6.i;
import ud.k3;

/* loaded from: classes3.dex */
public final class p2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49329b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49330c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ei f49331a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_shooter_candidate_matching, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new p2((ei) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49332w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(1);
            this.f49332w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49332w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49333w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a<wn.v> aVar) {
            super(1);
            this.f49333w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49333w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49334w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a<wn.v> aVar) {
            super(1);
            this.f49334w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49334w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public p2(ei eiVar) {
        super(eiVar.u());
        this.f49331a = eiVar;
    }

    public /* synthetic */ p2(ei eiVar, jo.h hVar) {
        this(eiVar);
    }

    public final void a(androidx.lifecycle.u uVar, k3 k3Var, io.a<wn.v> aVar, io.a<wn.v> aVar2, io.a<wn.v> aVar3) {
        jo.p.h(uVar, "viewLifeCycleOwner");
        jo.p.h(k3Var, "bindModel");
        jo.p.h(aVar, "onClickRequestMatching");
        jo.p.h(aVar2, "onClickCancelMatching");
        jo.p.h(aVar3, "onClickAcceptMatching");
        this.f49331a.M(uVar);
        this.f49331a.T(k3Var);
        this.f49331a.E.g(k3Var.b());
        AppCompatImageView appCompatImageView = this.f49331a.G;
        jo.p.g(appCompatImageView, "binding.cancelMatchingButtonView");
        x5.a.a(appCompatImageView.getContext()).c(new i.a(appCompatImageView.getContext()).b(Integer.valueOf(nd.y0.shooter_matching_recruiting)).l(appCompatImageView).a());
        RoundedButtonView roundedButtonView = this.f49331a.I;
        jo.p.g(roundedButtonView, "binding.requestMatchingButtonView");
        yd.g1.a(roundedButtonView, new b(aVar));
        AppCompatImageView appCompatImageView2 = this.f49331a.G;
        jo.p.g(appCompatImageView2, "binding.cancelMatchingButtonView");
        yd.g1.a(appCompatImageView2, new c(aVar2));
        RoundedButtonView roundedButtonView2 = this.f49331a.B;
        jo.p.g(roundedButtonView2, "binding.acceptMatchingButtonView");
        yd.g1.a(roundedButtonView2, new d(aVar3));
    }
}
