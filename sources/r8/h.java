package r8;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class h extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49915b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49916c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final t8.m0 f49917a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            t8.m0 T = t8.m0.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new h(T, null);
        }
    }

    public h(t8.m0 m0Var) {
        super(m0Var.u());
        this.f49917a = m0Var;
    }

    public /* synthetic */ h(t8.m0 m0Var, jo.h hVar) {
        this(m0Var);
    }

    public final t8.m0 a() {
        return this.f49917a;
    }
}
