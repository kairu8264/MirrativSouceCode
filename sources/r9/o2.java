package r9;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.u3;

/* loaded from: classes.dex */
public final class o2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50441b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f50442c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final s9.k1 f50443a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final o2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), q9.h.view_holder_shooter_parts_category_title, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new o2((s9.k1) e10, null);
        }
    }

    public o2(s9.k1 k1Var) {
        super(k1Var.u());
        this.f50443a = k1Var;
    }

    public /* synthetic */ o2(s9.k1 k1Var, jo.h hVar) {
        this(k1Var);
    }

    public final void a(u3 u3Var) {
        jo.p.h(u3Var, "bindModel");
        s9.k1 k1Var = this.f50443a;
        k1Var.B.setText(k1Var.u().getContext().getString(u3Var.a()));
    }
}
