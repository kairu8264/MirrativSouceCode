package ud;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import kotlin.NoWhenBranchMatchedException;
import ud.r2;

/* loaded from: classes2.dex */
public final class z2 implements r2 {

    /* renamed from: s  reason: collision with root package name */
    public static final a f55801s = new a(null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f55802t = 8;

    /* renamed from: a  reason: collision with root package name */
    public final r2.a f55803a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55804b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55805c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55806d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55807e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55808f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55809g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55810h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55811i;

    /* renamed from: j  reason: collision with root package name */
    public final Spannable f55812j;

    /* renamed from: k  reason: collision with root package name */
    public final float f55813k;

    /* renamed from: l  reason: collision with root package name */
    public final int f55814l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f55815m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f55816n;

    /* renamed from: o  reason: collision with root package name */
    public final int f55817o;

    /* renamed from: p  reason: collision with root package name */
    public final String f55818p;

    /* renamed from: q  reason: collision with root package name */
    public final we.g f55819q;

    /* renamed from: r  reason: collision with root package name */
    public final int f55820r;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: ud.z2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0870a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f55821a;

            static {
                int[] iArr = new int[GiftItem.Level.values().length];
                iArr[GiftItem.Level.GREEN.ordinal()] = 1;
                iArr[GiftItem.Level.BLUE.ordinal()] = 2;
                iArr[GiftItem.Level.RED.ordinal()] = 3;
                iArr[GiftItem.Level.SILVER.ordinal()] = 4;
                iArr[GiftItem.Level.GOLD.ordinal()] = 5;
                iArr[GiftItem.Level.RAINBOW.ordinal()] = 6;
                f55821a = iArr;
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final z2 a(Context context, String str, GiftItem giftItem, int i10) {
            int d10;
            int i11;
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            jo.p.h(giftItem, "giftItem");
            String userId = giftItem.getUserId();
            String userName = giftItem.getUserName();
            String message = giftItem.getMessage();
            String str2 = "";
            String str3 = message == null ? "" : message;
            String userName2 = giftItem.getUserName();
            String profileImageUrl = giftItem.getProfileImageUrl();
            String badgeImageUrl = giftItem.getBadgeImageUrl();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (giftItem.getLevel() == GiftItem.Level.GOLD) {
                d10 = c3.a.d(context, nd.w0.gift_comment_emphasis_gold_text_color);
            } else {
                d10 = c3.a.d(context, nd.w0.gift_comment_emphasis_text_color);
            }
            if (giftItem.getCount() > 1) {
                str2 = context.getString(nd.f1.text_gift_comment_count, String.valueOf(giftItem.getCount()));
                jo.p.g(str2, "{\n                    co…ring())\n                }");
            }
            SpannableString spannableString = new SpannableString(giftItem.getGiftTitle());
            spannableString.setSpan(new ForegroundColorSpan(d10), 0, giftItem.getGiftTitle().length(), 33);
            SpannableString spannableString2 = new SpannableString(context.getString(nd.f1.text_gift_comment_sent, str2));
            int U = so.o.U(spannableString2, str2, 0, false, 6, null);
            spannableString2.setSpan(new ForegroundColorSpan(d10), U, str2.length() + U, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) spannableString2);
            wn.v vVar = wn.v.f59242a;
            float f10 = giftItem.getGiftTitle().length() > 8 ? 10.0f : 12.0f;
            switch (C0870a.f55821a[giftItem.getLevel().ordinal()]) {
                case 1:
                    i11 = nd.y0.bg_gift_comment_green;
                    break;
                case 2:
                    i11 = nd.y0.bg_gift_comment_blue;
                    break;
                case 3:
                    i11 = nd.y0.bg_gift_comment_red;
                    break;
                case 4:
                    i11 = nd.y0.bg_gift_comment_silver;
                    break;
                case 5:
                    i11 = nd.y0.bg_gift_comment_gold;
                    break;
                case 6:
                    i11 = nd.y0.bg_gift_comment_rainbow;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return new z2(null, str, 0, userId, userName, str3, userName2, profileImageUrl, badgeImageUrl, spannableStringBuilder, f10, i11, giftItem.isCheerleader(), giftItem.isModerator(), i10, giftItem.getCollabStreamerUserName(), we.g.Companion.a(giftItem.getYellRank()), giftItem.getYellLevel(), 5, null);
        }
    }

    public z2(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, Spannable spannable, float f10, int i11, boolean z10, boolean z11, int i12, String str8, we.g gVar, int i13) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "senderName");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        jo.p.h(spannable, "giftTitle");
        jo.p.h(str8, "collabStreamerUserName");
        jo.p.h(gVar, "yellRank");
        this.f55803a = aVar;
        this.f55804b = str;
        this.f55805c = i10;
        this.f55806d = str2;
        this.f55807e = str3;
        this.f55808f = str4;
        this.f55809g = str5;
        this.f55810h = str6;
        this.f55811i = str7;
        this.f55812j = spannable;
        this.f55813k = f10;
        this.f55814l = i11;
        this.f55815m = z10;
        this.f55816n = z11;
        this.f55817o = i12;
        this.f55818p = str8;
        this.f55819q = gVar;
        this.f55820r = i13;
    }

    @Override // ud.r2
    public String a() {
        return this.f55808f;
    }

    public final int b() {
        return this.f55814l;
    }

    @Override // ud.r2
    public String c() {
        return this.f55807e;
    }

    @Override // ud.r2
    public int d() {
        return this.f55805c;
    }

    @Override // ud.r2
    public String e() {
        return this.f55806d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z2) {
            z2 z2Var = (z2) obj;
            return getType() == z2Var.getType() && jo.p.c(i(), z2Var.i()) && d() == z2Var.d() && jo.p.c(e(), z2Var.e()) && jo.p.c(c(), z2Var.c()) && jo.p.c(a(), z2Var.a()) && jo.p.c(this.f55809g, z2Var.f55809g) && jo.p.c(this.f55810h, z2Var.f55810h) && jo.p.c(this.f55811i, z2Var.f55811i) && jo.p.c(this.f55812j, z2Var.f55812j) && jo.p.c(Float.valueOf(this.f55813k), Float.valueOf(z2Var.f55813k)) && this.f55814l == z2Var.f55814l && this.f55815m == z2Var.f55815m && this.f55816n == z2Var.f55816n && this.f55817o == z2Var.f55817o && jo.p.c(this.f55818p, z2Var.f55818p) && this.f55819q == z2Var.f55819q && this.f55820r == z2Var.f55820r;
        }
        return false;
    }

    public final String f() {
        return this.f55811i;
    }

    public final Spannable g() {
        return this.f55812j;
    }

    @Override // ud.r2
    public r2.a getType() {
        return this.f55803a;
    }

    public final float h() {
        return this.f55813k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((getType().hashCode() * 31) + i().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + this.f55809g.hashCode()) * 31) + this.f55810h.hashCode()) * 31) + this.f55811i.hashCode()) * 31) + this.f55812j.hashCode()) * 31) + Float.hashCode(this.f55813k)) * 31) + Integer.hashCode(this.f55814l)) * 31;
        boolean z10 = this.f55815m;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f55816n;
        return ((((((((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Integer.hashCode(this.f55817o)) * 31) + this.f55818p.hashCode()) * 31) + this.f55819q.hashCode()) * 31) + Integer.hashCode(this.f55820r);
    }

    public String i() {
        return this.f55804b;
    }

    public final String j() {
        return this.f55810h;
    }

    public final String k() {
        return this.f55809g;
    }

    public final int l() {
        return this.f55820r;
    }

    public final we.g m() {
        return this.f55819q;
    }

    public final boolean n() {
        return this.f55815m;
    }

    public final boolean o() {
        return this.f55816n;
    }

    public String toString() {
        return "PlayerLiveCommentGiftBindModel(type=" + getType() + ", liveId=" + i() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", senderName=" + this.f55809g + ", profileImageUrl=" + this.f55810h + ", badgeImageUrl=" + this.f55811i + ", giftTitle=" + ((Object) this.f55812j) + ", giftTitleTextSizeSp=" + this.f55813k + ", backgroundDrawableResInt=" + this.f55814l + ", isCheerleader=" + this.f55815m + ", isModerator=" + this.f55816n + ", createdAt=" + this.f55817o + ", collabStreamerUserName=" + this.f55818p + ", yellRank=" + this.f55819q + ", yellLevel=" + this.f55820r + ')';
    }

    public /* synthetic */ z2(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, Spannable spannable, float f10, int i11, boolean z10, boolean z11, int i12, String str8, we.g gVar, int i13, int i14, jo.h hVar) {
        this((i14 & 1) != 0 ? r2.a.VIEW_TYPE_GIFT : aVar, str, (i14 & 4) != 0 ? 35 : i10, str2, str3, str4, str5, str6, str7, spannable, f10, i11, z10, z11, i12, str8, gVar, i13);
    }
}
