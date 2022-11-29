package v8;

import android.content.Context;
import com.dena.mirrorman.net.api.response.live.GroupShotItem;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import java.util.List;
import xn.a0;
import xn.s;

/* loaded from: classes.dex */
public final class a implements Serializable {
    public static final C0907a H = new C0907a(null);
    public static final int I = 8;
    public final String A;
    public final String B;
    public final String C;
    public final LiveBasicParams D;
    public final boolean E;
    public final boolean F;
    public final List<String> G;

    /* renamed from: w  reason: collision with root package name */
    public final String f56918w;

    /* renamed from: x  reason: collision with root package name */
    public final String f56919x;

    /* renamed from: y  reason: collision with root package name */
    public final String f56920y;

    /* renamed from: z  reason: collision with root package name */
    public final String f56921z;

    /* renamed from: v8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0907a {
        public C0907a() {
        }

        public /* synthetic */ C0907a(jo.h hVar) {
            this();
        }

        public final a a(Context context, GroupShotItem groupShotItem) {
            boolean z10;
            LiveBasicParams live;
            LiveBasicParams live2;
            List<String> collabUserProfileImageUrls;
            jo.p.h(context, "context");
            jo.p.h(groupShotItem, "groupShotItem");
            String id2 = groupShotItem.getId();
            String userId = groupShotItem.getUser().getUserId();
            String name = groupShotItem.getUser().getName();
            String profileImageUrl = groupShotItem.getUser().getProfileImageUrl();
            UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) a0.a0(groupShotItem.getUser().getBadges(), 0);
            String smallImageUrl = userBadgeImageUrl != null ? userBadgeImageUrl.getSmallImageUrl() : null;
            String imagePath = groupShotItem.getImagePath();
            String comment = groupShotItem.getComment();
            LiveBasicParams live3 = groupShotItem.getLive();
            LiveBasicParams live4 = groupShotItem.getLive();
            boolean z11 = true;
            if (live4 != null && live4.isLive()) {
                LiveBasicParams live5 = groupShotItem.getLive();
                List<String> collabUserProfileImageUrls2 = live5 != null ? live5.getCollabUserProfileImageUrls() : null;
                if (collabUserProfileImageUrls2 == null || collabUserProfileImageUrls2.isEmpty()) {
                    z10 = true;
                    live = groupShotItem.getLive();
                    if (live != null || (collabUserProfileImageUrls = live.getCollabUserProfileImageUrls()) == null || !(!collabUserProfileImageUrls.isEmpty())) {
                        z11 = false;
                    }
                    live2 = groupShotItem.getLive();
                    if (live2 != null || (r15 = live2.getCollabUserProfileImageUrls()) == null) {
                        List<String> k10 = s.k();
                    }
                    return new a(id2, userId, name, profileImageUrl, smallImageUrl, imagePath, comment, live3, z10, z11, k10);
                }
            }
            z10 = false;
            live = groupShotItem.getLive();
            if (live != null) {
            }
            z11 = false;
            live2 = groupShotItem.getLive();
            if (live2 != null) {
            }
            List<String> k102 = s.k();
            return new a(id2, userId, name, profileImageUrl, smallImageUrl, imagePath, comment, live3, z10, z11, k102);
        }
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, LiveBasicParams liveBasicParams, boolean z10, boolean z11, List<String> list) {
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "profileImageUrl");
        jo.p.h(str6, "groupShotImageUrl");
        jo.p.h(str7, "groupShotComment");
        jo.p.h(list, "collabViewerImageUrls");
        this.f56918w = str;
        this.f56919x = str2;
        this.f56920y = str3;
        this.f56921z = str4;
        this.A = str5;
        this.B = str6;
        this.C = str7;
        this.D = liveBasicParams;
        this.E = z10;
        this.F = z11;
        this.G = list;
    }

    public final List<String> a() {
        return this.G;
    }

    public final String b() {
        return this.A;
    }

    public final String c() {
        return this.C;
    }

    public final String d() {
        return this.B;
    }

    public final LiveBasicParams e() {
        return this.D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return jo.p.c(this.f56918w, aVar.f56918w) && jo.p.c(this.f56919x, aVar.f56919x) && jo.p.c(this.f56920y, aVar.f56920y) && jo.p.c(this.f56921z, aVar.f56921z) && jo.p.c(this.A, aVar.A) && jo.p.c(this.B, aVar.B) && jo.p.c(this.C, aVar.C) && jo.p.c(this.D, aVar.D) && this.E == aVar.E && this.F == aVar.F && jo.p.c(this.G, aVar.G);
        }
        return false;
    }

    public final String f() {
        return this.f56921z;
    }

    public final String g() {
        return this.f56919x;
    }

    public final String getId() {
        return this.f56918w;
    }

    public final String h() {
        return this.f56920y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f56918w.hashCode() * 31) + this.f56919x.hashCode()) * 31) + this.f56920y.hashCode()) * 31) + this.f56921z.hashCode()) * 31;
        String str = this.A;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31;
        LiveBasicParams liveBasicParams = this.D;
        int hashCode3 = (hashCode2 + (liveBasicParams != null ? liveBasicParams.hashCode() : 0)) * 31;
        boolean z10 = this.E;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode3 + i10) * 31;
        boolean z11 = this.F;
        return ((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.G.hashCode();
    }

    public final boolean i() {
        return this.F;
    }

    public final boolean j() {
        return this.E;
    }

    public String toString() {
        return "CatalogGroupShotBindModel(id=" + this.f56918w + ", userId=" + this.f56919x + ", userName=" + this.f56920y + ", profileImageUrl=" + this.f56921z + ", continuousBadgeImageUrl=" + this.A + ", groupShotImageUrl=" + this.B + ", groupShotComment=" + this.C + ", liveBasicParams=" + this.D + ", isVisibleLiveBadgeView=" + this.E + ", isVisibleCollabLiveBadgeView=" + this.F + ", collabViewerImageUrls=" + this.G + ')';
    }
}
