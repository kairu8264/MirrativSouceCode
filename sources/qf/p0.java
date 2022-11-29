package qf;

import ae.me;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class p0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49322b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49323c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final me f49324a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_gift_gacha_lose, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new p0((me) e10, null);
        }
    }

    public p0(me meVar) {
        super(meVar.u());
        this.f49324a = meVar;
    }

    public /* synthetic */ p0(me meVar, jo.h hVar) {
        this(meVar);
    }
}
