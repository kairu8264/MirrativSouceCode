package ya;

import android.content.Context;
import com.dena.mirrorman.net.api.response.campaign.CampaignProgressType;
import com.dena.mirrorman.net.api.response.campaign.SharingAward;
import java.util.List;
import ud.l;

/* loaded from: classes2.dex */
public final class x implements ud.l, u {

    /* renamed from: f  reason: collision with root package name */
    public static final a f61590f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f61591g = 8;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f61592a;

    /* renamed from: b  reason: collision with root package name */
    public final String f61593b;

    /* renamed from: c  reason: collision with root package name */
    public final List<ud.a> f61594c;

    /* renamed from: d  reason: collision with root package name */
    public final int f61595d;

    /* renamed from: e  reason: collision with root package name */
    public final l.a f61596e;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final x a(Context context, SharingAward sharingAward) {
            Object a10;
            jo.p.h(context, "context");
            jo.p.h(sharingAward, "sharingAward");
            List<String> notes = sharingAward.getNotes();
            if (sharingAward.getMission().getProgressType() == CampaignProgressType.PROGRESS_BAR) {
                a10 = za.h.J.a(context, sharingAward.getMission(), true);
            } else {
                a10 = za.c.I.a(context, sharingAward.getMission(), false);
            }
            return new x(notes, sharingAward.getPrizeDeliveryDate(), xn.r.d(a10), 0, null, 24, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(List<String> list, String str, List<? extends ud.a> list2, int i10, l.a aVar) {
        jo.p.h(list, "notes");
        jo.p.h(str, "deliveryDateText");
        jo.p.h(list2, "missions");
        jo.p.h(aVar, "type");
        this.f61592a = list;
        this.f61593b = str;
        this.f61594c = list2;
        this.f61595d = i10;
        this.f61596e = aVar;
    }

    @Override // ud.l
    public int a() {
        return this.f61595d;
    }

    @Override // ya.u
    public List<ud.a> b() {
        return this.f61594c;
    }

    public final String c() {
        return this.f61593b;
    }

    public final List<String> d() {
        return this.f61592a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return jo.p.c(this.f61592a, xVar.f61592a) && jo.p.c(this.f61593b, xVar.f61593b) && jo.p.c(b(), xVar.b()) && a() == xVar.a() && getType() == xVar.getType();
        }
        return false;
    }

    @Override // ud.l
    public l.a getType() {
        return this.f61596e;
    }

    public int hashCode() {
        return (((((((this.f61592a.hashCode() * 31) + this.f61593b.hashCode()) * 31) + b().hashCode()) * 31) + Integer.hashCode(a())) * 31) + getType().hashCode();
    }

    public String toString() {
        return "CampaignDetailShareAwardBindModel(notes=" + this.f61592a + ", deliveryDateText=" + this.f61593b + ", missions=" + b() + ", itemMarginTop=" + a() + ", type=" + getType() + ')';
    }

    public /* synthetic */ x(List list, String str, List list2, int i10, l.a aVar, int i11, jo.h hVar) {
        this(list, str, list2, (i11 & 8) != 0 ? -12 : i10, (i11 & 16) != 0 ? l.a.CAMPAIGN_DETAIL_SHARE_AWARD : aVar);
    }
}
