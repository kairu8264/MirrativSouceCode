package r9;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class l extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50241b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f50242c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final s9.q0 f50243a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), q9.h.view_holder_closet_parts_space, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new l((s9.q0) e10, null);
        }
    }

    public l(s9.q0 q0Var) {
        super(q0Var.u());
        this.f50243a = q0Var;
    }

    public /* synthetic */ l(s9.q0 q0Var, jo.h hVar) {
        this(q0Var);
    }

    public final void a(float f10, jf.e eVar) {
        jo.p.h(eVar, "viewSize");
        int c10 = (int) (eVar.c() * f10);
        this.f50243a.B.setLayoutParams(new ViewGroup.LayoutParams(c10, c10));
    }
}
