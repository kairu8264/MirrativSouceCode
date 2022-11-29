package hc;

import com.dena.mirrorman.net.api.response.live.LiveGiftRankingUser;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: g  reason: collision with root package name */
    public static final a f35320g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f35321h = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f35322a;

    /* renamed from: b  reason: collision with root package name */
    public final String f35323b;

    /* renamed from: c  reason: collision with root package name */
    public final String f35324c;

    /* renamed from: d  reason: collision with root package name */
    public final String f35325d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f35326e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f35327f;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y a(LiveGiftRankingUser liveGiftRankingUser, List<LiveGiftRankingUser> list) {
            jo.p.h(liveGiftRankingUser, "liveGiftRankingUser");
            jo.p.h(list, "selectedUsers");
            String catalogLabelImageUrl = liveGiftRankingUser.getUser().getCatalogLabelImageUrl();
            if (catalogLabelImageUrl == null) {
                catalogLabelImageUrl = "";
            }
            String str = catalogLabelImageUrl;
            String userId = liveGiftRankingUser.getUser().getUserId();
            String profileImageUrl = liveGiftRankingUser.getUser().getProfileImageUrl();
            String name = liveGiftRankingUser.getUser().getName();
            boolean z10 = true;
            boolean z11 = str.length() > 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (LiveGiftRankingUser liveGiftRankingUser2 : list) {
                    if (jo.p.c(liveGiftRankingUser2.getUser().getUserId(), liveGiftRankingUser.getUser().getUserId())) {
                        break;
                    }
                }
            }
            z10 = false;
            return new y(userId, profileImageUrl, str, name, z11, new androidx.lifecycle.e0(Boolean.valueOf(z10)));
        }
    }

    public y(String str, String str2, String str3, String str4, boolean z10, androidx.lifecycle.e0<Boolean> e0Var) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "profileImageUrl");
        jo.p.h(str3, "continuousStreamerLabelImageUrl");
        jo.p.h(str4, "userName");
        jo.p.h(e0Var, "isSelected");
        this.f35322a = str;
        this.f35323b = str2;
        this.f35324c = str3;
        this.f35325d = str4;
        this.f35326e = z10;
        this.f35327f = e0Var;
    }

    public final String a() {
        return this.f35324c;
    }

    public final String b() {
        return this.f35323b;
    }

    public final String c() {
        return this.f35322a;
    }

    public final String d() {
        return this.f35325d;
    }

    public final androidx.lifecycle.e0<Boolean> e() {
        return this.f35327f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return jo.p.c(this.f35322a, yVar.f35322a) && jo.p.c(this.f35323b, yVar.f35323b) && jo.p.c(this.f35324c, yVar.f35324c) && jo.p.c(this.f35325d, yVar.f35325d) && this.f35326e == yVar.f35326e && jo.p.c(this.f35327f, yVar.f35327f);
        }
        return false;
    }

    public final boolean f() {
        return this.f35326e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f35322a.hashCode() * 31) + this.f35323b.hashCode()) * 31) + this.f35324c.hashCode()) * 31) + this.f35325d.hashCode()) * 31;
        boolean z10 = this.f35326e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + this.f35327f.hashCode();
    }

    public String toString() {
        return "GroupShotMemberBindModel(userId=" + this.f35322a + ", profileImageUrl=" + this.f35323b + ", continuousStreamerLabelImageUrl=" + this.f35324c + ", userName=" + this.f35325d + ", isVisibleContinuousStreamerLabelImage=" + this.f35326e + ", isSelected=" + this.f35327f + ')';
    }
}
