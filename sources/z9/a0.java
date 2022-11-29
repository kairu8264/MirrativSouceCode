package z9;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import s9.w0;

/* loaded from: classes.dex */
public final class a0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f62800b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f62801c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final w0 f62802a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final a0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), q9.h.view_holder_gift_ranking_term, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new a0((w0) e10, null);
        }
    }

    public a0(w0 w0Var) {
        super(w0Var.u());
        this.f62802a = w0Var;
    }

    public /* synthetic */ a0(w0 w0Var, jo.h hVar) {
        this(w0Var);
    }

    public final void a(z zVar) {
        jo.p.h(zVar, "bindModel");
        this.f62802a.T(zVar);
    }
}
