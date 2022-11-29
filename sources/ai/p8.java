package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class p8 extends y8 {
    public static final Parcelable.Creator<p8> CREATOR = new o8();
    public final String[] A;
    public final y8[] B;

    /* renamed from: x  reason: collision with root package name */
    public final String f8342x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f8343y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f8344z;

    public p8(Parcel parcel) {
        super(ChapterTocFrame.ID);
        String readString = parcel.readString();
        int i10 = sb.f9778a;
        this.f8342x = readString;
        this.f8343y = parcel.readByte() != 0;
        this.f8344z = parcel.readByte() != 0;
        this.A = (String[]) sb.I(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.B = new y8[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.B[i11] = (y8) parcel.readParcelable(y8.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p8.class == obj.getClass()) {
            p8 p8Var = (p8) obj;
            if (this.f8343y == p8Var.f8343y && this.f8344z == p8Var.f8344z && sb.H(this.f8342x, p8Var.f8342x) && Arrays.equals(this.A, p8Var.A) && Arrays.equals(this.B, p8Var.B)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((((this.f8343y ? 1 : 0) + 527) * 31) + (this.f8344z ? 1 : 0)) * 31;
        String str = this.f8342x;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8342x);
        parcel.writeByte(this.f8343y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8344z ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.A);
        parcel.writeInt(this.B.length);
        for (y8 y8Var : this.B) {
            parcel.writeParcelable(y8Var, 0);
        }
    }

    public p8(String str, boolean z10, boolean z11, String[] strArr, y8[] y8VarArr) {
        super(ChapterTocFrame.ID);
        this.f8342x = str;
        this.f8343y = z10;
        this.f8344z = z11;
        this.A = strArr;
        this.B = y8VarArr;
    }
}
