package hc;

import ac.r6;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.k1;

/* loaded from: classes2.dex */
public final class i extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f35192b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f35193c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final r6 f35194a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_group_shot_background_setting_image, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new i((r6) e10, null);
        }
    }

    public i(r6 r6Var) {
        super(r6Var.u());
        this.f35194a = r6Var;
    }

    public /* synthetic */ i(r6 r6Var, jo.h hVar) {
        this(r6Var);
    }

    public final void a(k1 k1Var) {
        jo.p.h(k1Var, "bindModel");
        this.f35194a.B.setBackgroundImageUrl(k1Var.b());
        this.f35194a.B.setChecked(k1Var.c());
    }
}
