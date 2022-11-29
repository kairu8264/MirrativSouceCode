package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class n8 extends y8 {
    public static final Parcelable.Creator<n8> CREATOR = new m8();
    public final long A;
    public final long B;
    public final y8[] C;

    /* renamed from: x  reason: collision with root package name */
    public final String f7232x;

    /* renamed from: y  reason: collision with root package name */
    public final int f7233y;

    /* renamed from: z  reason: collision with root package name */
    public final int f7234z;

    public n8(Parcel parcel) {
        super(ChapterFrame.ID);
        String readString = parcel.readString();
        int i10 = sb.f9778a;
        this.f7232x = readString;
        this.f7233y = parcel.readInt();
        this.f7234z = parcel.readInt();
        this.A = parcel.readLong();
        this.B = parcel.readLong();
        int readInt = parcel.readInt();
        this.C = new y8[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.C[i11] = (y8) parcel.readParcelable(y8.class.getClassLoader());
        }
    }

    @Override // ai.y8, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n8.class == obj.getClass()) {
            n8 n8Var = (n8) obj;
            if (this.f7233y == n8Var.f7233y && this.f7234z == n8Var.f7234z && this.A == n8Var.A && this.B == n8Var.B && sb.H(this.f7232x, n8Var.f7232x) && Arrays.equals(this.C, n8Var.C)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((this.f7233y + 527) * 31) + this.f7234z) * 31) + ((int) this.A)) * 31) + ((int) this.B)) * 31;
        String str = this.f7232x;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7232x);
        parcel.writeInt(this.f7233y);
        parcel.writeInt(this.f7234z);
        parcel.writeLong(this.A);
        parcel.writeLong(this.B);
        parcel.writeInt(this.C.length);
        for (y8 y8Var : this.C) {
            parcel.writeParcelable(y8Var, 0);
        }
    }

    public n8(String str, int i10, int i11, long j10, long j11, y8[] y8VarArr) {
        super(ChapterFrame.ID);
        this.f7232x = str;
        this.f7233y = i10;
        this.f7234z = i11;
        this.A = j10;
        this.B = j11;
        this.C = y8VarArr;
    }
}
