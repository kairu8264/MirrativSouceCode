package hd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.KycInfo;
import com.dena.mirrativ.mirrativapi.user.RewardHistoryResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public abstract class f {

    /* loaded from: classes2.dex */
    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final KycInfo f35377a;

        public a(KycInfo kycInfo) {
            super(null);
            this.f35377a = kycInfo;
        }

        public final KycInfo a() {
            return this.f35377a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f35377a, ((a) obj).f35377a);
        }

        public int hashCode() {
            KycInfo kycInfo = this.f35377a;
            if (kycInfo == null) {
                return 0;
            }
            return kycInfo.hashCode();
        }

        public String toString() {
            return "FetchEditBankAccountParamsSucceeded(kycInfo=" + this.f35377a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f35378a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f35378a = mRError;
        }

        public final MRError a() {
            return this.f35378a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f35378a, ((b) obj).f35378a);
        }

        public int hashCode() {
            return this.f35378a.hashCode();
        }

        public String toString() {
            return "LoadFail(error=" + this.f35378a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends f {

        /* renamed from: a  reason: collision with root package name */
        public final RewardHistoryResponse f35379a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RewardHistoryResponse rewardHistoryResponse) {
            super(null);
            jo.p.h(rewardHistoryResponse, "response");
            this.f35379a = rewardHistoryResponse;
        }

        public final RewardHistoryResponse a() {
            return this.f35379a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f35379a, ((c) obj).f35379a);
        }

        public int hashCode() {
            return this.f35379a.hashCode();
        }

        public String toString() {
            return "LoadFinish(response=" + this.f35379a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends f {

        /* renamed from: a  reason: collision with root package name */
        public final ContractSummaryResponse f35380a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ContractSummaryResponse contractSummaryResponse) {
            super(null);
            jo.p.h(contractSummaryResponse, "response");
            this.f35380a = contractSummaryResponse;
        }

        public final ContractSummaryResponse a() {
            return this.f35380a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f35380a, ((d) obj).f35380a);
        }

        public int hashCode() {
            return this.f35380a.hashCode();
        }

        public String toString() {
            return "LoadFinishSummary(response=" + this.f35380a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f35381a = new e();

        public e() {
            super(null);
        }
    }

    /* renamed from: hd.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0448f extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final C0448f f35382a = new C0448f();

        public C0448f() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final g f35383a = new g();

        public g() {
            super(null);
        }
    }

    public f() {
    }

    public /* synthetic */ f(jo.h hVar) {
        this();
    }
}
