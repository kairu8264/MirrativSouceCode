package ce;

import com.dena.mirrorman.net.api.response.EmomoRunGameGift;
import com.dena.mirrorman.net.api.response.EmomoRunState;
import com.dena.mirrorman.net.api.response.FeverValue;
import com.dena.mirrorman.net.api.response.SimpleGiftGachaStock;
import com.dena.mirrorman.net.bcsvr.response.AnnouncementPopup;
import com.dena.mirrorman.net.bcsvr.response.ChangeModerator;
import com.dena.mirrorman.net.bcsvr.response.CheerLevelUpCommentBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabClosedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabEndNotFollowUserResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabInviteCanceledByStreamerBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabInviteCanceledByViewerBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabInvitedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabReadyMatchingBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabRecommendLiveBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabRequest;
import com.dena.mirrorman.net.bcsvr.response.CollabRequestCanceledBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabStartByMatchingResponse;
import com.dena.mirrorman.net.bcsvr.response.Comment;
import com.dena.mirrorman.net.bcsvr.response.CommentAppUserDetail;
import com.dena.mirrorman.net.bcsvr.response.EmomoQuestGameStateBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingTopUser;
import com.dena.mirrorman.net.bcsvr.response.LiveChangedResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveGameConnectBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveGameDisconnectBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveGameEndBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveGameInterruptibleBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveGamePlayingBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveLinkedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveUrlSharedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveViewerNum;
import com.dena.mirrorman.net.bcsvr.response.LuckyPrizeBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.MatchingCollabCanceledBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.MatchingLiveBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.MatchingStarterToStarterBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.MutualGiftAchievedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.MutualGiftReceivableRewardsBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.RankingUser;
import com.dena.mirrorman.net.bcsvr.response.ShooterMatchingBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.ShooterMatchingRequestFinishedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.ShooterMatchingStateChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.ShooterMemberStateChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.UpdateEmomoVisibleBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.UserLevelUpdate;
import com.dena.mirrorman.net.quiz.QuizMessage;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class l {

    /* loaded from: classes2.dex */
    public static final class a extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19333a;

        /* renamed from: b  reason: collision with root package name */
        public final CommentAppUserDetail f19334b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, CommentAppUserDetail commentAppUserDetail) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(commentAppUserDetail, "appUserDetail");
            this.f19333a = str;
            this.f19334b = commentAppUserDetail;
        }

        public final CommentAppUserDetail a() {
            return this.f19334b;
        }

        public String b() {
            return this.f19333a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(b(), aVar.b()) && jo.p.c(this.f19334b, aVar.f19334b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f19334b.hashCode();
        }

        public String toString() {
            return "AppUserDetailCommentReceived(key=" + b() + ", appUserDetail=" + this.f19334b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19335a;

        /* renamed from: b  reason: collision with root package name */
        public final GiftRankingChangedBcsvrResponse f19336b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String str, GiftRankingChangedBcsvrResponse giftRankingChangedBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(giftRankingChangedBcsvrResponse, "response");
            this.f19335a = str;
            this.f19336b = giftRankingChangedBcsvrResponse;
        }

        public String a() {
            return this.f19335a;
        }

        public final GiftRankingChangedBcsvrResponse b() {
            return this.f19336b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                return jo.p.c(a(), a0Var.a()) && jo.p.c(this.f19336b, a0Var.f19336b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19336b.hashCode();
        }

        public String toString() {
            return "GiftRankingChanged(key=" + a() + ", response=" + this.f19336b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class a1 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19337a;

        /* renamed from: b  reason: collision with root package name */
        public final QuizMessage f19338b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(String str, QuizMessage quizMessage) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(quizMessage, "quizMessage");
            this.f19337a = str;
            this.f19338b = quizMessage;
        }

        public String a() {
            return this.f19337a;
        }

        public final QuizMessage b() {
            return this.f19338b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a1) {
                a1 a1Var = (a1) obj;
                return jo.p.c(a(), a1Var.a()) && jo.p.c(this.f19338b, a1Var.f19338b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19338b.hashCode();
        }

        public String toString() {
            return "QuizShowCorrectAnswer(key=" + a() + ", quizMessage=" + this.f19338b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19339a;

        /* renamed from: b  reason: collision with root package name */
        public final CheerLevelUpCommentBcsvrResponse f19340b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, CheerLevelUpCommentBcsvrResponse cheerLevelUpCommentBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(cheerLevelUpCommentBcsvrResponse, "commentData");
            this.f19339a = str;
            this.f19340b = cheerLevelUpCommentBcsvrResponse;
        }

        public final CheerLevelUpCommentBcsvrResponse a() {
            return this.f19340b;
        }

        public String b() {
            return this.f19339a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(b(), bVar.b()) && jo.p.c(this.f19340b, bVar.f19340b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f19340b.hashCode();
        }

        public String toString() {
            return "CheerLevelUpCommentReceived(key=" + b() + ", commentData=" + this.f19340b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19341a;

        /* renamed from: b  reason: collision with root package name */
        public final List<RankingUser> f19342b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String str, List<RankingUser> list) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(list, "rankingUsers");
            this.f19341a = str;
            this.f19342b = list;
        }

        public String a() {
            return this.f19341a;
        }

        public final List<RankingUser> b() {
            return this.f19342b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                return jo.p.c(a(), b0Var.a()) && jo.p.c(this.f19342b, b0Var.f19342b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19342b.hashCode();
        }

        public String toString() {
            return "GiftRankingTopThreeUsers(key=" + a() + ", rankingUsers=" + this.f19342b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b1 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19343a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b1(String str) {
            super(null);
            jo.p.h(str, "key");
            this.f19343a = str;
        }

        public String a() {
            return this.f19343a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b1) && jo.p.c(a(), ((b1) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "QuizShowDismissPopup(key=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19344a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19345b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(str2, "acceptedUserId");
            this.f19344a = str;
            this.f19345b = str2;
        }

        public final String a() {
            return this.f19345b;
        }

        public String b() {
            return this.f19344a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return jo.p.c(b(), cVar.b()) && jo.p.c(this.f19345b, cVar.f19345b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f19345b.hashCode();
        }

        public String toString() {
            return "CollabAccepted(key=" + b() + ", acceptedUserId=" + this.f19345b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19346a;

        /* renamed from: b  reason: collision with root package name */
        public final GiftRankingTopUser f19347b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(String str, GiftRankingTopUser giftRankingTopUser) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(giftRankingTopUser, "giftRankingTopUser");
            this.f19346a = str;
            this.f19347b = giftRankingTopUser;
        }

        public final GiftRankingTopUser a() {
            return this.f19347b;
        }

        public String b() {
            return this.f19346a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                return jo.p.c(b(), c0Var.b()) && jo.p.c(this.f19347b, c0Var.f19347b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f19347b.hashCode();
        }

        public String toString() {
            return "GiftRankingTopUserUpdated(key=" + b() + ", giftRankingTopUser=" + this.f19347b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c1 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19348a;

        /* renamed from: b  reason: collision with root package name */
        public final QuizMessage f19349b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c1(String str, QuizMessage quizMessage) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(quizMessage, "quizMessage");
            this.f19348a = str;
            this.f19349b = quizMessage;
        }

        public String a() {
            return this.f19348a;
        }

        public final QuizMessage b() {
            return this.f19349b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c1) {
                c1 c1Var = (c1) obj;
                return jo.p.c(a(), c1Var.a()) && jo.p.c(this.f19349b, c1Var.f19349b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19349b.hashCode();
        }

        public String toString() {
            return "QuizStartQuestion(key=" + a() + ", quizMessage=" + this.f19349b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19350a;

        /* renamed from: b  reason: collision with root package name */
        public final CollabRequestCanceledBcsvrResponse f19351b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, CollabRequestCanceledBcsvrResponse collabRequestCanceledBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(collabRequestCanceledBcsvrResponse, "response");
            this.f19350a = str;
            this.f19351b = collabRequestCanceledBcsvrResponse;
        }

        public String a() {
            return this.f19350a;
        }

        public final CollabRequestCanceledBcsvrResponse b() {
            return this.f19351b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return jo.p.c(a(), dVar.a()) && jo.p.c(this.f19351b, dVar.f19351b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19351b.hashCode();
        }

        public String toString() {
            return "CollabCanceled(key=" + a() + ", response=" + this.f19351b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19352a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19353b;

        /* renamed from: c  reason: collision with root package name */
        public final String f19354c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(String str, String str2, String str3) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(str2, "liveId");
            jo.p.h(str3, "ownerName");
            this.f19352a = str;
            this.f19353b = str2;
            this.f19354c = str3;
        }

        public String a() {
            return this.f19352a;
        }

        public final String b() {
            return this.f19353b;
        }

        public final String c() {
            return this.f19354c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d0) {
                d0 d0Var = (d0) obj;
                return jo.p.c(a(), d0Var.a()) && jo.p.c(this.f19353b, d0Var.f19353b) && jo.p.c(this.f19354c, d0Var.f19354c);
            }
            return false;
        }

        public int hashCode() {
            return (((a().hashCode() * 31) + this.f19353b.hashCode()) * 31) + this.f19354c.hashCode();
        }

        public String toString() {
            return "LinkedLiveEnded(key=" + a() + ", liveId=" + this.f19353b + ", ownerName=" + this.f19354c + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d1 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19355a;

        /* renamed from: b  reason: collision with root package name */
        public final SimpleGiftGachaStock f19356b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(String str, SimpleGiftGachaStock simpleGiftGachaStock) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(simpleGiftGachaStock, "response");
            this.f19355a = str;
            this.f19356b = simpleGiftGachaStock;
        }

        public String a() {
            return this.f19355a;
        }

        public final SimpleGiftGachaStock b() {
            return this.f19356b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d1) {
                d1 d1Var = (d1) obj;
                return jo.p.c(a(), d1Var.a()) && jo.p.c(this.f19356b, d1Var.f19356b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19356b.hashCode();
        }

        public String toString() {
            return "ReceivedGiftGacha(key=" + a() + ", response=" + this.f19356b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19357a;

        /* renamed from: b  reason: collision with root package name */
        public final CollabChangedBcsvrResponse f19358b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, CollabChangedBcsvrResponse collabChangedBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(collabChangedBcsvrResponse, "collabChanged");
            this.f19357a = str;
            this.f19358b = collabChangedBcsvrResponse;
        }

        public final CollabChangedBcsvrResponse a() {
            return this.f19358b;
        }

        public String b() {
            return this.f19357a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return jo.p.c(b(), eVar.b()) && jo.p.c(this.f19358b, eVar.f19358b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f19358b.hashCode();
        }

        public String toString() {
            return "CollabChanged(key=" + b() + ", collabChanged=" + this.f19358b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19359a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveChangedResponse f19360b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(String str, LiveChangedResponse liveChangedResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(liveChangedResponse, "liveChangedResponse");
            this.f19359a = str;
            this.f19360b = liveChangedResponse;
        }

        public String a() {
            return this.f19359a;
        }

        public final LiveChangedResponse b() {
            return this.f19360b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                return jo.p.c(a(), e0Var.a()) && jo.p.c(this.f19360b, e0Var.f19360b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19360b.hashCode();
        }

        public String toString() {
            return "LiveChanged(key=" + a() + ", liveChangedResponse=" + this.f19360b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e1 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19361a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(String str) {
            super(null);
            jo.p.h(str, "key");
            this.f19361a = str;
        }

        public String a() {
            return this.f19361a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e1) && jo.p.c(a(), ((e1) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "ReloadEmomo(key=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19362a;

        /* renamed from: b  reason: collision with root package name */
        public final CollabClosedBcsvrResponse f19363b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, CollabClosedBcsvrResponse collabClosedBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(collabClosedBcsvrResponse, "response");
            this.f19362a = str;
            this.f19363b = collabClosedBcsvrResponse;
        }

        public String a() {
            return this.f19362a;
        }

        public final CollabClosedBcsvrResponse b() {
            return this.f19363b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return jo.p.c(a(), fVar.a()) && jo.p.c(this.f19363b, fVar.f19363b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19363b.hashCode();
        }

        public String toString() {
            return "CollabClosed(key=" + a() + ", response=" + this.f19363b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19364a;

        /* renamed from: b  reason: collision with root package name */
        public final Comment f19365b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(String str, Comment comment) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(comment, "commentData");
            this.f19364a = str;
            this.f19365b = comment;
        }

        public final Comment a() {
            return this.f19365b;
        }

        public String b() {
            return this.f19364a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                return jo.p.c(b(), f0Var.b()) && jo.p.c(this.f19365b, f0Var.f19365b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f19365b.hashCode();
        }

        public String toString() {
            return "LiveCommentReceived(key=" + b() + ", commentData=" + this.f19365b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f1 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19366a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19367b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f1(String str, String str2) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(str2, "targetUserId");
            this.f19366a = str;
            this.f19367b = str2;
        }

        public String a() {
            return this.f19366a;
        }

        public final String b() {
            return this.f19367b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f1) {
                f1 f1Var = (f1) obj;
                return jo.p.c(a(), f1Var.a()) && jo.p.c(this.f19367b, f1Var.f19367b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19367b.hashCode();
        }

        public String toString() {
            return "ReloadUserLevelGift(key=" + a() + ", targetUserId=" + this.f19367b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19368a;

        /* renamed from: b  reason: collision with root package name */
        public final CollabEndNotFollowUserResponse f19369b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, CollabEndNotFollowUserResponse collabEndNotFollowUserResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(collabEndNotFollowUserResponse, "response");
            this.f19368a = str;
            this.f19369b = collabEndNotFollowUserResponse;
        }

        public String a() {
            return this.f19368a;
        }

        public final CollabEndNotFollowUserResponse b() {
            return this.f19369b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return jo.p.c(a(), gVar.a()) && jo.p.c(this.f19369b, gVar.f19369b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19369b.hashCode();
        }

        public String toString() {
            return "CollabEndNotFollowUser(key=" + a() + ", response=" + this.f19369b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19370a;

        /* renamed from: b  reason: collision with root package name */
        public final Double f19371b;

        /* renamed from: c  reason: collision with root package name */
        public final Double f19372c;

        /* renamed from: d  reason: collision with root package name */
        public final Double f19373d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(String str, Double d10, Double d11, Double d12) {
            super(null);
            jo.p.h(str, "key");
            this.f19370a = str;
            this.f19371b = d10;
            this.f19372c = d11;
            this.f19373d = d12;
        }

        public final Double a() {
            return this.f19373d;
        }

        public String b() {
            return this.f19370a;
        }

        public final Double c() {
            return this.f19372c;
        }

        public final Double d() {
            return this.f19371b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                return jo.p.c(b(), g0Var.b()) && jo.p.c(this.f19371b, g0Var.f19371b) && jo.p.c(this.f19372c, g0Var.f19372c) && jo.p.c(this.f19373d, g0Var.f19373d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = b().hashCode() * 31;
            Double d10 = this.f19371b;
            int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
            Double d11 = this.f19372c;
            int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
            Double d12 = this.f19373d;
            return hashCode3 + (d12 != null ? d12.hashCode() : 0);
        }

        public String toString() {
            return "LiveEnded(key=" + b() + ", uniMin=" + this.f19371b + ", uniMax=" + this.f19372c + ", expMultiplier=" + this.f19373d + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g1 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19374a;

        /* renamed from: b  reason: collision with root package name */
        public final ShooterMatchingRequestFinishedBcsvrResponse f19375b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g1(String str, ShooterMatchingRequestFinishedBcsvrResponse shooterMatchingRequestFinishedBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(shooterMatchingRequestFinishedBcsvrResponse, "response");
            this.f19374a = str;
            this.f19375b = shooterMatchingRequestFinishedBcsvrResponse;
        }

        public String a() {
            return this.f19374a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g1) {
                g1 g1Var = (g1) obj;
                return jo.p.c(a(), g1Var.a()) && jo.p.c(this.f19375b, g1Var.f19375b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19375b.hashCode();
        }

        public String toString() {
            return "ShooterMatchingFinished(key=" + a() + ", response=" + this.f19375b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19376a;

        /* renamed from: b  reason: collision with root package name */
        public final CollabInviteCanceledByStreamerBcsvrResponse f19377b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, CollabInviteCanceledByStreamerBcsvrResponse collabInviteCanceledByStreamerBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(collabInviteCanceledByStreamerBcsvrResponse, "response");
            this.f19376a = str;
            this.f19377b = collabInviteCanceledByStreamerBcsvrResponse;
        }

        public String a() {
            return this.f19376a;
        }

        public final CollabInviteCanceledByStreamerBcsvrResponse b() {
            return this.f19377b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return jo.p.c(a(), hVar.a()) && jo.p.c(this.f19377b, hVar.f19377b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19377b.hashCode();
        }

        public String toString() {
            return "CollabInviteCanceledByStreamer(key=" + a() + ", response=" + this.f19377b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19378a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveGameConnectBcsvrResponse f19379b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(String str, LiveGameConnectBcsvrResponse liveGameConnectBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(liveGameConnectBcsvrResponse, "response");
            this.f19378a = str;
            this.f19379b = liveGameConnectBcsvrResponse;
        }

        public String a() {
            return this.f19378a;
        }

        public final LiveGameConnectBcsvrResponse b() {
            return this.f19379b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h0) {
                h0 h0Var = (h0) obj;
                return jo.p.c(a(), h0Var.a()) && jo.p.c(this.f19379b, h0Var.f19379b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19379b.hashCode();
        }

        public String toString() {
            return "LiveGameConnected(key=" + a() + ", response=" + this.f19379b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h1 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19380a;

        /* renamed from: b  reason: collision with root package name */
        public final ShooterMatchingStateChangedBcsvrResponse f19381b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h1(String str, ShooterMatchingStateChangedBcsvrResponse shooterMatchingStateChangedBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(shooterMatchingStateChangedBcsvrResponse, "response");
            this.f19380a = str;
            this.f19381b = shooterMatchingStateChangedBcsvrResponse;
        }

        public String a() {
            return this.f19380a;
        }

        public final ShooterMatchingStateChangedBcsvrResponse b() {
            return this.f19381b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h1) {
                h1 h1Var = (h1) obj;
                return jo.p.c(a(), h1Var.a()) && jo.p.c(this.f19381b, h1Var.f19381b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19381b.hashCode();
        }

        public String toString() {
            return "ShooterMatchingStateChanged(key=" + a() + ", response=" + this.f19381b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19382a;

        /* renamed from: b  reason: collision with root package name */
        public final CollabInviteCanceledByViewerBcsvrResponse f19383b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, CollabInviteCanceledByViewerBcsvrResponse collabInviteCanceledByViewerBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(collabInviteCanceledByViewerBcsvrResponse, "response");
            this.f19382a = str;
            this.f19383b = collabInviteCanceledByViewerBcsvrResponse;
        }

        public String a() {
            return this.f19382a;
        }

        public final CollabInviteCanceledByViewerBcsvrResponse b() {
            return this.f19383b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return jo.p.c(a(), iVar.a()) && jo.p.c(this.f19383b, iVar.f19383b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19383b.hashCode();
        }

        public String toString() {
            return "CollabInviteCanceledByViewer(key=" + a() + ", response=" + this.f19383b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19384a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveGameDisconnectBcsvrResponse f19385b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(String str, LiveGameDisconnectBcsvrResponse liveGameDisconnectBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(liveGameDisconnectBcsvrResponse, "response");
            this.f19384a = str;
            this.f19385b = liveGameDisconnectBcsvrResponse;
        }

        public String a() {
            return this.f19384a;
        }

        public final LiveGameDisconnectBcsvrResponse b() {
            return this.f19385b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i0) {
                i0 i0Var = (i0) obj;
                return jo.p.c(a(), i0Var.a()) && jo.p.c(this.f19385b, i0Var.f19385b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19385b.hashCode();
        }

        public String toString() {
            return "LiveGameDisconnected(key=" + a() + ", response=" + this.f19385b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i1 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19386a;

        /* renamed from: b  reason: collision with root package name */
        public final ShooterMemberStateChangedBcsvrResponse f19387b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i1(String str, ShooterMemberStateChangedBcsvrResponse shooterMemberStateChangedBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(shooterMemberStateChangedBcsvrResponse, "response");
            this.f19386a = str;
            this.f19387b = shooterMemberStateChangedBcsvrResponse;
        }

        public String a() {
            return this.f19386a;
        }

        public final ShooterMemberStateChangedBcsvrResponse b() {
            return this.f19387b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i1) {
                i1 i1Var = (i1) obj;
                return jo.p.c(a(), i1Var.a()) && jo.p.c(this.f19387b, i1Var.f19387b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19387b.hashCode();
        }

        public String toString() {
            return "ShooterMemberStateChanged(key=" + a() + ", response=" + this.f19387b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19388a;

        /* renamed from: b  reason: collision with root package name */
        public final CollabInvitedBcsvrResponse f19389b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, CollabInvitedBcsvrResponse collabInvitedBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(collabInvitedBcsvrResponse, "collabInvited");
            this.f19388a = str;
            this.f19389b = collabInvitedBcsvrResponse;
        }

        public final CollabInvitedBcsvrResponse a() {
            return this.f19389b;
        }

        public String b() {
            return this.f19388a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return jo.p.c(b(), jVar.b()) && jo.p.c(this.f19389b, jVar.f19389b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f19389b.hashCode();
        }

        public String toString() {
            return "CollabInvited(key=" + b() + ", collabInvited=" + this.f19389b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19390a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveGameEndBcsvrResponse f19391b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(String str, LiveGameEndBcsvrResponse liveGameEndBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(liveGameEndBcsvrResponse, "response");
            this.f19390a = str;
            this.f19391b = liveGameEndBcsvrResponse;
        }

        public String a() {
            return this.f19390a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j0) {
                j0 j0Var = (j0) obj;
                return jo.p.c(a(), j0Var.a()) && jo.p.c(this.f19391b, j0Var.f19391b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19391b.hashCode();
        }

        public String toString() {
            return "LiveGameEnded(key=" + a() + ", response=" + this.f19391b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j1 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19392a;

        /* renamed from: b  reason: collision with root package name */
        public final ShooterMatchingBcsvrResponse f19393b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j1(String str, ShooterMatchingBcsvrResponse shooterMatchingBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(shooterMatchingBcsvrResponse, "response");
            this.f19392a = str;
            this.f19393b = shooterMatchingBcsvrResponse;
        }

        public String a() {
            return this.f19392a;
        }

        public final ShooterMatchingBcsvrResponse b() {
            return this.f19393b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j1) {
                j1 j1Var = (j1) obj;
                return jo.p.c(a(), j1Var.a()) && jo.p.c(this.f19393b, j1Var.f19393b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19393b.hashCode();
        }

        public String toString() {
            return "ShooterViewerMatched(key=" + a() + ", response=" + this.f19393b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19394a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(null);
            jo.p.h(str, "key");
            this.f19394a = str;
        }

        public String a() {
            return this.f19394a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(a(), ((k) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "CollabLeaderStreamingEnd(key=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19395a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveGameInterruptibleBcsvrResponse f19396b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(String str, LiveGameInterruptibleBcsvrResponse liveGameInterruptibleBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(liveGameInterruptibleBcsvrResponse, "response");
            this.f19395a = str;
            this.f19396b = liveGameInterruptibleBcsvrResponse;
        }

        public String a() {
            return this.f19395a;
        }

        public final LiveGameInterruptibleBcsvrResponse b() {
            return this.f19396b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                return jo.p.c(a(), k0Var.a()) && jo.p.c(this.f19396b, k0Var.f19396b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19396b.hashCode();
        }

        public String toString() {
            return "LiveGameInterruptibleChanged(key=" + a() + ", response=" + this.f19396b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k1 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19397a;

        /* renamed from: b  reason: collision with root package name */
        public final AnnouncementPopup f19398b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k1(String str, AnnouncementPopup announcementPopup) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(announcementPopup, "popup");
            this.f19397a = str;
            this.f19398b = announcementPopup;
        }

        public String a() {
            return this.f19397a;
        }

        public final AnnouncementPopup b() {
            return this.f19398b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k1) {
                k1 k1Var = (k1) obj;
                return jo.p.c(a(), k1Var.a()) && jo.p.c(this.f19398b, k1Var.f19398b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19398b.hashCode();
        }

        public String toString() {
            return "ShowViewerAnnouncementPopup(key=" + a() + ", popup=" + this.f19398b + ')';
        }
    }

    /* renamed from: ce.l$l  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0151l extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19399a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0151l(String str) {
            super(null);
            jo.p.h(str, "key");
            this.f19399a = str;
        }

        public String a() {
            return this.f19399a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0151l) && jo.p.c(a(), ((C0151l) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "CollabNotFoundEnoughHosts(key=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19400a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveGamePlayingBcsvrResponse f19401b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(String str, LiveGamePlayingBcsvrResponse liveGamePlayingBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(liveGamePlayingBcsvrResponse, "response");
            this.f19400a = str;
            this.f19401b = liveGamePlayingBcsvrResponse;
        }

        public String a() {
            return this.f19400a;
        }

        public final LiveGamePlayingBcsvrResponse b() {
            return this.f19401b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l0) {
                l0 l0Var = (l0) obj;
                return jo.p.c(a(), l0Var.a()) && jo.p.c(this.f19401b, l0Var.f19401b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19401b.hashCode();
        }

        public String toString() {
            return "LiveGamePlaying(key=" + a() + ", response=" + this.f19401b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l1 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19402a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19403b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l1(String str, String str2) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(str2, "message");
            this.f19402a = str;
            this.f19403b = str2;
        }

        public String a() {
            return this.f19402a;
        }

        public final String b() {
            return this.f19403b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l1) {
                l1 l1Var = (l1) obj;
                return jo.p.c(a(), l1Var.a()) && jo.p.c(this.f19403b, l1Var.f19403b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19403b.hashCode();
        }

        public String toString() {
            return "StopBroadcasting(key=" + a() + ", message=" + this.f19403b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19404a;

        /* renamed from: b  reason: collision with root package name */
        public final CollabReadyMatchingBcsvrResponse f19405b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, CollabReadyMatchingBcsvrResponse collabReadyMatchingBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(collabReadyMatchingBcsvrResponse, "response");
            this.f19404a = str;
            this.f19405b = collabReadyMatchingBcsvrResponse;
        }

        public String a() {
            return this.f19404a;
        }

        public final CollabReadyMatchingBcsvrResponse b() {
            return this.f19405b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return jo.p.c(a(), mVar.a()) && jo.p.c(this.f19405b, mVar.f19405b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19405b.hashCode();
        }

        public String toString() {
            return "CollabReadyMatching(key=" + a() + ", response=" + this.f19405b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19406a;

        /* renamed from: b  reason: collision with root package name */
        public final Comment f19407b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(String str, Comment comment) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(comment, "commentData");
            this.f19406a = str;
            this.f19407b = comment;
        }

        public final Comment a() {
            return this.f19407b;
        }

        public String b() {
            return this.f19406a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m0) {
                m0 m0Var = (m0) obj;
                return jo.p.c(b(), m0Var.b()) && jo.p.c(this.f19407b, m0Var.f19407b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f19407b.hashCode();
        }

        public String toString() {
            return "LiveJoined(key=" + b() + ", commentData=" + this.f19407b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m1 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19408a;

        /* renamed from: b  reason: collision with root package name */
        public final Comment f19409b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m1(String str, Comment comment) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(comment, "commentData");
            this.f19408a = str;
            this.f19409b = comment;
        }

        public final Comment a() {
            return this.f19409b;
        }

        public String b() {
            return this.f19408a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m1) {
                m1 m1Var = (m1) obj;
                return jo.p.c(b(), m1Var.b()) && jo.p.c(this.f19409b, m1Var.f19409b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f19409b.hashCode();
        }

        public String toString() {
            return "StreamerFollowed(key=" + b() + ", commentData=" + this.f19409b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19410a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19411b;

        /* renamed from: c  reason: collision with root package name */
        public final String f19412c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, String str2, String str3) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(str2, "sentUserId");
            jo.p.h(str3, "rawJson");
            this.f19410a = str;
            this.f19411b = str2;
            this.f19412c = str3;
        }

        public String a() {
            return this.f19410a;
        }

        public final String b() {
            return this.f19412c;
        }

        public final String c() {
            return this.f19411b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return jo.p.c(a(), nVar.a()) && jo.p.c(this.f19411b, nVar.f19411b) && jo.p.c(this.f19412c, nVar.f19412c);
            }
            return false;
        }

        public int hashCode() {
            return (((a().hashCode() * 31) + this.f19411b.hashCode()) * 31) + this.f19412c.hashCode();
        }

        public String toString() {
            return "CollabReceivedPeer(key=" + a() + ", sentUserId=" + this.f19411b + ", rawJson=" + this.f19412c + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19413a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveLinkedBcsvrResponse f19414b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(String str, LiveLinkedBcsvrResponse liveLinkedBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(liveLinkedBcsvrResponse, "liveLinkedBcsvrResponse");
            this.f19413a = str;
            this.f19414b = liveLinkedBcsvrResponse;
        }

        public String a() {
            return this.f19413a;
        }

        public final LiveLinkedBcsvrResponse b() {
            return this.f19414b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                return jo.p.c(a(), n0Var.a()) && jo.p.c(this.f19414b, n0Var.f19414b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19414b.hashCode();
        }

        public String toString() {
            return "LiveLinked(key=" + a() + ", liveLinkedBcsvrResponse=" + this.f19414b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n1 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19415a;

        /* renamed from: b  reason: collision with root package name */
        public final UserLevelUpdate f19416b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n1(String str, UserLevelUpdate userLevelUpdate) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(userLevelUpdate, "userLevelUpdate");
            this.f19415a = str;
            this.f19416b = userLevelUpdate;
        }

        public String a() {
            return this.f19415a;
        }

        public final UserLevelUpdate b() {
            return this.f19416b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n1) {
                n1 n1Var = (n1) obj;
                return jo.p.c(a(), n1Var.a()) && jo.p.c(this.f19416b, n1Var.f19416b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19416b.hashCode();
        }

        public String toString() {
            return "UpdateUserLevel(key=" + a() + ", userLevelUpdate=" + this.f19416b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19417a;

        /* renamed from: b  reason: collision with root package name */
        public final CollabRecommendLiveBcsvrResponse f19418b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, CollabRecommendLiveBcsvrResponse collabRecommendLiveBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(collabRecommendLiveBcsvrResponse, "response");
            this.f19417a = str;
            this.f19418b = collabRecommendLiveBcsvrResponse;
        }

        public String a() {
            return this.f19417a;
        }

        public final CollabRecommendLiveBcsvrResponse b() {
            return this.f19418b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return jo.p.c(a(), oVar.a()) && jo.p.c(this.f19418b, oVar.f19418b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19418b.hashCode();
        }

        public String toString() {
            return "CollabRecommendLive(key=" + a() + ", response=" + this.f19418b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class o0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19419a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19420b;

        /* renamed from: c  reason: collision with root package name */
        public final String f19421c;

        /* renamed from: d  reason: collision with root package name */
        public final String f19422d;

        /* renamed from: e  reason: collision with root package name */
        public final String f19423e;

        /* renamed from: f  reason: collision with root package name */
        public final String f19424f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(String str, String str2, String str3, String str4, String str5, String str6) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(str2, "userId");
            jo.p.h(str3, "userName");
            jo.p.h(str4, "ownerName");
            jo.p.h(str5, "profileImageUrl");
            jo.p.h(str6, "badgeImageUrl");
            this.f19419a = str;
            this.f19420b = str2;
            this.f19421c = str3;
            this.f19422d = str4;
            this.f19423e = str5;
            this.f19424f = str6;
        }

        public final String a() {
            return this.f19424f;
        }

        public String b() {
            return this.f19419a;
        }

        public final String c() {
            return this.f19422d;
        }

        public final String d() {
            return this.f19423e;
        }

        public final String e() {
            return this.f19420b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                return jo.p.c(b(), o0Var.b()) && jo.p.c(this.f19420b, o0Var.f19420b) && jo.p.c(this.f19421c, o0Var.f19421c) && jo.p.c(this.f19422d, o0Var.f19422d) && jo.p.c(this.f19423e, o0Var.f19423e) && jo.p.c(this.f19424f, o0Var.f19424f);
            }
            return false;
        }

        public final String f() {
            return this.f19421c;
        }

        public int hashCode() {
            return (((((((((b().hashCode() * 31) + this.f19420b.hashCode()) * 31) + this.f19421c.hashCode()) * 31) + this.f19422d.hashCode()) * 31) + this.f19423e.hashCode()) * 31) + this.f19424f.hashCode();
        }

        public String toString() {
            return "LiveSelected(key=" + b() + ", userId=" + this.f19420b + ", userName=" + this.f19421c + ", ownerName=" + this.f19422d + ", profileImageUrl=" + this.f19423e + ", badgeImageUrl=" + this.f19424f + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19425a;

        /* renamed from: b  reason: collision with root package name */
        public final CollabRequest f19426b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, CollabRequest collabRequest) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(collabRequest, "collabRequest");
            this.f19425a = str;
            this.f19426b = collabRequest;
        }

        public final CollabRequest a() {
            return this.f19426b;
        }

        public String b() {
            return this.f19425a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                return jo.p.c(b(), pVar.b()) && jo.p.c(this.f19426b, pVar.f19426b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f19426b.hashCode();
        }

        public String toString() {
            return "CollabRequested(key=" + b() + ", collabRequest=" + this.f19426b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class p0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19427a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(String str) {
            super(null);
            jo.p.h(str, "key");
            this.f19427a = str;
        }

        public String a() {
            return this.f19427a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p0) && jo.p.c(a(), ((p0) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "LiveUnlinked(key=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19428a;

        /* renamed from: b  reason: collision with root package name */
        public final CollabStartByMatchingResponse f19429b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, CollabStartByMatchingResponse collabStartByMatchingResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(collabStartByMatchingResponse, "response");
            this.f19428a = str;
            this.f19429b = collabStartByMatchingResponse;
        }

        public String a() {
            return this.f19428a;
        }

        public final CollabStartByMatchingResponse b() {
            return this.f19429b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                q qVar = (q) obj;
                return jo.p.c(a(), qVar.a()) && jo.p.c(this.f19429b, qVar.f19429b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19429b.hashCode();
        }

        public String toString() {
            return "CollabStartByMatching(key=" + a() + ", response=" + this.f19429b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class q0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19430a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveUrlSharedBcsvrResponse f19431b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(String str, LiveUrlSharedBcsvrResponse liveUrlSharedBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(liveUrlSharedBcsvrResponse, "response");
            this.f19430a = str;
            this.f19431b = liveUrlSharedBcsvrResponse;
        }

        public String a() {
            return this.f19430a;
        }

        public final LiveUrlSharedBcsvrResponse b() {
            return this.f19431b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q0) {
                q0 q0Var = (q0) obj;
                return jo.p.c(a(), q0Var.a()) && jo.p.c(this.f19431b, q0Var.f19431b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19431b.hashCode();
        }

        public String toString() {
            return "LiveUrlShared(key=" + a() + ", response=" + this.f19431b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19432a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19433b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, String str2) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(str2, "response");
            this.f19432a = str;
            this.f19433b = str2;
        }

        public String a() {
            return this.f19432a;
        }

        public final String b() {
            return this.f19433b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof r) {
                r rVar = (r) obj;
                return jo.p.c(a(), rVar.a()) && jo.p.c(this.f19433b, rVar.f19433b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19433b.hashCode();
        }

        public String toString() {
            return "EmomoQuestGameGiftReceived(key=" + a() + ", response=" + this.f19433b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class r0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19434a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveViewerNum f19435b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(String str, LiveViewerNum liveViewerNum) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(liveViewerNum, "liveViewerNum");
            this.f19434a = str;
            this.f19435b = liveViewerNum;
        }

        public String a() {
            return this.f19434a;
        }

        public final LiveViewerNum b() {
            return this.f19435b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof r0) {
                r0 r0Var = (r0) obj;
                return jo.p.c(a(), r0Var.a()) && jo.p.c(this.f19435b, r0Var.f19435b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19435b.hashCode();
        }

        public String toString() {
            return "LiveViewerNumChanged(key=" + a() + ", liveViewerNum=" + this.f19435b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19436a;

        /* renamed from: b  reason: collision with root package name */
        public final EmomoQuestGameStateBcsvrResponse f19437b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, EmomoQuestGameStateBcsvrResponse emomoQuestGameStateBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(emomoQuestGameStateBcsvrResponse, "response");
            this.f19436a = str;
            this.f19437b = emomoQuestGameStateBcsvrResponse;
        }

        public String a() {
            return this.f19436a;
        }

        public final EmomoQuestGameStateBcsvrResponse b() {
            return this.f19437b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s) {
                s sVar = (s) obj;
                return jo.p.c(a(), sVar.a()) && jo.p.c(this.f19437b, sVar.f19437b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19437b.hashCode();
        }

        public String toString() {
            return "EmomoQuestGameStateChanged(key=" + a() + ", response=" + this.f19437b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class s0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19438a;

        /* renamed from: b  reason: collision with root package name */
        public final LuckyPrizeBcsvrResponse f19439b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(String str, LuckyPrizeBcsvrResponse luckyPrizeBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(luckyPrizeBcsvrResponse, "response");
            this.f19438a = str;
            this.f19439b = luckyPrizeBcsvrResponse;
        }

        public String a() {
            return this.f19438a;
        }

        public final LuckyPrizeBcsvrResponse b() {
            return this.f19439b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s0) {
                s0 s0Var = (s0) obj;
                return jo.p.c(a(), s0Var.a()) && jo.p.c(this.f19439b, s0Var.f19439b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19439b.hashCode();
        }

        public String toString() {
            return "LuckyPrizeReceived(key=" + a() + ", response=" + this.f19439b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19440a;

        /* renamed from: b  reason: collision with root package name */
        public final EmomoRunGameGift f19441b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str, EmomoRunGameGift emomoRunGameGift) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(emomoRunGameGift, "emomoRunGameGift");
            this.f19440a = str;
            this.f19441b = emomoRunGameGift;
        }

        public final EmomoRunGameGift a() {
            return this.f19441b;
        }

        public String b() {
            return this.f19440a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof t) {
                t tVar = (t) obj;
                return jo.p.c(b(), tVar.b()) && jo.p.c(this.f19441b, tVar.f19441b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f19441b.hashCode();
        }

        public String toString() {
            return "EmomoRunGiftSent(key=" + b() + ", emomoRunGameGift=" + this.f19441b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class t0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19442a;

        /* renamed from: b  reason: collision with root package name */
        public final MatchingLiveBcsvrResponse f19443b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(String str, MatchingLiveBcsvrResponse matchingLiveBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(matchingLiveBcsvrResponse, "response");
            this.f19442a = str;
            this.f19443b = matchingLiveBcsvrResponse;
        }

        public String a() {
            return this.f19442a;
        }

        public final MatchingLiveBcsvrResponse b() {
            return this.f19443b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof t0) {
                t0 t0Var = (t0) obj;
                return jo.p.c(a(), t0Var.a()) && jo.p.c(this.f19443b, t0Var.f19443b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19443b.hashCode();
        }

        public String toString() {
            return "MatchingLive(key=" + a() + ", response=" + this.f19443b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19444a;

        /* renamed from: b  reason: collision with root package name */
        public final EmomoRunState f19445b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, EmomoRunState emomoRunState) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(emomoRunState, "emomoRunState");
            this.f19444a = str;
            this.f19445b = emomoRunState;
        }

        public final EmomoRunState a() {
            return this.f19445b;
        }

        public String b() {
            return this.f19444a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof u) {
                u uVar = (u) obj;
                return jo.p.c(b(), uVar.b()) && jo.p.c(this.f19445b, uVar.f19445b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f19445b.hashCode();
        }

        public String toString() {
            return "EmomoRunStateChanged(key=" + b() + ", emomoRunState=" + this.f19445b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class u0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19446a;

        /* renamed from: b  reason: collision with root package name */
        public final MatchingCollabCanceledBcsvrResponse f19447b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(String str, MatchingCollabCanceledBcsvrResponse matchingCollabCanceledBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(matchingCollabCanceledBcsvrResponse, "response");
            this.f19446a = str;
            this.f19447b = matchingCollabCanceledBcsvrResponse;
        }

        public String a() {
            return this.f19446a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof u0) {
                u0 u0Var = (u0) obj;
                return jo.p.c(a(), u0Var.a()) && jo.p.c(this.f19447b, u0Var.f19447b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19447b.hashCode();
        }

        public String toString() {
            return "MatchingLiveCanceled(key=" + a() + ", response=" + this.f19447b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19448a;

        /* renamed from: b  reason: collision with root package name */
        public final UpdateEmomoVisibleBcsvrResponse f19449b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, UpdateEmomoVisibleBcsvrResponse updateEmomoVisibleBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(updateEmomoVisibleBcsvrResponse, "response");
            this.f19448a = str;
            this.f19449b = updateEmomoVisibleBcsvrResponse;
        }

        public String a() {
            return this.f19448a;
        }

        public final UpdateEmomoVisibleBcsvrResponse b() {
            return this.f19449b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof v) {
                v vVar = (v) obj;
                return jo.p.c(a(), vVar.a()) && jo.p.c(this.f19449b, vVar.f19449b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19449b.hashCode();
        }

        public String toString() {
            return "EmomoVisibilityChanged(key=" + a() + ", response=" + this.f19449b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class v0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19450a;

        /* renamed from: b  reason: collision with root package name */
        public final MatchingStarterToStarterBcsvrResponse f19451b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(String str, MatchingStarterToStarterBcsvrResponse matchingStarterToStarterBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(matchingStarterToStarterBcsvrResponse, "response");
            this.f19450a = str;
            this.f19451b = matchingStarterToStarterBcsvrResponse;
        }

        public String a() {
            return this.f19450a;
        }

        public final MatchingStarterToStarterBcsvrResponse b() {
            return this.f19451b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof v0) {
                v0 v0Var = (v0) obj;
                return jo.p.c(a(), v0Var.a()) && jo.p.c(this.f19451b, v0Var.f19451b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19451b.hashCode();
        }

        public String toString() {
            return "MatchingStarterToStarter(key=" + a() + ", response=" + this.f19451b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19452a;

        /* renamed from: b  reason: collision with root package name */
        public final FeverValue f19453b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str, FeverValue feverValue) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(feverValue, "response");
            this.f19452a = str;
            this.f19453b = feverValue;
        }

        public String a() {
            return this.f19452a;
        }

        public final FeverValue b() {
            return this.f19453b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof w) {
                w wVar = (w) obj;
                return jo.p.c(a(), wVar.a()) && jo.p.c(this.f19453b, wVar.f19453b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19453b.hashCode();
        }

        public String toString() {
            return "FeverValueChanged(key=" + a() + ", response=" + this.f19453b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class w0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19454a;

        /* renamed from: b  reason: collision with root package name */
        public final Comment f19455b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(String str, Comment comment) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(comment, "commentData");
            this.f19454a = str;
            this.f19455b = comment;
        }

        public final Comment a() {
            return this.f19455b;
        }

        public String b() {
            return this.f19454a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof w0) {
                w0 w0Var = (w0) obj;
                return jo.p.c(b(), w0Var.b()) && jo.p.c(this.f19455b, w0Var.f19455b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f19455b.hashCode();
        }

        public String toString() {
            return "MemoBroadcast(key=" + b() + ", commentData=" + this.f19455b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19456a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str) {
            super(null);
            jo.p.h(str, "key");
            this.f19456a = str;
        }

        public String a() {
            return this.f19456a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && jo.p.c(a(), ((x) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "FocusEventUpdated(key=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class x0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19457a;

        /* renamed from: b  reason: collision with root package name */
        public final ChangeModerator f19458b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(String str, ChangeModerator changeModerator) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(changeModerator, "changeModerator");
            this.f19457a = str;
            this.f19458b = changeModerator;
        }

        public final ChangeModerator a() {
            return this.f19458b;
        }

        public String b() {
            return this.f19457a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof x0) {
                x0 x0Var = (x0) obj;
                return jo.p.c(b(), x0Var.b()) && jo.p.c(this.f19458b, x0Var.f19458b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f19458b.hashCode();
        }

        public String toString() {
            return "ModeratorChange(key=" + b() + ", changeModerator=" + this.f19458b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19459a;

        /* renamed from: b  reason: collision with root package name */
        public final GiftItem f19460b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str, GiftItem giftItem) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(giftItem, "giftItem");
            this.f19459a = str;
            this.f19460b = giftItem;
        }

        public final GiftItem a() {
            return this.f19460b;
        }

        public String b() {
            return this.f19459a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof y) {
                y yVar = (y) obj;
                return jo.p.c(b(), yVar.b()) && jo.p.c(this.f19460b, yVar.f19460b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f19460b.hashCode();
        }

        public String toString() {
            return "GiftCommentReceived(key=" + b() + ", giftItem=" + this.f19460b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class y0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19461a;

        /* renamed from: b  reason: collision with root package name */
        public final MutualGiftAchievedBcsvrResponse f19462b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(String str, MutualGiftAchievedBcsvrResponse mutualGiftAchievedBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(mutualGiftAchievedBcsvrResponse, "response");
            this.f19461a = str;
            this.f19462b = mutualGiftAchievedBcsvrResponse;
        }

        public String a() {
            return this.f19461a;
        }

        public final MutualGiftAchievedBcsvrResponse b() {
            return this.f19462b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof y0) {
                y0 y0Var = (y0) obj;
                return jo.p.c(a(), y0Var.a()) && jo.p.c(this.f19462b, y0Var.f19462b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19462b.hashCode();
        }

        public String toString() {
            return "MutualGiftAchieved(key=" + a() + ", response=" + this.f19462b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19463a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str) {
            super(null);
            jo.p.h(str, "key");
            this.f19463a = str;
        }

        public String a() {
            return this.f19463a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && jo.p.c(a(), ((z) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "GiftPanelReload(key=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class z0 extends l {

        /* renamed from: a  reason: collision with root package name */
        public final String f19464a;

        /* renamed from: b  reason: collision with root package name */
        public final MutualGiftReceivableRewardsBcsvrResponse f19465b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(String str, MutualGiftReceivableRewardsBcsvrResponse mutualGiftReceivableRewardsBcsvrResponse) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(mutualGiftReceivableRewardsBcsvrResponse, "response");
            this.f19464a = str;
            this.f19465b = mutualGiftReceivableRewardsBcsvrResponse;
        }

        public String a() {
            return this.f19464a;
        }

        public final MutualGiftReceivableRewardsBcsvrResponse b() {
            return this.f19465b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof z0) {
                z0 z0Var = (z0) obj;
                return jo.p.c(a(), z0Var.a()) && jo.p.c(this.f19465b, z0Var.f19465b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f19465b.hashCode();
        }

        public String toString() {
            return "MutualGiftReceivableRewards(key=" + a() + ", response=" + this.f19465b + ')';
        }
    }

    public l() {
    }

    public /* synthetic */ l(jo.h hVar) {
        this();
    }
}
