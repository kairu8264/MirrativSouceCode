package ud;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.dena.mirrorman.net.api.response.user.UserProfile;

/* loaded from: classes2.dex */
public final class m2 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f55199e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f55200f = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f55201a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55202b;

    /* renamed from: c  reason: collision with root package name */
    public final SpannableString f55203c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55204d;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m2 a(UserProfile userProfile, Context context) {
            jo.p.h(userProfile, "userProfile");
            jo.p.h(context, "context");
            String string = context.getResources().getString(nd.f1.text_badge, userProfile.getNextContinuousStreamerText());
            jo.p.g(string, "context.resources.getStr…xtContinuousStreamerText)");
            String string2 = context.getResources().getString(nd.f1.f41964a2, String.valueOf(userProfile.getCurrentContinuousRecord()));
            jo.p.g(string2, "context.resources.getStr…tinuousRecord.toString())");
            String nextContinuousStreamerBadgeUrl = userProfile.getNextContinuousStreamerBadgeUrl();
            SpannableString spannableString = new SpannableString(context.getResources().getString(nd.f1.text_badge_attach, string));
            int U = so.o.U(spannableString, string, 0, false, 6, null);
            spannableString.setSpan(new ForegroundColorSpan(c3.a.d(context, nd.w0.f42237m)), U, string.length() + U, 33);
            wn.v vVar = wn.v.f59242a;
            String string3 = context.getResources().getString(nd.f1.text_remaining_days, String.valueOf(userProfile.getRemainingDaysForContinuousStreamer()));
            jo.p.g(string3, "context.resources.getStr…nuousStreamer.toString())");
            return new m2(string2, nextContinuousStreamerBadgeUrl, spannableString, string3);
        }
    }

    public m2(String str, String str2, SpannableString spannableString, String str3) {
        jo.p.h(str, "continuousText");
        jo.p.h(str2, "badgeImageUrl");
        jo.p.h(spannableString, "badgeText");
        jo.p.h(str3, "limitText");
        this.f55201a = str;
        this.f55202b = str2;
        this.f55203c = spannableString;
        this.f55204d = str3;
    }

    public final String a() {
        return this.f55202b;
    }

    public final SpannableString b() {
        return this.f55203c;
    }

    public final String c() {
        return this.f55201a;
    }

    public final String d() {
        return this.f55204d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m2) {
            m2 m2Var = (m2) obj;
            return jo.p.c(this.f55201a, m2Var.f55201a) && jo.p.c(this.f55202b, m2Var.f55202b) && jo.p.c(this.f55203c, m2Var.f55203c) && jo.p.c(this.f55204d, m2Var.f55204d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f55201a.hashCode() * 31) + this.f55202b.hashCode()) * 31) + this.f55203c.hashCode()) * 31) + this.f55204d.hashCode();
    }

    public String toString() {
        return "MyPageContinuousLivePromotionBindModel(continuousText=" + this.f55201a + ", badgeImageUrl=" + this.f55202b + ", badgeText=" + ((Object) this.f55203c) + ", limitText=" + this.f55204d + ')';
    }
}
