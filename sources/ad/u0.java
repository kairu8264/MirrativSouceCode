package ad;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.user.KycInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import wn.l;

/* loaded from: classes2.dex */
public final class u0 implements Parcelable {
    public final String A;
    public final int B;
    public final String C;

    /* renamed from: w  reason: collision with root package name */
    public final String f1367w;

    /* renamed from: x  reason: collision with root package name */
    public final String f1368x;

    /* renamed from: y  reason: collision with root package name */
    public final String f1369y;

    /* renamed from: z  reason: collision with root package name */
    public final String f1370z;
    public static final a D = new a(null);
    public static final Parcelable.Creator<u0> CREATOR = new b();
    public static final int E = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u0 a(bd.e eVar) {
            String f10;
            String f11;
            String f12;
            Integer f13;
            String f14;
            String f15;
            jo.p.h(eVar, "bindModel");
            String f16 = eVar.k().f();
            if (f16 == null || (f10 = eVar.i().f()) == null || (f11 = eVar.j().f()) == null || (f12 = eVar.h().f()) == null || (f13 = eVar.f().f()) == null || (f14 = eVar.l().f()) == null || (f15 = eVar.e().f()) == null) {
                return null;
            }
            return new u0(f16, f10, f11, f12, f14, f13.intValue(), f15);
        }

        public final u0 b(KycInfo kycInfo) {
            String familyName = kycInfo != null ? kycInfo.getFamilyName() : null;
            if (familyName == null) {
                familyName = "";
            }
            String givenName = kycInfo != null ? kycInfo.getGivenName() : null;
            if (givenName == null) {
                givenName = "";
            }
            String familyNameKana = kycInfo != null ? kycInfo.getFamilyNameKana() : null;
            if (familyNameKana == null) {
                familyNameKana = "";
            }
            String givenNameKana = kycInfo != null ? kycInfo.getGivenNameKana() : null;
            if (givenNameKana == null) {
                givenNameKana = "";
            }
            String postCode = kycInfo != null ? kycInfo.getPostCode() : null;
            if (postCode == null) {
                postCode = "";
            }
            int birthday = kycInfo != null ? kycInfo.getBirthday() : 0;
            String address = kycInfo != null ? kycInfo.getAddress() : null;
            return new u0(familyName, givenName, familyNameKana, givenNameKana, postCode, birthday, address == null ? "" : address);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<u0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final u0 createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new u0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final u0[] newArray(int i10) {
            return new u0[i10];
        }
    }

    public u0(String str, String str2, String str3, String str4, String str5, int i10, String str6) {
        jo.p.h(str, "familyName");
        jo.p.h(str2, "givenName");
        jo.p.h(str3, "familyNameKana");
        jo.p.h(str4, "givenNameKana");
        jo.p.h(str5, "postCode");
        jo.p.h(str6, "address");
        this.f1367w = str;
        this.f1368x = str2;
        this.f1369y = str3;
        this.f1370z = str4;
        this.A = str5;
        this.B = i10;
        this.C = str6;
    }

    public final u0 a(String str, String str2, String str3, String str4, String str5, int i10, String str6) {
        jo.p.h(str, "familyName");
        jo.p.h(str2, "givenName");
        jo.p.h(str3, "familyNameKana");
        jo.p.h(str4, "givenNameKana");
        jo.p.h(str5, "postCode");
        jo.p.h(str6, "address");
        return new u0(str, str2, str3, str4, str5, i10, str6);
    }

    public final String b() {
        return this.C;
    }

    public final int c() {
        return this.B;
    }

    @SuppressLint({"SimpleDateFormat"})
    public final String d() {
        Object a10;
        String str;
        String valueOf = String.valueOf(this.B);
        try {
            l.a aVar = wn.l.f59224w;
            Date parse = new SimpleDateFormat("yyyyMMdd").parse(valueOf);
            if (parse != null) {
                jo.p.g(parse, "date");
                str = new SimpleDateFormat("yyyy年M月d日").format(parse);
            } else {
                str = null;
            }
            a10 = wn.l.a(str);
        } catch (Throwable th2) {
            l.a aVar2 = wn.l.f59224w;
            a10 = wn.l.a(wn.m.a(th2));
        }
        String str2 = wn.l.c(a10) ? null : a10;
        return str2 == null ? "" : str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f1367w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            return jo.p.c(this.f1367w, u0Var.f1367w) && jo.p.c(this.f1368x, u0Var.f1368x) && jo.p.c(this.f1369y, u0Var.f1369y) && jo.p.c(this.f1370z, u0Var.f1370z) && jo.p.c(this.A, u0Var.A) && this.B == u0Var.B && jo.p.c(this.C, u0Var.C);
        }
        return false;
    }

    public final String f() {
        return this.f1369y;
    }

    public final String g() {
        return this.f1367w + ' ' + this.f1368x;
    }

    public final String h() {
        return this.f1369y + ' ' + this.f1370z;
    }

    public int hashCode() {
        return (((((((((((this.f1367w.hashCode() * 31) + this.f1368x.hashCode()) * 31) + this.f1369y.hashCode()) * 31) + this.f1370z.hashCode()) * 31) + this.A.hashCode()) * 31) + Integer.hashCode(this.B)) * 31) + this.C.hashCode();
    }

    public final String i() {
        return this.f1368x;
    }

    public final String j() {
        return this.f1370z;
    }

    public final String k() {
        return this.A;
    }

    public String toString() {
        return "ConfirmContractEditIdentificationViewBindModel(familyName=" + this.f1367w + ", givenName=" + this.f1368x + ", familyNameKana=" + this.f1369y + ", givenNameKana=" + this.f1370z + ", postCode=" + this.A + ", birthday=" + this.B + ", address=" + this.C + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "out");
        parcel.writeString(this.f1367w);
        parcel.writeString(this.f1368x);
        parcel.writeString(this.f1369y);
        parcel.writeString(this.f1370z);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
        parcel.writeString(this.C);
    }
}
