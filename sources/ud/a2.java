package ud;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.LiveArchiveStatus;
import com.dena.mirrorman.net.api.response.ThumbnailFrame;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import java.util.ArrayList;
import java.util.List;
import ud.a;

/* loaded from: classes2.dex */
public final class a2 implements ud.a {
    public static final a V = new a(null);
    public static final int W = 8;
    public final String A;
    public final jf.y B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final String J;
    public final int K;
    public final int L;
    public final int M;
    public final List<String> N;
    public final int O;
    public final boolean P;
    public final String Q;
    public final String R;
    public final String S;
    public final boolean T;
    public final a.EnumC0862a U;

    /* renamed from: w  reason: collision with root package name */
    public final String f54735w;

    /* renamed from: x  reason: collision with root package name */
    public final SpannableString f54736x;

    /* renamed from: y  reason: collision with root package name */
    public final int f54737y;

    /* renamed from: z  reason: collision with root package name */
    public final String f54738z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final a2 a(Context context, LiveBasicParams liveBasicParams) {
            jo.p.h(context, "context");
            jo.p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
            boolean z10 = liveBasicParams.isLive() || liveBasicParams.isArchive();
            String liveId = liveBasicParams.getLiveId();
            String title = liveBasicParams.getTitle();
            if (title == null) {
                title = "";
            }
            SpannableString c10 = c(context, title, false);
            int d10 = c3.a.d(context, nd.w0.f42240r0);
            String image_url = liveBasicParams.getImage_url();
            List<String> appIconUrls = liveBasicParams.getAppIconUrls();
            if (appIconUrls == null) {
                appIconUrls = xn.s.k();
            }
            String str = (String) xn.a0.Z(appIconUrls);
            jf.y a10 = jf.y.f38026d.a(liveBasicParams);
            boolean z11 = liveBasicParams.isLive() && liveBasicParams.getCollabUserProfileImageUrls().isEmpty();
            boolean z12 = !z10;
            boolean z13 = liveBasicParams.isLive() && (liveBasicParams.getCollabUserProfileImageUrls().isEmpty() ^ true);
            boolean isArchive = liveBasicParams.isArchive();
            String f10 = of.c.f45387a.f(context, System.currentTimeMillis(), liveBasicParams.getStartedAt() * 1000);
            int appNum = liveBasicParams.getAppNum();
            int totalViewerNum = liveBasicParams.getTotalViewerNum();
            List k10 = xn.s.k();
            ThumbnailFrame thumbnailFrame = liveBasicParams.getThumbnailFrame();
            String leftThumbnailImageUrl = thumbnailFrame != null ? thumbnailFrame.getLeftThumbnailImageUrl() : null;
            ThumbnailFrame thumbnailFrame2 = liveBasicParams.getThumbnailFrame();
            String rightThumbnailImageUrl = thumbnailFrame2 != null ? thumbnailFrame2.getRightThumbnailImageUrl() : null;
            ThumbnailFrame thumbnailFrame3 = liveBasicParams.getThumbnailFrame();
            return new a2(liveId, c10, d10, image_url, str, a10, z11, z12, z10, z13, false, isArchive, z10, f10, appNum, totalViewerNum, 0, k10, 0, false, leftThumbnailImageUrl, rightThumbnailImageUrl, thumbnailFrame3 != null ? thumbnailFrame3.getRightThumbnailAnimationUrl() : null, liveBasicParams.isOmotenashi() && liveBasicParams.isLive(), null, 16777216, null);
        }

