package ud;

import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.user.LiveViewingUser;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: e  reason: collision with root package name */
    public static final a f55499e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f55500a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55501b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55502c;

    /* renamed from: d  reason: collision with root package name */
    public final int f55503d;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final t a(String str, LiveViewingUser liveViewingUser) {
            int i10;
            int i11;
            jo.p.h(str, "playLiveId");
            jo.p.h(liveViewingUser, "liveViewingUser");
            String liveId = liveViewingUser.getLiveId();
            if (liveId == null) {
                liveId = "";
            }
            String profileImageUrl = liveViewingUser.getProfileImageUrl();
            if (jo.p.c(str, liveViewingUser.getLiveId())) {
                i10 = nd.y0.bg_collab_user_active;
            } else {
                i10 = nd.y0.bg_collab_user;
            }
            if (liveViewingUser.getCollabType() == CollabType.LIVE) {
                i11 = nd.y0.ic_collab_live_red;
            } else {
                i11 = nd.y0.ic_collab_talk_red;
            }
            return new t(liveId, profileImageUrl, i10, i11);
        }
    }

    public t(String str, String str2, int i10, int i11) {
        jo.p.h(str, "liveId");
        jo.p.h(str2, "profileImageUrl");
        this.f55500a = str;
        this.f55501b = str2;
        this.f55502c = i10;
        this.f55503d = i11;
    }

    public final int a() {
        return this.f55502c;
    }

    public final int b() {
        return this.f55503d;
    }

    public final String c() {
        return this.f55500a;
    }

    public final String d() {
        return this.f55501b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return jo.p.c(this.f55500a, tVar.f55500a) && jo.p.c(this.f55501b, tVar.f55501b) && this.f55502c == tVar.f55502c && this.f55503d == tVar.f55503d;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f55500a.hashCode() * 31) + this.f55501b.hashCode()) * 31) + Integer.hashCode(this.f55502c)) * 31) + Integer.hashCode(this.f55503d);
    }

    public String toString() {
        return "CollabUserBindModel(liveId=" + this.f55500a + ", profileImageUrl=" + this.f55501b + ", bgResourceId=" + this.f55502c + ", iconResourceId=" + this.f55503d + ')';
    }
}
