package qf;

import ae.gg;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class k1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49261b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49262c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final gg f49263a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            gg T = gg.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new k1(T, null);
        }
    }

    public k1(gg ggVar) {
        super(ggVar.u());
        this.f49263a = ggVar;
    }

    public /* synthetic */ k1(gg ggVar, jo.h hVar) {
        this(ggVar);
    }
}
