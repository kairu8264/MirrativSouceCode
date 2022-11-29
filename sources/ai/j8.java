package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j8 extends y8 {
    public static final Parcelable.Creator<j8> CREATOR = new i8();
    public final byte[] A;

    /* renamed from: x  reason: collision with root package name */
    public final String f5657x;

    /* renamed from: y  reason: collision with root package name */
    public final String f5658y;

    /* renamed from: z  reason: collision with root package name */
    public final int f5659z;

    public j8(Parcel parcel) {
        super(ApicFrame.ID);
        String readString = parcel.readString();
        int i10 = sb.f9778a;
        this.f5657x = readString;
        this.f5658y = parcel.readString();
        this.f5659z = parcel.readInt();
        this.A = (byte[]) sb.I(parcel.createByteArray());
    }

    @Override // ai.y8, ai.u7
    public final void E0(m5 m5Var) {
        m5Var.G(this.A, this.f5659z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j8.class == obj.getClass()) {
            j8 j8Var = (j8) obj;
            if (this.f5659z == j8Var.f5659z && sb.H(this.f5657x, j8Var.f5657x) && sb.H(this.f5658y, j8Var.f5658y) && Arrays.equals(this.A, j8Var.A)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f5659z + 527) * 31;
        String str = this.f5657x;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5658y;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.A);
    }

    @Override // ai.y8
    public final String toString() {
        String str = this.f12479w;
        String str2 = this.f5657x;
        String str3 = this.f5658y;
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5657x);
        parcel.writeString(this.f5658y);
        parcel.writeInt(this.f5659z);
        parcel.writeByteArray(this.A);
    }

    public j8(String str, String str2, int i10, byte[] bArr) {
        super(ApicFrame.ID);
        this.f5657x = str;
        this.f5658y = str2;
        this.f5659z = i10;
        this.A = bArr;
    }
}
