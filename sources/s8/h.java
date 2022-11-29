package s8;

import android.content.Context;
import androidx.lifecycle.e0;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import com.dena.mirrorman.net.api.response.ThumbnailFrame;
import com.dena.mirrorman.net.api.response.live.CatalogRecommend;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.live.LivePreview;
import com.dena.mirrorman.net.api.response.live.LiveTag;
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
public final class h implements s8.a, e {
    public static final a T = new a(null);
    public static final int U = 8;
    public final boolean A;
    public final List<String> B;
    public final String C;
    public final ThumbnailFrame D;
    public final e0<Boolean> E;
    public final String F;
    public final String G;
    public final boolean H;
    public final String I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final String M;
    public final boolean N;
    public final String O;
    public final boolean P;
    public final int Q;
    public final boolean R;
    public final a.b S;

    /* renamed from: b  reason: collision with root package name */
    public final String f52360b;

    /* renamed from: c  reason: collision with root package name */
    public final String f52361c;

    /* renamed from: d  reason: collision with root package name */
    public final String f52362d;

    /* renamed from: e  reason: collision with root package name */
    public final k f52363e;

    /* renamed from: f  reason: collision with root package name */
    public final int f52364f;

    /* renamed from: g  reason: collision with root package name */
    public final int f52365g;

    /* renamed from: h  reason: collision with root package name */
    public final e0<Boolean> f52366h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f52367i;

    /* renamed from: j  reason: collision with root package name */
    public final String f52368j;

    /* renamed from: k  reason: collision with root package name */
    public final Integer f52369k;

    /* renamed from: l  reason: collision with root package name */
    public final LiveBasicParams f52370l;

    /* renamed from: m  reason: collision with root package name */
    public final String f52371m;

    /* renamed from: n  reason: collision with root package name */
    public final String f52372n;

    /* renamed from: o  reason: collision with root package name */
    public final String f52373o;

    /* renamed from: p  reason: collision with root package name */
    public final j0 f52374p;

    /* renamed from: q  reason: collision with root package name */
    public final String f52375q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f52376r;

    /* renamed from: s  reason: collision with root package name */
    public final y f52377s;

    /* renamed from: t  reason: collision with root package name */
    public final String f52378t;

    /* renamed from: u  reason: collision with root package name */
    public final String f52379u;

    /* renamed from: v  reason: collision with root package name */
    public final String f52380v;

    /* renamed from: w  reason: collision with root package name */
    public final String f52381w;

    /* renamed from: x  reason: collision with root package name */
    public final List<LiveTag> f52382x;

    /* renamed from: y  reason: collision with root package name */
    public final int f52383y;

