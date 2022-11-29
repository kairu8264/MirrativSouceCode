package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class c9 extends y8 {
    public static final Parcelable.Creator<c9> CREATOR = new b9();
    public final int[] A;
    public final int[] B;

    /* renamed from: x  reason: collision with root package name */
    public final int f2756x;

    /* renamed from: y  reason: collision with root package name */
    public final int f2757y;

    /* renamed from: z  reason: collision with root package name */
    public final int f2758z;

    public c9(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super(MlltFrame.ID);
        this.f2756x = i10;
        this.f2757y = i11;
        this.f2758z = i12;
        this.A = iArr;
        this.B = iArr2;
    }

    @Override // ai.y8, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c9.class == obj.getClass()) {
            c9 c9Var = (c9) obj;
            if (this.f2756x == c9Var.f2756x && this.f2757y == c9Var.f2757y && this.f2758z == c9Var.f2758z && Arrays.equals(this.A, c9Var.A) && Arrays.equals(this.B, c9Var.B)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f2756x + 527) * 31) + this.f2757y) * 31) + this.f2758z) * 31) + Arrays.hashCode(this.A)) * 31) + Arrays.hashCode(this.B);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2756x);
        parcel.writeInt(this.f2757y);
        parcel.writeInt(this.f2758z);
        parcel.writeIntArray(this.A);
        parcel.writeIntArray(this.B);
    }

    public c9(Parcel parcel) {
        super(MlltFrame.ID);
        this.f2756x = parcel.readInt();
        this.f2757y = parcel.readInt();
        this.f2758z = parcel.readInt();
        this.A = (int[]) sb.I(parcel.createIntArray());
        this.B = (int[]) sb.I(parcel.createIntArray());
    }
}
