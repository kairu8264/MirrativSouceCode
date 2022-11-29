package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.BroadcastResult;
import com.dena.mirrorman.net.api.response.live.LiveWatchedUsersResponse;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: pd.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0710a extends a {

        /* renamed from: a  reason: collision with root package name */
        public final BroadcastResult f46542a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0710a(BroadcastResult broadcastResult) {
            super(null);
            jo.p.h(broadcastResult, "broadcastResult");
            this.f46542a = broadcastResult;
        }

        public final BroadcastResult a() {
            return this.f46542a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0710a) && jo.p.c(this.f46542a, ((C0710a) obj).f46542a);
        }

        public int hashCode() {
            return this.f46542a.hashCode();
        }

        public String toString() {
            return "LoadFinish(broadcastResult=" + this.f46542a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final LiveWatchedUsersResponse f46543a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LiveWatchedUsersResponse liveWatchedUsersResponse) {
            super(null);
            jo.p.h(liveWatchedUsersResponse, "liveWatchedUsersResponse");
            this.f46543a = liveWatchedUsersResponse;
        }

        public final LiveWatchedUsersResponse a() {
            return this.f46543a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f46543a, ((b) obj).f46543a);
        }

        public int hashCode() {
            return this.f46543a.hashCode();
        }

        public String toString() {
            return "LoadLiveViewersFinish(liveWatchedUsersResponse=" + this.f46543a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46544a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46544a = mRError;
        }

        public final MRError a() {
            return this.f46544a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f46544a, ((c) obj).f46544a);
        }

        public int hashCode() {
            return this.f46544a.hashCode();
        }

        public String toString() {
            return "PostFollowAllViewersFailed(error=" + this.f46544a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f46545a = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends a {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46546a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46546a = mRError;
        }

        public final MRError a() {
            return this.f46546a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f46546a, ((e) obj).f46546a);
        }

        public int hashCode() {
            return this.f46546a.hashCode();
        }

        public String toString() {
            return "PostFollowFailed(error=" + this.f46546a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends a {

        /* renamed from: a  reason: collision with root package name */
        public final String f46547a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f46547a = str;
        }

        public final String a() {
            return this.f46547a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f46547a, ((f) obj).f46547a);
        }

        public int hashCode() {
            return this.f46547a.hashCode();
        }

        public String toString() {
            return "PostFollowSucceeded(userId=" + this.f46547a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends a {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46548a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46548a = mRError;
        }

        public final MRError a() {
            return this.f46548a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f46548a, ((g) obj).f46548a);
        }

        public int hashCode() {
            return this.f46548a.hashCode();
        }

        public String toString() {
            return "PostThanksFailed(error=" + this.f46548a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends a {

        /* renamed from: a  reason: collision with root package name */
        public final String f46549a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46550b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, int i10) {
            super(null);
            jo.p.h(str, "userId");
            this.f46549a = str;
            this.f46550b = i10;
        }

        public final int a() {
            return this.f46550b;
        }

        public final String b() {
            return this.f46549a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends a {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46551a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46551a = mRError;
        }

        public final MRError a() {
            return this.f46551a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && jo.p.c(this.f46551a, ((i) obj).f46551a);
        }

        public int hashCode() {
            return this.f46551a.hashCode();
        }

        public String toString() {
            return "PostUnfollowFailed(error=" + this.f46551a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends a {

        /* renamed from: a  reason: collision with root package name */
        public final String f46552a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f46552a = str;
        }

        public final String a() {
            return this.f46552a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && jo.p.c(this.f46552a, ((j) obj).f46552a);
        }

        public int hashCode() {
            return this.f46552a.hashCode();
        }

        public String toString() {
            return "PostUnfollowSucceeded(userId=" + this.f46552a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends a {

        /* renamed from: a  reason: collision with root package name */
        public final LiveWatchedUsersResponse f46553a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(LiveWatchedUsersResponse liveWatchedUsersResponse) {
            super(null);
            jo.p.h(liveWatchedUsersResponse, "liveWatchedUsersResponse");
            this.f46553a = liveWatchedUsersResponse;
        }

        public final LiveWatchedUsersResponse a() {
            return this.f46553a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(this.f46553a, ((k) obj).f46553a);
        }

        public int hashCode() {
            return this.f46553a.hashCode();
        }

        public String toString() {
            return "ReloadLiveViewersFinish(liveWatchedUsersResponse=" + this.f46553a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends a {

        /* renamed from: a  reason: collision with root package name */
        public final ChatStatus f46554a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ChatStatus chatStatus) {
            super(null);
            jo.p.h(chatStatus, "chatStatus");
            this.f46554a = chatStatus;
        }

        public final ChatStatus a() {
            return this.f46554a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && jo.p.c(this.f46554a, ((l) obj).f46554a);
        }

        public int hashCode() {
            return this.f46554a.hashCode();
        }

        public String toString() {
            return "UpdateChatStatus(chatStatus=" + this.f46554a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends a {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46555a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46555a = mRError;
        }

        public final MRError a() {
            return this.f46555a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && jo.p.c(this.f46555a, ((m) obj).f46555a);
        }

        public int hashCode() {
            return this.f46555a.hashCode();
        }

        public String toString() {
            return "UpdateUserProfileFailed(error=" + this.f46555a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final n f46556a = new n();

        public n() {
            super(null);
        }
    }

    public a() {
    }

    public /* synthetic */ a(jo.h hVar) {
        this();
    }
}
