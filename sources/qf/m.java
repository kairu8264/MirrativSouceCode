package qf;

import ae.m7;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.q4;

/* loaded from: classes3.dex */
public final class m extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49289b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49290c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final m7 f49291a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.item_commentlist_live_linked, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new m((m7) e10, null);
        }
    }

    public m(m7 m7Var) {
        super(m7Var.u());
        this.f49291a = m7Var;
    }

    public /* synthetic */ m(m7 m7Var, jo.h hVar) {
        this(m7Var);
    }

    public final void a(q4 q4Var) {
        jo.p.h(q4Var, "bindModel");
        this.f49291a.B.setTypeface(null, 0);
        this.f49291a.B.setText(q4Var.a());
        this.f49291a.o();
    }
}
