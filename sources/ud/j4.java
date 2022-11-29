package ud;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import ud.d4;

/* loaded from: classes2.dex */
public final class j4 implements d4 {

    /* renamed from: o  reason: collision with root package name */
    public static final a f55055o = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public static final int f55056p = 8;

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f55057a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55058b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55059c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55060d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55061e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55062f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55063g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55064h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55065i;

    /* renamed from: j  reason: collision with root package name */
    public final Spannable f55066j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f55067k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f55068l;

    /* renamed from: m  reason: collision with root package name */
    public final int f55069m;

    /* renamed from: n  reason: collision with root package name */
    public final String f55070n;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j4 a(Context context, String str, GiftItem giftItem, int i10) {
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
            spannableString2.setSpan(new ForegroundColorSpan(c3.a.d(context, nd.w0.U0)), 0, string2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) spannableString2);
            return new j4(null, str, 0, userId, userName, sb3, null, giftItem.getProfileImageUrl(), giftItem.getBadgeImageUrl(), spannableStringBuilder, giftItem.isCheerleader(), giftItem.isModerator(), i10, giftItem.getCollabStreamerUserName(), 69, null);
        }
    }

    public j4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, Spannable spannable, boolean z10, boolean z11, int i11, String str8) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        jo.p.h(spannable, "userNameSpannable");
        this.f55057a = aVar;
        this.f55058b = str;
        this.f55059c = i10;
        this.f55060d = str2;
        this.f55061e = str3;
        this.f55062f = str4;
        this.f55063g = str5;
        this.f55064h = str6;
        this.f55065i = str7;
        this.f55066j = spannable;
        this.f55067k = z10;
        this.f55068l = z11;
        this.f55069m = i11;
        this.f55070n = str8;
    }

    @Override // ud.d4
    public String a() {
        return this.f55062f;
    }

    @Override // ud.d4
    public String b() {
        return this.f55058b;
    }

    @Override // ud.d4
    public String c() {
        return this.f55061e;
    }

    @Override // ud.d4
    public int d() {
        return this.f55059c;
    }

    @Override // ud.d4
    public String e() {
        return this.f55060d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j4) {
            j4 j4Var = (j4) obj;
            return getType() == j4Var.getType() && jo.p.c(b(), j4Var.b()) && d() == j4Var.d() && jo.p.c(e(), j4Var.e()) && jo.p.c(c(), j4Var.c()) && jo.p.c(a(), j4Var.a()) && jo.p.c(h(), j4Var.h()) && jo.p.c(f(), j4Var.f()) && jo.p.c(g(), j4Var.g()) && jo.p.c(this.f55066j, j4Var.f55066j) && this.f55067k == j4Var.f55067k && this.f55068l == j4Var.f55068l && this.f55069m == j4Var.f55069m && jo.p.c(this.f55070n, j4Var.f55070n);
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f55064h;
    }

    @Override // ud.d4
    public String g() {
        return this.f55065i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f55057a;
    }

    @Override // ud.d4
    public String h() {
        return this.f55063g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode()) * 31) + this.f55066j.hashCode()) * 31;
        boolean z10 = this.f55067k;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f55068l;
        int hashCode2 = (((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Integer.hashCode(this.f55069m)) * 31;
        String str = this.f55070n;
        return hashCode2 + (str == null ? 0 : str.hashCode());
    }

    public final String i() {
        return this.f55070n;
    }

    public final Spannable j() {
        return this.f55066j;
    }

    public final boolean k() {
        return this.f55067k;
    }

    public final boolean l() {
        return this.f55068l;
    }

    public String toString() {
        return "StreamingLiveCommentCollabLiveGiftBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ", userNameSpannable=" + ((Object) this.f55066j) + ", isCheerleader=" + this.f55067k + ", isModerator=" + this.f55068l + ", createdAt=" + this.f55069m + ", collabStreamerUserName=" + this.f55070n + ')';
    }

    public /* synthetic */ j4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, Spannable spannable, boolean z10, boolean z11, int i11, String str8, int i12, jo.h hVar) {
        this((i12 & 1) != 0 ? d4.a.VIEW_TYPE_COLLAB_LIVE_GIFT : aVar, str, (i12 & 4) != 0 ? 35 : i10, str2, str3, str4, (i12 & 64) != 0 ? "" : str5, (i12 & 128) != 0 ? "" : str6, (i12 & 256) != 0 ? "" : str7, spannable, z10, z11, i11, str8);
    }
}
