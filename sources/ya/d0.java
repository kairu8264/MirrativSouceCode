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
public final class d0 implements ud.l, u {

    /* renamed from: l  reason: collision with root package name */
    public static final a f61414l = new a(null);

    /* renamed from: m  reason: collision with root package name */
    public static final int f61415m = 8;

    /* renamed from: a  reason: collision with root package name */
    public final int f61416a;

    /* renamed from: b  reason: collision with root package name */
    public final String f61417b;

    /* renamed from: c  reason: collision with root package name */
    public final int f61418c;

    /* renamed from: d  reason: collision with root package name */
    public final String f61419d;

    /* renamed from: e  reason: collision with root package name */
    public final int f61420e;

    /* renamed from: f  reason: collision with root package name */
    public final String f61421f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f61422g;

    /* renamed from: h  reason: collision with root package name */
    public final String f61423h;

    /* renamed from: i  reason: collision with root package name */
    public final List<ud.a> f61424i;

    /* renamed from: j  reason: collision with root package name */
    public final int f61425j;

    /* renamed from: k  reason: collision with root package name */
    public final l.a f61426k;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d0 a(Context context, CampaignAward campaignAward) {
            za.b a10;
            jo.p.h(context, "context");
            jo.p.h(campaignAward, "campaignAward");
            int i10 = y0.bg_viewer_prize;
            String string = context.getResources().getString(f1.text_viewer_prize);
            int i11 = w0.f42239o;
            String string2 = context.getResources().getString(f1.text_move_to_web_version);
            int i12 = y0.ic_search;
            String string3 = context.getResources().getString(f1.text_achieved_view);
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
            jo.p.g(string, "getString(R.string.text_viewer_prize)");
            jo.p.g(string2, "getString(R.string.text_move_to_web_version)");
            jo.p.g(string3, "getString(R.string.text_achieved_view)");
            return new d0(i10, string, i11, string2, i12, string3, notes, prizeDeliveryDate, arrayList, 0, null, 1536, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(int i10, String str, int i11, String str2, int i12, String str3, List<String> list, String str4, List<? extends ud.a> list2, int i13, l.a aVar) {
        jo.p.h(str, "titleText");
        jo.p.h(str2, "buttonText");
        jo.p.h(str3, "achievedText");
        jo.p.h(list, "notes");
        jo.p.h(str4, "deliveryDateText");
        jo.p.h(list2, "missions");
        jo.p.h(aVar, "type");
        this.f61416a = i10;
        this.f61417b = str;
        this.f61418c = i11;
        this.f61419d = str2;
        this.f61420e = i12;
        this.f61421f = str3;
        this.f61422g = list;
        this.f61423h = str4;
        this.f61424i = list2;
        this.f61425j = i13;
        this.f61426k = aVar;
    }

    @Override // ud.l
    public int a() {
        return this.f61425j;
    }

    @Override // ya.u
    public List<ud.a> b() {
        return this.f61424i;
    }

    public final int c() {
        return this.f61416a;
    }

    public final int d() {
        return this.f61418c;
    }

    public final int e() {
        return this.f61420e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return this.f61416a == d0Var.f61416a && jo.p.c(this.f61417b, d0Var.f61417b) && this.f61418c == d0Var.f61418c && jo.p.c(this.f61419d, d0Var.f61419d) && this.f61420e == d0Var.f61420e && jo.p.c(this.f61421f, d0Var.f61421f) && jo.p.c(this.f61422g, d0Var.f61422g) && jo.p.c(this.f61423h, d0Var.f61423h) && jo.p.c(b(), d0Var.b()) && a() == d0Var.a() && getType() == d0Var.getType();
        }
        return false;
    }

    public final String f() {
        return this.f61419d;
    }

    public final String g() {
        return this.f61423h;
    }

    @Override // ud.l
    public l.a getType() {
        return this.f61426k;
    }

    public final List<String> h() {
        return this.f61422g;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.f61416a) * 31) + this.f61417b.hashCode()) * 31) + Integer.hashCode(this.f61418c)) * 31) + this.f61419d.hashCode()) * 31) + Integer.hashCode(this.f61420e)) * 31) + this.f61421f.hashCode()) * 31) + this.f61422g.hashCode()) * 31) + this.f61423h.hashCode()) * 31) + b().hashCode()) * 31) + Integer.hashCode(a())) * 31) + getType().hashCode();
    }

    public final String i() {
        return this.f61417b;
    }

    public String toString() {
        return "CampaignDetailViewAwardBindModel(backgroundDrawable=" + this.f61416a + ", titleText=" + this.f61417b + ", buttonBackgroundResourceId=" + this.f61418c + ", buttonText=" + this.f61419d + ", buttonIconResourceId=" + this.f61420e + ", achievedText=" + this.f61421f + ", notes=" + this.f61422g + ", deliveryDateText=" + this.f61423h + ", missions=" + b() + ", itemMarginTop=" + a() + ", type=" + getType() + ')';
    }

    public /* synthetic */ d0(int i10, String str, int i11, String str2, int i12, String str3, List list, String str4, List list2, int i13, l.a aVar, int i14, jo.h hVar) {
        this(i10, str, i11, str2, i12, str3, list, str4, list2, (i14 & 512) != 0 ? -12 : i13, (i14 & 1024) != 0 ? l.a.CAMPAIGN_DETAIL_VIEW_AWARD : aVar);
    }
}
