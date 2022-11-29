package s8;

import androidx.lifecycle.e0;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import com.dena.mirrorman.net.api.response.ThumbnailFrame;
import com.dena.mirrorman.net.api.response.live.CatalogRecommend;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.live.LivePreview;
import com.dena.mirrorman.net.api.response.live.LiveTag;
import com.dena.mirrorman.net.api.response.live.UserAppStatus;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import java.util.Iterator;
import java.util.List;
import jf.j0;
import jf.y;
import jo.p;
import s8.a;
import xn.a0;
import xn.s;

/* loaded from: classes.dex */
public final class g implements s8.a, e {
    public static final a N = new a(null);
    public static final int O = 8;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final j0 D;
    public final String E;
    public final ThumbnailFrame F;
    public final String G;
    public final String H;
    public final String I;
    public final boolean J;
    public final String K;
    public final boolean L;
    public final a.b M;

    /* renamed from: b  reason: collision with root package name */
    public final String f52335b;

    /* renamed from: c  reason: collision with root package name */
    public final String f52336c;

    /* renamed from: d  reason: collision with root package name */
    public final String f52337d;

    /* renamed from: e  reason: collision with root package name */
    public final k f52338e;

    /* renamed from: f  reason: collision with root package name */
    public final int f52339f;

    /* renamed from: g  reason: collision with root package name */
    public final int f52340g;

    /* renamed from: h  reason: collision with root package name */
    public final e0<Boolean> f52341h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f52342i;

    /* renamed from: j  reason: collision with root package name */
    public final String f52343j;

    /* renamed from: k  reason: collision with root package name */
    public final Integer f52344k;

    /* renamed from: l  reason: collision with root package name */
    public final LiveBasicParams f52345l;

    /* renamed from: m  reason: collision with root package name */
    public final String f52346m;

    /* renamed from: n  reason: collision with root package name */
    public final String f52347n;

    /* renamed from: o  reason: collision with root package name */
    public final String f52348o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f52349p;

    /* renamed from: q  reason: collision with root package name */
    public final y f52350q;

    /* renamed from: r  reason: collision with root package name */
    public final String f52351r;

    /* renamed from: s  reason: collision with root package name */
    public final String f52352s;

    /* renamed from: t  reason: collision with root package name */
    public final String f52353t;

    /* renamed from: u  reason: collision with root package name */
    public final List<UserAppStatus> f52354u;

    /* renamed from: v  reason: collision with root package name */
    public final List<LiveTag> f52355v;

    /* renamed from: w  reason: collision with root package name */
    public final int f52356w;

    /* renamed from: x  reason: collision with root package name */
    public final List<String> f52357x;

