package ya;

import android.content.Context;
import com.dena.mirrorman.net.api.response.campaign.CampaignAward;
import com.dena.mirrorman.net.api.response.campaign.CampaignMission;
import com.dena.mirrorman.net.api.response.campaign.CampaignProgressType;
import java.util.ArrayList;
import java.util.List;
import nd.f1;
import nd.w0;
import nd.y0;
import ud.l;

/* loaded from: classes2.dex */
public final class l implements ud.l, u {

    /* renamed from: l  reason: collision with root package name */
    public static final a f61530l = new a(null);

    /* renamed from: m  reason: collision with root package name */
    public static final int f61531m = 8;

    /* renamed from: a  reason: collision with root package name */
    public final int f61532a;

    /* renamed from: b  reason: collision with root package name */
    public final String f61533b;

    /* renamed from: c  reason: collision with root package name */
    public final int f61534c;

    /* renamed from: d  reason: collision with root package name */
    public final String f61535d;

    /* renamed from: e  reason: collision with root package name */
    public final int f61536e;

    /* renamed from: f  reason: collision with root package name */
    public final String f61537f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f61538g;

    /* renamed from: h  reason: collision with root package name */
    public final String f61539h;

    /* renamed from: i  reason: collision with root package name */
    public final List<ud.a> f61540i;

    /* renamed from: j  reason: collision with root package name */
    public final int f61541j;

    /* renamed from: k  reason: collision with root package name */
    public final l.a f61542k;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l a(Context context, CampaignAward campaignAward) {
            za.b a10;
            jo.p.h(context, "context");
            jo.p.h(campaignAward, "campaignAward");
            int i10 = y0.bg_coin_challenge;
            String string = context.getResources().getString(f1.text_streamer_prize);
            int i11 = w0.f42242u0;
            String string2 = context.getResources().getString(f1.text_bonus_btn_broadcast);
            int i12 = y0.ic_stream_white;
            String string3 = context.getResources().getString(f1.text_achieved_stream);
            List<String> notes = campaignAward.getNotes();
            List<CampaignMission> missions = campaignAward.getMissions();
            ArrayList arrayList = new ArrayList(xn.t.u(missions, 10));
            for (CampaignMission campaignMission : missions) {
                if (campaignMission.getProgressType() == CampaignProgressType.PROGRESS_BAR) {
                    a10 = za.h.J.a(context, campaignMission, campaignAward.isAllMissionReceiveHidden());
                } else {
                    a10 = za.c.I.a(context, campaignMission, campaignAward.isAllMissionReceiveHidden());
                }
                arrayList.add(a10);
            }
            String prizeDeliveryDate = campaignAward.getPrizeDeliveryDate();
            jo.p.g(string, "getString(R.string.text_streamer_prize)");
            jo.p.g(string2, "getString(R.string.text_bonus_btn_broadcast)");
            jo.p.g(string3, "getString(R.string.text_achieved_stream)");
            return new l(i10, string, i11, string2, i12, string3, notes, prizeDeliveryDate, arrayList, 0, null, 1536, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(int i10, String str, int i11, String str2, int i12, String str3, List<String> list, String str4, List<? extends ud.a> list2, int i13, l.a aVar) {
        jo.p.h(str, "titleText");
        jo.p.h(str2, "buttonText");
        jo.p.h(str3, "achievedText");
        jo.p.h(list, "notes");
        jo.p.h(str4, "deliveryDateText");
        jo.p.h(list2, "missions");
        jo.p.h(aVar, "type");
        this.f61532a = i10;
        this.f61533b = str;
        this.f61534c = i11;
        this.f61535d = str2;
        this.f61536e = i12;
        this.f61537f = str3;
        this.f61538g = list;
        this.f61539h = str4;
        this.f61540i = list2;
        this.f61541j = i13;
        this.f61542k = aVar;
    }

    @Override // ud.l
    public int a() {
        return this.f61541j;
    }

    @Override // ya.u
    public List<ud.a> b() {
        return this.f61540i;
    }

    public final int c() {
        return this.f61532a;
    }

    public final int d() {
        return this.f61534c;
    }

    public final int e() {
        return this.f61536e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f61532a == lVar.f61532a && jo.p.c(this.f61533b, lVar.f61533b) && this.f61534c == lVar.f61534c && jo.p.c(this.f61535d, lVar.f61535d) && this.f61536e == lVar.f61536e && jo.p.c(this.f61537f, lVar.f61537f) && jo.p.c(this.f61538g, lVar.f61538g) && jo.p.c(this.f61539h, lVar.f61539h) && jo.p.c(b(), lVar.b()) && a() == lVar.a() && getType() == lVar.getType();
        }
        return false;
    }

    public final String f() {
        return this.f61535d;
    }

    public final String g() {
        return this.f61539h;
    }

    @Override // ud.l
    public l.a getType() {
        return this.f61542k;
    }

    public final List<String> h() {
        return this.f61538g;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.f61532a) * 31) + this.f61533b.hashCode()) * 31) + Integer.hashCode(this.f61534c)) * 31) + this.f61535d.hashCode()) * 31) + Integer.hashCode(this.f61536e)) * 31) + this.f61537f.hashCode()) * 31) + this.f61538g.hashCode()) * 31) + this.f61539h.hashCode()) * 31) + b().hashCode()) * 31) + Integer.hashCode(a())) * 31) + getType().hashCode();
    }

    public final String i() {
        return this.f61533b;
    }

    public String toString() {
        return "CampaignDetailBroadcastAwardBindModel(backgroundDrawable=" + this.f61532a + ", titleText=" + this.f61533b + ", buttonBackgroundResourceId=" + this.f61534c + ", buttonText=" + this.f61535d + ", buttonIconResourceId=" + this.f61536e + ", achievedText=" + this.f61537f + ", notes=" + this.f61538g + ", deliveryDateText=" + this.f61539h + ", missions=" + b() + ", itemMarginTop=" + a() + ", type=" + getType() + ')';
    }

    public /* synthetic */ l(int i10, String str, int i11, String str2, int i12, String str3, List list, String str4, List list2, int i13, l.a aVar, int i14, jo.h hVar) {
        this(i10, str, i11, str2, i12, str3, list, str4, list2, (i14 & 512) != 0 ? -12 : i13, (i14 & 1024) != 0 ? l.a.CAMPAIGN_DETAIL_BROADCAST_AWARD : aVar);
    }
}
