package gd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.otherfeatures.passbook.coin.CoinHistoriesResponse;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.AvailableRewardAdIdsResponse;
import jo.p;

/* loaded from: classes2.dex */
public abstract class d {

    /* loaded from: classes2.dex */
    public static final class a extends d {

        /* renamed from: b  reason: collision with root package name */
        public static final int f33197b = AvailableRewardAdIdsResponse.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final AvailableRewardAdIdsResponse f33198a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AvailableRewardAdIdsResponse availableRewardAdIdsResponse) {
            super(null);
            p.h(availableRewardAdIdsResponse, "response");
            this.f33198a = availableRewardAdIdsResponse;
        }

        public final AvailableRewardAdIdsResponse a() {
            return this.f33198a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p.c(this.f33198a, ((a) obj).f33198a);
        }

        public int hashCode() {
            return this.f33198a.hashCode();
        }

        public String toString() {
            return "LoadAvailableRewardAdIds(response=" + this.f33198a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f33199a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f33199a = mRError;
        }

        public final MRError a() {
            return this.f33199a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p.c(this.f33199a, ((b) obj).f33199a);
        }

        public int hashCode() {
            return this.f33199a.hashCode();
        }

        public String toString() {
            return "LoadFail(error=" + this.f33199a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f33200a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f33200a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p.c(this.f33200a, ((c) obj).f33200a);
        }

        public int hashCode() {
            return this.f33200a.hashCode();
        }

        public String toString() {
            return "LoadFailSummary(error=" + this.f33200a + ')';
        }
    }

    /* renamed from: gd.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0401d extends d {

        /* renamed from: a  reason: collision with root package name */
        public final CoinHistoriesResponse f33201a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0401d(CoinHistoriesResponse coinHistoriesResponse) {
            super(null);
            p.h(coinHistoriesResponse, "response");
            this.f33201a = coinHistoriesResponse;
        }

        public final CoinHistoriesResponse a() {
            return this.f33201a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0401d) && p.c(this.f33201a, ((C0401d) obj).f33201a);
        }

        public int hashCode() {
            return this.f33201a.hashCode();
        }

        public String toString() {
            return "LoadFinish(response=" + this.f33201a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends d {

        /* renamed from: a  reason: collision with root package name */
        public final ContractSummaryResponse f33202a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ContractSummaryResponse contractSummaryResponse) {
            super(null);
            p.h(contractSummaryResponse, "response");
            this.f33202a = contractSummaryResponse;
        }

        public final ContractSummaryResponse a() {
            return this.f33202a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p.c(this.f33202a, ((e) obj).f33202a);
        }

        public int hashCode() {
            return this.f33202a.hashCode();
        }

        public String toString() {
            return "LoadFinishSummary(response=" + this.f33202a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final f f33203a = new f();

        public f() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final g f33204a = new g();

        public g() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final h f33205a = new h();

        public h() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends d {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f33206a;

        public i(boolean z10) {
            super(null);
            this.f33206a = z10;
        }

        public final boolean a() {
            return this.f33206a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f33206a == ((i) obj).f33206a;
        }

        public int hashCode() {
            boolean z10 = this.f33206a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "UpdatedCoingGetIconVisibility(isVisible=" + this.f33206a + ')';
        }
    }

    public d() {
    }

    public /* synthetic */ d(jo.h hVar) {
        this();
    }
}
