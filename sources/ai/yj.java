package ai;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class yj implements Parcelable {
    public static final Parcelable.Creator<yj> CREATOR = new xj();
    public int A;

    /* renamed from: w  reason: collision with root package name */
    public final int f12627w;

    /* renamed from: x  reason: collision with root package name */
    public final int f12628x;

    /* renamed from: y  reason: collision with root package name */
    public final int f12629y;

    /* renamed from: z  reason: collision with root package name */
    public final byte[] f12630z;

    public yj(int i10, int i11, int i12, byte[] bArr) {
        this.f12627w = i10;
        this.f12628x = i11;
        this.f12629y = i12;
        this.f12630z = bArr;
    }

    public yj(Parcel parcel) {
        this.f12627w = parcel.readInt();
        this.f12628x = parcel.readInt();
        this.f12629y = parcel.readInt();
        this.f12630z = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yj.class == obj.getClass()) {
            yj yjVar = (yj) obj;
            if (this.f12627w == yjVar.f12627w && this.f12628x == yjVar.f12628x && this.f12629y == yjVar.f12629y && Arrays.equals(this.f12630z, yjVar.f12630z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.A;
        if (i10 == 0) {
            int hashCode = ((((((this.f12627w + 527) * 31) + this.f12628x) * 31) + this.f12629y) * 31) + Arrays.hashCode(this.f12630z);
            this.A = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.f12627w;
        int i11 = this.f12628x;
        int i12 = this.f12629y;
        boolean z10 = this.f12630z != null;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("ColorInfo(");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12627w);
        parcel.writeInt(this.f12628x);
        parcel.writeInt(this.f12629y);
        parcel.writeInt(this.f12630z != null ? 1 : 0);
        byte[] bArr = this.f12630z;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
