package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestGachaTicket;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunScoreResponse;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.net.api.response.EmomoRunState;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.LiveStreamingUrlResponse;
import com.dena.mirrorman.net.api.response.event.RankingUserDetailResponse;
import com.dena.mirrorman.net.api.response.live.LinkedLive;
import com.dena.mirrorman.net.api.response.live.LiveCommentResponse;
import com.dena.mirrorman.net.api.response.live.LiveOnlineUsersResponse;
import com.dena.mirrorman.net.api.response.user.LiveViewingUser;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.dena.mirrorman.net.bcsvr.response.CollabChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.EmomoQuestGameStateBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveChangedResponse;
import com.dena.mirrorman.net.bcsvr.response.RankingUser;
import com.dena.mirrorman.net.bcsvr.response.UserLevelUpdate;
import com.dena.mirrorman.net.quiz.QuizMessage;
import java.util.List;
import ud.r2;

/* loaded from: classes2.dex */
public abstract class q0 {

    /* loaded from: classes2.dex */
    public static final class a extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.h f47123a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jf.h hVar) {
            super(null);
            jo.p.h(hVar, "collabInfo");
            this.f47123a = hVar;
        }

        public final jf.h a() {
            return this.f47123a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47123a, ((a) obj).f47123a);
        }

        public int hashCode() {
            return this.f47123a.hashCode();
        }

        public String toString() {
            return "AcceptedCollabInvitation(collabInfo=" + this.f47123a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.q f47124a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(jf.q qVar) {
            super(null);
            jo.p.h(qVar, "gift");
            this.f47124a = qVar;
        }

        public final jf.q a() {
            return this.f47124a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && jo.p.c(this.f47124a, ((a0) obj).f47124a);
        }

        public int hashCode() {
            return this.f47124a.hashCode();
        }

        public String toString() {
            return "GiftSendSucceeded(gift=" + this.f47124a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class a1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final r2 f47125a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(r2 r2Var) {
            super(null);
            jo.p.h(r2Var, "comment");
            this.f47125a = r2Var;
        }

        public final r2 a() {
            return this.f47125a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a1) && jo.p.c(this.f47125a, ((a1) obj).f47125a);
        }

        public int hashCode() {
            return this.f47125a.hashCode();
        }

        public String toString() {
            return "ReceiveCommentEvent(comment=" + this.f47125a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class a2 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final LiveOnlineUsersResponse f47126a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a2(LiveOnlineUsersResponse liveOnlineUsersResponse) {
            super(null);
            jo.p.h(liveOnlineUsersResponse, "liveViewers");
            this.f47126a = liveOnlineUsersResponse;
        }

        public final LiveOnlineUsersResponse a() {
            return this.f47126a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a2) && jo.p.c(this.f47126a, ((a2) obj).f47126a);
        }

        public int hashCode() {
            return this.f47126a.hashCode();
        }

        public String toString() {
            return "ViewerListReloadFinishEvent(liveViewers=" + this.f47126a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47127a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47128a;

        public b0(boolean z10) {
            super(null);
            this.f47128a = z10;
        }

        public final boolean a() {
            return this.f47128a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && this.f47128a == ((b0) obj).f47128a;
        }

        public int hashCode() {
            boolean z10 = this.f47128a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "IsMyAppChangeEvent(isMyApp=" + this.f47128a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final GiftItem f47129a;

        public b1(GiftItem giftItem) {
            super(null);
            this.f47129a = giftItem;
        }

        public final GiftItem a() {
            return this.f47129a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b1) && jo.p.c(this.f47129a, ((b1) obj).f47129a);
        }

        public int hashCode() {
            GiftItem giftItem = this.f47129a;
            if (giftItem == null) {
                return 0;
            }
            return giftItem.hashCode();
        }

        public String toString() {
            return "ReceivePaidCommentEvent(gift=" + this.f47129a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47130a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47130a = mRError;
        }

        public final MRError a() {
            return this.f47130a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47130a, ((c) obj).f47130a);
        }

        public int hashCode() {
            return this.f47130a.hashCode();
        }

        public String toString() {
            return "AnswerQuizFailEvent(error=" + this.f47130a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final LiveGameStartResponse f47131a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f47132b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(LiveGameStartResponse liveGameStartResponse, boolean z10) {
            super(null);
            jo.p.h(liveGameStartResponse, "startResponse");
            this.f47131a = liveGameStartResponse;
            this.f47132b = z10;
        }

        public final LiveGameStartResponse a() {
            return this.f47131a;
        }

        public final boolean b() {
            return this.f47132b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                return jo.p.c(this.f47131a, c0Var.f47131a) && this.f47132b == c0Var.f47132b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f47131a.hashCode() * 31;
            boolean z10 = this.f47132b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "JoinLiveGameSucceeded(startResponse=" + this.f47131a + ", isTransparent=" + this.f47132b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47133a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c1(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47133a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c1) && jo.p.c(this.f47133a, ((c1) obj).f47133a);
        }

        public int hashCode() {
            return this.f47133a.hashCode();
        }

        public String toString() {
            return "ReloadEmomoRunGiftsFail(error=" + this.f47133a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final d f47134a = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final LiveChangedResponse f47135a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(LiveChangedResponse liveChangedResponse) {
            super(null);
            jo.p.h(liveChangedResponse, "liveChangedResponse");
            this.f47135a = liveChangedResponse;
        }

        public final LiveChangedResponse a() {
            return this.f47135a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && jo.p.c(this.f47135a, ((d0) obj).f47135a);
        }

        public int hashCode() {
            return this.f47135a.hashCode();
        }

        public String toString() {
            return "LiveChangedEvent(liveChangedResponse=" + this.f47135a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final List<jf.q> f47136a;

        /* renamed from: b  reason: collision with root package name */
        public final String f47137b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(List<jf.q> list, String str) {
            super(null);
            jo.p.h(list, "gifts");
            jo.p.h(str, "helpPageUrl");
            this.f47136a = list;
            this.f47137b = str;
        }

        public final List<jf.q> a() {
            return this.f47136a;
        }

        public final String b() {
            return this.f47137b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d1) {
                d1 d1Var = (d1) obj;
                return jo.p.c(this.f47136a, d1Var.f47136a) && jo.p.c(this.f47137b, d1Var.f47137b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f47136a.hashCode() * 31) + this.f47137b.hashCode();
        }

        public String toString() {
            return "ReloadEmomoRunGiftsSucceeded(gifts=" + this.f47136a + ", helpPageUrl=" + this.f47137b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47138a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47138a = mRError;
        }

        public final MRError a() {
            return this.f47138a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f47138a, ((e) obj).f47138a);
        }

        public int hashCode() {
            return this.f47138a.hashCode();
        }

        public String toString() {
            return "ApiRequestFailed(error=" + this.f47138a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final e0 f47139a = new e0();

        public e0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47140a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47140a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e1) && jo.p.c(this.f47140a, ((e1) obj).f47140a);
        }

        public int hashCode() {
            return this.f47140a.hashCode();
        }

        public String toString() {
            return "ReloadGiftPanelsFailed(error=" + this.f47140a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q0 {
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47141a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47141a = mRError;
        }

        public final MRError a() {
            return this.f47141a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f0) && jo.p.c(this.f47141a, ((f0) obj).f47141a);
        }

        public int hashCode() {
            return this.f47141a.hashCode();
        }

        public String toString() {
            return "LiveLoadFailEvent(error=" + this.f47141a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final List<jf.s> f47142a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f1(List<jf.s> list) {
            super(null);
            jo.p.h(list, "panels");
            this.f47142a = list;
        }

        public final List<jf.s> a() {
            return this.f47142a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f1) && jo.p.c(this.f47142a, ((f1) obj).f47142a);
        }

        public int hashCode() {
            return this.f47142a.hashCode();
        }

        public String toString() {
            return "ReloadGiftPanelsSucceeded(panels=" + this.f47142a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final g f47143a = new g();

        public g() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47144a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(String str) {
            super(null);
            jo.p.h(str, "liveId");
            this.f47144a = str;
        }

        public final String a() {
            return this.f47144a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g0) && jo.p.c(this.f47144a, ((g0) obj).f47144a);
        }

        public int hashCode() {
            return this.f47144a.hashCode();
        }

        public String toString() {
            return "LiveLoadStartEvent(liveId=" + this.f47144a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final g1 f47145a = new g1();

        public g1() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final App.AppParams f47146a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(App.AppParams appParams) {
            super(null);
            jo.p.h(appParams, "app");
            this.f47146a = appParams;
        }

        public final App.AppParams a() {
            return this.f47146a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && jo.p.c(this.f47146a, ((h) obj).f47146a);
        }

        public int hashCode() {
            return this.f47146a.hashCode();
        }

        public String toString() {
            return "AppRegisterEvent(app=" + this.f47146a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final te.c f47147a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f47148b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(te.c cVar, boolean z10) {
            super(null);
            jo.p.h(cVar, "playRequestParams");
            this.f47147a = cVar;
            this.f47148b = z10;
        }

        public final te.c a() {
            return this.f47147a;
        }

        public final boolean b() {
            return this.f47148b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h0) {
                h0 h0Var = (h0) obj;
                return jo.p.c(this.f47147a, h0Var.f47147a) && this.f47148b == h0Var.f47148b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f47147a.hashCode() * 31;
            boolean z10 = this.f47148b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "LivePollingEvent(playRequestParams=" + this.f47147a + ", isMyApp=" + this.f47148b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final h1 f47149a = new h1();

        public h1() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final i f47150a = new i();

        public i() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final te.c f47151a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f47152b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f47153c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(te.c cVar, boolean z10, boolean z11) {
            super(null);
            jo.p.h(cVar, "playRequestParams");
            this.f47151a = cVar;
            this.f47152b = z10;
            this.f47153c = z11;
        }

        public final te.c a() {
            return this.f47151a;
        }

        public final boolean b() {
            return this.f47152b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i0) {
                i0 i0Var = (i0) obj;
                return jo.p.c(this.f47151a, i0Var.f47151a) && this.f47152b == i0Var.f47152b && this.f47153c == i0Var.f47153c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f47151a.hashCode() * 31;
            boolean z10 = this.f47152b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (hashCode + i10) * 31;
            boolean z11 = this.f47153c;
            return i11 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public String toString() {
            return "LiveStartEvent(playRequestParams=" + this.f47151a + ", isMyApp=" + this.f47152b + ", isMyLive=" + this.f47153c + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47154a;

        public i1(int i10) {
            super(null);
            this.f47154a = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i1) && this.f47154a == ((i1) obj).f47154a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47154a);
        }

        public String toString() {
            return "SendEmomoQuestGiftGachaSucceeded(gachaTicketCount=" + this.f47154a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final j f47155a = new j();

        public j() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47156a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47156a = mRError;
        }

        public final MRError a() {
            return this.f47156a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j0) && jo.p.c(this.f47156a, ((j0) obj).f47156a);
        }

        public int hashCode() {
            return this.f47156a.hashCode();
        }

        public String toString() {
            return "LiveStreamingUrlLoadFailedEvent(error=" + this.f47156a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final List<r2> f47157a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j1(List<? extends r2> list) {
            super(null);
            jo.p.h(list, "comments");
            this.f47157a = list;
        }

        public final List<r2> a() {
            return this.f47157a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j1) && jo.p.c(this.f47157a, ((j1) obj).f47157a);
        }

        public int hashCode() {
            return this.f47157a.hashCode();
        }

        public String toString() {
            return "SetCommentsEvent(comments=" + this.f47157a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final CollabChangedBcsvrResponse f47158a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(CollabChangedBcsvrResponse collabChangedBcsvrResponse) {
            super(null);
            jo.p.h(collabChangedBcsvrResponse, "collabChanged");
            this.f47158a = collabChangedBcsvrResponse;
        }

        public final CollabChangedBcsvrResponse a() {
            return this.f47158a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(this.f47158a, ((k) obj).f47158a);
        }

        public int hashCode() {
            return this.f47158a.hashCode();
        }

        public String toString() {
            return "CollabUserChanged(collabChanged=" + this.f47158a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final LiveStreamingUrlResponse f47159a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(LiveStreamingUrlResponse liveStreamingUrlResponse) {
            super(null);
            jo.p.h(liveStreamingUrlResponse, "liveStreamingUrlResponse");
            this.f47159a = liveStreamingUrlResponse;
        }

        public final LiveStreamingUrlResponse a() {
            return this.f47159a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k0) && jo.p.c(this.f47159a, ((k0) obj).f47159a);
        }

        public int hashCode() {
            return this.f47159a.hashCode();
        }

        public String toString() {
            return "LiveStreamingUrlLoadFinishedEvent(liveStreamingUrlResponse=" + this.f47159a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k1 extends q0 {
    }

    /* loaded from: classes2.dex */
    public static final class l extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47160a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47160a = mRError;
        }

        public final MRError a() {
            return this.f47160a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && jo.p.c(this.f47160a, ((l) obj).f47160a);
        }

        public int hashCode() {
            return this.f47160a.hashCode();
        }

        public String toString() {
            return "CommentAppUserIdFailedEvent(error=" + this.f47160a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final l0 f47161a = new l0();

        public l0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47162a;

        public l1(String str) {
            super(null);
            this.f47162a = str;
        }

        public final String a() {
            return this.f47162a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l1) && jo.p.c(this.f47162a, ((l1) obj).f47162a);
        }

        public int hashCode() {
            String str = this.f47162a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SetModeratorUserIdEvent(moderatorUserId=" + this.f47162a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47163a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47163a = mRError;
        }

        public final MRError a() {
            return this.f47163a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && jo.p.c(this.f47163a, ((m) obj).f47163a);
        }

        public int hashCode() {
            return this.f47163a.hashCode();
        }

        public String toString() {
            return "CommentMultiUrlFailedEvent(error=" + this.f47163a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final List<LiveViewingUser> f47164a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m0(List<? extends LiveViewingUser> list) {
            super(null);
            jo.p.h(list, "collaboratingUsers");
            this.f47164a = list;
        }

        public final List<LiveViewingUser> a() {
            return this.f47164a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m0) && jo.p.c(this.f47164a, ((m0) obj).f47164a);
        }

        public int hashCode() {
            return this.f47164a.hashCode();
        }

        public String toString() {
            return "LoadCollaboratingUsers(collaboratingUsers=" + this.f47164a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47165a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m1(String str) {
            super(null);
            jo.p.h(str, "url");
            this.f47165a = str;
        }

        public final String a() {
            return this.f47165a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m1) && jo.p.c(this.f47165a, ((m1) obj).f47165a);
        }

        public int hashCode() {
            return this.f47165a.hashCode();
        }

        public String toString() {
            return "ShowAnnouncementEvent(url=" + this.f47165a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final n f47166a = new n();

        public n() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47167a;

        /* renamed from: b  reason: collision with root package name */
        public final EmomoRunScoreResponse f47168b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(int i10, EmomoRunScoreResponse emomoRunScoreResponse) {
            super(null);
            jo.p.h(emomoRunScoreResponse, "response");
            this.f47167a = i10;
            this.f47168b = emomoRunScoreResponse;
        }

        public final EmomoRunScoreResponse a() {
            return this.f47168b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                return this.f47167a == n0Var.f47167a && jo.p.c(this.f47168b, n0Var.f47168b);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f47167a) * 31) + this.f47168b.hashCode();
        }

        public String toString() {
            return "LoadEmomoRunScore(giftEventId=" + this.f47167a + ", response=" + this.f47168b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final n1 f47169a = new n1();

        public n1() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47170a;

        public o(int i10) {
            super(null);
            this.f47170a = i10;
        }

        public final int a() {
            return this.f47170a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f47170a == ((o) obj).f47170a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47170a);
        }

        public String toString() {
            return "CommentScrollToTop(position=" + this.f47170a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class o0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final EventNoticeResponse f47171a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(EventNoticeResponse eventNoticeResponse) {
            super(null);
            jo.p.h(eventNoticeResponse, "eventNotice");
            this.f47171a = eventNoticeResponse;
        }

        public final EventNoticeResponse a() {
            return this.f47171a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o0) && jo.p.c(this.f47171a, ((o0) obj).f47171a);
        }

        public int hashCode() {
            return this.f47171a.hashCode();
        }

        public String toString() {
            return "LoadEventBannerFinish(eventNotice=" + this.f47171a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class o1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final o1 f47172a = new o1();

        public o1() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47173a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47173a = mRError;
        }

        public final MRError a() {
            return this.f47173a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && jo.p.c(this.f47173a, ((p) obj).f47173a);
        }

        public int hashCode() {
            return this.f47173a.hashCode();
        }

        public String toString() {
            return "DeleteAppUserDetailFailEvent(error=" + this.f47173a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class p0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final UserProfile f47174a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(UserProfile userProfile) {
            super(null);
            jo.p.h(userProfile, "userProfile");
            this.f47174a = userProfile;
        }

        public final UserProfile a() {
            return this.f47174a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p0) && jo.p.c(this.f47174a, ((p0) obj).f47174a);
        }

        public int hashCode() {
            return this.f47174a.hashCode();
        }

        public String toString() {
            return "LoadProfileEvent(userProfile=" + this.f47174a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class p1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47175a;

        public p1(int i10) {
            super(null);
            this.f47175a = i10;
        }

        public final int a() {
            return this.f47175a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p1) && this.f47175a == ((p1) obj).f47175a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47175a);
        }

        public String toString() {
            return "TotalViewerNumUpdateEvent(totalViewerCount=" + this.f47175a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final q f47176a = new q();

        public q() {
            super(null);
        }
    }

    /* renamed from: pd.q0$q0  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0719q0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47177a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0719q0(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47177a = mRError;
        }

        public final MRError a() {
            return this.f47177a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0719q0) && jo.p.c(this.f47177a, ((C0719q0) obj).f47177a);
        }

        public int hashCode() {
            return this.f47177a.hashCode();
        }

        public String toString() {
            return "LoadRemainingCoinsFail(error=" + this.f47177a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class q1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.f f47178a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q1(jf.f fVar) {
            super(null);
            jo.p.h(fVar, "calculatedCurrentCoins");
            this.f47178a = fVar;
        }

        public final jf.f a() {
            return this.f47178a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q1) && jo.p.c(this.f47178a, ((q1) obj).f47178a);
        }

        public int hashCode() {
            return this.f47178a.hashCode();
        }

        public String toString() {
            return "UpdateCalculatedCurrentCoins(calculatedCurrentCoins=" + this.f47178a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final r f47179a = new r();

        public r() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final r0 f47180a = new r0();

        public r0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47181a;

        public r1(int i10) {
            super(null);
            this.f47181a = i10;
        }

        public final int a() {
            return this.f47181a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r1) && this.f47181a == ((r1) obj).f47181a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47181a);
        }

        public String toString() {
            return "UpdateCurrentEmomoRunScores(currentEmomoRunScores=" + this.f47181a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final long f47182a;

        public s(long j10) {
            super(null);
            this.f47182a = j10;
        }

        public final long a() {
            return this.f47182a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.f47182a == ((s) obj).f47182a;
        }

        public int hashCode() {
            return Long.hashCode(this.f47182a);
        }

        public String toString() {
            return "EndLiveEvent(requestRecommendLivesDelayTimeMillis=" + this.f47182a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class s0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47183a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47183a = mRError;
        }

        public final MRError a() {
            return this.f47183a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s0) && jo.p.c(this.f47183a, ((s0) obj).f47183a);
        }

        public int hashCode() {
            return this.f47183a.hashCode();
        }

        public String toString() {
            return "LoadViewerAppUserDetailFailEvent(error=" + this.f47183a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class s1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final EmomoQuestGameStateBcsvrResponse f47184a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s1(EmomoQuestGameStateBcsvrResponse emomoQuestGameStateBcsvrResponse) {
            super(null);
            jo.p.h(emomoQuestGameStateBcsvrResponse, "emomoQuestState");
            this.f47184a = emomoQuestGameStateBcsvrResponse;
        }

        public final EmomoQuestGameStateBcsvrResponse a() {
            return this.f47184a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s1) && jo.p.c(this.f47184a, ((s1) obj).f47184a);
        }

        public int hashCode() {
            return this.f47184a.hashCode();
        }

        public String toString() {
            return "UpdateEmomoQuestState(emomoQuestState=" + this.f47184a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.q f47185a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(jf.q qVar) {
            super(null);
            jo.p.h(qVar, "gift");
            this.f47185a = qVar;
        }

        public final jf.q a() {
            return this.f47185a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && jo.p.c(this.f47185a, ((t) obj).f47185a);
        }

        public int hashCode() {
            return this.f47185a.hashCode();
        }

        public String toString() {
            return "FadeGiftOut(gift=" + this.f47185a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class t0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final AppUserDetailResponse f47186a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(AppUserDetailResponse appUserDetailResponse) {
            super(null);
            jo.p.h(appUserDetailResponse, "appUserDetail");
            this.f47186a = appUserDetailResponse;
        }

        public final AppUserDetailResponse a() {
            return this.f47186a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t0) && jo.p.c(this.f47186a, ((t0) obj).f47186a);
        }

        public int hashCode() {
            return this.f47186a.hashCode();
        }

        public String toString() {
            return "LoadViewerAppUserDetailSuccessEvent(appUserDetail=" + this.f47186a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class t1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final EmomoRunState f47187a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t1(EmomoRunState emomoRunState) {
            super(null);
            jo.p.h(emomoRunState, "emomoRunState");
            this.f47187a = emomoRunState;
        }

        public final EmomoRunState a() {
            return this.f47187a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t1) && jo.p.c(this.f47187a, ((t1) obj).f47187a);
        }

        public int hashCode() {
            return this.f47187a.hashCode();
        }

        public String toString() {
            return "UpdateEmomoRunState(emomoRunState=" + this.f47187a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47188a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47188a = mRError;
        }

        public final MRError a() {
            return this.f47188a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && jo.p.c(this.f47188a, ((u) obj).f47188a);
        }

        public int hashCode() {
            return this.f47188a.hashCode();
        }

        public String toString() {
            return "FailedAcceptCollabInvitation(error=" + this.f47188a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class u0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47189a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47189a = mRError;
        }

        public final MRError a() {
            return this.f47189a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u0) && jo.p.c(this.f47189a, ((u0) obj).f47189a);
        }

        public int hashCode() {
            return this.f47189a.hashCode();
        }

        public String toString() {
            return "PostAppUserDetailFailEvent(error=" + this.f47189a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class u1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedLive f47190a;

        public u1(LinkedLive linkedLive) {
            super(null);
            this.f47190a = linkedLive;
        }

        public final LinkedLive a() {
            return this.f47190a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u1) && jo.p.c(this.f47190a, ((u1) obj).f47190a);
        }

        public int hashCode() {
            LinkedLive linkedLive = this.f47190a;
            if (linkedLive == null) {
                return 0;
            }
            return linkedLive.hashCode();
        }

        public String toString() {
            return "UpdateLinkedLiveEvent(linkedLive=" + this.f47190a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final EmomoQuestGachaTicket f47191a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(EmomoQuestGachaTicket emomoQuestGachaTicket) {
            super(null);
            jo.p.h(emomoQuestGachaTicket, "gachaTicket");
            this.f47191a = emomoQuestGachaTicket;
        }

        public final EmomoQuestGachaTicket a() {
            return this.f47191a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && jo.p.c(this.f47191a, ((v) obj).f47191a);
        }

        public int hashCode() {
            return this.f47191a.hashCode();
        }

        public String toString() {
            return "FetchEmomoQuestGiftGachaTicketSucceeded(gachaTicket=" + this.f47191a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class v0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final AppUserDetailResponse f47192a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(AppUserDetailResponse appUserDetailResponse) {
            super(null);
            jo.p.h(appUserDetailResponse, "appUserDetailResponse");
            this.f47192a = appUserDetailResponse;
        }

        public final AppUserDetailResponse a() {
            return this.f47192a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v0) && jo.p.c(this.f47192a, ((v0) obj).f47192a);
        }

        public int hashCode() {
            return this.f47192a.hashCode();
        }

        public String toString() {
            return "PostAppUserDetailSuccessEvent(appUserDetailResponse=" + this.f47192a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class v1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final UserLevelUpdate f47193a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v1(UserLevelUpdate userLevelUpdate) {
            super(null);
            jo.p.h(userLevelUpdate, "userLevelUpdate");
            this.f47193a = userLevelUpdate;
        }

        public final UserLevelUpdate a() {
            return this.f47193a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v1) && jo.p.c(this.f47193a, ((v1) obj).f47193a);
        }

        public int hashCode() {
            return this.f47193a.hashCode();
        }

        public String toString() {
            return "UpdateUserLevel(userLevelUpdate=" + this.f47193a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final RankingUserDetailResponse f47194a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(RankingUserDetailResponse rankingUserDetailResponse) {
            super(null);
            jo.p.h(rankingUserDetailResponse, "response");
            this.f47194a = rankingUserDetailResponse;
        }

        public final RankingUserDetailResponse a() {
            return this.f47194a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && jo.p.c(this.f47194a, ((w) obj).f47194a);
        }

        public int hashCode() {
            return this.f47194a.hashCode();
        }

        public String toString() {
            return "FetchGiftRankingUserDetailSucceeded(response=" + this.f47194a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class w0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47195a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveCommentResponse f47196b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(int i10, LiveCommentResponse liveCommentResponse) {
            super(null);
            jo.p.h(liveCommentResponse, "response");
            this.f47195a = i10;
            this.f47196b = liveCommentResponse;
        }

        public final int a() {
            return this.f47195a;
        }

        public final LiveCommentResponse b() {
            return this.f47196b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof w0) {
                w0 w0Var = (w0) obj;
                return this.f47195a == w0Var.f47195a && jo.p.c(this.f47196b, w0Var.f47196b);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f47195a) * 31) + this.f47196b.hashCode();
        }

        public String toString() {
            return "PostLiveCommentSucceeded(commentType=" + this.f47195a + ", response=" + this.f47196b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class w1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47197a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w1(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47197a = mRError;
        }

        public final MRError a() {
            return this.f47197a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w1) && jo.p.c(this.f47197a, ((w1) obj).f47197a);
        }

        public int hashCode() {
            return this.f47197a.hashCode();
        }

        public String toString() {
            return "ViewerListErrorOccurEvent(error=" + this.f47197a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final x f47198a = new x();

        public x() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final x0 f47199a = new x0();

        public x0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final LiveOnlineUsersResponse f47200a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x1(LiveOnlineUsersResponse liveOnlineUsersResponse) {
            super(null);
            jo.p.h(liveOnlineUsersResponse, "liveViewers");
            this.f47200a = liveOnlineUsersResponse;
        }

        public final LiveOnlineUsersResponse a() {
            return this.f47200a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x1) && jo.p.c(this.f47200a, ((x1) obj).f47200a);
        }

        public int hashCode() {
            return this.f47200a.hashCode();
        }

        public String toString() {
            return "ViewerListLoadFinishEvent(liveViewers=" + this.f47200a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final List<RankingUser> f47201a;

        public y(List<RankingUser> list) {
            super(null);
            this.f47201a = list;
        }

        public final List<RankingUser> a() {
            return this.f47201a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && jo.p.c(this.f47201a, ((y) obj).f47201a);
        }

        public int hashCode() {
            List<RankingUser> list = this.f47201a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "GiftRankingUpdateEvent(users=" + this.f47201a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class y0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final QuizMessage f47202a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(QuizMessage quizMessage) {
            super(null);
            jo.p.h(quizMessage, "quizMessage");
            this.f47202a = quizMessage;
        }

        public final QuizMessage a() {
            return this.f47202a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y0) && jo.p.c(this.f47202a, ((y0) obj).f47202a);
        }

        public int hashCode() {
            return this.f47202a.hashCode();
        }

        public String toString() {
            return "QuizShowAnswerEvent(quizMessage=" + this.f47202a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class y1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final y1 f47203a = new y1();

        public y1() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final GiftRankingChangedBcsvrResponse f47204a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(GiftRankingChangedBcsvrResponse giftRankingChangedBcsvrResponse) {
            super(null);
            jo.p.h(giftRankingChangedBcsvrResponse, "response");
            this.f47204a = giftRankingChangedBcsvrResponse;
        }

        public final GiftRankingChangedBcsvrResponse a() {
            return this.f47204a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && jo.p.c(this.f47204a, ((z) obj).f47204a);
        }

        public int hashCode() {
            return this.f47204a.hashCode();
        }

        public String toString() {
            return "GiftRankingUserChanged(response=" + this.f47204a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class z0 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final QuizMessage f47205a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(QuizMessage quizMessage) {
            super(null);
            jo.p.h(quizMessage, "quizMessage");
            this.f47205a = quizMessage;
        }

        public final QuizMessage a() {
            return this.f47205a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z0) && jo.p.c(this.f47205a, ((z0) obj).f47205a);
        }

        public int hashCode() {
            return this.f47205a.hashCode();
        }

        public String toString() {
            return "QuizStartQuestionEvent(quizMessage=" + this.f47205a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class z1 extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public static final z1 f47206a = new z1();

        public z1() {
            super(null);
        }
    }

    public q0() {
    }

    public /* synthetic */ q0(jo.h hVar) {
        this();
    }
}
