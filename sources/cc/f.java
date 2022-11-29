package cc;

import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingBcsvrResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<GiftItem> f19051a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<GiftItem> f19052b = new ArrayList();

    public final void a(GiftItem giftItem) {
        Object obj;
        jo.p.h(giftItem, "giftItem");
        Iterator<T> it = this.f19051a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jo.p.c(((GiftItem) obj).getGiftId(), giftItem.getGiftId())) {
                break;
            }
        }
        GiftItem giftItem2 = (GiftItem) obj;
        if (giftItem2 != null) {
            this.f19051a.remove(giftItem2);
        }
    }

    public final void b() {
        this.f19051a.clear();
        this.f19052b.clear();
    }

    public final void c(GiftItem giftItem) {
        Object obj;
        jo.p.h(giftItem, "giftItem");
        Iterator<T> it = this.f19052b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jo.p.c(((GiftItem) obj).getGiftId(), giftItem.getGiftId())) {
                break;
            }
        }
        GiftItem giftItem2 = (GiftItem) obj;
        if (giftItem2 != null) {
            this.f19052b.remove(giftItem2);
        }
    }

    public final GiftItem d() {
        return (GiftItem) xn.a0.Z(this.f19051a);
    }

    public final GiftItem e() {
        return (GiftItem) xn.a0.Z(this.f19052b);
    }

    public final void f(GiftItem giftItem, boolean z10, boolean z11) {
        boolean z12;
        jo.p.h(giftItem, "giftItem");
        if (!z10) {
            this.f19051a.add(giftItem);
            return;
        }
        String effectId = giftItem.getEffectId();
        boolean z13 = true;
        if (!(effectId == null || effectId.length() == 0)) {
            this.f19051a.add(giftItem);
        } else if (xn.s.m(ve.d.BIRTHDAY, ve.d.ANNIVERSARY, ve.d.UNIQUE_EMOMO_GIFT_RICH, ve.d.BOOST_CATALOG_GIFT).contains(ve.d.Companion.a(giftItem.getGiftType()))) {
            this.f19051a.add(giftItem);
        } else {
            if (jo.p.c(giftItem.isLastSent(), Boolean.TRUE)) {
                List<GiftRankingBcsvrResponse> rankings = giftItem.getRankings();
                if (!(rankings instanceof Collection) || !rankings.isEmpty()) {
                    for (GiftRankingBcsvrResponse giftRankingBcsvrResponse : rankings) {
                        if (giftRankingBcsvrResponse.isStreamerRankUp()) {
                            z12 = true;
                            break;
                        }
                    }
                }
                z12 = false;
                if (z12) {
                    this.f19051a.add(giftItem);
                    return;
                }
            }
            if (jo.p.c(giftItem.isLastSent(), Boolean.TRUE)) {
                List<GiftRankingBcsvrResponse> rankings2 = giftItem.getRankings();
                if (!(rankings2 instanceof Collection) || !rankings2.isEmpty()) {
                    for (GiftRankingBcsvrResponse giftRankingBcsvrResponse2 : rankings2) {
                        if (giftRankingBcsvrResponse2.isSenderRankUp()) {
                            break;
                        }
                    }
                }
                z13 = false;
                if (z13 && z11) {
                    this.f19051a.add(giftItem);
                    return;
                }
            }
            this.f19052b.add(giftItem);
        }
    }
}
