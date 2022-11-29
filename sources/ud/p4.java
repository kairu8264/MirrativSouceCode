package ud;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import kotlin.NoWhenBranchMatchedException;
import ud.d4;

/* loaded from: classes2.dex */
public final class p4 implements d4 {

    /* renamed from: u  reason: collision with root package name */
    public static final a f55344u = new a(null);

    /* renamed from: v  reason: collision with root package name */
    public static final int f55345v = 8;

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f55346a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55347b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55348c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55349d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55350e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55351f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55352g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55353h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55354i;

    /* renamed from: j  reason: collision with root package name */
    public final String f55355j;

    /* renamed from: k  reason: collision with root package name */
    public final Spannable f55356k;

    /* renamed from: l  reason: collision with root package name */
    public final float f55357l;

    /* renamed from: m  reason: collision with root package name */
    public final String f55358m;

    /* renamed from: n  reason: collision with root package name */
    public final int f55359n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f55360o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f55361p;

    /* renamed from: q  reason: collision with root package name */
    public final int f55362q;

    /* renamed from: r  reason: collision with root package name */
    public final String f55363r;

    /* renamed from: s  reason: collision with root package name */
    public final we.g f55364s;

    /* renamed from: t  reason: collision with root package name */
    public final int f55365t;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: ud.p4$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0865a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f55366a;

