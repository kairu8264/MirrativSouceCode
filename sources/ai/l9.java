package ai;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l9 implements u7 {
    public static final Parcelable.Creator<l9> CREATOR = new j9();

    /* renamed from: w  reason: collision with root package name */
    public final String f6499w;

    /* renamed from: x  reason: collision with root package name */
    public final byte[] f6500x;

    /* renamed from: y  reason: collision with root package name */
    public final int f6501y;

    /* renamed from: z  reason: collision with root package name */
    public final int f6502z;

    public /* synthetic */ l9(Parcel parcel, k9 k9Var) {
        String readString = parcel.readString();
        int i10 = sb.f9778a;
        this.f6499w = readString;
        this.f6500x = (byte[]) sb.I(parcel.createByteArray());
        this.f6501y = parcel.readInt();
        this.f6502z = parcel.readInt();
    }

    public l9(String str, byte[] bArr, int i10, int i11) {
        this.f6499w = str;
        this.f6500x = bArr;
        this.f6501y = i10;
        this.f6502z = i11;
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
        if (obj != null && l9.class == obj.getClass()) {
            l9 l9Var = (l9) obj;
            if (this.f6499w.equals(l9Var.f6499w) && Arrays.equals(this.f6500x, l9Var.f6500x) && this.f6501y == l9Var.f6501y && this.f6502z == l9Var.f6502z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f6499w.hashCode() + 527) * 31) + Arrays.hashCode(this.f6500x)) * 31) + this.f6501y) * 31) + this.f6502z;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6499w);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6499w);
        parcel.writeByteArray(this.f6500x);
        parcel.writeInt(this.f6501y);
        parcel.writeInt(this.f6502z);
    }
}
