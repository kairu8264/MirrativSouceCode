package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.net.api.response.ConnectedStreamingCollabLivesResponse;
import com.dena.mirrorman.net.api.response.EmomoRunGameGift;
import com.dena.mirrorman.net.api.response.FeverValue;
import com.dena.mirrorman.net.api.response.GiftGachaOpenResponse;
import com.dena.mirrorman.net.api.response.GiftGachaStockType;
import com.dena.mirrorman.net.api.response.MutualGiftReceiveRewardResponse;
import com.dena.mirrorman.net.api.response.SimpleGiftGachaStock;
import com.dena.mirrorman.net.api.response.event.RankingUserDetailResponse;
import com.dena.mirrorman.net.api.response.live.LiveHeartbeatResponse;
import com.dena.mirrorman.net.api.response.live.LiveOwnedResponse;
import com.dena.mirrorman.net.api.response.livegame.NewCountsResponse;
import com.dena.mirrorman.net.bcsvr.response.EventFeverState;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingChangedBcsvrResponse;
import java.util.List;
import ud.d4;

/* loaded from: classes2.dex */
public abstract class c {

    /* loaded from: classes2.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46627a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46627a = mRError;
        }

        public final MRError a() {
            return this.f46627a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f46627a, ((a) obj).f46627a);
        }

        public int hashCode() {
            return this.f46627a.hashCode();
        }

        public String toString() {
            return "AppUserDetailFailedEvent(error=" + this.f46627a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46628a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46628a = mRError;
        }

        public final MRError a() {
            return this.f46628a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && jo.p.c(this.f46628a, ((a0) obj).f46628a);
        }

        public int hashCode() {
            return this.f46628a.hashCode();
        }

        public String toString() {
            return "PostAppUserDetailFailedEvent(error=" + this.f46628a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public final AppUserDetailResponse f46629a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AppUserDetailResponse appUserDetailResponse) {
            super(null);
            jo.p.h(appUserDetailResponse, "appUserDetailResponse");
            this.f46629a = appUserDetailResponse;
        }

        public final AppUserDetailResponse a() {
            return this.f46629a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f46629a, ((b) obj).f46629a);
        }

        public int hashCode() {
            return this.f46629a.hashCode();
        }

        public String toString() {
            return "AppUserDetailSucceededEvent(appUserDetailResponse=" + this.f46629a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public final AppUserDetailResponse f46630a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(AppUserDetailResponse appUserDetailResponse) {
            super(null);
            jo.p.h(appUserDetailResponse, "appUserDetailResponse");
            this.f46630a = appUserDetailResponse;
        }

        public final AppUserDetailResponse a() {
            return this.f46630a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && jo.p.c(this.f46630a, ((b0) obj).f46630a);
        }

        public int hashCode() {
            return this.f46630a.hashCode();
        }

        public String toString() {
            return "PostAppUserDetailSucceededEvent(appUserDetailResponse=" + this.f46630a + ')';
        }
    }

    /* renamed from: pd.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0712c extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final C0712c f46631a = new C0712c();

        public C0712c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46632a;

        public c0(boolean z10) {
            super(null);
            this.f46632a = z10;
        }

        public final boolean a() {
            return this.f46632a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && this.f46632a == ((c0) obj).f46632a;
        }

        public int hashCode() {
            boolean z10 = this.f46632a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "PostUserMatchingCollabEnabledSucceeded(enabled=" + this.f46632a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends c {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46633a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46633a = mRError;
        }

        public final MRError a() {
            return this.f46633a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f46633a, ((d) obj).f46633a);
        }

        public int hashCode() {
            return this.f46633a.hashCode();
        }

        public String toString() {
            return "CommentAppUserIdFailedEvent(error=" + this.f46633a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public final d4 f46634a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(d4 d4Var) {
            super(null);
            jo.p.h(d4Var, "comment");
            this.f46634a = d4Var;
        }

        public final d4 a() {
            return this.f46634a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && jo.p.c(this.f46634a, ((d0) obj).f46634a);
        }

        public int hashCode() {
            return this.f46634a.hashCode();
        }

        public String toString() {
            return "ReceiveComment(comment=" + this.f46634a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends c {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46635a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46635a = mRError;
        }

        public final MRError a() {
            return this.f46635a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f46635a, ((e) obj).f46635a);
        }

        public int hashCode() {
            return this.f46635a.hashCode();
        }

        public String toString() {
            return "CommentMultiUrlFailedEvent(error=" + this.f46635a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public final EmomoRunGameGift f46636a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(EmomoRunGameGift emomoRunGameGift) {
            super(null);
            jo.p.h(emomoRunGameGift, "emomoRunGameGift");
            this.f46636a = emomoRunGameGift;
        }

        public final EmomoRunGameGift a() {
            return this.f46636a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && jo.p.c(this.f46636a, ((e0) obj).f46636a);
        }

        public int hashCode() {
            return this.f46636a.hashCode();
        }

        public String toString() {
            return "ReceiveEmomoRunGameGift(emomoRunGameGift=" + this.f46636a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final f f46637a = new f();

        public f() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public final SimpleGiftGachaStock f46638a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(SimpleGiftGachaStock simpleGiftGachaStock) {
            super(null);
            jo.p.h(simpleGiftGachaStock, "giftGachaStock");
            this.f46638a = simpleGiftGachaStock;
        }

        public final SimpleGiftGachaStock a() {
            return this.f46638a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f0) && jo.p.c(this.f46638a, ((f0) obj).f46638a);
        }

        public int hashCode() {
            return this.f46638a.hashCode();
        }

        public String toString() {
            return "ReceiveGiftGacha(giftGachaStock=" + this.f46638a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends c {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46639a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46639a = mRError;
        }

        public final MRError a() {
            return this.f46639a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f46639a, ((g) obj).f46639a);
        }

        public int hashCode() {
            return this.f46639a.hashCode();
        }

        public String toString() {
            return "DeleteAppUserDetailFailedEvent(error=" + this.f46639a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public final String f46640a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f46640a = str;
        }

        public final String a() {
            return this.f46640a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g0) && jo.p.c(this.f46640a, ((g0) obj).f46640a);
        }

        public int hashCode() {
            return this.f46640a.hashCode();
        }

        public String toString() {
            return "RemoveCollabUser(userId=" + this.f46640a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final h f46641a = new h();

        public h() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final h0 f46642a = new h0();

        public h0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends c {

        /* renamed from: a  reason: collision with root package name */
        public final String f46643a;

