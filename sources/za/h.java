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
public final class h implements ud.a, b {
    public static final a J = new a(null);
    public static final int K = 8;
    public final int A;
    public final int B;
    public final String C;
    public final boolean D;
    public final String E;
    public final int F;
    public final e0<Boolean> G;
    public final e0<m> H;
    public final a.EnumC0862a I;

    /* renamed from: w  reason: collision with root package name */
    public final String f62933w;

    /* renamed from: x  reason: collision with root package name */
    public final g0 f62934x;

    /* renamed from: y  reason: collision with root package name */
    public final e3 f62935y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f62936z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a(Context context, CampaignMission campaignMission, boolean z10) {
            p.h(context, "context");
            p.h(campaignMission, "campaignMission");
            String title = campaignMission.getTitle();
            g0 a10 = g0.f61438c.a((CampaignPrize) a0.X(campaignMission.getPrizes()));
            e3 a11 = e3.f54886c.a(context, campaignMission.getPrizeGrantType());
            boolean isCompleted = campaignMission.getProgressStatus().isCompleted();
            int current = campaignMission.getProgressStatus().getCurrent();
            int max = campaignMission.getProgressStatus().getMax();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(campaignMission.getProgressStatus().getCurrent());
            sb2.append('/');
            sb2.append(campaignMission.getProgressStatus().getMax());
            return new h(title, a10, a11, isCompleted, current, max, sb2.toString(), campaignMission.isInactivation(), campaignMission.getInactivationText(), campaignMission.getId(), new e0(Boolean.FALSE), new e0(m.f62945e.a(context, campaignMission.getReceiveStatus(), z10)), null, 4096, null);
        }
    }

    public h(String str, g0 g0Var, e3 e3Var, boolean z10, int i10, int i11, String str2, boolean z11, String str3, int i12, e0<Boolean> e0Var, e0<m> e0Var2, a.EnumC0862a enumC0862a) {
        p.h(str, "title");
        p.h(g0Var, "prize");
        p.h(e3Var, "prizeGrant");
        p.h(str2, "progressNumText");
        p.h(str3, "inactivationText");
        p.h(e0Var, "loading");
        p.h(e0Var2, "receiveButton");
        p.h(enumC0862a, "type");
        this.f62933w = str;
        this.f62934x = g0Var;
        this.f62935y = e3Var;
        this.f62936z = z10;
        this.A = i10;
        this.B = i11;
        this.C = str2;
        this.D = z11;
        this.E = str3;
        this.F = i12;
        this.G = e0Var;
        this.H = e0Var2;
        this.I = enumC0862a;
    }

    @Override // za.b
    public e0<Boolean> a() {
        return this.G;
    }

    @Override // za.b
    public e0<m> b() {
        return this.H;
    }

    public final String c() {
        return this.E;
    }

    public final g0 d() {
        return this.f62934x;
    }

    public final e3 e() {
        return this.f62935y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return p.c(this.f62933w, hVar.f62933w) && p.c(this.f62934x, hVar.f62934x) && p.c(this.f62935y, hVar.f62935y) && this.f62936z == hVar.f62936z && this.A == hVar.A && this.B == hVar.B && p.c(this.C, hVar.C) && this.D == hVar.D && p.c(this.E, hVar.E) && getId() == hVar.getId() && p.c(a(), hVar.a()) && p.c(b(), hVar.b()) && getType() == hVar.getType();
        }
        return false;
    }

    public final int f() {
        return this.A;
    }

    public final int g() {
        return this.B;
    }

    @Override // za.b
    public int getId() {
        return this.F;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.I;
    }

    public final String h() {
        return this.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f62933w.hashCode() * 31) + this.f62934x.hashCode()) * 31) + this.f62935y.hashCode()) * 31;
        boolean z10 = this.f62936z;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((((hashCode + i10) * 31) + Integer.hashCode(this.A)) * 31) + Integer.hashCode(this.B)) * 31) + this.C.hashCode()) * 31;
        boolean z11 = this.D;
        return ((((((((((hashCode2 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.E.hashCode()) * 31) + Integer.hashCode(getId())) * 31) + a().hashCode()) * 31) + b().hashCode()) * 31) + getType().hashCode();
    }

    public final String i() {
        return this.f62933w;
    }

    public final boolean j() {
        return this.f62936z;
    }

    public final boolean k() {
        return this.D;
    }

    public String toString() {
        return "CampaignMissionProgressBarBindModel(title=" + this.f62933w + ", prize=" + this.f62934x + ", prizeGrant=" + this.f62935y + ", isCompleted=" + this.f62936z + ", progressCurrent=" + this.A + ", progressMax=" + this.B + ", progressNumText=" + this.C + ", isVisibleInactivation=" + this.D + ", inactivationText=" + this.E + ", id=" + getId() + ", loading=" + a() + ", receiveButton=" + b() + ", type=" + getType() + ')';
    }

    public /* synthetic */ h(String str, g0 g0Var, e3 e3Var, boolean z10, int i10, int i11, String str2, boolean z11, String str3, int i12, e0 e0Var, e0 e0Var2, a.EnumC0862a enumC0862a, int i13, jo.h hVar) {
        this(str, g0Var, e3Var, z10, i10, i11, str2, z11, str3, i12, e0Var, e0Var2, (i13 & 4096) != 0 ? a.EnumC0862a.CAMPAIGN_MISSION_PROGRESS_BAR : enumC0862a);
    }
}
