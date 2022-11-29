package r9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class m extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50250b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f50251c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final s9.o0 f50252a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), q9.h.view_holder_closet_parts, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new m((s9.o0) e10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50253w;

        public b(io.a aVar) {
            this.f50253w = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            jo.p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            io.a aVar = this.f50253w;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f50254w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a<wn.v> aVar) {
            super(1);
            this.f50254w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.a<wn.v> aVar = this.f50254w;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s9.o0 o0Var) {
        super(o0Var.u());
        jo.p.h(o0Var, "binding");
        this.f50252a = o0Var;
    }

    public final void a(ud.q qVar, float f10, jf.e eVar, io.a<wn.v> aVar, io.a<wn.v> aVar2) {
        jo.p.h(qVar, "bindModel");
        jo.p.h(eVar, "viewSize");
        int c10 = (int) (eVar.c() * f10);
        this.f50252a.E.setLayoutParams(new ViewGroup.LayoutParams(c10, c10));
        this.f50252a.T(qVar);
        this.f50252a.u().setAlpha(qVar.y() ? 0.5f : 1.0f);
        View u10 = this.f50252a.u();
        jo.p.g(u10, "binding.root");
        yd.g1.a(u10, new c(aVar));
        View u11 = this.f50252a.u();
        jo.p.g(u11, "binding.root");
        if (!o3.c0.V(u11) || u11.isLayoutRequested()) {
            u11.addOnLayoutChangeListener(new b(aVar2));
        } else if (aVar2 != null) {
            aVar2.invoke();
        }
        this.f50252a.o();
    }
}
