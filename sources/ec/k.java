package ec;

import ac.z5;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.q4;

/* loaded from: classes2.dex */
public final class k extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f30430b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f30431c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final z5 f30432a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_floating_comment_image_and_message, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new k((z5) e10, null);
        }
    }

    public k(z5 z5Var) {
        super(z5Var.u());
        this.f30432a = z5Var;
    }

    public /* synthetic */ k(z5 z5Var, jo.h hVar) {
        this(z5Var);
    }

    public final void a(q4 q4Var) {
        jo.p.h(q4Var, "bindModel");
        z5 z5Var = this.f30432a;
        z5Var.B.setTextColor(c3.a.d(z5Var.u().getContext(), xb.l.f59943n));
        this.f30432a.B.setText(q4Var.a());
        this.f30432a.C.setImageResource(xb.q.f60065e);
        this.f30432a.o();
    }
}
