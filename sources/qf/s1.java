package qf;

import ae.sg;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class s1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49375b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49376c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final sg f49377a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_message, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new s1((sg) e10, null);
        }
    }

    public s1(sg sgVar) {
        super(sgVar.u());
        this.f49377a = sgVar;
    }

    public /* synthetic */ s1(sg sgVar, jo.h hVar) {
        this(sgVar);
    }

    public final void a(ud.g2 g2Var) {
        jo.p.h(g2Var, "bindModel");
        this.f49377a.T(g2Var);
    }
}
