package z9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import s9.s0;
import yd.g1;

/* loaded from: classes.dex */
public final class n extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f62859b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f62860c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final s0 f62861a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final n a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), q9.h.view_holder_gift_ranking_expand, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new n((s0) e10, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f62862w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(1);
            this.f62862w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.a<wn.v> aVar = this.f62862w;
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

    public n(s0 s0Var) {
        super(s0Var.u());
        this.f62861a = s0Var;
    }

    public /* synthetic */ n(s0 s0Var, jo.h hVar) {
        this(s0Var);
    }

    public final void a(m mVar, io.a<wn.v> aVar) {
        jo.p.h(mVar, "bindModel");
        this.f62861a.T(mVar);
        AppCompatTextView appCompatTextView = this.f62861a.B;
        jo.p.g(appCompatTextView, "binding.rankingExpandTextView");
        g1.a(appCompatTextView, new b(aVar));
    }
}
