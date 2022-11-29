package pd;

import android.graphics.Bitmap;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.ChatThreadList;
import com.dena.mirrorman.net.api.response.live.LiveArchiveDownloadUrlResponse;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.live.LiveHistoriesResponse;
import com.dena.mirrorman.net.api.response.live.ViewHistoriesResponse;
import com.dena.mirrorman.net.api.response.user.UserMe;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class j0 {

    /* loaded from: classes2.dex */
    public static final class a extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f46991a;

        public a(Bitmap bitmap) {
            super(null);
            this.f46991a = bitmap;
        }

        public final Bitmap a() {
            return this.f46991a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f46991a, ((a) obj).f46991a);
        }

        public int hashCode() {
            Bitmap bitmap = this.f46991a;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.hashCode();
        }

        public String toString() {
            return "ActionBarBackgroundImageChangeEvent(actionBarBackgroundImage=" + this.f46991a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46992a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46992a = mRError;
        }

        public final MRError a() {
            return this.f46992a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && jo.p.c(this.f46992a, ((a0) obj).f46992a);
        }

        public int hashCode() {
            return this.f46992a.hashCode();
        }

        public String toString() {
            return "LiveHistoryDeleteFailEvent(error=" + this.f46992a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final ChatThreadList f46993a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ChatThreadList chatThreadList) {
            super(null);
            jo.p.h(chatThreadList, "response");
            this.f46993a = chatThreadList;
        }

        public final ChatThreadList a() {
            return this.f46993a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f46993a, ((b) obj).f46993a);
        }

        public int hashCode() {
            return this.f46993a.hashCode();
        }

        public String toString() {
            return "AddChatThreadsEvent(response=" + this.f46993a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final LiveBasicParams f46994a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(LiveBasicParams liveBasicParams) {
            super(null);
            jo.p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
            this.f46994a = liveBasicParams;
        }

        public final LiveBasicParams a() {
            return this.f46994a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && jo.p.c(this.f46994a, ((b0) obj).f46994a);
        }

        public int hashCode() {
            return this.f46994a.hashCode();
        }

        public String toString() {
            return "LiveHistoryUpdateEvent(live=" + this.f46994a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final LiveHistoriesResponse f46995a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LiveHistoriesResponse liveHistoriesResponse) {
            super(null);
            jo.p.h(liveHistoriesResponse, "response");
            this.f46995a = liveHistoriesResponse;
        }

        public final LiveHistoriesResponse a() {
            return this.f46995a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f46995a, ((c) obj).f46995a);
        }

        public int hashCode() {
            return this.f46995a.hashCode();
        }

        public String toString() {
            return "AddLiveHistoriesEvent(response=" + this.f46995a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46996a;

        public c0(boolean z10) {
            super(null);
            this.f46996a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && this.f46996a == ((c0) obj).f46996a;
        }

        public int hashCode() {
            boolean z10 = this.f46996a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "LiveStartTutorialVisibilityChangeEvent(visible=" + this.f46996a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final ViewHistoriesResponse f46997a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ViewHistoriesResponse viewHistoriesResponse) {
            super(null);
            jo.p.h(viewHistoriesResponse, "response");
            this.f46997a = viewHistoriesResponse;
        }

        public final ViewHistoriesResponse a() {
            return this.f46997a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f46997a, ((d) obj).f46997a);
        }

        public int hashCode() {
            return this.f46997a.hashCode();
        }

        public String toString() {
            return "AddViewHistoriesEvent(response=" + this.f46997a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46998a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46998a = mRError;
        }

        public final MRError a() {
            return this.f46998a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && jo.p.c(this.f46998a, ((d0) obj).f46998a);
        }

        public int hashCode() {
            return this.f46998a.hashCode();
        }

        public String toString() {
            return "LiveUpdateArchiveFailEvent(error=" + this.f46998a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f46999a;

        public e(Bitmap bitmap) {
            super(null);
            this.f46999a = bitmap;
        }

        public final Bitmap a() {
            return this.f46999a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f46999a, ((e) obj).f46999a);
        }

        public int hashCode() {
            Bitmap bitmap = this.f46999a;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.hashCode();
        }

        public String toString() {
            return "BackgroundImageChangeEvent(backgroundImage=" + this.f46999a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final UserMe f47000a;

        public e0(UserMe userMe) {
            super(null);
            this.f47000a = userMe;
        }

        public final UserMe a() {
            return this.f47000a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && jo.p.c(this.f47000a, ((e0) obj).f47000a);
        }

        public int hashCode() {
            UserMe userMe = this.f47000a;
            if (userMe == null) {
                return 0;
            }
            return userMe.hashCode();
        }

        public String toString() {
            return "MeDataLoadFinishEvent(profile=" + this.f47000a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47001a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47001a = mRError;
        }

        public final MRError a() {
            return this.f47001a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f47001a, ((f) obj).f47001a);
        }

        public int hashCode() {
            return this.f47001a.hashCode();
        }

        public String toString() {
            return "ChatThreadsErrorOccurEvent(error=" + this.f47001a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public static final f0 f47002a = new f0();

        public f0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public static final g f47003a = new g();

        public g() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47004a;

        public g0(int i10) {
            super(null);
            this.f47004a = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g0) && this.f47004a == ((g0) obj).f47004a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47004a);
        }

        public String toString() {
            return "NextAnnounceTimeChangeEvent(startAt=" + this.f47004a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public static final h f47005a = new h();

        public h() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47006a;

        public h0(int i10) {
            super(null);
            this.f47006a = i10;
        }

        public final int a() {
            return this.f47006a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h0) && this.f47006a == ((h0) obj).f47006a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47006a);
        }

        public String toString() {
            return "NumberOfLivesChangeEvent(numberOfLives=" + this.f47006a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47007a;

        public i(boolean z10) {
            super(null);
            this.f47007a = z10;
        }

        public final boolean a() {
            return this.f47007a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f47007a == ((i) obj).f47007a;
        }

        public int hashCode() {
            boolean z10 = this.f47007a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "CurrencyEnableEvent(enabled=" + this.f47007a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47008a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f47008a = str;
        }

        public final String a() {
            return this.f47008a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i0) && jo.p.c(this.f47008a, ((i0) obj).f47008a);
        }

        public int hashCode() {
            return this.f47008a.hashCode();
        }

        public String toString() {
            return "OwnUserIdGetEvent(userId=" + this.f47008a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47009a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47009a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && jo.p.c(this.f47009a, ((j) obj).f47009a);
        }

        public int hashCode() {
            return this.f47009a.hashCode();
        }

        public String toString() {
            return "DeleteNextLiveAnnouncementErrorOccurEvent(error=" + this.f47009a + ')';
        }
    }

    /* renamed from: pd.j0$j0  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0717j0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47010a;

        public C0717j0(int i10) {
            super(null);
            this.f47010a = i10;
        }

        public final int a() {
            return this.f47010a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public static final k f47011a = new k();

        public k() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47012a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(String str) {
            super(null);
            jo.p.h(str, "groupId");
            this.f47012a = str;
        }

        public final String a() {
            return this.f47012a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k0) && jo.p.c(this.f47012a, ((k0) obj).f47012a);
        }

        public int hashCode() {
            return this.f47012a.hashCode();
        }

        public String toString() {
            return "ReadChatByGroupIdEvent(groupId=" + this.f47012a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47013a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f47014b;

        public l(boolean z10, boolean z11) {
            super(null);
            this.f47013a = z10;
            this.f47014b = z11;
        }

        public final boolean a() {
            return this.f47013a;
        }

        public final boolean b() {
            return this.f47014b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return this.f47013a == lVar.f47013a && this.f47014b == lVar.f47014b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z10 = this.f47013a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i10 = r02 * 31;
            boolean z11 = this.f47014b;
            return i10 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public String toString() {
            return "EmomoEnableEvent(enabled=" + this.f47013a + ", hasMadeEmomo=" + this.f47014b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47015a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f47015a = str;
        }

        public final String a() {
            return this.f47015a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l0) && jo.p.c(this.f47015a, ((l0) obj).f47015a);
        }

        public int hashCode() {
            return this.f47015a.hashCode();
        }

        public String toString() {
            return "ReadChatByUserIdEvent(userId=" + this.f47015a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final List<EventBannerResponse> f47016a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(List<EventBannerResponse> list) {
            super(null);
            jo.p.h(list, "eventBanners");
            this.f47016a = list;
        }

        public final List<EventBannerResponse> a() {
            return this.f47016a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && jo.p.c(this.f47016a, ((m) obj).f47016a);
        }

        public int hashCode() {
            return this.f47016a.hashCode();
        }

        public String toString() {
            return "EventBannerChangeEvent(eventBanners=" + this.f47016a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final ViewHistoriesResponse f47017a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(ViewHistoriesResponse viewHistoriesResponse) {
            super(null);
            jo.p.h(viewHistoriesResponse, "response");
            this.f47017a = viewHistoriesResponse;
        }

        public final ViewHistoriesResponse a() {
            return this.f47017a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m0) && jo.p.c(this.f47017a, ((m0) obj).f47017a);
        }

        public int hashCode() {
            return this.f47017a.hashCode();
        }

        public String toString() {
            return "ReloadViewHistoriesEvent(response=" + this.f47017a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends j0 {
    }

    /* loaded from: classes2.dex */
    public static final class n0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public static final n0 f47018a = new n0();

        public n0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47019a;

        public o(boolean z10) {
            super(null);
            this.f47019a = z10;
        }

        public final boolean a() {
            return this.f47019a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f47019a == ((o) obj).f47019a;
        }

        public int hashCode() {
            boolean z10 = this.f47019a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "GradeOneOrHigherChangeEvent(gradeOneOrHigher=" + this.f47019a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class o0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final ChatStatus f47020a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(ChatStatus chatStatus) {
            super(null);
            jo.p.h(chatStatus, "response");
            this.f47020a = chatStatus;
        }

        public final ChatStatus a() {
            return this.f47020a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o0) && jo.p.c(this.f47020a, ((o0) obj).f47020a);
        }

        public int hashCode() {
            return this.f47020a.hashCode();
        }

        public String toString() {
            return "UpdateChatStatus(response=" + this.f47020a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final ChatThreadList f47021a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ChatThreadList chatThreadList) {
            super(null);
            jo.p.h(chatThreadList, "response");
            this.f47021a = chatThreadList;
        }

        public final ChatThreadList a() {
            return this.f47021a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && jo.p.c(this.f47021a, ((p) obj).f47021a);
        }

        public int hashCode() {
            return this.f47021a.hashCode();
        }

        public String toString() {
            return "InitChatThreadsEvent(response=" + this.f47021a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class p0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47022a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47022a = mRError;
        }

        public final MRError a() {
            return this.f47022a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p0) && jo.p.c(this.f47022a, ((p0) obj).f47022a);
        }

        public int hashCode() {
            return this.f47022a.hashCode();
        }

        public String toString() {
            return "ViewHistoriesErrorOccurEvent(error=" + this.f47022a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final LiveHistoriesResponse f47023a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(LiveHistoriesResponse liveHistoriesResponse) {
            super(null);
            jo.p.h(liveHistoriesResponse, "response");
            this.f47023a = liveHistoriesResponse;
        }

        public final LiveHistoriesResponse a() {
            return this.f47023a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && jo.p.c(this.f47023a, ((q) obj).f47023a);
        }

        public int hashCode() {
            return this.f47023a.hashCode();
        }

        public String toString() {
            return "InitLiveHistoriesEvent(response=" + this.f47023a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class q0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public static final q0 f47024a = new q0();

        public q0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47025a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str) {
            super(null);
            jo.p.h(str, "groupId");
            this.f47025a = str;
        }

        public final String a() {
            return this.f47025a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && jo.p.c(this.f47025a, ((r) obj).f47025a);
        }

        public int hashCode() {
            return this.f47025a.hashCode();
        }

        public String toString() {
            return "LeftChatByGroupIdEvent(groupId=" + this.f47025a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class r0 extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public static final r0 f47026a = new r0();

        public r0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47027a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f47027a = str;
        }

        public final String a() {
            return this.f47027a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && jo.p.c(this.f47027a, ((s) obj).f47027a);
        }

        public int hashCode() {
            return this.f47027a.hashCode();
        }

        public String toString() {
            return "LeftChatByUserIdEvent(userId=" + this.f47027a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47028a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47028a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && jo.p.c(this.f47028a, ((t) obj).f47028a);
        }

        public int hashCode() {
            return this.f47028a.hashCode();
        }

        public String toString() {
            return "LiveDownloadRequestFailEvent(error=" + this.f47028a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public static final u f47029a = new u();

        public u() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47030a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47030a = mRError;
        }

        public final MRError a() {
            return this.f47030a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && jo.p.c(this.f47030a, ((v) obj).f47030a);
        }

        public int hashCode() {
            return this.f47030a.hashCode();
        }

        public String toString() {
            return "LiveDownloadUrlLoadErrorOccurEvent(error=" + this.f47030a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final LiveArchiveDownloadUrlResponse f47031a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(LiveArchiveDownloadUrlResponse liveArchiveDownloadUrlResponse) {
            super(null);
            jo.p.h(liveArchiveDownloadUrlResponse, "downloadUrlResponse");
            this.f47031a = liveArchiveDownloadUrlResponse;
        }

        public final LiveArchiveDownloadUrlResponse a() {
            return this.f47031a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && jo.p.c(this.f47031a, ((w) obj).f47031a);
        }

        public int hashCode() {
            return this.f47031a.hashCode();
        }

        public String toString() {
            return "LiveDownloadUrlLoadFinishEvent(downloadUrlResponse=" + this.f47031a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public static final x f47032a = new x();

        public x() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public static final y f47033a = new y();

        public y() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends j0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47034a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str) {
            super(null);
            jo.p.h(str, "liveId");
            this.f47034a = str;
        }

        public final String a() {
            return this.f47034a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && jo.p.c(this.f47034a, ((z) obj).f47034a);
        }

        public int hashCode() {
            return this.f47034a.hashCode();
        }

        public String toString() {
            return "LiveHistoryDeleteEvent(liveId=" + this.f47034a + ')';
        }
    }

    public j0() {
    }

    public /* synthetic */ j0(jo.h hVar) {
        this();
    }
}
