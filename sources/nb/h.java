package nb;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.dena.mirrativ.player.gifting.panel.PlayerGiftPagerCell;
import io.p;
import java.util.List;
import jf.q;
import ud.a;
import ud.a1;
import ud.b1;
import ud.y0;
import ud.z0;
import wn.v;

/* loaded from: classes2.dex */
public final class h extends t<ud.a, RecyclerView.e0> {

    /* renamed from: g  reason: collision with root package name */
    public static final a f41759g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f41760h = 8;

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super y0, v> f41761c;

    /* renamed from: d  reason: collision with root package name */
    public p<? super PlayerGiftPagerCell, ? super q, v> f41762d;

    /* renamed from: e  reason: collision with root package name */
    public io.l<? super q, v> f41763e;

    /* renamed from: f  reason: collision with root package name */
    public io.l<? super q, v> f41764f;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public h() {
        super(new nb.a());
    }

    public final void g(io.l<? super y0, v> lVar) {
        this.f41761c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    public final void h(p<? super PlayerGiftPagerCell, ? super q, v> pVar) {
        this.f41762d = pVar;
    }

    public final void i(io.l<? super q, v> lVar) {
        this.f41763e = lVar;
    }

    public final void j(io.l<? super q, v> lVar) {
        this.f41764f = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof g) {
            ud.a b10 = b(i10);
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GiftPanelGiftBindModel");
            ((g) e0Var).d((b1) b10, this.f41762d, this.f41764f);
        } else if (e0Var instanceof c) {
            ud.a b11 = b(i10);
            jo.p.f(b11, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GiftPanelBannerBindModel");
            ((c) e0Var).d((y0) b11, this.f41761c);
        } else if (e0Var instanceof k) {
            ud.a b12 = b(i10);
            jo.p.f(b12, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GiftPanelEmptySpaceBindModel");
            ((k) e0Var).a((z0) b12);
        } else if (!(e0Var instanceof d)) {
            throw new IllegalArgumentException();
        } else {
            ud.a b13 = b(i10);
            jo.p.f(b13, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GiftPanelGachaTicketBindModel");
            ((d) e0Var).a((a1) b13, this.f41763e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.GIFT_PANEL_GIFT.ordinal()) {
            return g.f41751b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.GIFT_PANEL_BANNER.ordinal()) {
            return c.f41729c.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.GIFT_PANEL_EMPTY.ordinal()) {
            return k.f41776b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.GIFT_PANEL_GACHA_TICKET.ordinal()) {
            return d.f41740b.a(viewGroup);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10, List<Object> list) {
        jo.p.h(e0Var, "holder");
        jo.p.h(list, "payloads");
        boolean z10 = e0Var instanceof g;
        if (z10 && list.contains(1)) {
            ((g) e0Var).g();
        } else if (!z10 || !list.contains(0)) {
            onBindViewHolder(e0Var, i10);
        } else {
            ud.a b10 = b(i10);
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GiftPanelGiftBindModel");
            ((g) e0Var).f((b1) b10, this.f41762d, this.f41764f);
        }
    }
}
