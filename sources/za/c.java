package za;

import android.content.Context;
import androidx.lifecycle.e0;
import com.dena.mirrorman.net.api.response.campaign.CampaignMission;
import com.dena.mirrorman.net.api.response.campaign.CampaignPrize;
import jo.p;
import ud.a;
import ud.e3;
import xn.a0;
import ya.g0;

/* loaded from: classes2.dex */
public final class c implements ud.a, b {
    public static final a I = new a(null);
    public static final int J = 8;
    public final int A;
    public final int B;
    public final boolean C;
    public final String D;
    public final int E;
    public final e0<Boolean> F;
    public final e0<m> G;
    public final a.EnumC0862a H;

    /* renamed from: w  reason: collision with root package name */
    public final String f62921w;

    /* renamed from: x  reason: collision with root package name */
    public final g0 f62922x;

    /* renamed from: y  reason: collision with root package name */
    public final e3 f62923y;

    /* renamed from: z  reason: collision with root package name */
    public final String f62924z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(Context context, CampaignMission campaignMission, boolean z10) {
            wn.k kVar;
            p.h(context, "context");
            p.h(campaignMission, "campaignMission");
            m a10 = m.f62945e.a(context, campaignMission.getReceiveStatus(), z10);
            if (a10.c() == 8) {
                kVar = new wn.k(32, 12);
            } else {
                kVar = new wn.k(22, 10);
            }
            return new c(campaignMission.getTitle(), g0.f61438c.a((CampaignPrize) a0.X(campaignMission.getPrizes())), e3.f54886c.a(context, campaignMission.getPrizeGrantType()), String.valueOf(campaignMission.getProgressStatus().getCurrent()), ((Number) kVar.a()).intValue(), ((Number) kVar.b()).intValue(), campaignMission.isInactivation(), campaignMission.getInactivationText(), campaignMission.getId(), new e0(Boolean.FALSE), new e0(a10), null, 2048, null);
        }
    }

    public c(String str, g0 g0Var, e3 e3Var, String str2, int i10, int i11, boolean z10, String str3, int i12, e0<Boolean> e0Var, e0<m> e0Var2, a.EnumC0862a enumC0862a) {
        p.h(str, "title");
        p.h(g0Var, "prize");
        p.h(e3Var, "prizeGrant");
        p.h(str2, "achievementCountText");
        p.h(str3, "inactivationText");
        p.h(e0Var, "loading");
        p.h(e0Var2, "receiveButton");
        p.h(enumC0862a, "type");
        this.f62921w = str;
        this.f62922x = g0Var;
        this.f62923y = e3Var;
        this.f62924z = str2;
        this.A = i10;
        this.B = i11;
        this.C = z10;
        this.D = str3;
        this.E = i12;
        this.F = e0Var;
        this.G = e0Var2;
        this.H = enumC0862a;
    }

    @Override // za.b
    public e0<Boolean> a() {
        return this.F;
    }

    @Override // za.b
    public e0<m> b() {
        return this.G;
    }

    public final String c() {
        return this.f62924z;
    }

    public final int d() {
        return this.A;
    }

    public final int e() {
        return this.B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return p.c(this.f62921w, cVar.f62921w) && p.c(this.f62922x, cVar.f62922x) && p.c(this.f62923y, cVar.f62923y) && p.c(this.f62924z, cVar.f62924z) && this.A == cVar.A && this.B == cVar.B && this.C == cVar.C && p.c(this.D, cVar.D) && getId() == cVar.getId() && p.c(a(), cVar.a()) && p.c(b(), cVar.b()) && getType() == cVar.getType();
        }
        return false;
    }

    public final String f() {
        return this.D;
    }

    public final g0 g() {
        return this.f62922x;
    }

    @Override // za.b
    public int getId() {
        return this.E;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.H;
    }

    public final e3 h() {
        return this.f62923y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.f62921w.hashCode() * 31) + this.f62922x.hashCode()) * 31) + this.f62923y.hashCode()) * 31) + this.f62924z.hashCode()) * 31) + Integer.hashCode(this.A)) * 31) + Integer.hashCode(this.B)) * 31;
        boolean z10 = this.C;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((((((hashCode + i10) * 31) + this.D.hashCode()) * 31) + Integer.hashCode(getId())) * 31) + a().hashCode()) * 31) + b().hashCode()) * 31) + getType().hashCode();
    }

    public final String i() {
        return this.f62921w;
    }

    public final boolean j() {
        return this.C;
    }

    public String toString() {
        return "CampaignMissionDateBindModel(title=" + this.f62921w + ", prize=" + this.f62922x + ", prizeGrant=" + this.f62923y + ", achievementCountText=" + this.f62924z + ", achievementCountTextSize=" + this.A + ", dayTextViewMarginBottom=" + this.B + ", isVisibleInactivation=" + this.C + ", inactivationText=" + this.D + ", id=" + getId() + ", loading=" + a() + ", receiveButton=" + b() + ", type=" + getType() + ')';
    }

    public /* synthetic */ c(String str, g0 g0Var, e3 e3Var, String str2, int i10, int i11, boolean z10, String str3, int i12, e0 e0Var, e0 e0Var2, a.EnumC0862a enumC0862a, int i13, jo.h hVar) {
        this(str, g0Var, e3Var, str2, i10, i11, z10, str3, i12, e0Var, e0Var2, (i13 & 2048) != 0 ? a.EnumC0862a.CAMPAIGN_MISSION_DATE : enumC0862a);
    }
}
