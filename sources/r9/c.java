package r9;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class c extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50136b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f50137c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final s9.m0 f50138a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), q9.h.view_holder_closet_color_picker, viewGroup, false);
            jo.p.g(e10, "inflate(LayoutInflater.f…or_picker, parent, false)");
            return new c((s9.m0) e10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s9.m0 m0Var) {
        super(m0Var.u());
        jo.p.h(m0Var, "binding");
        this.f50138a = m0Var;
    }

    public final void a(ud.o oVar) {
        jo.p.h(oVar, "bindModel");
        this.f50138a.T(oVar);
        this.f50138a.o();
    }
}
