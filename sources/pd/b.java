package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.net.api.response.campaign.CampaignDetailResponse;
import com.dena.mirrorman.net.api.response.campaign.CampaignMissionReceivePrizesResponse;
import com.dena.mirrorman.net.api.response.campaign.SharingAward;

/* loaded from: classes2.dex */
public abstract class b {

    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46591a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46591a = mRError;
        }

        public final MRError a() {
            return this.f46591a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f46591a, ((a) obj).f46591a);
        }

        public int hashCode() {
            return this.f46591a.hashCode();
        }

        public String toString() {
            return "LoadFail(error=" + this.f46591a + ')';
        }
    }

    /* renamed from: pd.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0711b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final CampaignDetailResponse f46592a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0711b(CampaignDetailResponse campaignDetailResponse) {
            super(null);
            jo.p.h(campaignDetailResponse, "response");
            this.f46592a = campaignDetailResponse;
        }

        public final CampaignDetailResponse a() {
            return this.f46592a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0711b) && jo.p.c(this.f46592a, ((C0711b) obj).f46592a);
        }

        public int hashCode() {
            return this.f46592a.hashCode();
        }

        public String toString() {
            return "LoadFinish(response=" + this.f46592a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final int f46593a;

        /* renamed from: b  reason: collision with root package name */
        public final MRError f46594b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46593a = i10;
            this.f46594b = mRError;
        }

        public final MRError a() {
            return this.f46594b;
        }

        public final int b() {
            return this.f46593a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f46593a == cVar.f46593a && jo.p.c(this.f46594b, cVar.f46594b);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f46593a) * 31) + this.f46594b.hashCode();
        }

        public String toString() {
            return "ReceivePrizesFail(missionId=" + this.f46593a + ", error=" + this.f46594b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        public final int f46595a;

        /* renamed from: b  reason: collision with root package name */
        public final CampaignMissionReceivePrizesResponse f46596b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, CampaignMissionReceivePrizesResponse campaignMissionReceivePrizesResponse) {
            super(null);
            jo.p.h(campaignMissionReceivePrizesResponse, "response");
            this.f46595a = i10;
            this.f46596b = campaignMissionReceivePrizesResponse;
        }

        public final int a() {
            return this.f46595a;
        }

        public final CampaignMissionReceivePrizesResponse b() {
            return this.f46596b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f46595a == dVar.f46595a && jo.p.c(this.f46596b, dVar.f46596b);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f46595a) * 31) + this.f46596b.hashCode();
        }

        public String toString() {
            return "ReceivePrizesFinish(missionId=" + this.f46595a + ", response=" + this.f46596b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends b {

        /* renamed from: a  reason: collision with root package name */
        public final int f46597a;

        public e(int i10) {
            super(null);
            this.f46597a = i10;
        }

        public final int a() {
            return this.f46597a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f46597a == ((e) obj).f46597a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46597a);
        }

        public String toString() {
            return "ReceivePrizesStart(missionId=" + this.f46597a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final f f46598a = new f();

        public f() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46599a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46599a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f46599a, ((g) obj).f46599a);
        }

        public int hashCode() {
            return this.f46599a.hashCode();
        }

        public String toString() {
            return "ShareTweetFailed(error=" + this.f46599a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends b {

        /* renamed from: a  reason: collision with root package name */
        public final String f46600a;

        /* renamed from: b  reason: collision with root package name */
        public final SharingAward f46601b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, SharingAward sharingAward) {
            super(null);
            jo.p.h(str, "campaignId");
            this.f46600a = str;
            this.f46601b = sharingAward;
        }

        public final SharingAward a() {
            return this.f46601b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return jo.p.c(this.f46600a, hVar.f46600a) && jo.p.c(this.f46601b, hVar.f46601b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f46600a.hashCode() * 31;
            SharingAward sharingAward = this.f46601b;
            return hashCode + (sharingAward == null ? 0 : sharingAward.hashCode());
        }

        public String toString() {
            return "ShareTweetFinished(campaignId=" + this.f46600a + ", sharingAward=" + this.f46601b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final i f46602a = new i();

        public i() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46603a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46603a = mRError;
        }

        public final MRError a() {
            return this.f46603a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && jo.p.c(this.f46603a, ((j) obj).f46603a);
        }

        public int hashCode() {
            return this.f46603a.hashCode();
        }

        public String toString() {
            return "UpdateAppUserIdFail(error=" + this.f46603a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends b {

        /* renamed from: a  reason: collision with root package name */
        public final AppUserDetailResponse f46604a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AppUserDetailResponse appUserDetailResponse) {
            super(null);
            jo.p.h(appUserDetailResponse, "appUserDetailResponse");
            this.f46604a = appUserDetailResponse;
        }

        public final AppUserDetailResponse a() {
            return this.f46604a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(this.f46604a, ((k) obj).f46604a);
        }

        public int hashCode() {
            return this.f46604a.hashCode();
        }

        public String toString() {
            return "UpdateAppUserIdFinish(appUserDetailResponse=" + this.f46604a + ')';
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