        public final a2 b(Context context, LiveBasicParams liveBasicParams) {
            int d10;
            Integer archiveHidden;
            jo.p.h(context, "context");
            jo.p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
            boolean z10 = liveBasicParams.getArchiveStatus() == LiveArchiveStatus.PREPARED;
            boolean z11 = !liveBasicParams.isLive() && liveBasicParams.isArchiveExpired() == 1;
            boolean z12 = (z11 || (archiveHidden = liveBasicParams.getArchiveHidden()) == null || archiveHidden.intValue() != 1) ? false : true;
            String liveId = liveBasicParams.getLiveId();
            String title = liveBasicParams.getTitle();
            if (title == null) {
                title = "";
            }
            SpannableString c10 = c(context, title, z12);
            if (z11) {
                d10 = c3.a.d(context, nd.w0.Y);
            } else {
                d10 = c3.a.d(context, nd.w0.f42240r0);
            }
            int i10 = d10;
            String image_url = liveBasicParams.getImage_url();
            List<String> appIconUrls = liveBasicParams.getAppIconUrls();
            if (appIconUrls == null) {
                appIconUrls = xn.s.k();
            }
            String str = (String) xn.a0.Z(appIconUrls);
            jf.y a10 = jf.y.f38026d.a(liveBasicParams);
            boolean z13 = liveBasicParams.isLive() && liveBasicParams.getCollabUserProfileImageUrls().isEmpty();
            boolean z14 = (liveBasicParams.isLive() || z10) ? false : true;
            boolean z15 = liveBasicParams.isLive() && (liveBasicParams.getCollabUserProfileImageUrls().isEmpty() ^ true);
            boolean z16 = !liveBasicParams.isLive();
            boolean z17 = liveBasicParams.isLive() || z10 || liveBasicParams.getArchiveStatus() == LiveArchiveStatus.PREPARING;
            String f10 = of.c.f45387a.f(context, System.currentTimeMillis(), liveBasicParams.getStartedAt() * 1000);
            int appNum = liveBasicParams.getAppNum();
            int totalViewerNum = liveBasicParams.getTotalViewerNum();
            int gifterNum = liveBasicParams.getGifterNum() + liveBasicParams.getTopGifters().size();
            List<UserBasicParams> topGifters = liveBasicParams.getTopGifters();
            ArrayList arrayList = new ArrayList(xn.t.u(topGifters, 10));
            for (UserBasicParams userBasicParams : topGifters) {
                arrayList.add(userBasicParams.getProfileImageUrl());
            }
            int giftPoint = liveBasicParams.getGiftPoint();
            boolean z18 = liveBasicParams.getGiftPoint() > 0;
            ThumbnailFrame thumbnailFrame = liveBasicParams.getThumbnailFrame();
            String leftThumbnailImageUrl = thumbnailFrame != null ? thumbnailFrame.getLeftThumbnailImageUrl() : null;
            ThumbnailFrame thumbnailFrame2 = liveBasicParams.getThumbnailFrame();
            String rightThumbnailImageUrl = thumbnailFrame2 != null ? thumbnailFrame2.getRightThumbnailImageUrl() : null;
            ThumbnailFrame thumbnailFrame3 = liveBasicParams.getThumbnailFrame();
            return new a2(liveId, c10, i10, image_url, str, a10, z13, z14, true, z15, true, z16, z17, f10, appNum, totalViewerNum, gifterNum, arrayList, giftPoint, z18, leftThumbnailImageUrl, rightThumbnailImageUrl, thumbnailFrame3 != null ? thumbnailFrame3.getRightThumbnailAnimationUrl() : null, false, null, 16777216, null);
        }

        public final SpannableString c(Context context, String str, boolean z10) {
            if (z10) {
                String string = context.getString(nd.f1.hidden_live_title_prefix);
                jo.p.g(string, "context.getString(R.stri…hidden_live_title_prefix)");
                SpannableString spannableString = new SpannableString(string + ' ' + str);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#32a7df")), 0, string.length(), 33);
                return spannableString;
            }
            return new SpannableString(str);
        }
    }

    public a2(String str, SpannableString spannableString, int i10, String str2, String str3, jf.y yVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str4, int i11, int i12, int i13, List<String> list, int i14, boolean z17, String str5, String str6, String str7, boolean z18, a.EnumC0862a enumC0862a) {
        this.f54735w = str;
        this.f54736x = spannableString;
        this.f54737y = i10;
        this.f54738z = str2;
        this.A = str3;
        this.B = yVar;
        this.C = z10;
        this.D = z11;
        this.E = z12;
        this.F = z13;
        this.G = z14;
        this.H = z15;
        this.I = z16;
        this.J = str4;
        this.K = i11;
        this.L = i12;
        this.M = i13;
        this.N = list;
        this.O = i14;
        this.P = z17;
        this.Q = str5;
        this.R = str6;
        this.S = str7;
        this.T = z18;
        this.U = enumC0862a;
    }

    public final String a() {
        return this.A;
    }

    public final List<String> b() {
        return this.N;
    }

    public final int c() {
        return this.K;
    }

    public final String d() {
        return this.f54735w;
    }

    public final String e() {
        return this.J;
    }

    public final jf.y f() {
        return this.B;
    }

    public final SpannableString g() {
        return this.f54736x;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.U;
    }

    public final int h() {
        return this.f54737y;
    }

    public final String i() {
        return this.f54738z;
    }

    public final String j() {
        return this.Q;
    }

    public final String k() {
        return this.S;
    }

    public final String l() {
        return this.R;
    }

    public final int m() {
        return this.O;
    }

    public final int n() {
        return this.M;
    }

    public final int o() {
        return this.L;
    }

    public final boolean p() {
        return this.I;
    }

    public final boolean q() {
        return this.F;
    }

    public final boolean r() {
        return this.D;
    }

    public final boolean s() {
        return this.P;
    }

    public final boolean t() {
        return this.C;
    }

    public final boolean u() {
        return this.G;
    }

    public final boolean v() {
        return this.E;
    }

    public final boolean w() {
        return this.H;
    }

    public final boolean x() {
        return this.T;
    }

    public /* synthetic */ a2(String str, SpannableString spannableString, int i10, String str2, String str3, jf.y yVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str4, int i11, int i12, int i13, List list, int i14, boolean z17, String str5, String str6, String str7, boolean z18, a.EnumC0862a enumC0862a, int i15, jo.h hVar) {
        this(str, spannableString, i10, str2, str3, yVar, z10, z11, z12, z13, z14, z15, z16, str4, i11, i12, i13, list, i14, z17, str5, str6, str7, z18, (i15 & 16777216) != 0 ? a.EnumC0862a.LIVE_HISTORY : enumC0862a);
    }
}
