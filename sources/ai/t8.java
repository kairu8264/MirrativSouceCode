package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class t8 extends y8 {
    public static final Parcelable.Creator<t8> CREATOR = new s8();
    public final byte[] A;

    /* renamed from: x  reason: collision with root package name */
    public final String f10172x;

    /* renamed from: y  reason: collision with root package name */
    public final String f10173y;

    /* renamed from: z  reason: collision with root package name */
    public final String f10174z;

    public t8(Parcel parcel) {
        super(GeobFrame.ID);
        String readString = parcel.readString();
        int i10 = sb.f9778a;
        this.f10172x = readString;
        this.f10173y = parcel.readString();
        this.f10174z = parcel.readString();
        this.A = (byte[]) sb.I(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t8.class == obj.getClass()) {
            t8 t8Var = (t8) obj;
            if (sb.H(this.f10172x, t8Var.f10172x) && sb.H(this.f10173y, t8Var.f10173y) && sb.H(this.f10174z, t8Var.f10174z) && Arrays.equals(this.A, t8Var.A)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10172x;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f10173y;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10174z;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.A);
    }

    @Override // ai.y8
    public final String toString() {
        String str = this.f12479w;
        String str2 = this.f10172x;
        String str3 = this.f10173y;
        String str4 = this.f10174z;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb2 = new StringBuilder(length + 36 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", filename=");
        sb2.append(str3);
        sb2.append(", description=");
        sb2.append(str4);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10172x);
        parcel.writeString(this.f10173y);
        parcel.writeString(this.f10174z);
        parcel.writeByteArray(this.A);
    }

    public t8(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.f10172x = str;
        this.f10173y = str2;
        this.f10174z = str3;
        this.A = bArr;
    }
}
