package qf;

import ae.gf;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class t0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49384b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49385c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final gf f49386a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final t0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_gift_gacha_user, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new t0((gf) e10, null);
        }
    }

    public t0(gf gfVar) {
        super(gfVar.u());
        this.f49386a = gfVar;
    }

    public /* synthetic */ t0(gf gfVar, jo.h hVar) {
        this(gfVar);
    }

    public final void a(ud.q0 q0Var) {
        jo.p.h(q0Var, "bindModel");
        this.f49386a.B.setProfileImageUrl(q0Var.a());
        this.f49386a.C.setText(q0Var.b());
    }
}
