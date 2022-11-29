package ud;

import android.content.res.Resources;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.user.LiveViewingUser;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import ud.a;

/* loaded from: classes2.dex */
public final class d2 implements ud.a {
    public static final a G = new a(null);
    public final String A;
    public final String B;
    public final String C;
    public final we.g D;
    public final Integer E;
    public final a.EnumC0862a F;

    /* renamed from: w  reason: collision with root package name */
    public final String f54860w;

    /* renamed from: x  reason: collision with root package name */
    public final String f54861x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f54862y;

    /* renamed from: z  reason: collision with root package name */
    public final int f54863z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d2 a(LiveViewingUser liveViewingUser, Resources resources) {
            int i10;
            String string;
            jo.p.h(liveViewingUser, MRLog.TARGET_TYPE_USER);
            jo.p.h(resources, "resource");
            String userId = liveViewingUser.getUserId();
            String name = liveViewingUser.getName();
            boolean isCollaborating = liveViewingUser.isCollaborating();
            CollabType collabType = liveViewingUser.getCollabType();
            CollabType collabType2 = CollabType.LIVE;
            if (collabType == collabType2) {
                i10 = nd.y0.ic_collab_live_red_alpha;
            } else {
                i10 = nd.y0.ic_collab;
            }
            if (liveViewingUser.getCollabType() == collabType2) {
                string = resources.getString(nd.f1.text_viewer_collab_list_streaming_collab);
            } else {
                string = resources.getString(nd.f1.text_viewer_collab_list_collab);
            }
            String str = string;
            jo.p.g(str, "if (user.collabType == C…ist_collab)\n            }");
            String profileImageUrl = liveViewingUser.getProfileImageUrl();
            UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) xn.a0.a0(liveViewingUser.getBadges(), 0);
            return new d2(userId, name, isCollaborating, i10, str, profileImageUrl, userBadgeImageUrl != null ? userBadgeImageUrl.getSmallImageUrl() : null, we.g.Companion.a(liveViewingUser.getYellRank()), Integer.valueOf(liveViewingUser.getYellLevel()), null, 512, null);
        }
    }

    public d2(String str, String str2, boolean z10, int i10, String str3, String str4, String str5, we.g gVar, Integer num, a.EnumC0862a enumC0862a) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "userName");
        jo.p.h(str3, "collabText");
        jo.p.h(gVar, "yellRank");
        jo.p.h(enumC0862a, "type");
        this.f54860w = str;
        this.f54861x = str2;
        this.f54862y = z10;
        this.f54863z = i10;
        this.A = str3;
        this.B = str4;
        this.C = str5;
        this.D = gVar;
        this.E = num;
        this.F = enumC0862a;
    }

    public final int a() {
        return this.f54863z;
    }

    public final String b() {
        return this.A;
    }

    public final boolean c() {
        return this.f54862y;
    }

    public final String d() {
        return this.C;
    }

    public final String e() {
        return this.B;
    }

    public final String f() {
        return this.f54860w;
    }

    public final String g() {
        return this.f54861x;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.F;
    }

    public final Integer h() {
        return this.E;
    }

    public final we.g i() {
        return this.D;
    }

    public /* synthetic */ d2(String str, String str2, boolean z10, int i10, String str3, String str4, String str5, we.g gVar, Integer num, a.EnumC0862a enumC0862a, int i11, jo.h hVar) {
        this(str, str2, z10, i10, str3, str4, str5, gVar, num, (i11 & 512) != 0 ? a.EnumC0862a.LIVE_VIEWER : enumC0862a);
    }
}
