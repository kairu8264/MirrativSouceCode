package ec;

import ac.z5;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.u4;

/* loaded from: classes2.dex */
public final class l extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f30433b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f30434c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final z5 f30435a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_floating_comment_image_and_message, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new l((z5) e10, null);
        }
    }

    public l(z5 z5Var) {
        super(z5Var.u());
        this.f30435a = z5Var;
    }

    public /* synthetic */ l(z5 z5Var, jo.h hVar) {
        this(z5Var);
    }

    public final void a(u4 u4Var) {
        jo.p.h(u4Var, "bindModel");
        z5 z5Var = this.f30435a;
        z5Var.B.setTextColor(c3.a.d(z5Var.u().getContext(), xb.l.C));
        this.f30435a.B.setText(u4Var.a());
        this.f30435a.C.setImageResource(xb.q.ic_nortifi_thanks);
        this.f30435a.o();
    }
}