        /* renamed from: b  reason: collision with root package name */
        public final MRError f46644b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, MRError mRError) {
            super(null);
            jo.p.h(str, "commentText");
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46643a = str;
            this.f46644b = mRError;
        }

        public final String a() {
            return this.f46643a;
        }

        public final MRError b() {
            return this.f46644b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return jo.p.c(this.f46643a, iVar.f46643a) && jo.p.c(this.f46644b, iVar.f46644b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f46643a.hashCode() * 31) + this.f46644b.hashCode();
        }

        public String toString() {
            return "FailPostComment(commentText=" + this.f46643a + ", error=" + this.f46644b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public final List<d4> f46645a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i0(List<? extends d4> list) {
            super(null);
            jo.p.h(list, "comments");
            this.f46645a = list;
        }

        public final List<d4> a() {
            return this.f46645a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i0) && jo.p.c(this.f46645a, ((i0) obj).f46645a);
        }

        public int hashCode() {
            return this.f46645a.hashCode();
        }

        public String toString() {
            return "SetComments(comments=" + this.f46645a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends c {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46646a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46646a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && jo.p.c(this.f46646a, ((j) obj).f46646a);
        }

        public int hashCode() {
            return this.f46646a.hashCode();
        }

        public String toString() {
            return "FailedToLoadReconnectCollabInfo(error=" + this.f46646a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public final int f46647a;

        public j0(int i10) {
            super(null);
            this.f46647a = i10;
        }

        public final int a() {
            return this.f46647a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j0) && this.f46647a == ((j0) obj).f46647a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46647a);
        }

        public String toString() {
            return "SetCurrentEventType(eventType=" + this.f46647a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends c {

        /* renamed from: a  reason: collision with root package name */
        public final List<SimpleGiftGachaStock> f46648a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List<SimpleGiftGachaStock> list) {
            super(null);
            jo.p.h(list, "giftGachaStocks");
            this.f46648a = list;
        }

        public final List<SimpleGiftGachaStock> a() {
            return this.f46648a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(this.f46648a, ((k) obj).f46648a);
        }

        public int hashCode() {
            return this.f46648a.hashCode();
        }

        public String toString() {
            return "FetchGiftGachaUserStocks(giftGachaStocks=" + this.f46648a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public final String f46649a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(String str) {
            super(null);
            jo.p.h(str, "message");
            this.f46649a = str;
        }

        public final String a() {
            return this.f46649a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k0) && jo.p.c(this.f46649a, ((k0) obj).f46649a);
        }

        public int hashCode() {
            return this.f46649a.hashCode();
        }

        public String toString() {
            return "ShowToast(message=" + this.f46649a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends c {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46650a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46650a = mRError;
        }

        public final MRError a() {
            return this.f46650a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && jo.p.c(this.f46650a, ((l) obj).f46650a);
        }

        public int hashCode() {
            return this.f46650a.hashCode();
        }

        public String toString() {
            return "FetchGiftRankingUserDetailFailed(error=" + this.f46650a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final l0 f46651a = new l0();

        public l0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends c {

        /* renamed from: a  reason: collision with root package name */
        public final RankingUserDetailResponse f46652a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(RankingUserDetailResponse rankingUserDetailResponse) {
            super(null);
            jo.p.h(rankingUserDetailResponse, "response");
            this.f46652a = rankingUserDetailResponse;
        }

        public final RankingUserDetailResponse a() {
            return this.f46652a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && jo.p.c(this.f46652a, ((m) obj).f46652a);
        }

        public int hashCode() {
            return this.f46652a.hashCode();
        }

        public String toString() {
            return "FetchGiftRankingUserDetailSucceeded(response=" + this.f46652a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final m0 f46653a = new m0();

        public m0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends c {

        /* renamed from: a  reason: collision with root package name */
        public final GiftRankingChangedBcsvrResponse f46654a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(GiftRankingChangedBcsvrResponse giftRankingChangedBcsvrResponse) {
            super(null);
            jo.p.h(giftRankingChangedBcsvrResponse, "response");
            this.f46654a = giftRankingChangedBcsvrResponse;
        }

        public final GiftRankingChangedBcsvrResponse a() {
            return this.f46654a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && jo.p.c(this.f46654a, ((n) obj).f46654a);
        }

        public int hashCode() {
            return this.f46654a.hashCode();
        }

        public String toString() {
            return "GiftRankingUserChanged(response=" + this.f46654a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final n0 f46655a = new n0();

        public n0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends c {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46656a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46656a = mRError;
        }

        public final MRError a() {
            return this.f46656a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && jo.p.c(this.f46656a, ((o) obj).f46656a);
        }

        public int hashCode() {
            return this.f46656a.hashCode();
        }

        public String toString() {
            return "LiveEndFailed(error=" + this.f46656a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class o0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final o0 f46657a = new o0();

        public o0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final p f46658a = new p();

        public p() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46659a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f46660b;

        public p0(boolean z10, boolean z11) {
            super(null);
            this.f46659a = z10;
            this.f46660b = z11;
        }

        public final boolean a() {
            return this.f46659a;
        }

        public final boolean b() {
            return this.f46660b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p0) {
                p0 p0Var = (p0) obj;
                return this.f46659a == p0Var.f46659a && this.f46660b == p0Var.f46660b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z10 = this.f46659a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i10 = r02 * 31;
            boolean z11 = this.f46660b;
            return i10 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public String toString() {
            return "SwitchScreenSharing(isMuteScreenSharing=" + this.f46659a + ", isTemporary=" + this.f46660b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends c {

        /* renamed from: a  reason: collision with root package name */
        public final LiveHeartbeatResponse f46661a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(LiveHeartbeatResponse liveHeartbeatResponse) {
            super(null);
            jo.p.h(liveHeartbeatResponse, "response");
            this.f46661a = liveHeartbeatResponse;
        }

        public final LiveHeartbeatResponse a() {
            return this.f46661a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && jo.p.c(this.f46661a, ((q) obj).f46661a);
        }

        public int hashCode() {
            return this.f46661a.hashCode();
        }

        public String toString() {
            return "LiveHeartBeatSuccess(response=" + this.f46661a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class q0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public final String f46662a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46663b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(String str, int i10) {
            super(null);
            jo.p.h(str, "userId");
            this.f46662a = str;
            this.f46663b = i10;
        }

        public final int a() {
            return this.f46663b;
        }

        public final String b() {
            return this.f46662a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q0) {
                q0 q0Var = (q0) obj;
                return jo.p.c(this.f46662a, q0Var.f46662a) && this.f46663b == q0Var.f46663b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f46662a.hashCode() * 31) + Integer.hashCode(this.f46663b);
        }

        public String toString() {
            return "UpdateCollabVolume(userId=" + this.f46662a + ", progress=" + this.f46663b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends c {

        /* renamed from: a  reason: collision with root package name */
        public final LiveOwnedResponse f46664a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(LiveOwnedResponse liveOwnedResponse) {
            super(null);
            jo.p.h(liveOwnedResponse, "response");
            this.f46664a = liveOwnedResponse;
        }

        public final LiveOwnedResponse a() {
            return this.f46664a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && jo.p.c(this.f46664a, ((r) obj).f46664a);
        }

        public int hashCode() {
            return this.f46664a.hashCode();
        }

        public String toString() {
            return "LiveStartSuccess(response=" + this.f46664a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class r0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public final FeverValue f46665a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(FeverValue feverValue) {
            super(null);
            jo.p.h(feverValue, "feverValue");
            this.f46665a = feverValue;
        }

        public final FeverValue a() {
            return this.f46665a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r0) && jo.p.c(this.f46665a, ((r0) obj).f46665a);
        }

        public int hashCode() {
            return this.f46665a.hashCode();
        }

        public String toString() {
            return "UpdateFeverValue(feverValue=" + this.f46665a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends c {

        /* renamed from: a  reason: collision with root package name */
        public final ConnectedStreamingCollabLivesResponse f46666a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ConnectedStreamingCollabLivesResponse connectedStreamingCollabLivesResponse) {
            super(null);
            jo.p.h(connectedStreamingCollabLivesResponse, "connectedStreamingCollabLivesResponse");
            this.f46666a = connectedStreamingCollabLivesResponse;
        }

        public final ConnectedStreamingCollabLivesResponse a() {
            return this.f46666a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && jo.p.c(this.f46666a, ((s) obj).f46666a);
        }

        public int hashCode() {
            return this.f46666a.hashCode();
        }

        public String toString() {
            return "LoadConnectedStreamingCollabLives(connectedStreamingCollabLivesResponse=" + this.f46666a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class s0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46667a;

        public s0(boolean z10) {
            super(null);
            this.f46667a = z10;
        }

        public final boolean a() {
            return this.f46667a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s0) && this.f46667a == ((s0) obj).f46667a;
        }

        public int hashCode() {
            boolean z10 = this.f46667a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "UpdateGiftOverlayEnable(giftOverlayEnable=" + this.f46667a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends c {

        /* renamed from: a  reason: collision with root package name */
        public final EventFeverState f46668a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(EventFeverState eventFeverState) {
            super(null);
            jo.p.h(eventFeverState, "eventFeverState");
            this.f46668a = eventFeverState;
        }

        public final EventFeverState a() {
            return this.f46668a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && jo.p.c(this.f46668a, ((t) obj).f46668a);
        }

        public int hashCode() {
            return this.f46668a.hashCode();
        }

        public String toString() {
            return "LoadEventFeverState(eventFeverState=" + this.f46668a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class t0 extends c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46669a;

        public t0(boolean z10) {
            super(null);
            this.f46669a = z10;
        }

        public final boolean a() {
            return this.f46669a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t0) && this.f46669a == ((t0) obj).f46669a;
        }

        public int hashCode() {
            boolean z10 = this.f46669a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "UpdatedIsWiredHeadsetConnected(isWiredHeadsetConnected=" + this.f46669a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends c {

        /* renamed from: a  reason: collision with root package name */
        public final NewCountsResponse f46670a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(NewCountsResponse newCountsResponse) {
            super(null);
            jo.p.h(newCountsResponse, "response");
            this.f46670a = newCountsResponse;
        }

        public final NewCountsResponse a() {
            return this.f46670a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && jo.p.c(this.f46670a, ((u) obj).f46670a);
        }

        public int hashCode() {
            return this.f46670a.hashCode();
        }

        public String toString() {
            return "LoadedLiveGameNewCounts(response=" + this.f46670a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends c {

        /* renamed from: a  reason: collision with root package name */
        public final String f46671a;

        /* renamed from: b  reason: collision with root package name */
        public final String f46672b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, String str2) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(str2, "referer");
            this.f46671a = str;
            this.f46672b = str2;
        }

        public final String a() {
            return this.f46671a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof v) {
                v vVar = (v) obj;
                return jo.p.c(this.f46671a, vVar.f46671a) && jo.p.c(this.f46672b, vVar.f46672b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f46671a.hashCode() * 31) + this.f46672b.hashCode();
        }

        public String toString() {
            return "NotifyConfirmKickUserEvent(userId=" + this.f46671a + ", referer=" + this.f46672b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends c {

        /* renamed from: a  reason: collision with root package name */
        public final GiftGachaOpenResponse f46673a;

        /* renamed from: b  reason: collision with root package name */
        public final GiftGachaStockType f46674b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(GiftGachaOpenResponse giftGachaOpenResponse, GiftGachaStockType giftGachaStockType) {
            super(null);
            jo.p.h(giftGachaOpenResponse, "response");
            jo.p.h(giftGachaStockType, "giftGachaStockType");
            this.f46673a = giftGachaOpenResponse;
            this.f46674b = giftGachaStockType;
        }

        public final GiftGachaStockType a() {
            return this.f46674b;
        }

        public final GiftGachaOpenResponse b() {
            return this.f46673a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof w) {
                w wVar = (w) obj;
                return jo.p.c(this.f46673a, wVar.f46673a) && this.f46674b == wVar.f46674b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f46673a.hashCode() * 31) + this.f46674b.hashCode();
        }

        public String toString() {
            return "OpenedGiftGacha(response=" + this.f46673a + ", giftGachaStockType=" + this.f46674b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends c {

        /* renamed from: a  reason: collision with root package name */
        public final MutualGiftReceiveRewardResponse f46675a;

        /* renamed from: b  reason: collision with root package name */
        public final ud.o0 f46676b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(MutualGiftReceiveRewardResponse mutualGiftReceiveRewardResponse, ud.o0 o0Var) {
            super(null);
            jo.p.h(mutualGiftReceiveRewardResponse, "response");
            jo.p.h(o0Var, "mutualGift");
            this.f46675a = mutualGiftReceiveRewardResponse;
            this.f46676b = o0Var;
        }

        public final ud.o0 a() {
            return this.f46676b;
        }

        public final MutualGiftReceiveRewardResponse b() {
            return this.f46675a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof x) {
                x xVar = (x) obj;
                return jo.p.c(this.f46675a, xVar.f46675a) && jo.p.c(this.f46676b, xVar.f46676b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f46675a.hashCode() * 31) + this.f46676b.hashCode();
        }

        public String toString() {
            return "OpenedMutualGift(response=" + this.f46675a + ", mutualGift=" + this.f46676b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final y f46677a = new y();

        public y() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final z f46678a = new z();

        public z() {
            super(null);
        }
    }

    public c() {
    }

    public /* synthetic */ c(jo.h hVar) {
        this();
    }
}
