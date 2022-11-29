package ud;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import ud.r2;

/* loaded from: classes2.dex */
public final class x2 implements r2 {

    /* renamed from: n  reason: collision with root package name */
    public static final a f55684n = new a(null);

    /* renamed from: o  reason: collision with root package name */
    public static final int f55685o = 8;

    /* renamed from: a  reason: collision with root package name */
    public final r2.a f55686a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55687b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55688c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55689d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55690e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55691f;

    /* renamed from: g  reason: collision with root package name */
    public final Spannable f55692g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55693h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55694i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f55695j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f55696k;

    /* renamed from: l  reason: collision with root package name */
    public final int f55697l;

    /* renamed from: m  reason: collision with root package name */
    public final String f55698m;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final x2 a(Context context, String str, GiftItem giftItem, int i10) {
            String string;
            int d10;
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            jo.p.h(giftItem, "giftItem");
            String userId = giftItem.getUserId();
            String userName = giftItem.getUserName();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(giftItem.getGiftTitle());
            int i11 = nd.f1.text_gift_comment_sent;
            Object[] objArr = new Object[1];
            if (giftItem.getCount() <= 1) {
                string = "";
            } else {
                string = context.getString(nd.f1.text_gift_comment_count, String.valueOf(giftItem.getCount()));
                jo.p.g(string, "{\n                    co…ring())\n                }");
            }
            objArr[0] = string;
            sb2.append(context.getString(i11, objArr));
            String sb3 = sb2.toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (giftItem.isModerator()) {
                d10 = c3.a.d(context, nd.w0.moderator);
            } else {
                d10 = c3.a.d(context, nd.w0.M0);
            }
            SpannableString spannableString = new SpannableString(giftItem.getUserName());
            spannableString.setSpan(new ForegroundColorSpan(d10), 0, giftItem.getUserName().length(), 33);
            String string2 = context.getString(nd.f1.f41983p1, giftItem.getCollabStreamerUserName());
            jo.p.g(string2, "context.getString(R.stri…m.collabStreamerUserName)");
            SpannableString spannableString2 = new SpannableString(string2);
            spannableString2.setSpan(new ForegroundColorSpan(c3.a.d(context, nd.w0.f42240r0)), 0, string2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) spannableString2);
            wn.v vVar = wn.v.f59242a;
            return new x2(null, str, 0, userId, userName, sb3, spannableStringBuilder, giftItem.getProfileImageUrl(), giftItem.getBadgeImageUrl(), giftItem.isCheerleader(), giftItem.isModerator(), i10, giftItem.getCollabStreamerUserName(), 5, null);
        }
    }

    public x2(r2.a aVar, String str, int i10, String str2, String str3, String str4, Spannable spannable, String str5, String str6, boolean z10, boolean z11, int i11, String str7) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(spannable, "userNameSpannable");
        jo.p.h(str5, "profileImageUrl");
        this.f55686a = aVar;
        this.f55687b = str;
        this.f55688c = i10;
        this.f55689d = str2;
        this.f55690e = str3;
        this.f55691f = str4;
        this.f55692g = spannable;
        this.f55693h = str5;
        this.f55694i = str6;
        this.f55695j = z10;
        this.f55696k = z11;
        this.f55697l = i11;
        this.f55698m = str7;
    }

    @Override // ud.r2
    public String a() {
        return this.f55691f;
    }

    public final String b() {
        return this.f55694i;
    }

    @Override // ud.r2
    public String c() {
        return this.f55690e;
    }

    @Override // ud.r2
    public int d() {
        return this.f55688c;
    }

    @Override // ud.r2
    public String e() {
        return this.f55689d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x2) {
            x2 x2Var = (x2) obj;
            return getType() == x2Var.getType() && jo.p.c(f(), x2Var.f()) && d() == x2Var.d() && jo.p.c(e(), x2Var.e()) && jo.p.c(c(), x2Var.c()) && jo.p.c(a(), x2Var.a()) && jo.p.c(this.f55692g, x2Var.f55692g) && jo.p.c(this.f55693h, x2Var.f55693h) && jo.p.c(this.f55694i, x2Var.f55694i) && this.f55695j == x2Var.f55695j && this.f55696k == x2Var.f55696k && this.f55697l == x2Var.f55697l && jo.p.c(this.f55698m, x2Var.f55698m);
        }
        return false;
    }

    public String f() {
        return this.f55687b;
    }

    public final String g() {
        return this.f55693h;
    }

    @Override // ud.r2
    public r2.a getType() {
        return this.f55686a;
    }

    public final Spannable h() {
        return this.f55692g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((getType().hashCode() * 31) + f().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + this.f55692g.hashCode()) * 31) + this.f55693h.hashCode()) * 31;
        String str = this.f55694i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z10 = this.f55695j;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z11 = this.f55696k;
        int hashCode3 = (((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Integer.hashCode(this.f55697l)) * 31;
        String str2 = this.f55698m;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean i() {
        return this.f55696k;
    }

    public String toString() {
        return "PlayerLiveCommentCollabLiveGiftBindModel(type=" + getType() + ", liveId=" + f() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", userNameSpannable=" + ((Object) this.f55692g) + ", profileImageUrl=" + this.f55693h + ", badgeImageUrl=" + this.f55694i + ", isCheerleader=" + this.f55695j + ", isModerator=" + this.f55696k + ", createdAt=" + this.f55697l + ", collabStreamerUserName=" + this.f55698m + ')';
    }

    public /* synthetic */ x2(r2.a aVar, String str, int i10, String str2, String str3, String str4, Spannable spannable, String str5, String str6, boolean z10, boolean z11, int i11, String str7, int i12, jo.h hVar) {
        this((i12 & 1) != 0 ? r2.a.VIEW_TYPE_COLLAB_LIVE_GIFT : aVar, str, (i12 & 4) != 0 ? 35 : i10, str2, str3, str4, spannable, str5, str6, z10, z11, i11, str7);
    }
}
