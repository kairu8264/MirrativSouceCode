package y8;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import jo.p;
import r8.f1;
import t8.q1;
import ud.i2;

/* loaded from: classes.dex */
public final class f extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61297b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f61298c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final q1 f61299a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), f1.view_holder_my_app_has_outline_add, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new f((q1) e10, null);
        }
    }

    public f(q1 q1Var) {
        super(q1Var.u());
        this.f61299a = q1Var;
    }

    public /* synthetic */ f(q1 q1Var, jo.h hVar) {
        this(q1Var);
    }

    public final void a(i2 i2Var) {
        p.h(i2Var, "bindModel");
        this.f61299a.E.setVisibility(i2Var.a() ? 0 : 8);
    }
}
