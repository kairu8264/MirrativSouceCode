package ud;

import android.content.res.Resources;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.user.LiveViewingUser;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import java.util.Map;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: m  reason: collision with root package name */
    public static final a f55454m = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f55455a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55456b;

    /* renamed from: c  reason: collision with root package name */
    public final String f55457c;

    /* renamed from: d  reason: collision with root package name */
    public final int f55458d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f55459e;

    /* renamed from: f  reason: collision with root package name */
    public final int f55460f;

    /* renamed from: g  reason: collision with root package name */
    public final int f55461g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f55462h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f55463i;

    /* renamed from: j  reason: collision with root package name */
    public final int f55464j;

    /* renamed from: k  reason: collision with root package name */
    public final String f55465k;

    /* renamed from: l  reason: collision with root package name */
    public final String f55466l;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s a(Resources resources, LiveViewingUser liveViewingUser, boolean z10, Map<String, Integer> map, String str) {
            int i10;
            jo.p.h(resources, "resources");
            jo.p.h(liveViewingUser, MRLog.TARGET_TYPE_USER);
            jo.p.h(map, "collabSettings");
            String userId = liveViewingUser.getUserId();
            String profileImageUrl = liveViewingUser.getProfileImageUrl();
            String name = liveViewingUser.getName();
            CollabType collabType = liveViewingUser.getCollabType();
            CollabType collabType2 = CollabType.LIVE;
            if (collabType == collabType2) {
                i10 = nd.y0.ic_collab_live_red;
            } else {
                i10 = nd.y0.ic_collab_talk_red;
            }
            boolean z11 = !z10;
            Integer num = map.get(liveViewingUser.getUserId());
            int intValue = (num != null ? num.intValue() : -24) + 80;
            Boolean isStartedCollab = liveViewingUser.isStartedCollab();
            Boolean bool = Boolean.TRUE;
            int i11 = jo.p.c(isStartedCollab, bool) ? 0 : 4;
            boolean z12 = !jo.p.c(liveViewingUser.isStartedCollab(), bool);
            boolean z13 = liveViewingUser.getCollabType() == collabType2 && jo.p.c(liveViewingUser.isStartedCollab(), bool);
            int i12 = jo.p.c(str, liveViewingUser.getLiveId()) ? nd.w0.Y : nd.w0.f42242u0;
            String string = resources.getString(jo.p.c(str, liveViewingUser.getLiveId()) ? nd.f1.text_viewing : nd.f1.text_display_live);
            jo.p.g(string, "resources.getString(if (…string.text_display_live)");
            UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) xn.a0.a0(liveViewingUser.getBadges(), 0);
            return new s(userId, profileImageUrl, name, i10, z11, intValue, i11, z12, z13, i12, string, (userBadgeImageUrl == null || (r2 = userBadgeImageUrl.getSmallImageUrl()) == null) ? "" : "");
        }
    }

    public s(String str, String str2, String str3, int i10, boolean z10, int i11, int i12, boolean z11, boolean z12, int i13, String str4, String str5) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "userIconImageUrl");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "showLiveButtonText");
        jo.p.h(str5, "continuousStreamerBadgeImageUrl");
        this.f55455a = str;
        this.f55456b = str2;
        this.f55457c = str3;
        this.f55458d = i10;
        this.f55459e = z10;
        this.f55460f = i11;
        this.f55461g = i12;
        this.f55462h = z11;
        this.f55463i = z12;
        this.f55464j = i13;
        this.f55465k = str4;
        this.f55466l = str5;
    }

    public final String a() {
        return this.f55466l;
    }

    public final int b() {
        return this.f55458d;
    }

    public final int c() {
        return this.f55464j;
    }

    public final String d() {
        return this.f55465k;
    }

    public final String e() {
        return this.f55456b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return jo.p.c(this.f55455a, sVar.f55455a) && jo.p.c(this.f55456b, sVar.f55456b) && jo.p.c(this.f55457c, sVar.f55457c) && this.f55458d == sVar.f55458d && this.f55459e == sVar.f55459e && this.f55460f == sVar.f55460f && this.f55461g == sVar.f55461g && this.f55462h == sVar.f55462h && this.f55463i == sVar.f55463i && this.f55464j == sVar.f55464j && jo.p.c(this.f55465k, sVar.f55465k) && jo.p.c(this.f55466l, sVar.f55466l);
        }
        return false;
    }

    public final String f() {
        return this.f55455a;
    }

    public final String g() {
        return this.f55457c;
    }

    public final int h() {
        return this.f55460f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f55455a.hashCode() * 31) + this.f55456b.hashCode()) * 31) + this.f55457c.hashCode()) * 31) + Integer.hashCode(this.f55458d)) * 31;
        boolean z10 = this.f55459e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((hashCode + i10) * 31) + Integer.hashCode(this.f55460f)) * 31) + Integer.hashCode(this.f55461g)) * 31;
        boolean z11 = this.f55462h;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode2 + i11) * 31;
        boolean z12 = this.f55463i;
        return ((((((i12 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + Integer.hashCode(this.f55464j)) * 31) + this.f55465k.hashCode()) * 31) + this.f55466l.hashCode();
    }

    public final int i() {
        return this.f55461g;
    }

    public final boolean j() {
        return this.f55462h;
    }

    public final boolean k() {
        return this.f55463i;
    }

    public final boolean l() {
        return this.f55459e;
    }

    public String toString() {
        return "CollabMemberBindModel(userId=" + this.f55455a + ", userIconImageUrl=" + this.f55456b + ", userName=" + this.f55457c + ", iconResourceId=" + this.f55458d + ", isVisibleStopImage=" + this.f55459e + ", volumeProgress=" + this.f55460f + ", volumeVisibility=" + this.f55461g + ", isVisiblePreparing=" + this.f55462h + ", isVisibleShowLiveButton=" + this.f55463i + ", showLiveButtonBackgroundColor=" + this.f55464j + ", showLiveButtonText=" + this.f55465k + ", continuousStreamerBadgeImageUrl=" + this.f55466l + ')';
    }
}
