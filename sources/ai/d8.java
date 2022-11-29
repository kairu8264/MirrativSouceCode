package ai;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class d8 implements u7 {
    public static final Parcelable.Creator<d8> CREATOR = new c8();
    public final int A;
    public final int B;
    public final int C;
    public final byte[] D;

    /* renamed from: w  reason: collision with root package name */
    public final int f3169w;

    /* renamed from: x  reason: collision with root package name */
    public final String f3170x;

    /* renamed from: y  reason: collision with root package name */
    public final String f3171y;

    /* renamed from: z  reason: collision with root package name */
    public final int f3172z;

    public d8(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f3169w = i10;
        this.f3170x = str;
        this.f3171y = str2;
        this.f3172z = i11;
        this.A = i12;
        this.B = i13;
        this.C = i14;
        this.D = bArr;
    }

    public d8(Parcel parcel) {
        this.f3169w = parcel.readInt();
        String readString = parcel.readString();
        int i10 = sb.f9778a;
        this.f3170x = readString;
        this.f3171y = parcel.readString();
        this.f3172z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = (byte[]) sb.I(parcel.createByteArray());
    }

    @Override // ai.u7
    public final void E0(m5 m5Var) {
        m5Var.G(this.D, this.f3169w);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d8.class == obj.getClass()) {
            d8 d8Var = (d8) obj;
            if (this.f3169w == d8Var.f3169w && this.f3170x.equals(d8Var.f3170x) && this.f3171y.equals(d8Var.f3171y) && this.f3172z == d8Var.f3172z && this.A == d8Var.A && this.B == d8Var.B && this.C == d8Var.C && Arrays.equals(this.D, d8Var.D)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f3169w + 527) * 31) + this.f3170x.hashCode()) * 31) + this.f3171y.hashCode()) * 31) + this.f3172z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + Arrays.hashCode(this.D);
    }

    public final String toString() {
        String str = this.f3170x;
        String str2 = this.f3171y;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb2.append("Picture: mimeType=");
        sb2.append(str);
        sb2.append(", description=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3169w);
        parcel.writeString(this.f3170x);
        parcel.writeString(this.f3171y);
        parcel.writeInt(this.f3172z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeByteArray(this.D);
    }
}
