package mc;

import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.GiftResultItem;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams;
import hf.v0;
import java.io.Serializable;
import java.util.List;
import xn.a0;

/* loaded from: classes2.dex */
public final class n implements Serializable {
    public static final a M = new a(null);
    public static final int N = 8;
    public final String A;
    public final boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final List<GiftResultItem> F;
    public int G;
    public int H;
    public final int I;
    public final String J;
    public final we.g K;
    public final int L;

    /* renamed from: w  reason: collision with root package name */
    public final String f40814w;

    /* renamed from: x  reason: collision with root package name */
    public final String f40815x;

    /* renamed from: y  reason: collision with root package name */
    public final String f40816y;

    /* renamed from: z  reason: collision with root package name */
    public final int f40817z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ n b(a aVar, UserBasicWithGraphParams userBasicWithGraphParams, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(userBasicWithGraphParams, z10);
        }

        public final n a(UserBasicWithGraphParams userBasicWithGraphParams, boolean z10) {
            jo.p.h(userBasicWithGraphParams, "params");
            if (z10) {
                String userId = userBasicWithGraphParams.getUserId();
                String name = userBasicWithGraphParams.getName();
                String profileImageUrl = userBasicWithGraphParams.getProfileImageUrl();
                int commentNum = userBasicWithGraphParams.getCommentNum();
                String description = userBasicWithGraphParams.getDescription();
                boolean a10 = v0.f35614h.a(userBasicWithGraphParams);
                List<GiftResultItem> sentGifts = userBasicWithGraphParams.getSentGifts();
                if (sentGifts == null) {
                    sentGifts = xn.s.k();
                }
                List<GiftResultItem> list = sentGifts;
                int thanksStatus = userBasicWithGraphParams.getThanksStatus();
                int thanksSentNum = userBasicWithGraphParams.getThanksSentNum();
                boolean isFollower = userBasicWithGraphParams.isFollower();
                int giftCoins = userBasicWithGraphParams.getGiftCoins();
                UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) a0.Z(userBasicWithGraphParams.getBadges());
                return new n(userId, name, profileImageUrl, commentNum, description, a10, true, isFollower, true, list, thanksStatus, thanksSentNum, giftCoins, userBadgeImageUrl != null ? userBadgeImageUrl.getSmallImageUrl() : null, we.g.Companion.a(userBasicWithGraphParams.getYellRank().getRawValue()), userBasicWithGraphParams.getYellLevel());
            }
            String userId2 = userBasicWithGraphParams.getUserId();
            String name2 = userBasicWithGraphParams.getName();
            String profileImageUrl2 = userBasicWithGraphParams.getProfileImageUrl();
            int commentNum2 = userBasicWithGraphParams.getCommentNum();
            String description2 = userBasicWithGraphParams.getDescription();
            boolean a11 = v0.f35614h.a(userBasicWithGraphParams);
            List<GiftResultItem> sentGifts2 = userBasicWithGraphParams.getSentGifts();
            if (sentGifts2 == null) {
                sentGifts2 = xn.s.k();
            }
            List<GiftResultItem> list2 = sentGifts2;
            int thanksStatus2 = userBasicWithGraphParams.getThanksStatus();
            int thanksSentNum2 = userBasicWithGraphParams.getThanksSentNum();
            boolean isFollowing = userBasicWithGraphParams.isFollowing();
            boolean isFollower2 = userBasicWithGraphParams.isFollower();
            int giftCoins2 = userBasicWithGraphParams.getGiftCoins();
            UserBadgeImageUrl userBadgeImageUrl2 = (UserBadgeImageUrl) a0.Z(userBasicWithGraphParams.getBadges());
            return new n(userId2, name2, profileImageUrl2, commentNum2, description2, a11, isFollowing, isFollower2, false, list2, thanksStatus2, thanksSentNum2, giftCoins2, userBadgeImageUrl2 != null ? userBadgeImageUrl2.getSmallImageUrl() : null, we.g.Companion.a(userBasicWithGraphParams.getYellRank().getRawValue()), userBasicWithGraphParams.getYellLevel(), 256, null);
        }
    }

    public n(String str, String str2, String str3, int i10, String str4, boolean z10, boolean z11, boolean z12, boolean z13, List<GiftResultItem> list, int i11, int i12, int i13, String str5, we.g gVar, int i14) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "userName");
        jo.p.h(str3, "imageUrl");
        jo.p.h(str4, MRLog.PAYLOAD_KEY_DESCRIPTION);
        jo.p.h(list, "sentGifts");
        jo.p.h(gVar, "yellRank");
        this.f40814w = str;
        this.f40815x = str2;
        this.f40816y = str3;
        this.f40817z = i10;
        this.A = str4;
        this.B = z10;
        this.C = z11;
        this.D = z12;
        this.E = z13;
        this.F = list;
        this.G = i11;
        this.H = i12;
        this.I = i13;
        this.J = str5;
        this.K = gVar;
        this.L = i14;
    }

    public final n a(String str, String str2, String str3, int i10, String str4, boolean z10, boolean z11, boolean z12, boolean z13, List<GiftResultItem> list, int i11, int i12, int i13, String str5, we.g gVar, int i14) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "userName");
        jo.p.h(str3, "imageUrl");
        jo.p.h(str4, MRLog.PAYLOAD_KEY_DESCRIPTION);
        jo.p.h(list, "sentGifts");
        jo.p.h(gVar, "yellRank");
        return new n(str, str2, str3, i10, str4, z10, z11, z12, z13, list, i11, i12, i13, str5, gVar, i14);
    }

    public final String c() {
        return this.J;
    }

    public final int d() {
        return this.f40817z;
    }

    public final boolean e() {
        return this.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return jo.p.c(this.f40814w, nVar.f40814w) && jo.p.c(this.f40815x, nVar.f40815x) && jo.p.c(this.f40816y, nVar.f40816y) && this.f40817z == nVar.f40817z && jo.p.c(this.A, nVar.A) && this.B == nVar.B && this.C == nVar.C && this.D == nVar.D && this.E == nVar.E && jo.p.c(this.F, nVar.F) && this.G == nVar.G && this.H == nVar.H && this.I == nVar.I && jo.p.c(this.J, nVar.J) && this.K == nVar.K && this.L == nVar.L;
        }
        return false;
    }

    public final int f() {
        return this.I;
    }

    public final String g() {
        return this.f40816y;
    }

    public final boolean h() {
        return this.E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f40814w.hashCode() * 31) + this.f40815x.hashCode()) * 31) + this.f40816y.hashCode()) * 31) + Integer.hashCode(this.f40817z)) * 31) + this.A.hashCode()) * 31;
        boolean z10 = this.B;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.C;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.D;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.E;
        int hashCode2 = (((((((((i15 + (z13 ? 1 : z13 ? 1 : 0)) * 31) + this.F.hashCode()) * 31) + Integer.hashCode(this.G)) * 31) + Integer.hashCode(this.H)) * 31) + Integer.hashCode(this.I)) * 31;
        String str = this.J;
        return ((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.K.hashCode()) * 31) + Integer.hashCode(this.L);
    }

    public final List<GiftResultItem> i() {
        return this.F;
    }

    public final int j() {
        return this.H;
    }

    public final int k() {
        return this.G;
    }

    public final String l() {
        return this.f40814w;
    }

    public final String m() {
        return this.f40815x;
    }

    public final int n() {
        return this.L;
    }

    public final we.g o() {
        return this.K;
    }

    public final boolean p() {
        return this.D;
    }

    public String toString() {
        return "BroadcastUserData(userId=" + this.f40814w + ", userName=" + this.f40815x + ", imageUrl=" + this.f40816y + ", commentCount=" + this.f40817z + ", description=" + this.A + ", isOnLive=" + this.B + ", following=" + this.C + ", isFollower=" + this.D + ", lockFollowing=" + this.E + ", sentGifts=" + this.F + ", thanksStatus=" + this.G + ", thanksSentNum=" + this.H + ", giftCoins=" + this.I + ", badgeImageUrl=" + this.J + ", yellRank=" + this.K + ", yellLevel=" + this.L + ')';
    }

    public /* synthetic */ n(String str, String str2, String str3, int i10, String str4, boolean z10, boolean z11, boolean z12, boolean z13, List list, int i11, int i12, int i13, String str5, we.g gVar, int i14, int i15, jo.h hVar) {
        this(str, str2, str3, i10, str4, z10, z11, z12, (i15 & 256) != 0 ? false : z13, list, i11, i12, i13, str5, gVar, i14);
    }
}
