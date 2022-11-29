package v8;

import android.content.Context;
import com.dena.mirrorman.net.api.response.live.GroupShotItem;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import java.util.List;
import r8.b1;
import xn.a0;
import xn.s;

/* loaded from: classes.dex */
public final class l implements Serializable {
    public static final a I = new a(null);
    public static final int J = 8;
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final int E;
    public final boolean F;
    public final boolean G;
    public final List<String> H;

    /* renamed from: w  reason: collision with root package name */
    public final String f56939w;

    /* renamed from: x  reason: collision with root package name */
    public final b f56940x;

    /* renamed from: y  reason: collision with root package name */
    public final String f56941y;

    /* renamed from: z  reason: collision with root package name */
    public final String f56942z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l a(Context context, GroupShotItem groupShotItem, b bVar) {
            boolean z10;
            LiveBasicParams live;
            LiveBasicParams live2;
            List<String> collabUserProfileImageUrls;
            jo.p.h(context, "context");
            jo.p.h(groupShotItem, "item");
            jo.p.h(bVar, "layoutPattern");
            String id2 = groupShotItem.getId();
            String userId = groupShotItem.getUser().getUserId();
            String name = groupShotItem.getUser().getName();
            String profileImageUrl = groupShotItem.getUser().getProfileImageUrl();
            UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) a0.a0(groupShotItem.getUser().getBadges(), 0);
            String smallImageUrl = userBadgeImageUrl != null ? userBadgeImageUrl.getSmallImageUrl() : null;
            String imagePath = groupShotItem.getImagePath();
            String comment = groupShotItem.getComment();
            int i10 = b1.f49836f;
            LiveBasicParams live3 = groupShotItem.getLive();
            boolean z11 = true;
            if (live3 != null && live3.isLive()) {
                LiveBasicParams live4 = groupShotItem.getLive();
                List<String> collabUserProfileImageUrls2 = live4 != null ? live4.getCollabUserProfileImageUrls() : null;
                if (collabUserProfileImageUrls2 == null || collabUserProfileImageUrls2.isEmpty()) {
                    z10 = true;
                    live = groupShotItem.getLive();
                    if (live != null || (collabUserProfileImageUrls = live.getCollabUserProfileImageUrls()) == null || !(!collabUserProfileImageUrls.isEmpty())) {
                        z11 = false;
                    }
                    live2 = groupShotItem.getLive();
                    if (live2 != null || (r1 = live2.getCollabUserProfileImageUrls()) == null) {
                        List<String> k10 = s.k();
                    }
                    return new l(id2, bVar, userId, name, profileImageUrl, smallImageUrl, imagePath, comment, i10, z10, z11, k10);
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
            return new l(id2, bVar, userId, name, profileImageUrl, smallImageUrl, imagePath, comment, i10, z10, z11, k102);
        }

        public final l b() {
            return new l("", b.EMPTY, "", "", "", "", "", "", b1.f49836f, false, false, s.k());
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        SMALL,
        VERTICAL,
        LARGE,
        EMPTY
    }

    public l(String str, b bVar, String str2, String str3, String str4, String str5, String str6, String str7, int i10, boolean z10, boolean z11, List<String> list) {
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(bVar, "layoutPattern");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "profileImageUrl");
        jo.p.h(str6, "groupShotImageUrl");
        jo.p.h(str7, "groupShotComment");
        jo.p.h(list, "collabViewerImageUrls");
        this.f56939w = str;
        this.f56940x = bVar;
        this.f56941y = str2;
        this.f56942z = str3;
        this.A = str4;
        this.B = str5;
        this.C = str6;
        this.D = str7;
        this.E = i10;
        this.F = z10;
        this.G = z11;
        this.H = list;
    }

    public final List<String> a() {
        return this.H;
    }

    public final String b() {
        return this.B;
    }

    public final String c() {
        return this.D;
    }

    public final String d() {
        return this.C;
    }

    public final int e() {
        return this.E;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return jo.p.c(this.f56939w, lVar.f56939w) && this.f56940x == lVar.f56940x && jo.p.c(this.f56941y, lVar.f56941y) && jo.p.c(this.f56942z, lVar.f56942z) && jo.p.c(this.A, lVar.A) && jo.p.c(this.B, lVar.B) && jo.p.c(this.C, lVar.C) && jo.p.c(this.D, lVar.D) && this.E == lVar.E && this.F == lVar.F && this.G == lVar.G && jo.p.c(this.H, lVar.H);
        }
        return false;
    }

    public final b f() {
        return this.f56940x;
    }

    public final String g() {
        return this.A;
    }

    public final String getId() {
        return this.f56939w;
    }

    public final String h() {
        return this.f56941y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f56939w.hashCode() * 31) + this.f56940x.hashCode()) * 31) + this.f56941y.hashCode()) * 31) + this.f56942z.hashCode()) * 31) + this.A.hashCode()) * 31;
        String str = this.B;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + Integer.hashCode(this.E)) * 31;
        boolean z10 = this.F;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z11 = this.G;
        return ((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.H.hashCode();
    }

    public final String i() {
        return this.f56942z;
    }

    public final boolean j() {
        return this.G;
    }

    public final boolean k() {
        return this.F;
    }

    public String toString() {
        return "GroupShotGalleryItemBindModel(id=" + this.f56939w + ", layoutPattern=" + this.f56940x + ", userId=" + this.f56941y + ", userName=" + this.f56942z + ", profileImageUrl=" + this.A + ", continuousBadgeImageUrl=" + this.B + ", groupShotImageUrl=" + this.C + ", groupShotComment=" + this.D + ", imageViewBorderColorResInt=" + this.E + ", isVisibleLiveBadgeView=" + this.F + ", isVisibleCollabLiveBadgeView=" + this.G + ", collabViewerImageUrls=" + this.H + ')';
    }
}
