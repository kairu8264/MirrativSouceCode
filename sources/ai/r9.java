package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class r9 implements u7 {
    public static final Parcelable.Creator<r9> CREATOR = new p9();

    /* renamed from: w  reason: collision with root package name */
    public final float f9375w;

    /* renamed from: x  reason: collision with root package name */
    public final int f9376x;

    public r9(float f10, int i10) {
        this.f9375w = f10;
        this.f9376x = i10;
    }

    public /* synthetic */ r9(Parcel parcel, q9 q9Var) {
        this.f9375w = parcel.readFloat();
        this.f9376x = parcel.readInt();
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
        if (obj != null && r9.class == obj.getClass()) {
            r9 r9Var = (r9) obj;
            if (this.f9375w == r9Var.f9375w && this.f9376x == r9Var.f9376x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f9375w).hashCode() + 527) * 31) + this.f9376x;
    }

    public final String toString() {
        float f10 = this.f9375w;
        int i10 = this.f9376x;
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("smta: captureFrameRate=");
        sb2.append(f10);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f9375w);
        parcel.writeInt(this.f9376x);
    }
}
