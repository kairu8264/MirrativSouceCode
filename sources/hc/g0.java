package hc;

import ac.t6;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class g0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f35114b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f35115c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final t6 f35116a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g0 a(androidx.lifecycle.u uVar, ViewGroup viewGroup) {
            jo.p.h(uVar, "lifecycleOwner");
            jo.p.h(viewGroup, "parent");
            t6 T = t6.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            T.M(uVar);
            jo.p.g(T, "inflate(\n               …ecycleOwner\n            }");
            return new g0(T, null);
        }
    }

    public g0(t6 t6Var) {
        super(t6Var.u());
        this.f35116a = t6Var;
    }

    public /* synthetic */ g0(t6 t6Var, jo.h hVar) {
        this(t6Var);
    }

    public final void a(y yVar) {
        jo.p.h(yVar, "bindModel");
        this.f35116a.V(yVar);
        this.f35116a.o();
    }
}