    /* renamed from: y  reason: collision with root package name */
    public final List<String> f52358y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f52359z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(int i10, int i11, LiveBasicParams liveBasicParams) {
            Object obj;
            j0 j0Var;
            p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
            String liveId = liveBasicParams.getLiveId();
            String userId = liveBasicParams.getOwner().getUserId();
            String appId = liveBasicParams.getAppId();
            CatalogRecommend recommend = liveBasicParams.getRecommend();
            k a10 = recommend != null ? k.f52420e.a(recommend) : null;
            e0 e0Var = new e0(Boolean.FALSE);
            boolean isLive = liveBasicParams.isLive();
            String reason = liveBasicParams.getReason();
            Iterator<T> it = liveBasicParams.getOwner().getRibbons().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((RibbonResponse) obj).isLabel()) {
                    break;
                }
            }
            RibbonResponse ribbonResponse = (RibbonResponse) obj;
            Integer valueOf = ribbonResponse != null ? Integer.valueOf(ribbonResponse.getRibbonId()) : null;
            String blur_image_url = liveBasicParams.getBlur_image_url();
            String image_url = liveBasicParams.getImage_url();
            List<String> appIconUrls = liveBasicParams.getAppIconUrls();
            if (appIconUrls == null) {
                appIconUrls = s.k();
            }
            String str = (String) a0.Z(appIconUrls);
            boolean z10 = liveBasicParams.isLive() && liveBasicParams.getCollabUserProfileImageUrls().isEmpty();
            y a11 = y.f38026d.a(liveBasicParams);
            String profileImageUrl = liveBasicParams.getOwner().getProfileImageUrl();
            String name = liveBasicParams.getOwner().getName();
            String title = liveBasicParams.getTitle();
            if (title == null) {
                title = "";
            }
            String str2 = title;
            List<UserAppStatus> userAppStatus = liveBasicParams.getUserAppStatus();
            if (userAppStatus == null) {
                userAppStatus = s.k();
            }
            List<UserAppStatus> list = userAppStatus;
            List<LiveTag> liveTags = liveBasicParams.getLiveTags();
            if (liveTags == null) {
                liveTags = s.k();
            }
            List<LiveTag> list2 = liveTags;
            int totalViewerNum = liveBasicParams.getTotalViewerNum();
            List<String> followingViewerImageUrls = liveBasicParams.getFollowingViewerImageUrls();
            List<String> collabUserProfileImageUrls = liveBasicParams.getCollabUserProfileImageUrls();
            boolean z11 = liveBasicParams.getRecommend() != null || liveBasicParams.isOmotenashi();
            boolean z12 = (liveBasicParams.getRecommend() == null || liveBasicParams.isOmotenashi()) ? false : true;
            boolean isOmotenashi = liveBasicParams.isOmotenashi();
            boolean isFollowing = liveBasicParams.isFollowing();
            String orientationV2 = liveBasicParams.getOrientationV2();
            if (orientationV2 == null || (j0Var = j0.Companion.a(orientationV2)) == null) {
                j0Var = j0.VERTICAL;
            }
            j0 j0Var2 = j0Var;
            String avatarBodyImageUrl = liveBasicParams.getAvatarBodyImageUrl();
            ThumbnailFrame thumbnailFrame = liveBasicParams.getThumbnailFrame();
            LivePreview preview = liveBasicParams.getPreview();
            String streamingUrlHls = preview != null ? preview.getStreamingUrlHls() : null;
            UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) a0.a0(liveBasicParams.getOwner().getBadges(), 0);
            String imageUrl = userBadgeImageUrl != null ? userBadgeImageUrl.getImageUrl() : null;
            String userLabelImageUrl = liveBasicParams.getUserLabelImageUrl();
            return new g(liveId, userId, appId, a10, i10, i11, e0Var, isLive, reason, valueOf, liveBasicParams, blur_image_url, image_url, str, z10, a11, profileImageUrl, name, str2, list, list2, totalViewerNum, followingViewerImageUrls, collabUserProfileImageUrls, z11, z12, isOmotenashi, isFollowing, j0Var2, avatarBodyImageUrl, thumbnailFrame, streamingUrlHls, imageUrl, userLabelImageUrl.length() > 0 ? userLabelImageUrl : null, liveBasicParams.getOwner().getSeasonRating().getIconUrl().length() > 0, liveBasicParams.getOwner().getSeasonRating().getIconUrl(), p.c(liveBasicParams.getOwner().getSeasonRating().getClassName(), "S"), null, 0, 32, null);
        }
    }

    public g(String str, String str2, String str3, k kVar, int i10, int i11, e0<Boolean> e0Var, boolean z10, String str4, Integer num, LiveBasicParams liveBasicParams, String str5, String str6, String str7, boolean z11, y yVar, String str8, String str9, String str10, List<UserAppStatus> list, List<LiveTag> list2, int i12, List<String> list3, List<String> list4, boolean z12, boolean z13, boolean z14, boolean z15, j0 j0Var, String str11, ThumbnailFrame thumbnailFrame, String str12, String str13, String str14, boolean z16, String str15, boolean z17, a.b bVar) {
        p.h(str, "liveId");
        p.h(str2, "castId");
        p.h(e0Var, "isPlaying");
        p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
        p.h(str5, "blurImageUrl");
        p.h(str6, "imageUrl");
        p.h(yVar, "liveTime");
        p.h(str8, "profileImageUrl");
        p.h(str9, "userName");
        p.h(str10, "liveTitle");
        p.h(list, "userAppStatuses");
        p.h(list2, "liveTags");
        p.h(list3, "followingViewerImageUrls");
        p.h(list4, "collabViewerImageUrls");
        p.h(j0Var, "orientation");
        p.h(str11, "avatarBodyImageUrl");
        p.h(str15, "seasonClassIconImageUrl");
        p.h(bVar, "type");
        this.f52335b = str;
        this.f52336c = str2;
        this.f52337d = str3;
        this.f52338e = kVar;
        this.f52339f = i10;
        this.f52340g = i11;
        this.f52341h = e0Var;
        this.f52342i = z10;
        this.f52343j = str4;
        this.f52344k = num;
        this.f52345l = liveBasicParams;
        this.f52346m = str5;
        this.f52347n = str6;
        this.f52348o = str7;
        this.f52349p = z11;
        this.f52350q = yVar;
        this.f52351r = str8;
        this.f52352s = str9;
        this.f52353t = str10;
        this.f52354u = list;
        this.f52355v = list2;
        this.f52356w = i12;
        this.f52357x = list3;
        this.f52358y = list4;
        this.f52359z = z12;
        this.A = z13;
        this.B = z14;
        this.C = z15;
        this.D = j0Var;
        this.E = str11;
        this.F = thumbnailFrame;
        this.G = str12;
        this.H = str13;
        this.I = str14;
        this.J = z16;
        this.K = str15;
        this.L = z17;
        this.M = bVar;
    }

    public final String A() {
        return this.K;
    }

    public final ThumbnailFrame B() {
        return this.F;
    }

    public final int C() {
        return this.f52356w;
    }

    public final List<UserAppStatus> D() {
        return this.f52354u;
    }

    public final String E() {
        return this.f52352s;
    }

    public final boolean F() {
        return this.f52359z;
    }

    public final boolean G() {
        return this.B;
    }

    public final boolean H() {
        return this.A;
    }

    public final boolean I() {
        return this.L;
    }

    public final boolean J() {
        return this.J;
    }

    @Override // s8.e
    public k a() {
        return this.f52338e;
    }

    @Override // s8.e
    public String b() {
        return this.f52335b;
    }

    @Override // s8.e
    public Integer c() {
        return this.f52344k;
    }

    @Override // s8.e
    public String d() {
        return this.f52336c;
    }

    @Override // s8.e
    public int e() {
        return this.f52340g;
    }

    @Override // s8.e
    public int f() {
        return this.f52339f;
    }

    @Override // s8.e
    public boolean g() {
        return this.f52342i;
    }

    @Override // s8.a
    public a.b getType() {
        return this.M;
    }

    @Override // s8.e
    public String h() {
        return this.f52337d;
    }

    @Override // s8.e
    public String i() {
        return this.f52343j;
    }

    @Override // s8.e
    public e0<Boolean> isPlaying() {
        return this.f52341h;
    }

    public final String j() {
        return this.E;
    }

    public final String k() {
        return this.f52346m;
    }

    public final List<String> l() {
        return this.f52358y;
    }

    public final String m() {
        return this.H;
    }

    public final String n() {
        return this.I;
    }

    public final boolean o() {
        return this.C;
    }

    public final List<String> p() {
        return this.f52357x;
    }

    public final String q() {
        return this.f52348o;
    }

    public final String r() {
        return this.f52347n;
    }

    public final LiveBasicParams s() {
        return this.f52345l;
    }

    public final boolean t() {
        return this.f52349p;
    }

    public final List<LiveTag> u() {
        return this.f52355v;
    }

    public final y v() {
        return this.f52350q;
    }

    public final String w() {
        return this.f52353t;
    }

    public final j0 x() {
        return this.D;
    }

    public final String y() {
        return this.G;
    }

    public final String z() {
        return this.f52351r;
    }

    public /* synthetic */ g(String str, String str2, String str3, k kVar, int i10, int i11, e0 e0Var, boolean z10, String str4, Integer num, LiveBasicParams liveBasicParams, String str5, String str6, String str7, boolean z11, y yVar, String str8, String str9, String str10, List list, List list2, int i12, List list3, List list4, boolean z12, boolean z13, boolean z14, boolean z15, j0 j0Var, String str11, ThumbnailFrame thumbnailFrame, String str12, String str13, String str14, boolean z16, String str15, boolean z17, a.b bVar, int i13, int i14, jo.h hVar) {
        this(str, str2, str3, kVar, i10, i11, e0Var, z10, str4, num, liveBasicParams, str5, str6, str7, z11, yVar, str8, str9, str10, list, list2, i12, list3, list4, z12, z13, z14, z15, j0Var, str11, (i13 & 1073741824) != 0 ? null : thumbnailFrame, (i13 & Integer.MIN_VALUE) != 0 ? null : str12, str13, str14, z16, str15, z17, (i14 & 32) != 0 ? a.b.LIVE_LARGE : bVar);
    }
}
