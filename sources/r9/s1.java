package r9;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class s1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50488b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f50489c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final s9.a1 f50490a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), q9.h.view_holder_parts_category, viewGroup, false);
            jo.p.g(e10, "inflate(LayoutInflater.f…_category, parent, false)");
            return new s1((s9.a1) e10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(s9.a1 a1Var) {
        super(a1Var.u());
        jo.p.h(a1Var, "binding");
        this.f50490a = a1Var;
    }

    public final void a(jf.l0 l0Var) {
        jo.p.h(l0Var, "bindModel");
        this.f50490a.T(l0Var);
        this.f50490a.o();
    }
}
