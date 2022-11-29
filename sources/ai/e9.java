package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class e9 extends y8 {
    public static final Parcelable.Creator<e9> CREATOR = new d9();

    /* renamed from: x  reason: collision with root package name */
    public final String f3586x;

    /* renamed from: y  reason: collision with root package name */
    public final byte[] f3587y;

    public e9(Parcel parcel) {
        super(PrivFrame.ID);
        String readString = parcel.readString();
        int i10 = sb.f9778a;
        this.f3586x = readString;
        this.f3587y = (byte[]) sb.I(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e9.class == obj.getClass()) {
            e9 e9Var = (e9) obj;
            if (sb.H(this.f3586x, e9Var.f3586x) && Arrays.equals(this.f3587y, e9Var.f3587y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3586x;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f3587y);
    }

    @Override // ai.y8
    public final String toString() {
        String str = this.f12479w;
        String str2 = this.f3586x;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(": owner=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3586x);
        parcel.writeByteArray(this.f3587y);
    }

    public e9(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.f3586x = str;
        this.f3587y = bArr;
    }
}
