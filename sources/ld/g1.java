package ld;

import ad.g2;
import android.content.res.Resources;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryPaymentType;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;

/* loaded from: classes2.dex */
public final class g1 {

    /* renamed from: q  reason: collision with root package name */
    public static final a f39983q = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f39984a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f39985b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f39986c;

    /* renamed from: d  reason: collision with root package name */
    public final int f39987d;

    /* renamed from: e  reason: collision with root package name */
    public final int f39988e;

    /* renamed from: f  reason: collision with root package name */
    public final ub.a f39989f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f39990g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f39991h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f39992i;

    /* renamed from: j  reason: collision with root package name */
    public final String f39993j;

    /* renamed from: k  reason: collision with root package name */
    public final String f39994k;

    /* renamed from: l  reason: collision with root package name */
    public final cd.c0 f39995l;

    /* renamed from: m  reason: collision with root package name */
    public final cd.c0 f39996m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f39997n;

    /* renamed from: o  reason: collision with root package name */
    public final String f39998o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f39999p;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g1 a(ContractSummaryResponse contractSummaryResponse, kf.x xVar, Resources resources) {
            jo.p.h(contractSummaryResponse, "contractSummaryResponse");
            jo.p.h(xVar, "userPreference");
            jo.p.h(resources, "resources");
            boolean z10 = !df.c.Companion.a(contractSummaryResponse.getSeason().getClassId()).l();
            int kycStatus = contractSummaryResponse.getKycStatus();
            g2 g2Var = g2.CONFIRMED;
            cd.c0 c0Var = kycStatus == g2Var.c() ? cd.c0.EDIT : cd.c0.REGISTER;
            cd.c0 c0Var2 = contractSummaryResponse.getAccountStatus() == ad.v0.UNCONFIRMED.c() ? cd.c0.REGISTER : cd.c0.EDIT;
            boolean z11 = contractSummaryResponse.getKycStatus() == g2Var.c();
            boolean z12 = contractSummaryResponse.getKycStatus() == g2Var.c();
            int i10 = z10 ? nc.d.ic_icon_lock : nc.d.ic_path;
            int i11 = (!z10 || contractSummaryResponse.isVisibleHistory()) ? nc.d.ic_path : nc.d.ic_icon_lock;
            ub.a aVar = contractSummaryResponse.getKycStatus() == g2.PENDING.c() ? ub.a.SUBMISSION_IDENTIFICATION : ub.a.EDIT_IDENTIFICATION;
            boolean z13 = (!xVar.h3()) & (!z10);
            boolean z14 = (!xVar.u4()) & (!z10);
            boolean z15 = (!xVar.n3()) & (!z10);
            String string = resources.getString(contractSummaryResponse.getKycStatus() == g2Var.c() ? nc.i.text_menu_edit_identification_title : nc.i.text_menu_register_identification_title);
            String kycUrl = contractSummaryResponse.getKycUrl();
            boolean isVisibleHistory = contractSummaryResponse.isVisibleHistory();
            String string2 = resources.getString(contractSummaryResponse.getPaymentType() == ContractSummaryPaymentType.COIN ? nc.i.text_contract_explain_receive_coin_gift_highlight_1 : nc.i.text_contract_can_receive_cash_highlight_3);
            boolean z16 = !z10 && xVar.u4();
            jo.p.g(string, "getString(if (contractSu…ter_identification_title)");
            jo.p.g(string2, "if (contractSummaryRespo…receive_cash_highlight_3)");
            return new g1(z10, z11, z12, i10, i11, aVar, z13, z14, z15, string, kycUrl, c0Var, c0Var2, isVisibleHistory, string2, z16);
        }
    }

    public g1(boolean z10, boolean z11, boolean z12, int i10, int i11, ub.a aVar, boolean z13, boolean z14, boolean z15, String str, String str2, cd.c0 c0Var, cd.c0 c0Var2, boolean z16, String str3, boolean z17) {
        jo.p.h(aVar, "editIdentificationTransition");
        jo.p.h(str, "editIdentificationTitle");
        jo.p.h(str2, "kycUrl");
        jo.p.h(c0Var, "editIdentificationType");
        jo.p.h(c0Var2, "editBankAccountType");
        jo.p.h(str3, "paymentTypeText");
        this.f39984a = z10;
        this.f39985b = z11;
        this.f39986c = z12;
        this.f39987d = i10;
        this.f39988e = i11;
        this.f39989f = aVar;
        this.f39990g = z13;
        this.f39991h = z14;
        this.f39992i = z15;
        this.f39993j = str;
        this.f39994k = str2;
        this.f39995l = c0Var;
        this.f39996m = c0Var2;
        this.f39997n = z16;
        this.f39998o = str3;
        this.f39999p = z17;
    }

    public final g1 a(boolean z10, boolean z11, boolean z12, int i10, int i11, ub.a aVar, boolean z13, boolean z14, boolean z15, String str, String str2, cd.c0 c0Var, cd.c0 c0Var2, boolean z16, String str3, boolean z17) {
        jo.p.h(aVar, "editIdentificationTransition");
        jo.p.h(str, "editIdentificationTitle");
        jo.p.h(str2, "kycUrl");
        jo.p.h(c0Var, "editIdentificationType");
        jo.p.h(c0Var2, "editBankAccountType");
        jo.p.h(str3, "paymentTypeText");
        return new g1(z10, z11, z12, i10, i11, aVar, z13, z14, z15, str, str2, c0Var, c0Var2, z16, str3, z17);
    }

    public final int c() {
        return this.f39988e;
    }

    public final cd.c0 d() {
        return this.f39996m;
    }

    public final String e() {
        return this.f39993j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            return this.f39984a == g1Var.f39984a && this.f39985b == g1Var.f39985b && this.f39986c == g1Var.f39986c && this.f39987d == g1Var.f39987d && this.f39988e == g1Var.f39988e && this.f39989f == g1Var.f39989f && this.f39990g == g1Var.f39990g && this.f39991h == g1Var.f39991h && this.f39992i == g1Var.f39992i && jo.p.c(this.f39993j, g1Var.f39993j) && jo.p.c(this.f39994k, g1Var.f39994k) && this.f39995l == g1Var.f39995l && this.f39996m == g1Var.f39996m && this.f39997n == g1Var.f39997n && jo.p.c(this.f39998o, g1Var.f39998o) && this.f39999p == g1Var.f39999p;
        }
        return false;
    }

    public final ub.a f() {
        return this.f39989f;
    }

    public final cd.c0 g() {
        return this.f39995l;
    }

    public final int h() {
        return this.f39987d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f39984a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f39985b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.f39986c;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int hashCode = (((((((i12 + i13) * 31) + Integer.hashCode(this.f39987d)) * 31) + Integer.hashCode(this.f39988e)) * 31) + this.f39989f.hashCode()) * 31;
        ?? r24 = this.f39990g;
        int i14 = r24;
        if (r24 != 0) {
            i14 = 1;
        }
        int i15 = (hashCode + i14) * 31;
        ?? r25 = this.f39991h;
        int i16 = r25;
        if (r25 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        ?? r26 = this.f39992i;
        int i18 = r26;
        if (r26 != 0) {
            i18 = 1;
        }
        int hashCode2 = (((((((((i17 + i18) * 31) + this.f39993j.hashCode()) * 31) + this.f39994k.hashCode()) * 31) + this.f39995l.hashCode()) * 31) + this.f39996m.hashCode()) * 31;
        ?? r27 = this.f39997n;
        int i19 = r27;
        if (r27 != 0) {
            i19 = 1;
        }
        int hashCode3 = (((hashCode2 + i19) * 31) + this.f39998o.hashCode()) * 31;
        boolean z11 = this.f39999p;
        return hashCode3 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String i() {
        return this.f39998o;
    }

    public final boolean j() {
        return this.f39986c;
    }

    public final boolean k() {
        return this.f39985b;
    }

    public final boolean l() {
        return this.f39984a;
    }

    public final boolean m() {
        return this.f39992i;
    }

    public final boolean n() {
        return this.f39991h;
    }

    public final boolean o() {
        return this.f39990g;
    }

    public final boolean p() {
        return this.f39997n;
    }

    public final boolean q() {
        return this.f39999p;
    }

    public String toString() {
        return "SettingRootCashBonusHistoryBindModel(isLockCashHistory=" + this.f39984a + ", isEnabledEditBankAccount=" + this.f39985b + ", isEnabledCashHistory=" + this.f39986c + ", identificationRightIconDrawable=" + this.f39987d + ", cashHistoryRightIconDrawableRes=" + this.f39988e + ", editIdentificationTransition=" + this.f39989f + ", isVisibleEditIdentificationNewBadge=" + this.f39990g + ", isVisibleEditBankAccountNewBadge=" + this.f39991h + ", isVisibleCashBonusHistoryNewBadge=" + this.f39992i + ", editIdentificationTitle=" + this.f39993j + ", kycUrl=" + this.f39994k + ", editIdentificationType=" + this.f39995l + ", editBankAccountType=" + this.f39996m + ", isVisibleHistory=" + this.f39997n + ", paymentTypeText=" + this.f39998o + ", isVisiblePaymentTypeText=" + this.f39999p + ')';
    }
}
