package ad;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import pc.g3;

/* loaded from: classes2.dex */
public final class g extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f1115b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f1116c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final g3 f1117a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            g3 T = g3.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(LayoutInflater.f….context), parent, false)");
            return new g(T);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g3 g3Var) {
        super(g3Var.u());
        jo.p.h(g3Var, "binding");
        this.f1117a = g3Var;
    }

    public final void a(String str) {
        jo.p.h(str, "title");
        this.f1117a.C.setText(str);
    }
}
