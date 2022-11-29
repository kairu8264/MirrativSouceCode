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
public final class g implements Serializable {
    public static final a J = new a(null);
    public static final int K = 8;
    public final String A;
    public final String B;
    public final String C;
    public final LiveBasicParams D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final List<String> H;
    public final boolean I;

    /* renamed from: w  reason: collision with root package name */
    public final String f56929w;

    /* renamed from: x  reason: collision with root package name */
    public final String f56930x;

    /* renamed from: y  reason: collision with root package name */
    public final String f56931y;

    /* renamed from: z  reason: collision with root package name */
    public final String f56932z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(Context context, GroupShotItem groupShotItem) {
            boolean z10;
            LiveBasicParams live;
            List<String> collabUserProfileImageUrls;
            jo.p.h(context, "context");
            jo.p.h(groupShotItem, "item");
            String id2 = groupShotItem.getId();
            String userId = groupShotItem.getUser().getUserId();
            String name = groupShotItem.getUser().getName();
            String profileImageUrl = groupShotItem.getUser().getProfileImageUrl();
            UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) a0.a0(groupShotItem.getUser().getBadges(), 0);
            String smallImageUrl = userBadgeImageUrl != null ? userBadgeImageUrl.getSmallImageUrl() : null;
            String imagePath = groupShotItem.getImagePath();
            String comment = groupShotItem.getComment();
            LiveBasicParams live2 = groupShotItem.getLive();
            LiveBasicParams live3 = groupShotItem.getLive();
            boolean z11 = live3 != null && live3.isLive();
            LiveBasicParams live4 = groupShotItem.getLive();
            if (live4 != null && live4.isLive()) {
                LiveBasicParams live5 = groupShotItem.getLive();
                List<String> collabUserProfileImageUrls2 = live5 != null ? live5.getCollabUserProfileImageUrls() : null;
                if (collabUserProfileImageUrls2 == null || collabUserProfileImageUrls2.isEmpty()) {
                    z10 = true;
                    LiveBasicParams live6 = groupShotItem.getLive();
                    boolean z12 = live6 == null && (collabUserProfileImageUrls = live6.getCollabUserProfileImageUrls()) != null && (collabUserProfileImageUrls.isEmpty() ^ true);
                    live = groupShotItem.getLive();
                    if (live != null || (r8 = live.getCollabUserProfileImageUrls()) == null) {
                        List<String> k10 = s.k();
                    }
                    List<String> list = k10;
                    LiveBasicParams live7 = groupShotItem.getLive();
                    return new g(id2, userId, name, profileImageUrl, smallImageUrl, imagePath, comment, live2, z11, z10, z12, list, live7 == null && live7.isLive());
                }
            }
            z10 = false;
            LiveBasicParams live62 = groupShotItem.getLive();
            if (live62 == null) {
            }
            live = groupShotItem.getLive();
            if (live != null) {
            }
            List<String> k102 = s.k();
            List<String> list2 = k102;
            LiveBasicParams live72 = groupShotItem.getLive();
            return new g(id2, userId, name, profileImageUrl, smallImageUrl, imagePath, comment, live2, z11, z10, z12, list2, live72 == null && live72.isLive());
        }

        public final g b(Context context, v8.a aVar) {
            boolean z10;
            LiveBasicParams e10;
            List<String> collabUserProfileImageUrls;
            jo.p.h(context, "context");
            jo.p.h(aVar, "bindModel");
            String id2 = aVar.getId();
            String g10 = aVar.g();
            String h10 = aVar.h();
            String f10 = aVar.f();
            String b10 = aVar.b();
            String d10 = aVar.d();
            String c10 = aVar.c();
            LiveBasicParams e11 = aVar.e();
            LiveBasicParams e12 = aVar.e();
            boolean z11 = e12 != null && e12.isLive();
            LiveBasicParams e13 = aVar.e();
            if (e13 != null && e13.isLive()) {
                List<String> collabUserProfileImageUrls2 = aVar.e().getCollabUserProfileImageUrls();
                if (collabUserProfileImageUrls2 == null || collabUserProfileImageUrls2.isEmpty()) {
                    z10 = true;
                    LiveBasicParams e14 = aVar.e();
                    boolean z12 = e14 == null && (collabUserProfileImageUrls = e14.getCollabUserProfileImageUrls()) != null && (collabUserProfileImageUrls.isEmpty() ^ true);
                    e10 = aVar.e();
                    if (e10 != null || (r15 = e10.getCollabUserProfileImageUrls()) == null) {
                        List<String> k10 = s.k();
                    }
                    LiveBasicParams e15 = aVar.e();
                    return new g(id2, g10, h10, f10, b10, d10, c10, e11, z11, z10, z12, k10, e15 == null && e15.isLive());
                }
            }
            z10 = false;
            LiveBasicParams e142 = aVar.e();
            if (e142 == null) {
            }
            e10 = aVar.e();
            if (e10 != null) {
            }
            List<String> k102 = s.k();
            LiveBasicParams e152 = aVar.e();
            return new g(id2, g10, h10, f10, b10, d10, c10, e11, z11, z10, z12, k102, e152 == null && e152.isLive());
        }
    }

    public g(String str, String str2, String str3, String str4, String str5, String str6, String str7, LiveBasicParams liveBasicParams, boolean z10, boolean z11, boolean z12, List<String> list, boolean z13) {
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "profileImageUrl");
        jo.p.h(str6, "groupShotImageUrl");
        jo.p.h(str7, "groupShotComment");
        jo.p.h(list, "collabViewerImageUrls");
        this.f56929w = str;
        this.f56930x = str2;
        this.f56931y = str3;
        this.f56932z = str4;
        this.A = str5;
        this.B = str6;
        this.C = str7;
        this.D = liveBasicParams;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        this.H = list;
        this.I = z13;
    }

    public final List<String> a() {
        return this.H;
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
        if (obj instanceof g) {
            g gVar = (g) obj;
            return jo.p.c(this.f56929w, gVar.f56929w) && jo.p.c(this.f56930x, gVar.f56930x) && jo.p.c(this.f56931y, gVar.f56931y) && jo.p.c(this.f56932z, gVar.f56932z) && jo.p.c(this.A, gVar.A) && jo.p.c(this.B, gVar.B) && jo.p.c(this.C, gVar.C) && jo.p.c(this.D, gVar.D) && this.E == gVar.E && this.F == gVar.F && this.G == gVar.G && jo.p.c(this.H, gVar.H) && this.I == gVar.I;
        }
        return false;
    }

    public final String f() {
        return this.f56932z;
    }

    public final String g() {
        return this.f56930x;
    }

    public final String getId() {
        return this.f56929w;
    }

    public final String h() {
        return this.f56931y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f56929w.hashCode() * 31) + this.f56930x.hashCode()) * 31) + this.f56931y.hashCode()) * 31) + this.f56932z.hashCode()) * 31;
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
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.G;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int hashCode4 = (((i13 + i14) * 31) + this.H.hashCode()) * 31;
        boolean z13 = this.I;
        return hashCode4 + (z13 ? 1 : z13 ? 1 : 0);
    }

    public final boolean i() {
        return this.E;
    }

    public final boolean j() {
        return this.G;
    }

    public final boolean k() {
        return this.F;
    }

    public final boolean l() {
        return this.I;
    }

    public String toString() {
        return "GroupShotGalleryDetailBindModel(id=" + this.f56929w + ", userId=" + this.f56930x + ", userName=" + this.f56931y + ", profileImageUrl=" + this.f56932z + ", continuousBadgeImageUrl=" + this.A + ", groupShotImageUrl=" + this.B + ", groupShotComment=" + this.C + ", liveBasicParams=" + this.D + ", isLive=" + this.E + ", isVisibleLiveBadgeView=" + this.F + ", isVisibleCollabLiveBadgeView=" + this.G + ", collabViewerImageUrls=" + this.H + ", isVisibleWatchLiveButton=" + this.I + ')';
    }
}
