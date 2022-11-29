package id;

import ad.l2;
import ad.s1;
import android.annotation.SuppressLint;
import android.content.Context;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.PaidCoinChangeRate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import jo.h;
import jo.p;
import nc.i;
import wn.l;
import wn.m;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: i  reason: collision with root package name */
    public static final a f36757i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f36758j = 8;

    /* renamed from: a  reason: collision with root package name */
    public final l2 f36759a;

    /* renamed from: b  reason: collision with root package name */
    public final Date f36760b;

    /* renamed from: c  reason: collision with root package name */
    public final Date f36761c;

    /* renamed from: d  reason: collision with root package name */
    public final String f36762d;

    /* renamed from: e  reason: collision with root package name */
    public final String f36763e;

    /* renamed from: f  reason: collision with root package name */
    public final String f36764f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f36765g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f36766h;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        @SuppressLint({"SimpleDateFormat"})
        public final d a(ContractSummaryResponse contractSummaryResponse) {
            Object a10;
            Object a11;
            Object obj;
            Object obj2;
            boolean z10;
            boolean z11;
            p.h(contractSummaryResponse, "summary");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            l2 a12 = l2.Companion.a(contractSummaryResponse.getCurrentGrade());
            try {
                l.a aVar = l.f59224w;
                a10 = l.a(simpleDateFormat.parse(String.valueOf(contractSummaryResponse.getCurrentMonthStartDate())));
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
                a11 = l.a(simpleDateFormat.parse(String.valueOf(contractSummaryResponse.getCurrentMonthEndDate())));
            } catch (Throwable th3) {
                l.a aVar4 = l.f59224w;
                a11 = l.a(m.a(th3));
            }
            if (l.c(a11)) {
                a11 = null;
            }
            Date date2 = (Date) a11;
            Iterator<T> it = contractSummaryResponse.getPaidCoinChangeRates().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((PaidCoinChangeRate) obj).getGrade() == a12.e()) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            }
            PaidCoinChangeRate paidCoinChangeRate = (PaidCoinChangeRate) obj;
            String num = paidCoinChangeRate != null ? Integer.valueOf(paidCoinChangeRate.getCashRate()).toString() : null;
            if (num == null) {
                num = "";
            }
            Iterator<T> it2 = contractSummaryResponse.getPaidCoinChangeRates().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((PaidCoinChangeRate) obj2).getGrade() == a12.e()) {
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
            PaidCoinChangeRate paidCoinChangeRate2 = (PaidCoinChangeRate) obj2;
            String num2 = paidCoinChangeRate2 != null ? Integer.valueOf(paidCoinChangeRate2.getCoinRate()).toString() : null;
            return new d(a12, date, date2, num, num2 == null ? "" : num2, String.valueOf(contractSummaryResponse.getFreeCoinChangeRate()), true, contractSummaryResponse.getCurrentContractStatus() == s1.COMPLETE.c());
        }

        @SuppressLint({"SimpleDateFormat"})
        public final d b(ContractSummaryResponse contractSummaryResponse) {
            Object a10;
            Object a11;
            Object obj;
            boolean z10;
            p.h(contractSummaryResponse, "summary");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            l2 a12 = l2.Companion.a(contractSummaryResponse.getCurrentGrade());
            try {
                l.a aVar = l.f59224w;
                a10 = l.a(simpleDateFormat.parse(String.valueOf(contractSummaryResponse.getCurrentMonthStartDate())));
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
                a11 = l.a(simpleDateFormat.parse(String.valueOf(contractSummaryResponse.getCurrentMonthEndDate())));
            } catch (Throwable th3) {
                l.a aVar4 = l.f59224w;
                a11 = l.a(m.a(th3));
            }
            if (l.c(a11)) {
                a11 = null;
            }
            Date date2 = (Date) a11;
            Iterator<T> it = contractSummaryResponse.getPaidCoinChangeRates().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((PaidCoinChangeRate) obj).getGrade() == a12.e()) {
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
            String num = paidCoinChangeRate != null ? Integer.valueOf(paidCoinChangeRate.getCashRate()).toString() : null;
            return new d(a12, date, date2, num == null ? "" : num, String.valueOf(contractSummaryResponse.getCurrentCoinRate()), String.valueOf(contractSummaryResponse.getFreeCoinChangeRate()), false, contractSummaryResponse.getCurrentContractStatus() == s1.COMPLETE.c());
        }
    }

    public d(l2 l2Var, Date date, Date date2, String str, String str2, String str3, boolean z10, boolean z11) {
        p.h(l2Var, "rankingGrade");
        p.h(str, "cashRate");
        p.h(str2, "coinRate");
        p.h(str3, "freeCoinChangeRate");
        this.f36759a = l2Var;
        this.f36760b = date;
        this.f36761c = date2;
        this.f36762d = str;
        this.f36763e = str2;
        this.f36764f = str3;
        this.f36765g = z10;
        this.f36766h = z11;
    }

    @SuppressLint({"SimpleDateFormat"})
    public final String a(Context context) {
        p.h(context, "context");
        Date date = this.f36761c;
        String string = date != null ? context.getString(i.text_contract_period_switch_end_time, new SimpleDateFormat("M/d").format(date)) : null;
        return string == null ? "" : string;
    }

    public final String b() {
        return this.f36762d;
    }

    public final String c() {
        return this.f36763e;
    }

    public final String d() {
        return this.f36764f;
    }

    public final l2 e() {
        return this.f36759a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f36759a == dVar.f36759a && p.c(this.f36760b, dVar.f36760b) && p.c(this.f36761c, dVar.f36761c) && p.c(this.f36762d, dVar.f36762d) && p.c(this.f36763e, dVar.f36763e) && p.c(this.f36764f, dVar.f36764f) && this.f36765g == dVar.f36765g && this.f36766h == dVar.f36766h;
        }
        return false;
    }

    public final boolean f() {
        return this.f36766h;
    }

    @SuppressLint({"SimpleDateFormat"})
    public final String g(Context context) {
        Date date;
        String str;
        p.h(context, "context");
        if (this.f36760b != null) {
            str = new SimpleDateFormat("yyyy/M/d").format(date) + ' ' + context.getString(i.text_contract_period_hour_minutes);
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f36759a.hashCode() * 31;
        Date date = this.f36760b;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f36761c;
        int hashCode3 = (((((((hashCode2 + (date2 != null ? date2.hashCode() : 0)) * 31) + this.f36762d.hashCode()) * 31) + this.f36763e.hashCode()) * 31) + this.f36764f.hashCode()) * 31;
        boolean z10 = this.f36765g;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode3 + i10) * 31;
        boolean z11 = this.f36766h;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "ContractMemberPassBookRankBindModel(rankingGrade=" + this.f36759a + ", startDate=" + this.f36760b + ", endDate=" + this.f36761c + ", cashRate=" + this.f36762d + ", coinRate=" + this.f36763e + ", freeCoinChangeRate=" + this.f36764f + ", isVisibleHourMinutesText=" + this.f36765g + ", isContract=" + this.f36766h + ')';
    }
}
