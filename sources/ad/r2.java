package ad;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.user.ContractKycResponse;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryPaymentType;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.KycInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import wn.l;

/* loaded from: classes2.dex */
public final class r2 implements Parcelable {
    public final String A;
    public final String B;
    public final String C;
    public final boolean D;
    public final boolean E;

    /* renamed from: w  reason: collision with root package name */
    public final String f1299w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f1300x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f1301y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f1302z;
    public static final a F = new a(null);
    public static final Parcelable.Creator<r2> CREATOR = new b();
    public static final int G = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final r2 a(ContractSummaryResponse contractSummaryResponse, ContractKycResponse contractKycResponse) {
            Object a10;
            Object a11;
            KycInfo kycInfo;
            KycInfo kycInfo2;
            KycInfo kycInfo3;
            Date parse;
            String format;
            jo.p.h(contractSummaryResponse, "response");
            String str = null;
            try {
                l.a aVar = wn.l.f59224w;
                if (contractSummaryResponse.getValidPaymentStartDate() == 0 || (parse = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).parse(String.valueOf(contractSummaryResponse.getValidPaymentStartDate()))) == null) {
                    format = null;
                } else {
                    jo.p.g(parse, "dateFormat");
                    format = new SimpleDateFormat("yyyy/M/d", Locale.getDefault()).format(parse);
                }
                a10 = wn.l.a(format);
            } catch (Throwable th2) {
                l.a aVar2 = wn.l.f59224w;
                a10 = wn.l.a(wn.m.a(th2));
            }
            if (wn.l.c(a10)) {
                a10 = null;
            }
            String str2 = (String) a10;
            String str3 = str2 == null ? "" : str2;
            try {
                l.a aVar3 = wn.l.f59224w;
                a11 = wn.l.a(Boolean.valueOf(contractSummaryResponse.getValidPaymentStartDate() == 0 ? true : new Date().after(new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).parse(String.valueOf(contractSummaryResponse.getValidPaymentStartDate())))));
            } catch (Throwable th3) {
                l.a aVar4 = wn.l.f59224w;
                a11 = wn.l.a(wn.m.a(th3));
            }
            if (wn.l.c(a11)) {
                a11 = null;
            }
            Boolean bool = (Boolean) a11;
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            boolean z10 = contractSummaryResponse.getPaymentType() == ContractSummaryPaymentType.COIN;
            boolean z11 = contractSummaryResponse.getPaymentType() == ContractSummaryPaymentType.CASH;
            boolean z12 = contractSummaryResponse.getAccountStatus() == v0.UNCONFIRMED.c();
            String bankName = (contractKycResponse == null || (kycInfo3 = contractKycResponse.getKycInfo()) == null) ? null : kycInfo3.getBankName();
            if (bankName == null) {
                bankName = "";
            }
            String branchCode = (contractKycResponse == null || (kycInfo2 = contractKycResponse.getKycInfo()) == null) ? null : kycInfo2.getBranchCode();
            if (branchCode == null) {
                branchCode = "";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("****");
            if (contractKycResponse != null && (kycInfo = contractKycResponse.getKycInfo()) != null) {
                str = kycInfo.getAccountNumber();
            }
            sb2.append(so.q.T0(str != null ? str : "", 3));
            return new r2(str3, z10, z11, z12, bankName, branchCode, sb2.toString(), (contractSummaryResponse.getValidPaymentStartDate() == 0 || booleanValue) ? false : true, contractSummaryResponse.getAccountStatus() != v0.NG_CONFIRM.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<r2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final r2 createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new r2(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final r2[] newArray(int i10) {
            return new r2[i10];
        }
    }

    public r2(String str, boolean z10, boolean z11, boolean z12, String str2, String str3, String str4, boolean z13, boolean z14) {
        jo.p.h(str, "paymentTextDate");
        jo.p.h(str2, "bankNameText");
        jo.p.h(str3, "branchCodeText");
        jo.p.h(str4, "accountNumberText");
        this.f1299w = str;
        this.f1300x = z10;
        this.f1301y = z11;
        this.f1302z = z12;
        this.A = str2;
        this.B = str3;
        this.C = str4;
        this.D = z13;
        this.E = z14;
    }

    public final r2 a(String str, boolean z10, boolean z11, boolean z12, String str2, String str3, String str4, boolean z13, boolean z14) {
        jo.p.h(str, "paymentTextDate");
        jo.p.h(str2, "bankNameText");
        jo.p.h(str3, "branchCodeText");
        jo.p.h(str4, "accountNumberText");
        return new r2(str, z10, z11, z12, str2, str3, str4, z13, z14);
    }

    public final String c() {
        return this.C;
    }

    public final String d() {
        return this.A;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r2) {
            r2 r2Var = (r2) obj;
            return jo.p.c(this.f1299w, r2Var.f1299w) && this.f1300x == r2Var.f1300x && this.f1301y == r2Var.f1301y && this.f1302z == r2Var.f1302z && jo.p.c(this.A, r2Var.A) && jo.p.c(this.B, r2Var.B) && jo.p.c(this.C, r2Var.C) && this.D == r2Var.D && this.E == r2Var.E;
        }
        return false;
    }

    public final String f() {
        return this.f1299w;
    }

    public final boolean g() {
        return this.E;
    }

    public final boolean h() {
        return this.f1301y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f1299w.hashCode() * 31;
        boolean z10 = this.f1300x;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f1301y;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f1302z;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int hashCode2 = (((((((i13 + i14) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31;
        boolean z13 = this.D;
        int i15 = z13;
        if (z13 != 0) {
            i15 = 1;
        }
        int i16 = (hashCode2 + i15) * 31;
        boolean z14 = this.E;
        return i16 + (z14 ? 1 : z14 ? 1 : 0);
    }

    public final boolean i() {
        return this.f1300x;
    }

    public final boolean j() {
        return this.D;
    }

    public final boolean k() {
        return this.f1302z;
    }

    public String toString() {
        return "SelectReceiveCashBonusBindModel(paymentTextDate=" + this.f1299w + ", isVisibleCoinCheckButton=" + this.f1300x + ", isVisibleCashCheckButton=" + this.f1301y + ", isVisibleRegisterBankAccountMessage=" + this.f1302z + ", bankNameText=" + this.A + ", branchCodeText=" + this.B + ", accountNumberText=" + this.C + ", isVisiblePaymentTextDate=" + this.D + ", isEnabledCashCheckButton=" + this.E + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "out");
        parcel.writeString(this.f1299w);
        parcel.writeInt(this.f1300x ? 1 : 0);
        parcel.writeInt(this.f1301y ? 1 : 0);
        parcel.writeInt(this.f1302z ? 1 : 0);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
    }
}
