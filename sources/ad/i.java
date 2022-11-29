package ad;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class i extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f1128b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f1129c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final pc.w2 f1130a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            pc.w2 T = pc.w2.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(LayoutInflater.f….context), parent, false)");
            return new i(T);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(pc.w2 w2Var) {
        super(w2Var.u());
        jo.p.h(w2Var, "binding");
        this.f1130a = w2Var;
    }

    public final void a(String str) {
        jo.p.h(str, "title");
        this.f1130a.V(str);
    }
}
