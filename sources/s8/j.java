package s8;

import androidx.lifecycle.e0;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import com.dena.mirrorman.net.api.response.ThumbnailFrame;
import com.dena.mirrorman.net.api.response.live.CatalogRecommend;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.live.UserAppStatus;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.y;
import jo.p;
import s8.a;
import xn.a0;
import xn.s;
import xn.t;

/* loaded from: classes.dex */
public final class j implements s8.a, e {
    public static final a A = new a(null);
    public static final int B = 8;

    /* renamed from: b  reason: collision with root package name */
    public final String f52395b;

    /* renamed from: c  reason: collision with root package name */
    public final String f52396c;

    /* renamed from: d  reason: collision with root package name */
    public final String f52397d;

    /* renamed from: e  reason: collision with root package name */
    public final k f52398e;

    /* renamed from: f  reason: collision with root package name */
    public final int f52399f;

    /* renamed from: g  reason: collision with root package name */
    public final int f52400g;

    /* renamed from: h  reason: collision with root package name */
    public final e0<Boolean> f52401h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f52402i;

    /* renamed from: j  reason: collision with root package name */
    public final String f52403j;

    /* renamed from: k  reason: collision with root package name */
    public final Integer f52404k;

    /* renamed from: l  reason: collision with root package name */
    public final LiveBasicParams f52405l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f52406m;

    /* renamed from: n  reason: collision with root package name */
    public final String f52407n;

    /* renamed from: o  reason: collision with root package name */
    public final y f52408o;

    /* renamed from: p  reason: collision with root package name */
    public final String f52409p;

    /* renamed from: q  reason: collision with root package name */
    public final String f52410q;

    /* renamed from: r  reason: collision with root package name */
    public final int f52411r;

    /* renamed from: s  reason: collision with root package name */
    public final List<UserAppStatus> f52412s;

    /* renamed from: t  reason: collision with root package name */
    public final List<n> f52413t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f52414u;

    /* renamed from: v  reason: collision with root package name */
    public final String f52415v;

    /* renamed from: w  reason: collision with root package name */
    public final ThumbnailFrame f52416w;

    /* renamed from: x  reason: collision with root package name */
    public final String f52417x;

    /* renamed from: y  reason: collision with root package name */
    public final String f52418y;

