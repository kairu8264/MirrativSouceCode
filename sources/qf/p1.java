package qf;

import ae.mg;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.MultipleUserView;
import java.util.List;

/* loaded from: classes3.dex */
public final class p1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49325b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49326c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final mg f49327a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_live_history, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new p1((mg) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49328w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(1);
            this.f49328w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49328w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public p1(mg mgVar) {
        super(mgVar.u());
        this.f49327a = mgVar;
    }

    public /* synthetic */ p1(mg mgVar, jo.h hVar) {
        this(mgVar);
    }

    public static final void d(io.a aVar, View view) {
        jo.p.h(aVar, "$infoClickListener");
        aVar.invoke();
    }

    public static final void f(io.l lVar, p1 p1Var, View view) {
        jo.p.h(lVar, "$menuClickListener");
        jo.p.h(p1Var, "this$0");
        AppCompatImageView appCompatImageView = p1Var.f49327a.P;
        jo.p.g(appCompatImageView, "binding.menuImageView");
        lVar.invoke(appCompatImageView);
    }

    public final void c(ud.a2 a2Var, io.a<wn.v> aVar, final io.a<wn.v> aVar2, final io.l<? super View, wn.v> lVar) {
        List<String> r02;
        jo.p.h(a2Var, "bindModel");
        jo.p.h(aVar, "itemClickListener");
        jo.p.h(aVar2, "infoClickListener");
        jo.p.h(lVar, "menuClickListener");
        this.f49327a.T(a2Var);
        this.f49327a.N.b(a2Var.f());
        this.f49327a.u().setEnabled(a2Var.p());
        View u10 = this.f49327a.u();
        jo.p.g(u10, "binding.root");
        yd.g1.a(u10, new b(aVar));
        this.f49327a.K.setOnClickListener(new View.OnClickListener() { // from class: qf.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p1.d(io.a.this, view);
            }
        });
        this.f49327a.P.setOnClickListener(new View.OnClickListener() { // from class: qf.o1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p1.f(io.l.this, this, view);
            }
        });
        if (a2Var.s()) {
            MultipleUserView multipleUserView = this.f49327a.G;
            jo.p.g(multipleUserView, "binding.gifterView");
            multipleUserView.setVisibility(0);
            MultipleUserView multipleUserView2 = this.f49327a.G;
            if (a2Var.n() >= 4) {
                r02 = xn.a0.o0(xn.a0.r0(a2Var.b()), xn.r.d(""));
            } else {
                r02 = xn.a0.r0(a2Var.b());
            }
            multipleUserView2.h(r02, de.m.a(this, 14), de.m.a(this, 4));
        } else {
            MultipleUserView multipleUserView3 = this.f49327a.G;
            jo.p.g(multipleUserView3, "binding.gifterView");
            multipleUserView3.setVisibility(8);
        }
        this.f49327a.o();
    }
}
