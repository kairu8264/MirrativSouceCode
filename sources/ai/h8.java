package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class h8 implements u7 {
    public static final Parcelable.Creator<h8> CREATOR = new g8();
    public final boolean A;
    public final int B;

    /* renamed from: w  reason: collision with root package name */
    public final int f4772w;

    /* renamed from: x  reason: collision with root package name */
    public final String f4773x;

    /* renamed from: y  reason: collision with root package name */
    public final String f4774y;

    /* renamed from: z  reason: collision with root package name */
    public final String f4775z;

    public h8(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11 = true;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        }
        u9.a(z11);
        this.f4772w = i10;
        this.f4773x = str;
        this.f4774y = str2;
        this.f4775z = str3;
        this.A = z10;
        this.B = i11;
    }

    @Override // ai.u7
    public final void E0(m5 m5Var) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h8.class == obj.getClass()) {
            h8 h8Var = (h8) obj;
            if (this.f4772w == h8Var.f4772w && sb.H(this.f4773x, h8Var.f4773x) && sb.H(this.f4774y, h8Var.f4774y) && sb.H(this.f4775z, h8Var.f4775z) && this.A == h8Var.A && this.B == h8Var.B) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f4772w + 527) * 31;
        String str = this.f4773x;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4774y;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4775z;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.A ? 1 : 0)) * 31) + this.B;
    }

    public final String toString() {
        String str = this.f4774y;
        String str2 = this.f4773x;
        int i10 = this.f4772w;
        int i11 = this.B;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb2.append("IcyHeaders: name=\"");
        sb2.append(str);
        sb2.append("\", genre=\"");
        sb2.append(str2);
        sb2.append("\", bitrate=");
        sb2.append(i10);
        sb2.append(", metadataInterval=");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4772w);
        parcel.writeString(this.f4773x);
        parcel.writeString(this.f4774y);
        parcel.writeString(this.f4775z);
        sb.T(parcel, this.A);
        parcel.writeInt(this.B);
    }

    public h8(Parcel parcel) {
        this.f4772w = parcel.readInt();
        this.f4773x = parcel.readString();
        this.f4774y = parcel.readString();
        this.f4775z = parcel.readString();
        this.A = sb.S(parcel);
        this.B = parcel.readInt();
    }
}
