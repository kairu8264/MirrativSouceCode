package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameAppRankingResponse;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameDetailResponse;
import com.dena.mirrativ.mirrativapi.user.ContractKycResponse;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.CampaignShareInfoResponse;
import com.dena.mirrorman.net.api.response.live.LiveArchiveDownloadUrlResponse;
import com.dena.mirrorman.net.api.response.live.LiveDetailResponse;

/* loaded from: classes2.dex */
public abstract class u {

    /* loaded from: classes2.dex */
    public static final class a extends u {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47273a;

        public a(boolean z10) {
            super(null);
            this.f47273a = z10;
        }

        public final boolean a() {
            return this.f47273a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f47273a == ((a) obj).f47273a;
        }

        public int hashCode() {
            boolean z10 = this.f47273a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "FetchIsVisibleContractMemberPassBookSucceeded(isVisible=" + this.f47273a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends u {

        /* renamed from: a  reason: collision with root package name */
        public final LiveGameAppRankingResponse f47274a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LiveGameAppRankingResponse liveGameAppRankingResponse) {
            super(null);
            jo.p.h(liveGameAppRankingResponse, "response");
            this.f47274a = liveGameAppRankingResponse;
        }

        public final LiveGameAppRankingResponse a() {
            return this.f47274a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47274a, ((b) obj).f47274a);
        }

        public int hashCode() {
            return this.f47274a.hashCode();
        }

        public String toString() {
            return "FetchLiveGameAppRankingSucceeded(response=" + this.f47274a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends u {

        /* renamed from: a  reason: collision with root package name */
        public final LiveGameDetailResponse f47275a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LiveGameDetailResponse liveGameDetailResponse) {
            super(null);
            jo.p.h(liveGameDetailResponse, "response");
            this.f47275a = liveGameDetailResponse;
        }

        public final LiveGameDetailResponse a() {
            return this.f47275a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47275a, ((c) obj).f47275a);
        }

        public int hashCode() {
            return this.f47275a.hashCode();
        }

        public String toString() {
            return "FetchLiveGameDetailSucceeded(response=" + this.f47275a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends u {

        /* renamed from: a  reason: collision with root package name */
        public static final d f47276a = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends u {

        /* renamed from: a  reason: collision with root package name */
        public static final e f47277a = new e();

        public e() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends u {

        /* renamed from: a  reason: collision with root package name */
        public final ContractSummaryResponse f47278a;

        /* renamed from: b  reason: collision with root package name */
        public final ContractKycResponse f47279b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ContractSummaryResponse contractSummaryResponse, ContractKycResponse contractKycResponse) {
            super(null);
            jo.p.h(contractSummaryResponse, "summaryResponse");
            jo.p.h(contractKycResponse, "contractKycResponse");
            this.f47278a = contractSummaryResponse;
            this.f47279b = contractKycResponse;
        }

        public final ContractKycResponse a() {
            return this.f47279b;
        }

        public final ContractSummaryResponse b() {
            return this.f47278a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return jo.p.c(this.f47278a, fVar.f47278a) && jo.p.c(this.f47279b, fVar.f47279b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f47278a.hashCode() * 31) + this.f47279b.hashCode();
        }

        public String toString() {
            return "LoadContractKycSucceeded(summaryResponse=" + this.f47278a + ", contractKycResponse=" + this.f47279b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends u {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47280a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47280a = mRError;
        }

        public final MRError a() {
            return this.f47280a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f47280a, ((g) obj).f47280a);
        }

        public int hashCode() {
            return this.f47280a.hashCode();
        }

        public String toString() {
            return "LoadFail(error=" + this.f47280a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends u {

        /* renamed from: a  reason: collision with root package name */
        public final LiveArchiveDownloadUrlResponse f47281a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LiveArchiveDownloadUrlResponse liveArchiveDownloadUrlResponse) {
            super(null);
            jo.p.h(liveArchiveDownloadUrlResponse, "response");
            this.f47281a = liveArchiveDownloadUrlResponse;
        }

        public final LiveArchiveDownloadUrlResponse a() {
            return this.f47281a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && jo.p.c(this.f47281a, ((h) obj).f47281a);
        }

        public int hashCode() {
            return this.f47281a.hashCode();
        }

        public String toString() {
            return "LoadFinishArchiveDownloadUrl(response=" + this.f47281a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends u {

        /* renamed from: a  reason: collision with root package name */
        public final CampaignShareInfoResponse f47282a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(CampaignShareInfoResponse campaignShareInfoResponse) {
            super(null);
            jo.p.h(campaignShareInfoResponse, "response");
            this.f47282a = campaignShareInfoResponse;
        }

        public final CampaignShareInfoResponse a() {
            return this.f47282a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && jo.p.c(this.f47282a, ((i) obj).f47282a);
        }

        public int hashCode() {
            return this.f47282a.hashCode();
        }

        public String toString() {
            return "LoadFinishCampaignShareInfo(response=" + this.f47282a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends u {

        /* renamed from: a  reason: collision with root package name */
        public final LiveDetailResponse f47283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LiveDetailResponse liveDetailResponse) {
            super(null);
            jo.p.h(liveDetailResponse, "response");
            this.f47283a = liveDetailResponse;
        }

        public final LiveDetailResponse a() {
            return this.f47283a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && jo.p.c(this.f47283a, ((j) obj).f47283a);
        }

        public int hashCode() {
            return this.f47283a.hashCode();
        }

        public String toString() {
            return "LoadFinishLiveDetail(response=" + this.f47283a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends u {

        /* renamed from: a  reason: collision with root package name */
        public static final k f47284a = new k();

        public k() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends u {

        /* renamed from: a  reason: collision with root package name */
        public static final l f47285a = new l();

        public l() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends u {

        /* renamed from: a  reason: collision with root package name */
        public final ContractSummaryResponse f47286a;

        /* renamed from: b  reason: collision with root package name */
        public final ub.a f47287b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ContractSummaryResponse contractSummaryResponse, ub.a aVar) {
            super(null);
            jo.p.h(contractSummaryResponse, "summaryResponse");
            jo.p.h(aVar, "transition");
            this.f47286a = contractSummaryResponse;
            this.f47287b = aVar;
        }

        public final ContractSummaryResponse a() {
            return this.f47286a;
        }

        public final ub.a b() {
            return this.f47287b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return jo.p.c(this.f47286a, mVar.f47286a) && this.f47287b == mVar.f47287b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f47286a.hashCode() * 31) + this.f47287b.hashCode();
        }

        public String toString() {
            return "LoadSummarySucceeded(summaryResponse=" + this.f47286a + ", transition=" + this.f47287b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends u {
    }

    public u() {
    }

    public /* synthetic */ u(jo.h hVar) {
        this();
    }
}
