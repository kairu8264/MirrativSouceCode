package cc;

import android.content.res.Resources;
import com.dena.mirrorman.net.api.response.user.CollabInvitableUser;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: e  reason: collision with root package name */
    public static final a f19094e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f19095a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19096b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19097c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f19098d;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final o a(Resources resources, CollabInvitableUser collabInvitableUser, boolean z10) {
            jo.p.h(resources, "resources");
            jo.p.h(collabInvitableUser, "collabInvitableUser");
            String string = resources.getString(xb.r.text_invite_viewer_to_collab, collabInvitableUser.getName());
            jo.p.g(string, "resources.getString(R.st…collabInvitableUser.name)");
            String profileImageUrl = collabInvitableUser.getProfileImageUrl();
            UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) xn.a0.a0(collabInvitableUser.getBadges(), 0);
            return new o(string, profileImageUrl, (userBadgeImageUrl == null || (r7 = userBadgeImageUrl.getSmallImageUrl()) == null) ? "" : "", z10);
        }
    }

    public o(String str, String str2, String str3, boolean z10) {
        jo.p.h(str, "title");
        jo.p.h(str2, "profileImageUrl");
        jo.p.h(str3, "continuousStreamerBadgeImageUrl");
        this.f19095a = str;
        this.f19096b = str2;
        this.f19097c = str3;
        this.f19098d = z10;
    }

    public final String a() {
        return this.f19097c;
    }

    public final String b() {
        return this.f19096b;
    }

    public final String c() {
        return this.f19095a;
    }

    public final boolean d() {
        return this.f19098d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return jo.p.c(this.f19095a, oVar.f19095a) && jo.p.c(this.f19096b, oVar.f19096b) && jo.p.c(this.f19097c, oVar.f19097c) && this.f19098d == oVar.f19098d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f19095a.hashCode() * 31) + this.f19096b.hashCode()) * 31) + this.f19097c.hashCode()) * 31;
        boolean z10 = this.f19098d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "InviteCollabBindModel(title=" + this.f19095a + ", profileImageUrl=" + this.f19096b + ", continuousStreamerBadgeImageUrl=" + this.f19097c + ", isVisibleStreamingCollab=" + this.f19098d + ')';
    }
}
