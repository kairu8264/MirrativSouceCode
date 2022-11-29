package r9;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class r2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50483b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f50484c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final s9.q1 f50485a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final r2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), q9.h.view_shop_parts, viewGroup, false);
            jo.p.g(e10, "inflate(LayoutInflater.f…hop_parts, parent, false)");
            return new r2((s9.q1) e10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(s9.q1 q1Var) {
        super(q1Var.u());
        jo.p.h(q1Var, "binding");
        this.f50485a = q1Var;
    }

    public final void a(ud.q qVar) {
        jo.p.h(qVar, "bindModel");
        this.f50485a.T(qVar);
        this.f50485a.o();
    }
}
