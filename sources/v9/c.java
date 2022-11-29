package v9;

import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaItem;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestEquipmentGachaResultsResponse;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import xn.t;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56980b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f56981a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(EmomoQuestEquipmentGachaResultsResponse emomoQuestEquipmentGachaResultsResponse) {
            p.h(emomoQuestEquipmentGachaResultsResponse, "response");
            List<GiftGachaItem> results = emomoQuestEquipmentGachaResultsResponse.getResults();
            ArrayList arrayList = new ArrayList(t.u(results, 10));
            for (GiftGachaItem giftGachaItem : results) {
                arrayList.add(f.f56984k.a(giftGachaItem, emomoQuestEquipmentGachaResultsResponse.getElementImageUrl()));
            }
            return new c(arrayList);
        }
    }

    public c(List<f> list) {
        p.h(list, "gachaItems");
        this.f56981a = list;
    }

    public final List<f> a() {
        return this.f56981a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && p.c(this.f56981a, ((c) obj).f56981a);
    }

    public int hashCode() {
        return this.f56981a.hashCode();
    }

    public String toString() {
        return "EmomoQuestEquipmentGachaBindModel(gachaItems=" + this.f56981a + ')';
    }
}