    /* renamed from: z  reason: collision with root package name */
    public final List<String> f52384z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final h a(Context context, int i10, int i11, LiveBasicParams liveBasicParams, long j10) {
            Object obj;
            j0 j0Var;
            int i12;
            int i13;
            String e10;
            p.h(context, "context");
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
            String image_url = liveBasicParams.getImage_url();
            String blur_image_url = liveBasicParams.getBlur_image_url();
            LivePreview preview = liveBasicParams.getPreview();
            String streamingUrlHls = preview != null ? preview.getStreamingUrlHls() : null;
            String orientationV2 = liveBasicParams.getOrientationV2();
            if (orientationV2 == null || (j0Var = j0.Companion.a(orientationV2)) == null) {
                j0Var = j0.VERTICAL;
            }
            j0 j0Var2 = j0Var;
            List<String> appIconUrls = liveBasicParams.getAppIconUrls();
            if (appIconUrls == null) {
                appIconUrls = s.k();
            }
            String str = (String) a0.Z(appIconUrls);
            boolean z10 = liveBasicParams.isLive() && liveBasicParams.getCollabUserProfileImageUrls().isEmpty();
            y a11 = y.f38026d.a(liveBasicParams);
            if (liveBasicParams.isLive()) {
                i12 = 0;
                i13 = 1;
                e10 = null;
            } else {
                i12 = 0;
                i13 = 1;
                e10 = of.c.f45387a.e(context, j10, 1000 * liveBasicParams.getStartedAt());
            }
            String profileImageUrl = liveBasicParams.getOwner().getProfileImageUrl();
            String name = liveBasicParams.getOwner().getName();
            String title = liveBasicParams.getTitle();
            String str2 = title == null ? "" : title;
            List<LiveTag> liveTags = liveBasicParams.getLiveTags();
            if (liveTags == null) {
                liveTags = s.k();
            }
            List<LiveTag> list = liveTags;
            int totalViewerNum = liveBasicParams.getTotalViewerNum();
            List<String> followingViewerImageUrls = liveBasicParams.getFollowingViewerImageUrls();
            int i14 = (((liveBasicParams.getFollowingViewerImageUrls().isEmpty() ? 1 : 0) ^ i13) == 0 || liveBasicParams.isOmotenashi()) ? i12 : i13;
            List<String> collabUserProfileImageUrls = liveBasicParams.getCollabUserProfileImageUrls();
            String avatarBodyImageUrl = liveBasicParams.getAvatarBodyImageUrl();
            ThumbnailFrame thumbnailFrame = liveBasicParams.getThumbnailFrame();
            e0 e0Var2 = new e0(Boolean.valueOf(liveBasicParams.isNew()));
            UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) a0.a0(liveBasicParams.getOwner().getBadges(), i12);
            String imageUrl = userBadgeImageUrl != null ? userBadgeImageUrl.getImageUrl() : null;
            String userLabelImageUrl = liveBasicParams.getUserLabelImageUrl();
            String str3 = (userLabelImageUrl.length() > 0 ? i13 : i12) != 0 ? userLabelImageUrl : null;
            int i15 = liveBasicParams.getOwner().getSeasonRating().getIconUrl().length() > 0 ? i13 : i12;
            String iconUrl = liveBasicParams.getOwner().getSeasonRating().getIconUrl();
            boolean c10 = p.c(liveBasicParams.getOwner().getSeasonRating().getClassName(), "S");
            int i16 = (((liveBasicParams.getFollowingViewerImageUrls().isEmpty() ? 1 : 0) ^ i13) != 0 || liveBasicParams.isOmotenashi()) ? i13 : i12;
            boolean isOmotenashi = liveBasicParams.isOmotenashi();
            String str4 = (String) a0.Z(liveBasicParams.getLiveGame().getTags());
            String str5 = str4 == null ? "" : str4;
            CharSequence charSequence = (CharSequence) a0.Z(liveBasicParams.getLiveGame().getTags());
            boolean z11 = ((charSequence == null || charSequence.length() == 0) ? i13 : i12) ^ 1;
            String str6 = (String) a0.a0(liveBasicParams.getLiveGame().getTags(), i13);
            String str7 = str6 == null ? "" : str6;
            CharSequence charSequence2 = (CharSequence) a0.a0(liveBasicParams.getLiveGame().getTags(), i13);
            return new h(liveId, userId, appId, a10, i10, i11, e0Var, isLive, reason, valueOf, liveBasicParams, image_url, blur_image_url, streamingUrlHls, j0Var2, str, z10, a11, e10, profileImageUrl, name, str2, list, totalViewerNum, followingViewerImageUrls, i14, collabUserProfileImageUrls, avatarBodyImageUrl, thumbnailFrame, e0Var2, imageUrl, str3, i15, iconUrl, c10, i16, isOmotenashi, str5, z11, str7, ((charSequence2 == null || charSequence2.length() == 0) ? i13 : i12) ^ 1, liveBasicParams.getLiveGame().getViewerPlayCount(), liveBasicParams.getLiveGame().getViewerPlayCount() >= 0 ? i13 : i12, null, 0, 2048, null);
        }
    }

    public h(String str, String str2, String str3, k kVar, int i10, int i11, e0<Boolean> e0Var, boolean z10, String str4, Integer num, LiveBasicParams liveBasicParams, String str5, String str6, String str7, j0 j0Var, String str8, boolean z11, y yVar, String str9, String str10, String str11, String str12, List<LiveTag> list, int i12, List<String> list2, boolean z12, List<String> list3, String str13, ThumbnailFrame thumbnailFrame, e0<Boolean> e0Var2, String str14, String str15, boolean z13, String str16, boolean z14, boolean z15, boolean z16, String str17, boolean z17, String str18, boolean z18, int i13, boolean z19, a.b bVar) {
        p.h(str, "liveId");
        p.h(str2, "castId");
        p.h(e0Var, "isPlaying");
        p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
        p.h(str5, "previewImageUrl");
        p.h(str6, "blurImageUrl");
        p.h(j0Var, "orientation");
        p.h(yVar, "liveTime");
        p.h(str10, "profileImageUrl");
        p.h(str11, "userName");
        p.h(str12, "liveTitle");
        p.h(list, "liveTags");
        p.h(list2, "followingViewerImageUrls");
        p.h(list3, "collabViewerImageUrls");
        p.h(str13, "avatarBodyImageUrl");
        p.h(e0Var2, "isNew");
        p.h(str16, "seasonClassIconImageUrl");
        p.h(str17, "liveGameTag1");
        p.h(str18, "liveGameTag2");
        p.h(bVar, "type");
        this.f52360b = str;
        this.f52361c = str2;
        this.f52362d = str3;
        this.f52363e = kVar;
        this.f52364f = i10;
        this.f52365g = i11;
        this.f52366h = e0Var;
        this.f52367i = z10;
        this.f52368j = str4;
        this.f52369k = num;
        this.f52370l = liveBasicParams;
        this.f52371m = str5;
        this.f52372n = str6;
        this.f52373o = str7;
        this.f52374p = j0Var;
        this.f52375q = str8;
        this.f52376r = z11;
        this.f52377s = yVar;
        this.f52378t = str9;
        this.f52379u = str10;
        this.f52380v = str11;
        this.f52381w = str12;
        this.f52382x = list;
        this.f52383y = i12;
        this.f52384z = list2;
        this.A = z12;
        this.B = list3;
        this.C = str13;
        this.D = thumbnailFrame;
        this.E = e0Var2;
        this.F = str14;
        this.G = str15;
        this.H = z13;
        this.I = str16;
        this.J = z14;
        this.K = z15;
        this.L = z16;
        this.M = str17;
        this.N = z17;
        this.O = str18;
        this.P = z18;
        this.Q = i13;
        this.R = z19;
        this.S = bVar;
    }

    public final String A() {
        return this.f52379u;
    }

    public final String B() {
        return this.I;
    }

    public final ThumbnailFrame C() {
        return this.D;
    }

    public final int D() {
        return this.f52383y;
    }

    public final String E() {
        return this.f52380v;
    }

    public final int F() {
        return this.Q;
    }

    public final boolean G() {
        return this.N;
    }

    public final boolean H() {
        return this.P;
    }

    public final e0<Boolean> I() {
        return this.E;
    }

    public final boolean J() {
        return this.R;
    }

    public final boolean K() {
        return this.A;
    }

    public final boolean L() {
        return this.f52376r;
    }

    public final boolean M() {
        return this.L;
    }

    public final boolean N() {
        return this.J;
    }

    public final boolean O() {
        return this.H;
    }

    @Override // s8.e
    public k a() {
        return this.f52363e;
    }

    @Override // s8.e
    public String b() {
        return this.f52360b;
    }

    @Override // s8.e
    public Integer c() {
        return this.f52369k;
    }

    @Override // s8.e
    public String d() {
        return this.f52361c;
    }

    @Override // s8.e
    public int e() {
        return this.f52365g;
    }

    @Override // s8.e
    public int f() {
        return this.f52364f;
    }

    @Override // s8.e
    public boolean g() {
        return this.f52367i;
    }

    @Override // s8.a
    public a.b getType() {
        return this.S;
    }

    @Override // s8.e
    public String h() {
        return this.f52362d;
    }

    @Override // s8.e
    public String i() {
        return this.f52368j;
    }

    @Override // s8.e
    public e0<Boolean> isPlaying() {
        return this.f52366h;
    }

    public final String j() {
        return this.C;
    }

    public final String k() {
        return this.f52372n;
    }

    public final List<String> l() {
        return this.B;
    }

    public final String m() {
        return this.F;
    }

    public final String n() {
        return this.G;
    }

    public final List<String> o() {
        return this.f52384z;
    }

    public final String p() {
        return this.f52375q;
    }

    public final LiveBasicParams q() {
        return this.f52370l;
    }

    public final String r() {
        return this.M;
    }

    public final String s() {
        return this.O;
    }

    public final String t() {
        return this.f52378t;
    }

    public final List<LiveTag> u() {
        return this.f52382x;
    }

    public final y v() {
        return this.f52377s;
    }

    public final String w() {
        return this.f52381w;
    }

    public final j0 x() {
        return this.f52374p;
    }

    public final String y() {
        return this.f52371m;
    }

    public final String z() {
        return this.f52373o;
    }

    public /* synthetic */ h(String str, String str2, String str3, k kVar, int i10, int i11, e0 e0Var, boolean z10, String str4, Integer num, LiveBasicParams liveBasicParams, String str5, String str6, String str7, j0 j0Var, String str8, boolean z11, y yVar, String str9, String str10, String str11, String str12, List list, int i12, List list2, boolean z12, List list3, String str13, ThumbnailFrame thumbnailFrame, e0 e0Var2, String str14, String str15, boolean z13, String str16, boolean z14, boolean z15, boolean z16, String str17, boolean z17, String str18, boolean z18, int i13, boolean z19, a.b bVar, int i14, int i15, jo.h hVar) {
        this(str, str2, str3, kVar, i10, i11, e0Var, z10, str4, num, liveBasicParams, str5, str6, (i14 & 8192) != 0 ? null : str7, j0Var, str8, z11, yVar, str9, str10, str11, str12, list, i12, list2, z12, list3, str13, (i14 & 268435456) != 0 ? null : thumbnailFrame, e0Var2, str14, str15, z13, str16, z14, z15, z16, str17, z17, str18, z18, i13, z19, (i15 & 2048) != 0 ? a.b.LIVE : bVar);
    }
}
