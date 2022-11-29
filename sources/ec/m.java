package ec;

import ac.d6;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.t4;

/* loaded from: classes2.dex */
public final class m extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f30436b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f30437c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final d6 f30438a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_floating_comment_text, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new m((d6) e10, null);
        }
    }

    public m(d6 d6Var) {
        super(d6Var.u());
        this.f30438a = d6Var;
    }

    public /* synthetic */ m(d6 d6Var, jo.h hVar) {
        this(d6Var);
    }

    public final void a(t4 t4Var) {
        jo.p.h(t4Var, "bindModel");
        this.f30438a.C.setText(t4Var.a());
        this.f30438a.o();
    }
}
