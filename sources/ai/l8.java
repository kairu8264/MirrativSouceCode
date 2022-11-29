package ai;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l8 extends y8 {
    public static final Parcelable.Creator<l8> CREATOR = new k8();

    /* renamed from: x  reason: collision with root package name */
    public final byte[] f6494x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l8(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = ai.sb.f9778a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            java.lang.Object r3 = ai.sb.I(r3)
            byte[] r3 = (byte[]) r3
            r2.f6494x = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.l8.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l8.class == obj.getClass()) {
            l8 l8Var = (l8) obj;
            if (this.f12479w.equals(l8Var.f12479w) && Arrays.equals(this.f6494x, l8Var.f6494x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f12479w.hashCode() + 527) * 31) + Arrays.hashCode(this.f6494x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12479w);
        parcel.writeByteArray(this.f6494x);
    }

    public l8(String str, byte[] bArr) {
        super(str);
        this.f6494x = bArr;
    }
}
