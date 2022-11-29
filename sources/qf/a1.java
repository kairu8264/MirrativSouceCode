package qf;

import ae.uf;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class a1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49034b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49035c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final uf f49036a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final a1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_landing_page_description, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new a1((uf) e10, null);
        }
    }

    public a1(uf ufVar) {
        super(ufVar.u());
        this.f49036a = ufVar;
    }

    public /* synthetic */ a1(uf ufVar, jo.h hVar) {
        this(ufVar);
    }

    public final void a(ud.n1 n1Var) {
        jo.p.h(n1Var, "bindModel");
        this.f49036a.T(n1Var);
        this.f49036a.o();
    }
}
