package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.notice.CampaignNotice;
import com.dena.mirrorman.net.api.response.notice.NoticeCampaignResponse;

/* loaded from: classes2.dex */
public abstract class m0 {

    /* loaded from: classes2.dex */
    public static final class a extends m0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.g0 f47061a;

        /* renamed from: b  reason: collision with root package name */
        public final MRError f47062b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jf.g0 g0Var, MRError mRError) {
            super(null);
            jo.p.h(g0Var, "page");
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47061a = g0Var;
            this.f47062b = mRError;
        }

        public final MRError a() {
            return this.f47062b;
        }

        public final jf.g0 b() {
            return this.f47061a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f47061a == aVar.f47061a && jo.p.c(this.f47062b, aVar.f47062b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f47061a.hashCode() * 31) + this.f47062b.hashCode();
        }

        public String toString() {
            return "LoadFail(page=" + this.f47061a + ", error=" + this.f47062b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.g0 f47063a;

        /* renamed from: b  reason: collision with root package name */
        public final NoticeCampaignResponse f47064b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jf.g0 g0Var, NoticeCampaignResponse noticeCampaignResponse) {
            super(null);
            jo.p.h(g0Var, "page");
            jo.p.h(noticeCampaignResponse, "response");
            this.f47063a = g0Var;
            this.f47064b = noticeCampaignResponse;
        }

        public final jf.g0 a() {
            return this.f47063a;
        }

        public final NoticeCampaignResponse b() {
            return this.f47064b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f47063a == bVar.f47063a && jo.p.c(this.f47064b, bVar.f47064b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f47063a.hashCode() * 31) + this.f47064b.hashCode();
        }

        public String toString() {
            return "LoadFinish(page=" + this.f47063a + ", response=" + this.f47064b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.g0 f47065a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(jf.g0 g0Var) {
            super(null);
            jo.p.h(g0Var, "page");
            this.f47065a = g0Var;
        }

        public final jf.g0 a() {
            return this.f47065a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f47065a == ((c) obj).f47065a;
        }

        public int hashCode() {
            return this.f47065a.hashCode();
        }

        public String toString() {
            return "LoadNext(page=" + this.f47065a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.g0 f47066a;

        /* renamed from: b  reason: collision with root package name */
        public final NoticeCampaignResponse f47067b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(jf.g0 g0Var, NoticeCampaignResponse noticeCampaignResponse) {
            super(null);
            jo.p.h(g0Var, "page");
            jo.p.h(noticeCampaignResponse, "response");
            this.f47066a = g0Var;
            this.f47067b = noticeCampaignResponse;
        }

        public final jf.g0 a() {
            return this.f47066a;
        }

        public final NoticeCampaignResponse b() {
            return this.f47067b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f47066a == dVar.f47066a && jo.p.c(this.f47067b, dVar.f47067b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f47066a.hashCode() * 31) + this.f47067b.hashCode();
        }

        public String toString() {
            return "LoadNotice(page=" + this.f47066a + ", response=" + this.f47067b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.g0 f47068a;

        /* renamed from: b  reason: collision with root package name */
        public final long f47069b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(jf.g0 g0Var, long j10) {
            super(null);
            jo.p.h(g0Var, "page");
            this.f47068a = g0Var;
            this.f47069b = j10;
        }

        public final long a() {
            return this.f47069b;
        }

        public final jf.g0 b() {
            return this.f47068a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.f47068a == eVar.f47068a && this.f47069b == eVar.f47069b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f47068a.hashCode() * 31) + Long.hashCode(this.f47069b);
        }

        public String toString() {
            return "Reload(page=" + this.f47068a + ", lastViewedTime=" + this.f47069b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.g0 f47070a;

        /* renamed from: b  reason: collision with root package name */
        public final long f47071b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f47072c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(jf.g0 g0Var, long j10, boolean z10) {
            super(null);
            jo.p.h(g0Var, "page");
            this.f47070a = g0Var;
            this.f47071b = j10;
            this.f47072c = z10;
        }

        public final boolean a() {
            return this.f47072c;
        }

        public final long b() {
            return this.f47071b;
        }

        public final jf.g0 c() {
            return this.f47070a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return this.f47070a == fVar.f47070a && this.f47071b == fVar.f47071b && this.f47072c == fVar.f47072c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f47070a.hashCode() * 31) + Long.hashCode(this.f47071b)) * 31;
            boolean z10 = this.f47072c;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "ReloadFinish(page=" + this.f47070a + ", noticeLatestTime=" + this.f47071b + ", hasCampaignNotice=" + this.f47072c + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.g0 f47073a;

        /* renamed from: b  reason: collision with root package name */
        public final CampaignNotice f47074b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(jf.g0 g0Var, CampaignNotice campaignNotice) {
            super(null);
            jo.p.h(g0Var, "page");
            jo.p.h(campaignNotice, Referer.NOTICE);
            this.f47073a = g0Var;
            this.f47074b = campaignNotice;
        }

        public final CampaignNotice a() {
            return this.f47074b;
        }

        public final jf.g0 b() {
            return this.f47073a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return this.f47073a == gVar.f47073a && jo.p.c(this.f47074b, gVar.f47074b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f47073a.hashCode() * 31) + this.f47074b.hashCode();
        }

        public String toString() {
            return "ViewNotice(page=" + this.f47073a + ", notice=" + this.f47074b + ')';
        }
    }

    public m0() {
    }

    public /* synthetic */ m0(jo.h hVar) {
        this();
    }
}
