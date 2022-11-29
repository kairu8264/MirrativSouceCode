package za;

import android.content.Context;
import com.dena.mirrorman.net.api.response.campaign.CampaignMissionReceiveStatus;
import jo.p;
import kotlin.NoWhenBranchMatchedException;
import nd.f1;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: e  reason: collision with root package name */
    public static final a f62945e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f62946a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f62947b;

    /* renamed from: c  reason: collision with root package name */
    public final String f62948c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f62949d;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: za.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C1087a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f62950a;

            static {
                int[] iArr = new int[CampaignMissionReceiveStatus.values().length];
                iArr[CampaignMissionReceiveStatus.HIDDEN.ordinal()] = 1;
                iArr[CampaignMissionReceiveStatus.CAN_RECEIVE.ordinal()] = 2;
                iArr[CampaignMissionReceiveStatus.ALREADY_RECEIVED.ordinal()] = 3;
                iArr[CampaignMissionReceiveStatus.APP_USER_ID_REQUIRED.ordinal()] = 4;
                iArr[CampaignMissionReceiveStatus.CANNOT_RECEIVE.ordinal()] = 5;
                f62950a = iArr;
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m a(Context context, CampaignMissionReceiveStatus campaignMissionReceiveStatus, boolean z10) {
            p.h(context, "context");
            p.h(campaignMissionReceiveStatus, "status");
            int i10 = C1087a.f62950a[campaignMissionReceiveStatus.ordinal()];
            if (i10 == 1) {
                return new m(z10 ? 8 : 4, false, "", true);
            } else if (i10 == 2) {
                String string = context.getResources().getString(f1.text_campaign_mission_prizes_receive);
                p.g(string, "context.resources.getStr…n_mission_prizes_receive)");
                return new m(0, true, string, false);
            } else if (i10 == 3) {
                String string2 = context.getResources().getString(f1.text_campaign_mission_prizes_received);
                p.g(string2, "context.resources.getStr…_mission_prizes_received)");
                return new m(0, false, string2, true);
            } else if (i10 != 4 && i10 != 5) {
                throw new NoWhenBranchMatchedException();
            } else {
                String string3 = context.getResources().getString(f1.text_campaign_mission_prizes_receive);
                p.g(string3, "context.resources.getStr…n_mission_prizes_receive)");
                return new m(0, false, string3, false);
            }
        }
    }

    public m(int i10, boolean z10, String str, boolean z11) {
        p.h(str, "text");
        this.f62946a = i10;
        this.f62947b = z10;
        this.f62948c = str;
        this.f62949d = z11;
    }

    public final boolean a() {
        return this.f62949d;
    }

    public final String b() {
        return this.f62948c;
    }

    public final int c() {
        return this.f62946a;
    }

    public final boolean d() {
        return this.f62947b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f62946a == mVar.f62946a && this.f62947b == mVar.f62947b && p.c(this.f62948c, mVar.f62948c) && this.f62949d == mVar.f62949d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f62946a) * 31;
        boolean z10 = this.f62947b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((hashCode + i10) * 31) + this.f62948c.hashCode()) * 31;
        boolean z11 = this.f62949d;
        return hashCode2 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "CampaignMissionReceiveButtonBindModel(visibility=" + this.f62946a + ", isEnabled=" + this.f62947b + ", text=" + this.f62948c + ", canShowInactivation=" + this.f62949d + ')';
    }
}
