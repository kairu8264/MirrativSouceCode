package r9;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.t3;

/* loaded from: classes.dex */
public final class n2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50435b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f50436c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final s9.i1 f50437a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final n2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), q9.h.view_holder_shooter_parts_category_item, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new n2((s9.i1) e10, null);
        }
    }

    public n2(s9.i1 i1Var) {
        super(i1Var.u());
        this.f50437a = i1Var;
    }

    public /* synthetic */ n2(s9.i1 i1Var, jo.h hVar) {
        this(i1Var);
    }

    public final void a(t3 t3Var) {
        jo.p.h(t3Var, "bindModel");
        this.f50437a.T(t3Var);
        this.f50437a.o();
    }
}
