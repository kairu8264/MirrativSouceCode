package zb;

import android.content.Context;
import androidx.lifecycle.e0;
import com.dena.mirrorman.net.api.response.user.CollabInvitableUser;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import jo.p;
import xb.r;
import xn.a0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f62955j = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public static final int f62956k = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f62957a;

    /* renamed from: b  reason: collision with root package name */
    public final String f62958b;

    /* renamed from: c  reason: collision with root package name */
    public final String f62959c;

    /* renamed from: d  reason: collision with root package name */
    public final String f62960d;

    /* renamed from: e  reason: collision with root package name */
    public final String f62961e;

    /* renamed from: f  reason: collision with root package name */
    public final String f62962f;

    /* renamed from: g  reason: collision with root package name */
    public final e0<Boolean> f62963g;

    /* renamed from: h  reason: collision with root package name */
    public final we.g f62964h;

    /* renamed from: i  reason: collision with root package name */
    public final int f62965i;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b a(Context context, CollabInvitableUser collabInvitableUser, boolean z10) {
            String str;
            String string;
            String smallImageUrl;
            p.h(context, "context");
            p.h(collabInvitableUser, "collabInvitableUser");
            String userId = collabInvitableUser.getUserId();
            String name = collabInvitableUser.getName();
            String profileImageUrl = collabInvitableUser.getProfileImageUrl();
            String catalogLabelImageUrl = collabInvitableUser.getCatalogLabelImageUrl();
            String str2 = catalogLabelImageUrl == null ? "" : catalogLabelImageUrl;
            UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) a0.a0(collabInvitableUser.getBadges(), 0);
            String str3 = (userBadgeImageUrl == null || (smallImageUrl = userBadgeImageUrl.getSmallImageUrl()) == null) ? "" : smallImageUrl;
            if (collabInvitableUser.getLatestLiveStartedAt() == 0) {
                string = context.getString(r.text_invitable_collab_user_no_last_broadcast);
                str = str3;
            } else {
                str = str3;
                string = context.getString(r.text_invitable_collab_user_last_broadcast_time, of.c.f45387a.f(context, System.currentTimeMillis(), collabInvitableUser.getLatestLiveStartedAt() * 1000));
            }
            p.g(string, "if (collabInvitableUser.…t * 1000L))\n            }");
            return new b(userId, name, profileImageUrl, str2, str, string, new e0(Boolean.valueOf(z10)), we.g.Companion.a(collabInvitableUser.getYellRank()), collabInvitableUser.getYellLevel());
        }
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, e0<Boolean> e0Var, we.g gVar, int i10) {
        p.h(str, "userId");
        p.h(str2, "userNameText");
        p.h(str3, "profileImageUrl");
        p.h(str4, "continuousStreamerLabelImageUrl");
        p.h(str5, "continuousStreamerBadgeImageUrl");
        p.h(str6, "latestLiveText");
        p.h(e0Var, "isEnabledInvite");
        p.h(gVar, "yellRank");
        this.f62957a = str;
        this.f62958b = str2;
        this.f62959c = str3;
        this.f62960d = str4;
        this.f62961e = str5;
        this.f62962f = str6;
        this.f62963g = e0Var;
        this.f62964h = gVar;
        this.f62965i = i10;
    }

    public final String a() {
        return this.f62961e;
    }

    public final String b() {
        return this.f62960d;
    }

    public final String c() {
        return this.f62962f;
    }

    public final String d() {
        return this.f62959c;
    }

    public final String e() {
        return this.f62957a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return p.c(this.f62957a, bVar.f62957a) && p.c(this.f62958b, bVar.f62958b) && p.c(this.f62959c, bVar.f62959c) && p.c(this.f62960d, bVar.f62960d) && p.c(this.f62961e, bVar.f62961e) && p.c(this.f62962f, bVar.f62962f) && p.c(this.f62963g, bVar.f62963g) && this.f62964h == bVar.f62964h && this.f62965i == bVar.f62965i;
        }
        return false;
    }

    public final String f() {
        return this.f62958b;
    }

    public final int g() {
        return this.f62965i;
    }

    public final we.g h() {
        return this.f62964h;
    }

    public int hashCode() {
        return (((((((((((((((this.f62957a.hashCode() * 31) + this.f62958b.hashCode()) * 31) + this.f62959c.hashCode()) * 31) + this.f62960d.hashCode()) * 31) + this.f62961e.hashCode()) * 31) + this.f62962f.hashCode()) * 31) + this.f62963g.hashCode()) * 31) + this.f62964h.hashCode()) * 31) + Integer.hashCode(this.f62965i);
    }

    public final e0<Boolean> i() {
        return this.f62963g;
    }

    public final boolean j() {
        return this.f62960d.length() > 0;
    }

    public String toString() {
        return "CollabCandidateViewerBindModel(userId=" + this.f62957a + ", userNameText=" + this.f62958b + ", profileImageUrl=" + this.f62959c + ", continuousStreamerLabelImageUrl=" + this.f62960d + ", continuousStreamerBadgeImageUrl=" + this.f62961e + ", latestLiveText=" + this.f62962f + ", isEnabledInvite=" + this.f62963g + ", yellRank=" + this.f62964h + ", yellLevel=" + this.f62965i + ')';
    }
}
