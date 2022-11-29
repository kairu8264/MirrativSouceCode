package ad;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import pc.a3;

/* loaded from: classes2.dex */
public final class h extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f1120b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f1121c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final a3 f1122a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            a3 T = a3.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(LayoutInflater.f….context), parent, false)");
            return new h(T);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a3 a3Var) {
        super(a3Var.u());
        jo.p.h(a3Var, "binding");
        this.f1122a = a3Var;
    }

    public final void a(String str) {
        jo.p.h(str, "title");
        this.f1122a.C.setText(str);
    }
}
