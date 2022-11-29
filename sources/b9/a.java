package b9;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import jo.h;
import jo.p;
import t8.u1;

/* loaded from: classes.dex */
public final class a extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0103a f17098a = new C0103a(null);

    /* renamed from: b9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0103a {
        public C0103a() {
        }

        public /* synthetic */ C0103a(h hVar) {
            this();
        }

        public final a a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            u1 T = u1.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            p.g(T, "inflate(\n               …      false\n            )");
            return new a(T, null);
        }
    }

    public a(u1 u1Var) {
        super(u1Var.u());
    }

    public /* synthetic */ a(u1 u1Var, h hVar) {
        this(u1Var);
    }
}
