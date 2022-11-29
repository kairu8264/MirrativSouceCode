package id;

import ad.l2;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryGift;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryPaymentType;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import jo.h;
import jo.p;
import nc.i;
import wn.l;
import wn.m;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: u  reason: collision with root package name */
    public static final a f36767u = new a(null);

    /* renamed from: v  reason: collision with root package name */
    public static final int f36768v = 8;

    /* renamed from: a  reason: collision with root package name */
    public final Date f36769a;

    /* renamed from: b  reason: collision with root package name */
    public final String f36770b;

    /* renamed from: c  reason: collision with root package name */
    public final String f36771c;

    /* renamed from: d  reason: collision with root package name */
    public final String f36772d;

    /* renamed from: e  reason: collision with root package name */
    public final String f36773e;

    /* renamed from: f  reason: collision with root package name */
    public final int f36774f;

    /* renamed from: g  reason: collision with root package name */
    public final String f36775g;

    /* renamed from: h  reason: collision with root package name */
    public final String f36776h;

    /* renamed from: i  reason: collision with root package name */
    public final String f36777i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f36778j;

    /* renamed from: k  reason: collision with root package name */
    public final String f36779k;

    /* renamed from: l  reason: collision with root package name */
    public final String f36780l;

    /* renamed from: m  reason: collision with root package name */
    public final Integer f36781m;

    /* renamed from: n  reason: collision with root package name */
    public final String f36782n;

    /* renamed from: o  reason: collision with root package name */
    public final String f36783o;

    /* renamed from: p  reason: collision with root package name */
    public final ContractSummaryPaymentType f36784p;

    /* renamed from: q  reason: collision with root package name */
    public final String f36785q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f36786r;

    /* renamed from: s  reason: collision with root package name */
    public final String f36787s;

    /* renamed from: t  reason: collision with root package name */
    public final String f36788t;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v1 */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v5 */
        @SuppressLint({"SimpleDateFormat"})
        public final e a(SimpleDateFormat simpleDateFormat, ContractSummaryResponse contractSummaryResponse, Resources resources) {
            Object a10;
            Object a11;
            Object a12;
            String str;
            String string;
            String str2;
            String str3;
            String str4;
            ?? r10;
            String str5;
            String string2;
            String string3;
            p.h(simpleDateFormat, "dateFormat");
            p.h(contractSummaryResponse, "summary");
            p.h(resources, "resources");
            df.c a13 = df.c.Companion.a(contractSummaryResponse.getBroadcastFee().getClassId());
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMM");
            try {
                l.a aVar = l.f59224w;
                a10 = l.a(simpleDateFormat.parse(String.valueOf(contractSummaryResponse.getCurrentMonthEndDate())));
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
                a11 = l.a(simpleDateFormat.parse(String.valueOf(contractSummaryResponse.getCurrentMonthPayDate())));
            } catch (Throwable th3) {
                l.a aVar4 = l.f59224w;
                a11 = l.a(m.a(th3));
            }
            if (l.c(a11)) {
                a11 = null;
            }
            Date date2 = (Date) a11;
            try {
                l.a aVar5 = l.f59224w;
                a12 = l.a(simpleDateFormat2.parse(String.valueOf(contractSummaryResponse.getCurrentMonth())));
            } catch (Throwable th4) {
                l.a aVar6 = l.f59224w;
                a12 = l.a(m.a(th4));
            }
            if (l.c(a12)) {
                a12 = null;
            }
            Date date3 = (Date) a12;
            String string4 = resources.getString(i.text_unit_yen);
            p.g(string4, "resources.getString(R.string.text_unit_yen)");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string4);
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(contractSummaryResponse.getTotalCash())}, 1));
            p.g(format, "format(this, *args)");
            sb2.append(format);
            String sb3 = sb2.toString();
            String format2 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(contractSummaryResponse.getTax())}, 1));
            p.g(format2, "format(this, *args)");
            if (contractSummaryResponse.getTax() == 0) {
                str = (char) 65509 + format2;
            } else {
                str = "- ￥" + format2;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(string4);
            String format3 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(contractSummaryResponse.getCash())}, 1));
            p.g(format3, "format(this, *args)");
            sb4.append(format3);
            String sb5 = sb4.toString();
            String format4 = date2 != null ? new SimpleDateFormat("yyyy/M/d").format(date2) : null;
            if (format4 == null) {
                format4 = "";
            }
            int h10 = a13.h();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(string4);
            String format5 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(contractSummaryResponse.getBroadcastFee().getCash())}, 1));
            p.g(format5, "format(this, *args)");
            sb6.append(format5);
            String sb7 = sb6.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(string4);
            if (a13.l()) {
                string = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(contractSummaryResponse.getBroadcastFee().getCashUnit())}, 1));
                p.g(string, "format(this, *args)");
            } else {
                string = resources.getString(i.text_cash_bonus_history_no_amount_displayed);
                p.g(string, "resources.getString(R.st…tory_no_amount_displayed)");
            }
            sb8.append(string);
            String sb9 = sb8.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(string4);
            if (a13.l()) {
                str2 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(contractSummaryResponse.getBroadcastFee().getMonthlyCashLimit())}, 1));
                p.g(str2, "format(this, *args)");
            } else {
                String string5 = resources.getString(i.text_cash_bonus_history_no_amount_displayed);
                p.g(string5, "resources.getString(R.st…tory_no_amount_displayed)");
                str2 = string5;
            }
            sb10.append(str2);
            String sb11 = sb10.toString();
            boolean z10 = contractSummaryResponse.getGift() != null;
            ContractSummaryGift gift = contractSummaryResponse.getGift();
            if (gift != null) {
                int cash = gift.getCash();
                StringBuilder sb12 = new StringBuilder();
                sb12.append(string4);
                String format6 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(cash)}, 1));
                p.g(format6, "format(this, *args)");
                sb12.append(format6);
                str3 = sb12.toString();
            } else {
                str3 = null;
            }
            String format7 = date != null ? new SimpleDateFormat("M/d").format(date) : null;
            if (format7 == null) {
                format7 = "";
            }
            Integer h11 = l2.Companion.a(contractSummaryResponse.getCurrentGrade()).h();
            String string6 = resources.getString(i.text_contract_rate_unit, String.valueOf(contractSummaryResponse.getCurrentCashRate()));
            if (date3 != null) {
                str4 = "";
                r10 = 0;
                str5 = resources.getString(contractSummaryResponse.getCurrentPaymentType() == ContractSummaryPaymentType.CASH ? i.text_cash_bonus_history_current_month_amount_cash : i.text_cash_bonus_history_current_month_amount_coin, new SimpleDateFormat("M").format(date3));
            } else {
                str4 = "";
                r10 = 0;
                str5 = null;
            }
            if (str5 != null) {
                str4 = str5;
            }
            ContractSummaryPaymentType currentPaymentType = contractSummaryResponse.getCurrentPaymentType();
            Object[] objArr = new Object[1];
            objArr[r10] = Integer.valueOf(contractSummaryResponse.getCoinFromCash());
            String format8 = String.format("%,d", Arrays.copyOf(objArr, 1));
            p.g(format8, "format(this, *args)");
            ContractSummaryPaymentType currentPaymentType2 = contractSummaryResponse.getCurrentPaymentType();
            ContractSummaryPaymentType contractSummaryPaymentType = ContractSummaryPaymentType.CASH;
            boolean z11 = (currentPaymentType2 != contractSummaryPaymentType || 1000 <= contractSummaryResponse.getCash()) ? r10 : true;
            if (contractSummaryResponse.getCurrentPaymentType() == contractSummaryPaymentType) {
                string2 = resources.getString(i.text_cash_bonus_history_expected_payment_amount_cash);
            } else {
                string2 = resources.getString(i.text_cash_bonus_history_expected_payment_amount_coin);
            }
            String str6 = string2;
            p.g(str6, "if (summary.currentPayme…t_coin)\n                }");
            if (contractSummaryResponse.getCurrentPaymentType() == contractSummaryPaymentType) {
                string3 = resources.getString(i.text_cash_bonus_history_annotation_cash);
            } else {
                string3 = resources.getString(i.text_cash_bonus_history_annotation_coin);
            }
            p.g(string3, "if (summary.currentPayme…n_coin)\n                }");
            return new e(date3, sb3, str, sb5, format4, h10, sb7, sb9, sb11, z10, str3, format7, h11, string6, str4, currentPaymentType, format8, z11, str6, string3);
        }
    }

    public e(Date date, String str, String str2, String str3, String str4, int i10, String str5, String str6, String str7, boolean z10, String str8, String str9, Integer num, String str10, String str11, ContractSummaryPaymentType contractSummaryPaymentType, String str12, boolean z11, String str13, String str14) {
        p.h(str, "reward");
        p.h(str2, "tax");
        p.h(str3, "payment");
        p.h(str4, "paymentStartDateText");
        p.h(str5, "broadCastFeeCashText");
        p.h(str6, "broadCastFeeCashUnitText");
        p.h(str7, "broadCastFeeMonthlyCashLimitText");
        p.h(str11, "currentMonthTitleText");
        p.h(contractSummaryPaymentType, "currentPaymentType");
        p.h(str12, "coinFromCashText");
        p.h(str13, "paymentAmountTitle");
        p.h(str14, "paymentTypeAnnotationText");
        this.f36769a = date;
        this.f36770b = str;
        this.f36771c = str2;
        this.f36772d = str3;
        this.f36773e = str4;
        this.f36774f = i10;
        this.f36775g = str5;
        this.f36776h = str6;
        this.f36777i = str7;
        this.f36778j = z10;
        this.f36779k = str8;
        this.f36780l = str9;
        this.f36781m = num;
        this.f36782n = str10;
        this.f36783o = str11;
        this.f36784p = contractSummaryPaymentType;
        this.f36785q = str12;
        this.f36786r = z11;
        this.f36787s = str13;
        this.f36788t = str14;
    }

    public final String a() {
        return this.f36775g;
    }

    public final String b() {
        return this.f36776h;
    }

    public final String c() {
        return this.f36777i;
    }

    public final String d() {
        return this.f36785q;
    }

    public final String e() {
        return this.f36782n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return p.c(this.f36769a, eVar.f36769a) && p.c(this.f36770b, eVar.f36770b) && p.c(this.f36771c, eVar.f36771c) && p.c(this.f36772d, eVar.f36772d) && p.c(this.f36773e, eVar.f36773e) && this.f36774f == eVar.f36774f && p.c(this.f36775g, eVar.f36775g) && p.c(this.f36776h, eVar.f36776h) && p.c(this.f36777i, eVar.f36777i) && this.f36778j == eVar.f36778j && p.c(this.f36779k, eVar.f36779k) && p.c(this.f36780l, eVar.f36780l) && p.c(this.f36781m, eVar.f36781m) && p.c(this.f36782n, eVar.f36782n) && p.c(this.f36783o, eVar.f36783o) && this.f36784p == eVar.f36784p && p.c(this.f36785q, eVar.f36785q) && this.f36786r == eVar.f36786r && p.c(this.f36787s, eVar.f36787s) && p.c(this.f36788t, eVar.f36788t);
        }
        return false;
    }

    public final String f() {
        return this.f36780l;
    }

    public final String g() {
        return this.f36783o;
    }

    public final ContractSummaryPaymentType h() {
        return this.f36784p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Date date = this.f36769a;
        int hashCode = (((((((((((((((((date == null ? 0 : date.hashCode()) * 31) + this.f36770b.hashCode()) * 31) + this.f36771c.hashCode()) * 31) + this.f36772d.hashCode()) * 31) + this.f36773e.hashCode()) * 31) + Integer.hashCode(this.f36774f)) * 31) + this.f36775g.hashCode()) * 31) + this.f36776h.hashCode()) * 31) + this.f36777i.hashCode()) * 31;
        boolean z10 = this.f36778j;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        String str = this.f36779k;
        int hashCode2 = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f36780l;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f36781m;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f36782n;
        int hashCode5 = (((((((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f36783o.hashCode()) * 31) + this.f36784p.hashCode()) * 31) + this.f36785q.hashCode()) * 31;
        boolean z11 = this.f36786r;
        return ((((hashCode5 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.f36787s.hashCode()) * 31) + this.f36788t.hashCode();
    }

    public final String i() {
        return this.f36779k;
    }

    public final String j() {
        return this.f36772d;
    }

    public final String k() {
        return this.f36787s;
    }

    public final String l() {
        return this.f36773e;
    }

    public final Integer m() {
        return this.f36781m;
    }

    public final int n() {
        return this.f36774f;
    }

    public final String o() {
        return this.f36771c;
    }

    public final boolean p() {
        return this.f36778j;
    }

    public final boolean q() {
        return this.f36786r;
    }

    public String toString() {
        return "ContractMemberPassBookRewardBindModel(currentMonth=" + this.f36769a + ", reward=" + this.f36770b + ", tax=" + this.f36771c + ", payment=" + this.f36772d + ", paymentStartDateText=" + this.f36773e + ", seasonRatingImage=" + this.f36774f + ", broadCastFeeCashText=" + this.f36775g + ", broadCastFeeCashUnitText=" + this.f36776h + ", broadCastFeeMonthlyCashLimitText=" + this.f36777i + ", isVisibleGiftView=" + this.f36778j + ", giftCashText=" + this.f36779k + ", currentMonthEndDateText=" + this.f36780l + ", rankingGradeImage=" + this.f36781m + ", currentCashRateText=" + this.f36782n + ", currentMonthTitleText=" + this.f36783o + ", currentPaymentType=" + this.f36784p + ", coinFromCashText=" + this.f36785q + ", isVisiblePayWithCoinMessage=" + this.f36786r + ", paymentAmountTitle=" + this.f36787s + ", paymentTypeAnnotationText=" + this.f36788t + ')';
    }
}
