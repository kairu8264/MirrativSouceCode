package ad;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.user.KycInfo;

/* loaded from: classes2.dex */
public final class r0 implements Parcelable {
    public final String A;

    /* renamed from: w  reason: collision with root package name */
    public final String f1288w;

    /* renamed from: x  reason: collision with root package name */
    public final String f1289x;

    /* renamed from: y  reason: collision with root package name */
    public final String f1290y;

    /* renamed from: z  reason: collision with root package name */
    public final String f1291z;
    public static final a B = new a(null);
    public static final Parcelable.Creator<r0> CREATOR = new b();
    public static final int C = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final r0 a(bd.d dVar, String str) {
            String f10;
            String f11;
            String f12;
            jo.p.h(dVar, "bindModel");
            jo.p.h(str, "bankAccountName");
            String f13 = dVar.d().f();
            if (f13 == null || (f10 = dVar.c().f()) == null || (f11 = dVar.b().f()) == null || (f12 = dVar.a().f()) == null) {
                return null;
            }
            return new r0(f13, f10, f11, f12, str);
        }

        public final r0 b(KycInfo kycInfo) {
            String str;
            String bankName = kycInfo != null ? kycInfo.getBankName() : null;
            String str2 = bankName == null ? "" : bankName;
            String bankCode = kycInfo != null ? kycInfo.getBankCode() : null;
            String str3 = bankCode == null ? "" : bankCode;
            String branchCode = kycInfo != null ? kycInfo.getBranchCode() : null;
            String str4 = branchCode == null ? "" : branchCode;
            if (kycInfo != null) {
                str = kycInfo.getFamilyNameKana() + ' ' + kycInfo.getGivenNameKana();
            } else {
                str = null;
            }
            String str5 = str == null ? "" : str;
            String accountNumber = kycInfo != null ? kycInfo.getAccountNumber() : null;
            return new r0(str2, str3, str4, accountNumber == null ? "" : accountNumber, str5);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<r0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final r0 createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new r0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final r0[] newArray(int i10) {
            return new r0[i10];
        }
    }

    public r0(String str, String str2, String str3, String str4, String str5) {
        jo.p.h(str, "bankName");
        jo.p.h(str2, "bankId");
        jo.p.h(str3, "bankBranchCode");
        jo.p.h(str4, "bankAccountNumber");
        jo.p.h(str5, "bankAccountName");
        this.f1288w = str;
        this.f1289x = str2;
        this.f1290y = str3;
        this.f1291z = str4;
        this.A = str5;
    }

    public static /* synthetic */ r0 b(r0 r0Var, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = r0Var.f1288w;
        }
        if ((i10 & 2) != 0) {
            str2 = r0Var.f1289x;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = r0Var.f1290y;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = r0Var.f1291z;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = r0Var.A;
        }
        return r0Var.a(str, str6, str7, str8, str5);
    }

    public final r0 a(String str, String str2, String str3, String str4, String str5) {
        jo.p.h(str, "bankName");
        jo.p.h(str2, "bankId");
        jo.p.h(str3, "bankBranchCode");
        jo.p.h(str4, "bankAccountNumber");
        jo.p.h(str5, "bankAccountName");
        return new r0(str, str2, str3, str4, str5);
    }

    public final String c() {
        return this.A;
    }

    public final String d() {
        return this.f1291z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f1290y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            return jo.p.c(this.f1288w, r0Var.f1288w) && jo.p.c(this.f1289x, r0Var.f1289x) && jo.p.c(this.f1290y, r0Var.f1290y) && jo.p.c(this.f1291z, r0Var.f1291z) && jo.p.c(this.A, r0Var.A);
        }
        return false;
    }

    public final String f() {
        return this.f1289x;
    }

    public final String g() {
        return this.f1288w;
    }

    public int hashCode() {
        return (((((((this.f1288w.hashCode() * 31) + this.f1289x.hashCode()) * 31) + this.f1290y.hashCode()) * 31) + this.f1291z.hashCode()) * 31) + this.A.hashCode();
    }

    public String toString() {
        return "ConfirmContractEditBankAccountViewBindModel(bankName=" + this.f1288w + ", bankId=" + this.f1289x + ", bankBranchCode=" + this.f1290y + ", bankAccountNumber=" + this.f1291z + ", bankAccountName=" + this.A + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "out");
        parcel.writeString(this.f1288w);
        parcel.writeString(this.f1289x);
        parcel.writeString(this.f1290y);
        parcel.writeString(this.f1291z);
        parcel.writeString(this.A);
    }
}
