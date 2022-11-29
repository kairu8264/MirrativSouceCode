package ud;

import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.user.LiveViewingUser;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: d  reason: collision with root package name */
    public static final a f55793d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f55794a;

    /* renamed from: b  reason: collision with root package name */
    public final int f55795b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f55796c;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final z a(LiveViewingUser liveViewingUser) {
            int i10;
            jo.p.h(liveViewingUser, "liveViewingUser");
            String profileImageUrl = liveViewingUser.getProfileImageUrl();
            if (liveViewingUser.getCollabType() == CollabType.CALL) {
                i10 = nd.y0.ic_collab_talk_red;
            } else {
                i10 = nd.y0.ic_collab_live_red;
            }
            return new z(profileImageUrl, i10, !jo.p.c(liveViewingUser.isStartedCollab(), Boolean.TRUE));
        }
    }

    public z(String str, int i10, boolean z10) {
        jo.p.h(str, "profileImageUrl");
        this.f55794a = str;
        this.f55795b = i10;
        this.f55796c = z10;
    }

    public final int a() {
        return this.f55795b;
    }

    public final String b() {
        return this.f55794a;
    }

    public final boolean c() {
        return this.f55796c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return jo.p.c(this.f55794a, zVar.f55794a) && this.f55795b == zVar.f55795b && this.f55796c == zVar.f55796c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f55794a.hashCode() * 31) + Integer.hashCode(this.f55795b)) * 31;
        boolean z10 = this.f55796c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "EmomoCollabUserBindModel(profileImageUrl=" + this.f55794a + ", iconResourceId=" + this.f55795b + ", isPreparing=" + this.f55796c + ')';
    }
}