    /* renamed from: z  reason: collision with root package name */
    public final a.b f52419z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a(int i10, int i11, LiveBasicParams liveBasicParams) {
            Object obj;
            p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
            List<String> privateViewerImageUrls = liveBasicParams.getPrivateViewerImageUrls();
            List<String> privateInvitedUserImageUrls = liveBasicParams.getPrivateInvitedUserImageUrls();
            List<UserAppStatus> userAppStatus = liveBasicParams.getUserAppStatus();
            if (userAppStatus == null) {
                userAppStatus = s.k();
            }
            List<UserAppStatus> list = userAppStatus;
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
            boolean isNew = liveBasicParams.isNew();
            String image_url = liveBasicParams.getImage_url();
            y a11 = y.f38026d.a(liveBasicParams);
            String profileImageUrl = liveBasicParams.getOwner().getProfileImageUrl();
            String name = liveBasicParams.getOwner().getName();
            int totalViewerNum = liveBasicParams.getTotalViewerNum();
            ArrayList arrayList = new ArrayList(t.u(privateViewerImageUrls, 10));
            for (String str : privateViewerImageUrls) {
                arrayList.add(new n(str, false, null, 4, null));
            }
            ArrayList arrayList2 = new ArrayList(t.u(privateInvitedUserImageUrls, 10));
            for (Iterator it2 = privateInvitedUserImageUrls.iterator(); it2.hasNext(); it2 = it2) {
                arrayList2.add(new n((String) it2.next(), true, null, 4, null));
            }
            List o02 = a0.o0(arrayList, arrayList2);
            boolean z10 = privateViewerImageUrls.size() + privateInvitedUserImageUrls.size() < liveBasicParams.getPrivateInvitedUserNum();
            String avatarBodyImageUrl = liveBasicParams.getAvatarBodyImageUrl();
            ThumbnailFrame thumbnailFrame = liveBasicParams.getThumbnailFrame();
            UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) a0.a0(liveBasicParams.getOwner().getBadges(), 0);
            String imageUrl = userBadgeImageUrl != null ? userBadgeImageUrl.getImageUrl() : null;
            String userLabelImageUrl = liveBasicParams.getUserLabelImageUrl();
            return new j(liveId, userId, appId, a10, i10, i11, e0Var, isLive, reason, valueOf, liveBasicParams, isNew, image_url, a11, profileImageUrl, name, totalViewerNum, list, o02, z10, avatarBodyImageUrl, thumbnailFrame, imageUrl, userLabelImageUrl.length() > 0 ? userLabelImageUrl : null, null, 16777216, null);
        }
    }

    public j(String str, String str2, String str3, k kVar, int i10, int i11, e0<Boolean> e0Var, boolean z10, String str4, Integer num, LiveBasicParams liveBasicParams, boolean z11, String str5, y yVar, String str6, String str7, int i12, List<UserAppStatus> list, List<n> list2, boolean z12, String str8, ThumbnailFrame thumbnailFrame, String str9, String str10, a.b bVar) {
        p.h(str, "liveId");
        p.h(str2, "castId");
        p.h(e0Var, "isPlaying");
        p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
        p.h(str5, "previewImageUrl");
        p.h(yVar, "liveTime");
        p.h(str6, "profileImageUrl");
        p.h(str7, "userName");
        p.h(list, "userAppStatuses");
        p.h(list2, "viewerBindModels");
        p.h(str8, "avatarBodyImageUrl");
        p.h(bVar, "type");
        this.f52395b = str;
        this.f52396c = str2;
        this.f52397d = str3;
        this.f52398e = kVar;
        this.f52399f = i10;
        this.f52400g = i11;
        this.f52401h = e0Var;
        this.f52402i = z10;
        this.f52403j = str4;
        this.f52404k = num;
        this.f52405l = liveBasicParams;
        this.f52406m = z11;
        this.f52407n = str5;
        this.f52408o = yVar;
        this.f52409p = str6;
        this.f52410q = str7;
        this.f52411r = i12;
        this.f52412s = list;
        this.f52413t = list2;
        this.f52414u = z12;
        this.f52415v = str8;
        this.f52416w = thumbnailFrame;
        this.f52417x = str9;
        this.f52418y = str10;
        this.f52419z = bVar;
    }

    @Override // s8.e
    public k a() {
        return this.f52398e;
    }

    @Override // s8.e
    public String b() {
        return this.f52395b;
    }

    @Override // s8.e
    public Integer c() {
        return this.f52404k;
    }

    @Override // s8.e
    public String d() {
        return this.f52396c;
    }

    @Override // s8.e
    public int e() {
        return this.f52400g;
    }

    @Override // s8.e
    public int f() {
        return this.f52399f;
    }

    @Override // s8.e
    public boolean g() {
        return this.f52402i;
    }

    @Override // s8.a
    public a.b getType() {
        return this.f52419z;
    }

    @Override // s8.e
    public String h() {
        return this.f52397d;
    }

    @Override // s8.e
    public String i() {
        return this.f52403j;
    }

    @Override // s8.e
    public e0<Boolean> isPlaying() {
        return this.f52401h;
    }

    public final String j() {
        return this.f52415v;
    }

    public final String k() {
        return this.f52417x;
    }

    public final String l() {
        return this.f52418y;
    }

    public final LiveBasicParams m() {
        return this.f52405l;
    }

    public final y n() {
        return this.f52408o;
    }

    public final String o() {
        return this.f52407n;
    }

    public final String p() {
        return this.f52409p;
    }

    public final boolean q() {
        return this.f52414u;
    }

    public final ThumbnailFrame r() {
        return this.f52416w;
    }

    public final int s() {
        return this.f52411r;
    }

    public final List<UserAppStatus> t() {
        return this.f52412s;
    }

    public final String u() {
        return this.f52410q;
    }

    public final List<n> v() {
        return this.f52413t;
    }

    public final boolean w() {
        return this.f52406m;
    }

    public /* synthetic */ j(String str, String str2, String str3, k kVar, int i10, int i11, e0 e0Var, boolean z10, String str4, Integer num, LiveBasicParams liveBasicParams, boolean z11, String str5, y yVar, String str6, String str7, int i12, List list, List list2, boolean z12, String str8, ThumbnailFrame thumbnailFrame, String str9, String str10, a.b bVar, int i13, jo.h hVar) {
        this(str, str2, str3, kVar, i10, i11, e0Var, z10, str4, num, liveBasicParams, z11, str5, yVar, str6, str7, i12, list, list2, z12, str8, (i13 & 2097152) != 0 ? null : thumbnailFrame, (i13 & 4194304) != 0 ? null : str9, (i13 & 8388608) != 0 ? null : str10, (i13 & 16777216) != 0 ? a.b.LIVE_PRIVATE : bVar);
    }
}
