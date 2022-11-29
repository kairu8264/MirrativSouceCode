package qf;

import ae.od;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.q4;

/* loaded from: classes3.dex */
public final class z extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49459b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49460c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final od f49461a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final z a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_emomo_comment_linked_live, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new z((od) e10, null);
        }
    }

    public z(od odVar) {
        super(odVar.u());
        this.f49461a = odVar;
    }

    public /* synthetic */ z(od odVar, jo.h hVar) {
        this(odVar);
    }

    public final void a(q4 q4Var) {
        jo.p.h(q4Var, "bindModel");
        AppCompatTextView appCompatTextView = this.f49461a.C;
        appCompatTextView.setTextColor(c3.a.d(appCompatTextView.getContext(), q4Var.j()));
        this.f49461a.C.setText(q4Var.a());
        this.f49461a.E.setImageResource(q4Var.k());
        this.f49461a.o();
    }
}
