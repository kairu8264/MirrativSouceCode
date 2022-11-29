package ud;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.dena.mirrativ.mirrativapi.emomo.event.EventButtonStyle;
import com.dena.mirrativ.mirrativapi.emomo.event.GradientColor;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingAttributedText;
import com.dena.mirrorman.net.api.response.event.ShooterEventResponse;
import com.dena.mirrorman.net.api.response.event.ShooterRatingClass;
import com.dena.mirrorman.net.api.response.event.ShooterUserShooterSummary;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class v3 {

    /* renamed from: p  reason: collision with root package name */
    public static final a f55608p = new a(null);

    /* renamed from: q  reason: collision with root package name */
    public static final int f55609q = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f55610a;

    /* renamed from: b  reason: collision with root package name */
    public final SpannableString f55611b;

    /* renamed from: c  reason: collision with root package name */
    public final Drawable f55612c;

    /* renamed from: d  reason: collision with root package name */
    public final int f55613d;

    /* renamed from: e  reason: collision with root package name */
    public final SpannableString f55614e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55615f;

    /* renamed from: g  reason: collision with root package name */
    public final Drawable f55616g;

    /* renamed from: h  reason: collision with root package name */
    public final int f55617h;

    /* renamed from: i  reason: collision with root package name */
    public final Drawable f55618i;

    /* renamed from: j  reason: collision with root package name */
    public final String f55619j;

    /* renamed from: k  reason: collision with root package name */
    public final int f55620k;

    /* renamed from: l  reason: collision with root package name */
    public final int f55621l;

    /* renamed from: m  reason: collision with root package name */
    public final int f55622m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f55623n;

    /* renamed from: o  reason: collision with root package name */
    public final String f55624o;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final v3 a(Resources resources, ShooterEventResponse shooterEventResponse) {
            ShooterRatingClass ratingClass;
            jo.p.h(resources, "resources");
            jo.p.h(shooterEventResponse, "shooterEvent");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i10 = 0;
            for (GiftRankingAttributedText giftRankingAttributedText : shooterEventResponse.getTitle()) {
                spannableStringBuilder.append((CharSequence) giftRankingAttributedText.getValue());
                jo.i0 i0Var = jo.i0.f38149a;
                String format = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingAttributedText.getColor()}, 1));
                jo.p.g(format, "format(format, *args)");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(format)), i10, giftRankingAttributedText.getValue().length() + i10, 33);
                i10 += giftRankingAttributedText.getValue().length();
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            int i11 = 0;
            for (GiftRankingAttributedText giftRankingAttributedText2 : shooterEventResponse.getSubtitle()) {
                spannableStringBuilder2.append((CharSequence) giftRankingAttributedText2.getValue());
                jo.i0 i0Var2 = jo.i0.f38149a;
                String format2 = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingAttributedText2.getColor()}, 1));
                jo.p.g(format2, "format(format, *args)");
                spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor(format2)), i11, giftRankingAttributedText2.getValue().length() + i11, 33);
                i11 += giftRankingAttributedText2.getValue().length();
            }
            int i12 = -1;
            GradientDrawable gradientDrawable = null;
            ShooterUserShooterSummary userShooterSummary = shooterEventResponse.getUserShooterSummary();
            if (userShooterSummary != null && (ratingClass = userShooterSummary.getRatingClass()) != null) {
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                jo.i0 i0Var3 = jo.i0.f38149a;
                String format3 = String.format("#%s", Arrays.copyOf(new Object[]{ratingClass.getStartClassColor()}, 1));
                jo.p.g(format3, "format(format, *args)");
                String format4 = String.format("#%s", Arrays.copyOf(new Object[]{ratingClass.getEndClassColor()}, 1));
                jo.p.g(format4, "format(format, *args)");
                gradientDrawable = new GradientDrawable(orientation, xn.a0.A0(xn.s.m(Integer.valueOf(Color.parseColor(format3)), Integer.valueOf(Color.parseColor(format4)))));
                String format5 = String.format("#%s", Arrays.copyOf(new Object[]{ratingClass.getEndClassColor()}, 1));
                jo.p.g(format5, "format(format, *args)");
                i12 = Color.parseColor(format5);
            }
            int i13 = i12;
            GradientDrawable gradientDrawable2 = gradientDrawable;
            String imageUrl = shooterEventResponse.getImageUrl();
            SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
            Drawable b10 = b(shooterEventResponse.getTitleBackground());
            SpannableString valueOf2 = SpannableString.valueOf(spannableStringBuilder2);
            String ruleLink = shooterEventResponse.getRuleLink();
            Drawable c10 = c(shooterEventResponse.getRuleButton(), resources.getDisplayMetrics().scaledDensity * 24);
            jo.i0 i0Var4 = jo.i0.f38149a;
            String format6 = String.format("#%s", Arrays.copyOf(new Object[]{shooterEventResponse.getRuleButton().getTextColor()}, 1));
            jo.p.g(format6, "format(format, *args)");
            int parseColor = Color.parseColor(format6);
            String format7 = String.format("#%s", Arrays.copyOf(new Object[]{shooterEventResponse.getTotalScoreColor()}, 1));
            jo.p.g(format7, "format(format, *args)");
            int parseColor2 = Color.parseColor(format7);
            String format8 = String.format("#%s", Arrays.copyOf(new Object[]{shooterEventResponse.getHighScoreColor()}, 1));
            jo.p.g(format8, "format(format, *args)");
            int parseColor3 = Color.parseColor(format8);
            String format9 = String.format("#%s", Arrays.copyOf(new Object[]{shooterEventResponse.getRatingColor()}, 1));
            jo.p.g(format9, "format(format, *args)");
            int parseColor4 = Color.parseColor(format9);
            String rankingLink = shooterEventResponse.getRankingLink();
            boolean z10 = shooterEventResponse.getStreamerRankReward() != null;
            String footerImageUrl = shooterEventResponse.getFooterImageUrl();
            jo.p.g(valueOf, "valueOf(titleSpannableStringBuilder)");
            jo.p.g(valueOf2, "valueOf(periodSpannableStringBuilder)");
            return new v3(imageUrl, valueOf, b10, i13, valueOf2, ruleLink, c10, parseColor, gradientDrawable2, rankingLink, parseColor2, parseColor3, parseColor4, z10, footerImageUrl);
        }

        public final Drawable b(GradientColor gradientColor) {
            return new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, xn.a0.A0(xn.s.m(Integer.valueOf(gradientColor.getStartColorInt()), Integer.valueOf(gradientColor.getEndColorInt()))));
        }

        public final Drawable c(EventButtonStyle eventButtonStyle, float f10) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            jo.i0 i0Var = jo.i0.f38149a;
            String format = String.format("#%s", Arrays.copyOf(new Object[]{eventButtonStyle.getBackgroundColor()}, 1));
            jo.p.g(format, "format(format, *args)");
            String format2 = String.format("#%s", Arrays.copyOf(new Object[]{eventButtonStyle.getBackgroundColor()}, 1));
            jo.p.g(format2, "format(format, *args)");
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, xn.a0.A0(xn.s.m(Integer.valueOf(Color.parseColor(format)), Integer.valueOf(Color.parseColor(format2)))));
            String format3 = String.format("#%s", Arrays.copyOf(new Object[]{eventButtonStyle.getFrameColor()}, 1));
            jo.p.g(format3, "format(format, *args)");
            gradientDrawable.setStroke(1, Color.parseColor(format3));
            gradientDrawable.setCornerRadius(f10);
            return gradientDrawable;
        }
    }

    public v3(String str, SpannableString spannableString, Drawable drawable, int i10, SpannableString spannableString2, String str2, Drawable drawable2, int i11, Drawable drawable3, String str3, int i12, int i13, int i14, boolean z10, String str4) {
        jo.p.h(str, "eventImageUrl");
        jo.p.h(spannableString, "eventTitleText");
        jo.p.h(spannableString2, "periodText");
        jo.p.h(str2, "ruleText");
        jo.p.h(drawable2, "ruleBackground");
        jo.p.h(str3, "rankingExpandText");
        jo.p.h(str4, "footerImageUrl");
        this.f55610a = str;
        this.f55611b = spannableString;
        this.f55612c = drawable;
        this.f55613d = i10;
        this.f55614e = spannableString2;
        this.f55615f = str2;
        this.f55616g = drawable2;
        this.f55617h = i11;
        this.f55618i = drawable3;
        this.f55619j = str3;
        this.f55620k = i12;
        this.f55621l = i13;
        this.f55622m = i14;
        this.f55623n = z10;
        this.f55624o = str4;
    }

    public final String a() {
        return this.f55610a;
    }

    public final SpannableString b() {
        return this.f55611b;
    }

    public final String c() {
        return this.f55624o;
    }

    public final SpannableString d() {
        return this.f55614e;
    }

    public final int e() {
        return this.f55622m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v3) {
            v3 v3Var = (v3) obj;
            return jo.p.c(this.f55610a, v3Var.f55610a) && jo.p.c(this.f55611b, v3Var.f55611b) && jo.p.c(this.f55612c, v3Var.f55612c) && this.f55613d == v3Var.f55613d && jo.p.c(this.f55614e, v3Var.f55614e) && jo.p.c(this.f55615f, v3Var.f55615f) && jo.p.c(this.f55616g, v3Var.f55616g) && this.f55617h == v3Var.f55617h && jo.p.c(this.f55618i, v3Var.f55618i) && jo.p.c(this.f55619j, v3Var.f55619j) && this.f55620k == v3Var.f55620k && this.f55621l == v3Var.f55621l && this.f55622m == v3Var.f55622m && this.f55623n == v3Var.f55623n && jo.p.c(this.f55624o, v3Var.f55624o);
        }
        return false;
    }

    public final Drawable f() {
        return this.f55616g;
    }

    public final String g() {
        return this.f55615f;
    }

    public final int h() {
        return this.f55617h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f55610a.hashCode() * 31) + this.f55611b.hashCode()) * 31;
        Drawable drawable = this.f55612c;
        int hashCode2 = (((((((((((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + Integer.hashCode(this.f55613d)) * 31) + this.f55614e.hashCode()) * 31) + this.f55615f.hashCode()) * 31) + this.f55616g.hashCode()) * 31) + Integer.hashCode(this.f55617h)) * 31;
        Drawable drawable2 = this.f55618i;
        int hashCode3 = (((((((((hashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31) + this.f55619j.hashCode()) * 31) + Integer.hashCode(this.f55620k)) * 31) + Integer.hashCode(this.f55621l)) * 31) + Integer.hashCode(this.f55622m)) * 31;
        boolean z10 = this.f55623n;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode3 + i10) * 31) + this.f55624o.hashCode();
    }

    public final int i() {
        return this.f55613d;
    }

    public final Drawable j() {
        return this.f55612c;
    }

    public final int k() {
        return this.f55620k;
    }

    public final Drawable l() {
        return this.f55618i;
    }

    public final boolean m() {
        return this.f55623n;
    }

    public String toString() {
        return "ShooterRankingBindModel(eventImageUrl=" + this.f55610a + ", eventTitleText=" + ((Object) this.f55611b) + ", titleBackground=" + this.f55612c + ", tabBackgroundColor=" + this.f55613d + ", periodText=" + ((Object) this.f55614e) + ", ruleText=" + this.f55615f + ", ruleBackground=" + this.f55616g + ", ruleTextColor=" + this.f55617h + ", userSummaryGradientBackground=" + this.f55618i + ", rankingExpandText=" + this.f55619j + ", totalScoreColor=" + this.f55620k + ", highScoreColor=" + this.f55621l + ", ratingColor=" + this.f55622m + ", isVisibleStreamerView=" + this.f55623n + ", footerImageUrl=" + this.f55624o + ')';
    }
}
