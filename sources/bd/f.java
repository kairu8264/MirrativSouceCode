package bd;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingLiveResultClass;
import df.c;
import jo.h;
import jo.p;
import nc.i;
import so.o;
import wn.v;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: k  reason: collision with root package name */
    public static final a f17605k = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f17606l = 8;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17607a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17608b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17609c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17610d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17611e;

    /* renamed from: f  reason: collision with root package name */
    public final int f17612f;

    /* renamed from: g  reason: collision with root package name */
    public final int f17613g;

    /* renamed from: h  reason: collision with root package name */
    public final df.c f17614h;

    /* renamed from: i  reason: collision with root package name */
    public final Spannable f17615i;

    /* renamed from: j  reason: collision with root package name */
    public final Spannable f17616j;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final f a(SeasonRatingLiveResultClass seasonRatingLiveResultClass, boolean z10, Context context) {
            p.h(seasonRatingLiveResultClass, "response");
            p.h(context, "context");
            c.a aVar = df.c.Companion;
            df.c m10 = aVar.a(seasonRatingLiveResultClass.getClassId()).m();
            if (m10 == null) {
                m10 = df.c.E;
            }
            int start = (int) (((seasonRatingLiveResultClass.getStart() - seasonRatingLiveResultClass.getClassStart()) / (seasonRatingLiveResultClass.getClassEnd() - seasonRatingLiveResultClass.getClassStart())) * 100.0f);
            int end = (int) (((seasonRatingLiveResultClass.getEnd() - seasonRatingLiveResultClass.getClassStart()) / (seasonRatingLiveResultClass.getClassEnd() - seasonRatingLiveResultClass.getClassStart())) * 100.0f);
            int start2 = seasonRatingLiveResultClass.getStart() - seasonRatingLiveResultClass.getClassStart();
            int end2 = seasonRatingLiveResultClass.getEnd() - seasonRatingLiveResultClass.getClassStart();
            int end3 = seasonRatingLiveResultClass.getEnd();
            int classEnd = seasonRatingLiveResultClass.getClassEnd() - seasonRatingLiveResultClass.getClassStart();
            df.c a10 = aVar.a(seasonRatingLiveResultClass.getClassId());
            SpannableString spannableString = new SpannableString(context.getString(i.text_classup_title, m10.name()));
            String string = context.getString(i.text_classup_title_highlight, m10.name());
            p.g(string, "context.getString(R.stri…easonRatingNextRank.name)");
            spannableString.setSpan(new ForegroundColorSpan(c3.a.d(context, m10.p())), o.U(spannableString, string, 0, false, 6, null), o.U(spannableString, string, 0, false, 6, null) + string.length(), 33);
            v vVar = v.f59242a;
            SpannableString spannableString2 = new SpannableString(context.getString(i.text_classup_how_to_get_streaming_bonus));
            String string2 = context.getString(i.text_classup_how_to_get_streaming_bonus_highlight);
            p.g(string2, "context.getString(R.stri…treaming_bonus_highlight)");
            spannableString2.setSpan(new ForegroundColorSpan(c3.a.d(context, nc.b.f41795l)), o.U(spannableString2, string2, 0, false, 6, null), o.U(spannableString2, string2, 0, false, 6, null) + string2.length(), 33);
            return new f(z10, start, end, start2, end2, end3, classEnd, a10, spannableString, spannableString2);
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17617a;

        static {
            int[] iArr = new int[df.c.values().length];
            iArr[df.c.S.ordinal()] = 1;
            iArr[df.c.A2.ordinal()] = 2;
            iArr[df.c.A1.ordinal()] = 3;
            iArr[df.c.B4.ordinal()] = 4;
            iArr[df.c.B3.ordinal()] = 5;
            iArr[df.c.B2.ordinal()] = 6;
            iArr[df.c.B1.ordinal()] = 7;
            iArr[df.c.C2.ordinal()] = 8;
            iArr[df.c.C1.ordinal()] = 9;
            iArr[df.c.D2.ordinal()] = 10;
            iArr[df.c.D1.ordinal()] = 11;
            f17617a = iArr;
        }
    }

    public f(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, df.c cVar, Spannable spannable, Spannable spannable2) {
        p.h(cVar, "rank");
        p.h(spannable, "currentRankText");
        p.h(spannable2, "howToGetStreamingBonusMessage");
        this.f17607a = z10;
        this.f17608b = i10;
        this.f17609c = i11;
        this.f17610d = i12;
        this.f17611e = i13;
        this.f17612f = i14;
        this.f17613g = i15;
        this.f17614h = cVar;
        this.f17615i = spannable;
        this.f17616j = spannable2;
    }

    public final Spannable a() {
        return this.f17615i;
    }

    public final int b() {
        return this.f17611e;
    }

    public final int c() {
        return this.f17609c;
    }

    public final Spannable d() {
        return this.f17616j;
    }

    public final int e() {
        return this.f17613g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f17607a == fVar.f17607a && this.f17608b == fVar.f17608b && this.f17609c == fVar.f17609c && this.f17610d == fVar.f17610d && this.f17611e == fVar.f17611e && this.f17612f == fVar.f17612f && this.f17613g == fVar.f17613g && this.f17614h == fVar.f17614h && p.c(this.f17615i, fVar.f17615i) && p.c(this.f17616j, fVar.f17616j);
        }
        return false;
    }

    public final df.c f() {
        return this.f17614h;
    }

    public final int g() {
        return this.f17610d;
    }

    public final int h() {
        return this.f17608b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    public int hashCode() {
        boolean z10 = this.f17607a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (((((((((((((((((r02 * 31) + Integer.hashCode(this.f17608b)) * 31) + Integer.hashCode(this.f17609c)) * 31) + Integer.hashCode(this.f17610d)) * 31) + Integer.hashCode(this.f17611e)) * 31) + Integer.hashCode(this.f17612f)) * 31) + Integer.hashCode(this.f17613g)) * 31) + this.f17614h.hashCode()) * 31) + this.f17615i.hashCode()) * 31) + this.f17616j.hashCode();
    }

    public final int i() {
        return this.f17612f;
    }

    public final boolean j() {
        return this.f17607a;
    }

    public final Integer k() {
        df.c m10 = this.f17614h.m();
        switch (m10 == null ? -1 : b.f17617a[m10.ordinal()]) {
            case 2:
                return Integer.valueOf(nc.d.season_rating_rank_up_reward_a2);
            case 3:
                return Integer.valueOf(nc.d.season_rating_rank_up_reward_a1);
            case 4:
                return Integer.valueOf(nc.d.season_rating_rank_up_reward_b4);
            case 5:
                return Integer.valueOf(nc.d.season_rating_rank_up_reward_b3);
            case 6:
                return Integer.valueOf(nc.d.season_rating_rank_up_reward_b2);
            case 7:
                return Integer.valueOf(nc.d.season_rating_rank_up_reward_b1);
            case 8:
                return Integer.valueOf(nc.d.season_rating_rank_up_reward_c2);
            case 9:
                return Integer.valueOf(nc.d.season_rating_rank_up_reward_c1);
            case 10:
                return Integer.valueOf(nc.d.season_rating_rank_up_reward_d2);
            case 11:
                return Integer.valueOf(nc.d.season_rating_rank_up_reward_d1);
            default:
                return null;
        }
    }

    public final Integer l() {
        df.c m10 = this.f17614h.m();
        switch (m10 == null ? -1 : b.f17617a[m10.ordinal()]) {
            case 1:
                return Integer.valueOf(nc.d.season_rating_result_item_bg_s);
            case 2:
            case 3:
                return Integer.valueOf(nc.d.season_rating_result_item_bg_a);
            case 4:
            case 5:
            case 6:
            case 7:
                return Integer.valueOf(nc.d.season_rating_result_item_bg_b);
            case 8:
            case 9:
                return Integer.valueOf(nc.d.season_rating_result_item_bg_c);
            case 10:
            case 11:
                return Integer.valueOf(nc.d.season_rating_result_item_bg_d);
            default:
                return null;
        }
    }

    public String toString() {
        return "SeasonRatingLiveResultClassBindModel(isLast=" + this.f17607a + ", startProgress=" + this.f17608b + ", endProgress=" + this.f17609c + ", startExp=" + this.f17610d + ", endExp=" + this.f17611e + ", totalEndExp=" + this.f17612f + ", limitExp=" + this.f17613g + ", rank=" + this.f17614h + ", currentRankText=" + ((Object) this.f17615i) + ", howToGetStreamingBonusMessage=" + ((Object) this.f17616j) + ')';
    }
}