            static {
                int[] iArr = new int[GiftItem.Level.values().length];
                iArr[GiftItem.Level.GREEN.ordinal()] = 1;
                iArr[GiftItem.Level.BLUE.ordinal()] = 2;
                iArr[GiftItem.Level.RED.ordinal()] = 3;
                iArr[GiftItem.Level.SILVER.ordinal()] = 4;
                iArr[GiftItem.Level.GOLD.ordinal()] = 5;
                iArr[GiftItem.Level.RAINBOW.ordinal()] = 6;
                f55366a = iArr;
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p4 a(Context context, String str, GiftItem giftItem, int i10, d4.a aVar) {
            int d10;
            int i11;
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            jo.p.h(giftItem, "giftItem");
            jo.p.h(aVar, "type");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getString(nd.f1.text_gift_comment_user, giftItem.getUserName()));
            sb2.append(giftItem.getGiftTitle());
            int i12 = nd.f1.text_gift_comment_sent;
            Object[] objArr = new Object[1];
            String str2 = "";
            objArr[0] = giftItem.getCount() > 1 ? context.getString(nd.f1.text_gift_comment_count, String.valueOf(giftItem.getCount())) : "";
            sb2.append(context.getString(i12, objArr));
            String sb3 = sb2.toString();
            String userId = giftItem.getUserId();
            String userName = giftItem.getUserName();
            String message = giftItem.getMessage();
            if (message == null) {
                message = "";
            }
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
                jo.p.g(str2, "{\n                      …())\n                    }");
            }
            SpannableString spannableString = new SpannableString(giftItem.getGiftTitle());
            spannableString.setSpan(new ForegroundColorSpan(d10), 0, giftItem.getGiftTitle().length(), 33);
            SpannableString spannableString2 = new SpannableString(context.getString(i12, str2));
            int U = so.o.U(spannableString2, str2, 0, false, 6, null);
            spannableString2.setSpan(new ForegroundColorSpan(d10), U, str2.length() + U, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) spannableString2);
            float f10 = giftItem.getGiftTitle().length() > 8 ? 10.0f : 12.0f;
            String speech = giftItem.getSpeech();
            String str3 = speech == null ? sb3 : speech;
            switch (C0865a.f55366a[giftItem.getLevel().ordinal()]) {
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
            return new p4(aVar, str, 0, userId, userName, message, str3, profileImageUrl, badgeImageUrl, userName2, spannableStringBuilder, f10, sb3, i11, giftItem.isCheerleader(), giftItem.isModerator(), i10, giftItem.getCollabStreamerUserName(), we.g.Companion.a(giftItem.getYellRank()), giftItem.getYellLevel(), 4, null);
        }
    }

    public p4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Spannable spannable, float f10, String str9, int i11, boolean z10, boolean z11, int i12, String str10, we.g gVar, int i13) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        jo.p.h(str8, "senderName");
        jo.p.h(spannable, "giftTitle");
        jo.p.h(str9, "floatComment");
        jo.p.h(str10, "collabStreamerUserName");
        jo.p.h(gVar, "yellRank");
        this.f55346a = aVar;
        this.f55347b = str;
        this.f55348c = i10;
        this.f55349d = str2;
        this.f55350e = str3;
        this.f55351f = str4;
        this.f55352g = str5;
        this.f55353h = str6;
        this.f55354i = str7;
        this.f55355j = str8;
        this.f55356k = spannable;
        this.f55357l = f10;
        this.f55358m = str9;
        this.f55359n = i11;
        this.f55360o = z10;
        this.f55361p = z11;
        this.f55362q = i12;
        this.f55363r = str10;
        this.f55364s = gVar;
        this.f55365t = i13;
    }

    @Override // ud.d4
    public String a() {
        return this.f55351f;
    }

    @Override // ud.d4
    public String b() {
        return this.f55347b;
    }

    @Override // ud.d4
    public String c() {
        return this.f55350e;
    }

    @Override // ud.d4
    public int d() {
        return this.f55348c;
    }

    @Override // ud.d4
    public String e() {
        return this.f55349d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p4) {
            p4 p4Var = (p4) obj;
            return getType() == p4Var.getType() && jo.p.c(b(), p4Var.b()) && d() == p4Var.d() && jo.p.c(e(), p4Var.e()) && jo.p.c(c(), p4Var.c()) && jo.p.c(a(), p4Var.a()) && jo.p.c(h(), p4Var.h()) && jo.p.c(f(), p4Var.f()) && jo.p.c(g(), p4Var.g()) && jo.p.c(this.f55355j, p4Var.f55355j) && jo.p.c(this.f55356k, p4Var.f55356k) && jo.p.c(Float.valueOf(this.f55357l), Float.valueOf(p4Var.f55357l)) && jo.p.c(this.f55358m, p4Var.f55358m) && this.f55359n == p4Var.f55359n && this.f55360o == p4Var.f55360o && this.f55361p == p4Var.f55361p && this.f55362q == p4Var.f55362q && jo.p.c(this.f55363r, p4Var.f55363r) && this.f55364s == p4Var.f55364s && this.f55365t == p4Var.f55365t;
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f55353h;
    }

    @Override // ud.d4
    public String g() {
        return this.f55354i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f55346a;
    }

    @Override // ud.d4
    public String h() {
        return this.f55352g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode()) * 31) + this.f55355j.hashCode()) * 31) + this.f55356k.hashCode()) * 31) + Float.hashCode(this.f55357l)) * 31) + this.f55358m.hashCode()) * 31) + Integer.hashCode(this.f55359n)) * 31;
        boolean z10 = this.f55360o;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f55361p;
        return ((((((((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Integer.hashCode(this.f55362q)) * 31) + this.f55363r.hashCode()) * 31) + this.f55364s.hashCode()) * 31) + Integer.hashCode(this.f55365t);
    }

    public final int i() {
        return this.f55359n;
    }

    public final String j() {
        return this.f55363r;
    }

    public final String k() {
        return this.f55358m;
    }

    public final Spannable l() {
        return this.f55356k;
    }

    public final float m() {
        return this.f55357l;
    }

    public final int n() {
        return this.f55365t;
    }

    public final we.g o() {
        return this.f55364s;
    }

    public final boolean p() {
        return this.f55360o;
    }

    public final boolean q() {
        return this.f55361p;
    }

    public String toString() {
        return "StreamingLiveCommentGiftBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ", senderName=" + this.f55355j + ", giftTitle=" + ((Object) this.f55356k) + ", giftTitleTextSizeSp=" + this.f55357l + ", floatComment=" + this.f55358m + ", backgroundDrawableResInt=" + this.f55359n + ", isCheerleader=" + this.f55360o + ", isModerator=" + this.f55361p + ", createdAt=" + this.f55362q + ", collabStreamerUserName=" + this.f55363r + ", yellRank=" + this.f55364s + ", yellLevel=" + this.f55365t + ')';
    }

    public /* synthetic */ p4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Spannable spannable, float f10, String str9, int i11, boolean z10, boolean z11, int i12, String str10, we.g gVar, int i13, int i14, jo.h hVar) {
        this(aVar, str, (i14 & 4) != 0 ? 35 : i10, str2, str3, str4, str5, (i14 & 128) != 0 ? "" : str6, (i14 & 256) != 0 ? "" : str7, str8, spannable, f10, str9, i11, z10, z11, i12, str10, gVar, i13);
    }
}
