package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingEventDetailResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingEventResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public abstract class q {

    /* loaded from: classes2.dex */
    public static final class a extends q {

        /* renamed from: a  reason: collision with root package name */
        public final int f47112a;

        public a(int i10) {
            super(null);
            this.f47112a = i10;
        }

        public final int a() {
            return this.f47112a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f47112a == ((a) obj).f47112a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47112a);
        }

        public String toString() {
            return "CurrentTermChangeEvent(currentTerm=" + this.f47112a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q {

        /* renamed from: a  reason: collision with root package name */
        public final GiftRankingEventResponse f47113a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GiftRankingEventResponse giftRankingEventResponse) {
            super(null);
            jo.p.h(giftRankingEventResponse, "giftEvent");
            this.f47113a = giftRankingEventResponse;
        }

        public final GiftRankingEventResponse a() {
            return this.f47113a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47113a, ((b) obj).f47113a);
        }

        public int hashCode() {
            return this.f47113a.hashCode();
        }

        public String toString() {
            return "GiftEventDataChangeEvent(giftEvent=" + this.f47113a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47114a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47114a = mRError;
        }

        public final MRError a() {
            return this.f47114a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47114a, ((c) obj).f47114a);
        }

        public int hashCode() {
            return this.f47114a.hashCode();
        }

        public String toString() {
            return "GiftEventDataFailEvent(error=" + this.f47114a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q {

        /* renamed from: a  reason: collision with root package name */
        public static final d f47115a = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q {

        /* renamed from: a  reason: collision with root package name */
        public static final e f47116a = new e();

        public e() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q {

        /* renamed from: a  reason: collision with root package name */
        public final GiftRankingEventDetailResponse f47117a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(GiftRankingEventDetailResponse giftRankingEventDetailResponse) {
            super(null);
            jo.p.h(giftRankingEventDetailResponse, "giftEventRanking");
            this.f47117a = giftRankingEventDetailResponse;
        }

        public final GiftRankingEventDetailResponse a() {
            return this.f47117a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f47117a, ((f) obj).f47117a);
        }

        public int hashCode() {
            return this.f47117a.hashCode();
        }

        public String toString() {
            return "GiftEventRankingDataChangeEvent(giftEventRanking=" + this.f47117a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47118a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47118a = mRError;
        }

        public final MRError a() {
            return this.f47118a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f47118a, ((g) obj).f47118a);
        }

        public int hashCode() {
            return this.f47118a.hashCode();
        }

        public String toString() {
            return "GiftEventRankingDataFailEvent(error=" + this.f47118a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q {

        /* renamed from: a  reason: collision with root package name */
        public static final h f47119a = new h();

        public h() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47120a;

        public i(boolean z10) {
            super(null);
            this.f47120a = z10;
        }

        public final boolean a() {
            return this.f47120a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f47120a == ((i) obj).f47120a;
        }

        public int hashCode() {
            boolean z10 = this.f47120a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "RankingStateChangeEvent(isRankingExpanded=" + this.f47120a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47121a;

        public j(boolean z10) {
            super(null);
            this.f47121a = z10;
        }

        public final boolean a() {
            return this.f47121a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f47121a == ((j) obj).f47121a;
        }

        public int hashCode() {
            boolean z10 = this.f47121a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "RewardPointTypeChangeEvent(isRewardPointTypeSent=" + this.f47121a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47122a;

        public k(boolean z10) {
            super(null);
            this.f47122a = z10;
        }

        public final boolean a() {
            return this.f47122a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f47122a == ((k) obj).f47122a;
        }

        public int hashCode() {
            boolean z10 = this.f47122a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "RewardTypeChangeEvent(isPointReward=" + this.f47122a + ')';
        }
    }

    public q() {
    }

    public /* synthetic */ q(jo.h hVar) {
        this();
    }
}
