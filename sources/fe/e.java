package fe;

import android.os.Parcel;
import android.os.Parcelable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();
    public static final int D = 8;
    public String A;
    public String B;
    public String C;

    /* renamed from: w  reason: collision with root package name */
    public final String f31971w;

    /* renamed from: x  reason: collision with root package name */
    public final String f31972x;

    /* renamed from: y  reason: collision with root package name */
    public String f31973y;

    /* renamed from: z  reason: collision with root package name */
    public String f31974z;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final e createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new e(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        p.h(str, "clientId");
        p.h(str2, "redirectUri");
        p.h(str3, "responseType");
        p.h(str4, "scope");
        p.h(str5, "nonce");
        p.h(str6, "state");
        p.h(str7, "callback");
        this.f31971w = str;
        this.f31972x = str2;
        this.f31973y = str3;
        this.f31974z = str4;
        this.A = str5;
        this.B = str6;
        this.C = str7;
    }

    public final String a() {
        return this.C;
    }

    public final String b() {
        return this.f31971w;
    }

    public final String c() {
        return this.A;
    }

    public final String d() {
        return this.f31972x;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f31973y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return p.c(this.f31971w, eVar.f31971w) && p.c(this.f31972x, eVar.f31972x) && p.c(this.f31973y, eVar.f31973y) && p.c(this.f31974z, eVar.f31974z) && p.c(this.A, eVar.A) && p.c(this.B, eVar.B) && p.c(this.C, eVar.C);
        }
        return false;
    }

    public final String f() {
        return this.f31974z;
    }

    public final String g() {
        return this.B;
    }

    public final void h(String str) {
        p.h(str, "<set-?>");
        this.C = str;
    }

    public int hashCode() {
        return (((((((((((this.f31971w.hashCode() * 31) + this.f31972x.hashCode()) * 31) + this.f31973y.hashCode()) * 31) + this.f31974z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode();
    }

    public final void i(String str) {
        p.h(str, "<set-?>");
        this.A = str;
    }

    public final void j(String str) {
        p.h(str, "<set-?>");
        this.f31973y = str;
    }

    public final void k(String str) {
        p.h(str, "<set-?>");
        this.f31974z = str;
    }

    public final void l(String str) {
        p.h(str, "<set-?>");
        this.B = str;
    }

    public String toString() {
        return "AppAuthenticationParams(clientId=" + this.f31971w + ", redirectUri=" + this.f31972x + ", responseType=" + this.f31973y + ", scope=" + this.f31974z + ", nonce=" + this.A + ", state=" + this.B + ", callback=" + this.C + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.f31971w);
        parcel.writeString(this.f31972x);
        parcel.writeString(this.f31973y);
        parcel.writeString(this.f31974z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
    }

    public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, h hVar) {
        this(str, str2, (i10 & 4) != 0 ? "token id_token" : str3, (i10 & 8) != 0 ? "token openid" : str4, (i10 & 16) != 0 ? "nonce" : str5, (i10 & 32) != 0 ? "state" : str6, (i10 & 64) != 0 ? "" : str7);
    }
}
