package bd;

import ad.g2;
import ad.l2;
import ad.s1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.PaidCoinChangeRate;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import jo.h;
import jo.p;
import nc.i;
import so.o;
import wn.k;
import wn.l;
import wn.m;
import wn.q;
import xn.r;
import xn.s;

/* loaded from: classes2.dex */
public final class c implements Serializable {
    public static final a P = new a(null);
    public static final int Q = 8;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final Date E;
    public final Date F;
    public final Date G;
    public final Date H;
    public final Date I;
    public final String J;
    public final int K;
    public final String L;
    public final boolean M;
    public final boolean N;
    public final int O;

    /* renamed from: w  reason: collision with root package name */
    public final l2 f17557w;

    /* renamed from: x  reason: collision with root package name */
    public final int f17558x;

    /* renamed from: y  reason: collision with root package name */
    public final Date f17559y;

    /* renamed from: z  reason: collision with root package name */
    public final Date f17560z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(ContractSummaryResponse contractSummaryResponse) {
            l2 l2Var;
            Object obj;
            Object a10;
            Object a11;
            Object a12;
            Object a13;
            Object a14;
            Object a15;
            Object a16;
            boolean z10;
            p.h(contractSummaryResponse, "summaryResponse");
            l2[] values = l2.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    l2Var = null;
                    break;
                }
                l2Var = values[i10];
                if (contractSummaryResponse.getContractGrade() == l2Var.e()) {
                    break;
                }
                i10++;
            }
            if (l2Var == null) {
                l2Var = l2.NOT_RANK;
            }
            l2 l2Var2 = l2Var;
            Iterator<T> it = contractSummaryResponse.getPaidCoinChangeRates().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((PaidCoinChangeRate) obj).getGrade() == l2Var2.e()) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            PaidCoinChangeRate paidCoinChangeRate = (PaidCoinChangeRate) obj;
            int rankingRank = contractSummaryResponse.getRankingRank();
            try {
                l.a aVar = l.f59224w;
                a10 = l.a(b().parse(String.valueOf(contractSummaryResponse.getContractMonthStartDate())));
            } catch (Throwable th2) {
                l.a aVar2 = l.f59224w;
                a10 = l.a(m.a(th2));
            }
            if (l.c(a10)) {
                a10 = null;
            }
            Date date = (Date) a10;
            try {
                l.a aVar3 = l.f59224w;
                a11 = l.a(b().parse(String.valueOf(contractSummaryResponse.getContractMonthEndDate())));
            } catch (Throwable th3) {
                l.a aVar4 = l.f59224w;
                a11 = l.a(m.a(th3));
            }
            if (l.c(a11)) {
                a11 = null;
            }
            Date date2 = (Date) a11;
            int cashRate = paidCoinChangeRate != null ? (paidCoinChangeRate.getCashRate() * 1000) / 100 : 0;
            int cashRate2 = paidCoinChangeRate != null ? paidCoinChangeRate.getCashRate() : 0;
            int coinRate = paidCoinChangeRate != null ? paidCoinChangeRate.getCoinRate() : 0;
            int coinRate2 = paidCoinChangeRate != null ? (paidCoinChangeRate.getCoinRate() * 1000) / 100 : 0;
            try {
                l.a aVar5 = l.f59224w;
                a12 = l.a(b().parse(String.valueOf(contractSummaryResponse.getContractMonthEndDate())));
            } catch (Throwable th4) {
                l.a aVar6 = l.f59224w;
                a12 = l.a(m.a(th4));
            }
            if (l.c(a12)) {
                a12 = null;
            }
            Date date3 = (Date) a12;
            try {
                l.a aVar7 = l.f59224w;
                a13 = l.a(b().parse(String.valueOf(contractSummaryResponse.getContractAcceptEndDate())));
            } catch (Throwable th5) {
                l.a aVar8 = l.f59224w;
                a13 = l.a(m.a(th5));
            }
            if (l.c(a13)) {
                a13 = null;
            }
            Date date4 = (Date) a13;
            try {
                l.a aVar9 = l.f59224w;
                a14 = l.a(b().parse(String.valueOf(contractSummaryResponse.getContractAcceptStartDate())));
            } catch (Throwable th6) {
                l.a aVar10 = l.f59224w;
                a14 = l.a(m.a(th6));
            }
            if (l.c(a14)) {
                a14 = null;
            }
            Date date5 = (Date) a14;
            try {
                l.a aVar11 = l.f59224w;
                a15 = l.a(b().parse(String.valueOf(contractSummaryResponse.getContractMonthStartDate())));
            } catch (Throwable th7) {
                l.a aVar12 = l.f59224w;
                a15 = l.a(m.a(th7));
            }
            if (l.c(a15)) {
                a15 = null;
            }
            Date date6 = (Date) a15;
            try {
                l.a aVar13 = l.f59224w;
                a16 = l.a(b().parse(String.valueOf(contractSummaryResponse.getContractMonthPayDate())));
            } catch (Throwable th8) {
                l.a aVar14 = l.f59224w;
                a16 = l.a(m.a(th8));
            }
            return new c(l2Var2, rankingRank, date, date2, cashRate, cashRate2, coinRate2, coinRate, date5, date4, date6, date3, l.c(a16) ? null : a16, contractSummaryResponse.getHowToPageUrl(), contractSummaryResponse.getFreeCoinChangeRate(), contractSummaryResponse.getMainImageUrl(), contractSummaryResponse.isHandoverCodeRequired(), contractSummaryResponse.getContractStatus() == s1.NOT_COMPLETE.c() && contractSummaryResponse.getKycStatus() == g2.CONFIRMED.c(), contractSummaryResponse.getContractMonth());
        }

        @SuppressLint({"SimpleDateFormat"})
        public final SimpleDateFormat b() {
            return new SimpleDateFormat("yyyyMMdd");
        }
    }

    public c(l2 l2Var, int i10, Date date, Date date2, int i11, int i12, int i13, int i14, Date date3, Date date4, Date date5, Date date6, Date date7, String str, int i15, String str2, boolean z10, boolean z11, int i16) {
        p.h(l2Var, "grade");
        p.h(str, "detailUrl");
        p.h(str2, "mainImageUrl");
        this.f17557w = l2Var;
        this.f17558x = i10;
        this.f17559y = date;
        this.f17560z = date2;
        this.A = i11;
        this.B = i12;
        this.C = i13;
        this.D = i14;
        this.E = date3;
        this.F = date4;
        this.G = date5;
        this.H = date6;
        this.I = date7;
        this.J = str;
        this.K = i15;
        this.L = str2;
        this.M = z10;
        this.N = z11;
        this.O = i16;
    }

    public final Spannable a(Context context) {
        p.h(context, "context");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) context.getString(i.text_contract_can_receive_coin_message, String.valueOf(this.K)));
        for (k kVar : r.d(q.a(context.getString(i.text_contract_can_receive_coin_message_highlight, String.valueOf(this.K)), Integer.valueOf(c3.a.d(context, nc.b.f41804x))))) {
            String str = (String) kVar.a();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(((Number) kVar.b()).intValue());
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            p.g(spannableStringBuilder2, "builder.toString()");
            p.g(str, "text");
            int U = o.U(spannableStringBuilder2, str, 0, false, 6, null);
            String spannableStringBuilder3 = spannableStringBuilder.toString();
            p.g(spannableStringBuilder3, "builder.toString()");
            spannableStringBuilder.setSpan(foregroundColorSpan, U, o.U(spannableStringBuilder3, str, 0, false, 6, null) + str.length(), 33);
            StyleSpan styleSpan = new StyleSpan(1);
            String spannableStringBuilder4 = spannableStringBuilder.toString();
            p.g(spannableStringBuilder4, "builder.toString()");
            int U2 = o.U(spannableStringBuilder4, str, 0, false, 6, null);
            String spannableStringBuilder5 = spannableStringBuilder.toString();
            p.g(spannableStringBuilder5, "builder.toString()");
            spannableStringBuilder.setSpan(styleSpan, U2, o.U(spannableStringBuilder5, str, 0, false, 6, null) + str.length(), 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final Spannable b(Context context) {
        p.h(context, "context");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) context.getString(i.text_contract_can_receive_cash, String.valueOf(this.B), String.valueOf(this.A)));
        String string = context.getString(i.text_contract_can_receive_cash_highlight_1, String.valueOf(this.B));
        int i10 = nc.b.f41798r;
        for (k kVar : s.m(q.a(string, Integer.valueOf(c3.a.d(context, i10))), q.a(context.getString(i.text_contract_can_receive_cash_highlight_2, String.valueOf(this.A)), Integer.valueOf(c3.a.d(context, i10))), q.a(context.getString(i.text_contract_can_receive_cash_highlight_3), Integer.valueOf(c3.a.d(context, i10))))) {
            String str = (String) kVar.a();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(((Number) kVar.b()).intValue());
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            p.g(spannableStringBuilder2, "builder.toString()");
            p.g(str, "text");
            int U = o.U(spannableStringBuilder2, str, 0, false, 6, null);
            String spannableStringBuilder3 = spannableStringBuilder.toString();
            p.g(spannableStringBuilder3, "builder.toString()");
            spannableStringBuilder.setSpan(foregroundColorSpan, U, o.U(spannableStringBuilder3, str, 0, false, 6, null) + str.length(), 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final Spannable c(Context context) {
        p.h(context, "context");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) context.getString(i.text_contract_can_receive_coin, String.valueOf(this.D), String.valueOf(this.C)));
        String string = context.getString(i.text_contract_can_receive_coin_highlight_1, String.valueOf(this.D));
        int i10 = nc.b.emomo_flag_previous_season_result_dialog_title_text_color;
        for (k kVar : s.m(q.a(string, Integer.valueOf(c3.a.d(context, i10))), q.a(context.getString(i.text_contract_can_receive_coin_highlight_2, String.valueOf(this.C)), Integer.valueOf(c3.a.d(context, i10))))) {
            String str = (String) kVar.a();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(((Number) kVar.b()).intValue());
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            p.g(spannableStringBuilder2, "builder.toString()");
            p.g(str, "text");
            int U = o.U(spannableStringBuilder2, str, 0, false, 6, null);
            String spannableStringBuilder3 = spannableStringBuilder.toString();
            p.g(spannableStringBuilder3, "builder.toString()");
            spannableStringBuilder.setSpan(foregroundColorSpan, U, o.U(spannableStringBuilder3, str, 0, false, 6, null) + str.length(), 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final String d(Context context) {
        Date date;
        String str;
        p.h(context, "context");
        if (this.H != null) {
            str = ' ' + context.getString(i.text_contract_period_switch_end_time, h().format(date));
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    public final String e(Context context) {
        Date date;
        String str;
        p.h(context, "context");
        if (this.F != null) {
            str = ' ' + context.getString(i.text_contract_period_switch_end_time, h().format(date));
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f17557w == cVar.f17557w && this.f17558x == cVar.f17558x && p.c(this.f17559y, cVar.f17559y) && p.c(this.f17560z, cVar.f17560z) && this.A == cVar.A && this.B == cVar.B && this.C == cVar.C && this.D == cVar.D && p.c(this.E, cVar.E) && p.c(this.F, cVar.F) && p.c(this.G, cVar.G) && p.c(this.H, cVar.H) && p.c(this.I, cVar.I) && p.c(this.J, cVar.J) && this.K == cVar.K && p.c(this.L, cVar.L) && this.M == cVar.M && this.N == cVar.N && this.O == cVar.O;
        }
        return false;
    }

    public final String f(Context context) {
        Date date;
        String str;
        p.h(context, "context");
        if (this.E != null) {
            str = h().format(date) + ' ' + context.getString(i.text_contract_period_hour_minutes) + ' ';
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    public final String g(Context context) {
        Date date;
        String str;
        p.h(context, "context");
        if (this.G != null) {
            str = h().format(date) + ' ' + context.getString(i.text_contract_period_hour_minutes) + ' ';
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    @SuppressLint({"SimpleDateFormat"})
    public final SimpleDateFormat h() {
        return new SimpleDateFormat("yyyy/M/d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f17557w.hashCode() * 31) + Integer.hashCode(this.f17558x)) * 31;
        Date date = this.f17559y;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f17560z;
        int hashCode3 = (((((((((hashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31) + Integer.hashCode(this.A)) * 31) + Integer.hashCode(this.B)) * 31) + Integer.hashCode(this.C)) * 31) + Integer.hashCode(this.D)) * 31;
        Date date3 = this.E;
        int hashCode4 = (hashCode3 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.F;
        int hashCode5 = (hashCode4 + (date4 == null ? 0 : date4.hashCode())) * 31;
        Date date5 = this.G;
        int hashCode6 = (hashCode5 + (date5 == null ? 0 : date5.hashCode())) * 31;
        Date date6 = this.H;
        int hashCode7 = (hashCode6 + (date6 == null ? 0 : date6.hashCode())) * 31;
        Date date7 = this.I;
        int hashCode8 = (((((((hashCode7 + (date7 != null ? date7.hashCode() : 0)) * 31) + this.J.hashCode()) * 31) + Integer.hashCode(this.K)) * 31) + this.L.hashCode()) * 31;
        boolean z10 = this.M;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode8 + i10) * 31;
        boolean z11 = this.N;
        return ((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Integer.hashCode(this.O);
    }

    public final int i() {
        return this.B;
    }

    public final int j() {
        return this.D;
    }

    public final String k() {
        return this.J;
    }

    public final l2 l() {
        return this.f17557w;
    }

    public final String m() {
        return this.L;
    }

    @SuppressLint({"SimpleDateFormat"})
    public final String n(Context context) {
        Date date;
        String str;
        p.h(context, "context");
        if (this.f17560z != null) {
            str = ' ' + context.getString(i.text_contract_period_switch_end_time, new SimpleDateFormat("M/d").format(date));
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    public final String o(Context context) {
        Date date;
        String str;
        p.h(context, "context");
        if (this.f17559y != null) {
            str = h().format(date) + ' ' + context.getString(i.text_contract_period_hour_minutes) + ' ';
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    public final boolean p() {
        return this.M;
    }

    public final String q() {
        Date date = this.I;
        String format = date != null ? h().format(date) : null;
        return format == null ? "" : format;
    }

    public final Spannable r(Context context) {
        p.h(context, "context");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) context.getString(i.text_contract_monthly_passbook_prize_example_message));
        for (String str : r.d(context.getString(i.text_contract_monthly_passbook_prize_example_message_bold))) {
            StyleSpan styleSpan = new StyleSpan(1);
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            p.g(spannableStringBuilder2, "builder.toString()");
            p.g(str, "text");
            int U = o.U(spannableStringBuilder2, str, 0, false, 6, null);
            String spannableStringBuilder3 = spannableStringBuilder.toString();
            p.g(spannableStringBuilder3, "builder.toString()");
            spannableStringBuilder.setSpan(styleSpan, U, o.U(spannableStringBuilder3, str, 0, false, 6, null) + str.length(), 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public String toString() {
        return "ContractDetailBindModel(grade=" + this.f17557w + ", ranking=" + this.f17558x + ", gradeStartDate=" + this.f17559y + ", gradeEndDate=" + this.f17560z + ", cashYouCanReceive=" + this.A + ", cashRate=" + this.B + ", coinYouCanReceive=" + this.C + ", coinRate=" + this.D + ", contractPeriodStartDate=" + this.E + ", contractPeriodEndDate=" + this.F + ", contractStartDate=" + this.G + ", contractEndDate=" + this.H + ", paymentStartDate=" + this.I + ", detailUrl=" + this.J + ", freeCoinChangeRate=" + this.K + ", mainImageUrl=" + this.L + ", isHandOverCodeRequired=" + this.M + ", isNotFirstContract=" + this.N + ", contractMonth=" + this.O + ')';
    }
}
