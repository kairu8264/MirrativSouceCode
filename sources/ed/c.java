package ed;

import ad.l2;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import jo.h;
import jo.p;
import nc.i;
import so.o;
import wn.k;
import wn.q;
import xn.r;
import xn.s;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f30537f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f30538g = 8;

    /* renamed from: a  reason: collision with root package name */
    public final int f30539a;

    /* renamed from: b  reason: collision with root package name */
    public final l2 f30540b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30541c;

    /* renamed from: d  reason: collision with root package name */
    public final Spannable f30542d;

    /* renamed from: e  reason: collision with root package name */
    public final Spannable f30543e;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(Context context, ub.c cVar) {
            p.h(context, "context");
            p.h(cVar, "rankingPrizeData");
            l2 a10 = l2.Companion.a(cVar.e());
            int d10 = cVar.d();
            String a11 = cVar.a();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String string = context.getString(i.text_contract_your_rank, context.getString(a10.w()));
            p.g(string, "context.getString(R.stri…tring(rankingGrade.text))");
            spannableStringBuilder.append((CharSequence) context.getString(i.text_monthly_rankin_message_1, string));
            for (k kVar : r.d(q.a(string, Integer.valueOf(c3.a.d(context, a10.c()))))) {
                String str = (String) kVar.a();
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(((Number) kVar.b()).intValue());
                String spannableStringBuilder2 = spannableStringBuilder.toString();
                p.g(spannableStringBuilder2, "spannableStringBuilder.toString()");
                int U = o.U(spannableStringBuilder2, str, 0, false, 6, null);
                String spannableStringBuilder3 = spannableStringBuilder.toString();
                p.g(spannableStringBuilder3, "spannableStringBuilder.toString()");
                spannableStringBuilder.setSpan(foregroundColorSpan, U, o.U(spannableStringBuilder3, str, 0, false, 6, null) + str.length(), 33);
            }
            SpannableString spannableString = new SpannableString(spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            String string2 = context.getString(i.text_monthly_rankin_message_highlight_1, String.valueOf(cVar.b()));
            p.g(string2, "context.getString(\n     …g()\n                    )");
            String string3 = context.getString(i.text_monthly_rankin_message_highlight_2, String.valueOf(cVar.c()));
            p.g(string3, "context.getString(\n     …g()\n                    )");
            spannableStringBuilder4.append((CharSequence) context.getString(i.text_monthly_rankin_message_2, String.valueOf(cVar.b()), String.valueOf(cVar.c())));
            for (k kVar2 : s.m(q.a(string2, Integer.valueOf(c3.a.d(context, nc.b.f41798r))), q.a(string3, Integer.valueOf(c3.a.d(context, nc.b.emomo_flag_previous_season_result_dialog_title_text_color))))) {
                String str2 = (String) kVar2.a();
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(((Number) kVar2.b()).intValue());
                String spannableStringBuilder5 = spannableStringBuilder4.toString();
                p.g(spannableStringBuilder5, "spannableStringBuilder.toString()");
                int U2 = o.U(spannableStringBuilder5, str2, 0, false, 6, null);
                String spannableStringBuilder6 = spannableStringBuilder4.toString();
                p.g(spannableStringBuilder6, "spannableStringBuilder.toString()");
                spannableStringBuilder4.setSpan(foregroundColorSpan2, U2, o.U(spannableStringBuilder6, str2, 0, false, 6, null) + str2.length(), 33);
            }
            return new c(d10, a10, a11, spannableString, new SpannableString(spannableStringBuilder4));
        }
    }

    public c(int i10, l2 l2Var, String str, Spannable spannable, Spannable spannable2) {
        p.h(l2Var, "grade");
        p.h(spannable, "rankingPrizeMessage1Span");
        p.h(spannable2, "rankingPrizeMessage2Span");
        this.f30539a = i10;
        this.f30540b = l2Var;
        this.f30541c = str;
        this.f30542d = spannable;
        this.f30543e = spannable2;
    }

    public final String a() {
        return this.f30541c;
    }

    public final l2 b() {
        return this.f30540b;
    }

    public final int c() {
        return this.f30539a;
    }

    public final Spannable d() {
        return this.f30542d;
    }

    public final Spannable e() {
        return this.f30543e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f30539a == cVar.f30539a && this.f30540b == cVar.f30540b && p.c(this.f30541c, cVar.f30541c) && p.c(this.f30542d, cVar.f30542d) && p.c(this.f30543e, cVar.f30543e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f30539a) * 31) + this.f30540b.hashCode()) * 31;
        String str = this.f30541c;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f30542d.hashCode()) * 31) + this.f30543e.hashCode();
    }

    public String toString() {
        return "RankingPrizeDialogBindModel(rank=" + this.f30539a + ", grade=" + this.f30540b + ", avatarBodyImageUrl=" + this.f30541c + ", rankingPrizeMessage1Span=" + ((Object) this.f30542d) + ", rankingPrizeMessage2Span=" + ((Object) this.f30543e) + ')';
    }
}
