package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.j;
import com.dena.mirrorman.net.api.response.GiftboxGachaResultSpecialGachaItem;

/* loaded from: classes2.dex */
public final class e0 extends androidx.recyclerview.widget.t<GiftboxGachaResultSpecialGachaItem, qf.z0> {

    /* loaded from: classes2.dex */
    public static final class a extends j.f<GiftboxGachaResultSpecialGachaItem> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(GiftboxGachaResultSpecialGachaItem giftboxGachaResultSpecialGachaItem, GiftboxGachaResultSpecialGachaItem giftboxGachaResultSpecialGachaItem2) {
            jo.p.h(giftboxGachaResultSpecialGachaItem, "oldItem");
            jo.p.h(giftboxGachaResultSpecialGachaItem2, "newItem");
            return jo.p.c(giftboxGachaResultSpecialGachaItem, giftboxGachaResultSpecialGachaItem2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(GiftboxGachaResultSpecialGachaItem giftboxGachaResultSpecialGachaItem, GiftboxGachaResultSpecialGachaItem giftboxGachaResultSpecialGachaItem2) {
            jo.p.h(giftboxGachaResultSpecialGachaItem, "oldItem");
            jo.p.h(giftboxGachaResultSpecialGachaItem2, "newItem");
            return giftboxGachaResultSpecialGachaItem == giftboxGachaResultSpecialGachaItem2;
        }
    }

    public e0() {
        super(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g */
    public void onBindViewHolder(qf.z0 z0Var, int i10) {
        jo.p.h(z0Var, "holder");
        GiftboxGachaResultSpecialGachaItem b10 = b(i10);
        jo.p.g(b10, "getItem(position)");
        z0Var.a(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: h */
    public qf.z0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return qf.z0.f49462b.a(viewGroup);
    }
}
