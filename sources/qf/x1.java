package qf;

import ae.ch;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class x1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49432b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49433c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ch f49434a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final x1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_no_contents, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new x1((ch) e10, null);
        }
    }

    public x1(ch chVar) {
        super(chVar.u());
        this.f49434a = chVar;
    }

    public /* synthetic */ x1(ch chVar, jo.h hVar) {
        this(chVar);
    }

    public final void a(ud.o2 o2Var) {
        jo.p.h(o2Var, "bindModel");
        this.f49434a.T(o2Var);
        this.f49434a.u().setPadding(o2Var.e(), o2Var.f(), o2Var.d(), o2Var.c());
    }
}
