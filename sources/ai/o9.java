package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class o9 implements u7 {
    public static final Parcelable.Creator<o9> CREATOR = new m9();
    public final long A;

    /* renamed from: w  reason: collision with root package name */
    public final long f7693w;

    /* renamed from: x  reason: collision with root package name */
    public final long f7694x;

    /* renamed from: y  reason: collision with root package name */
    public final long f7695y;

    /* renamed from: z  reason: collision with root package name */
    public final long f7696z;

    public o9(long j10, long j11, long j12, long j13, long j14) {
        this.f7693w = j10;
        this.f7694x = j11;
        this.f7695y = j12;
        this.f7696z = j13;
        this.A = j14;
    }

    public /* synthetic */ o9(Parcel parcel, n9 n9Var) {
        this.f7693w = parcel.readLong();
        this.f7694x = parcel.readLong();
        this.f7695y = parcel.readLong();
        this.f7696z = parcel.readLong();
        this.A = parcel.readLong();
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
        if (obj != null && o9.class == obj.getClass()) {
            o9 o9Var = (o9) obj;
            if (this.f7693w == o9Var.f7693w && this.f7694x == o9Var.f7694x && this.f7695y == o9Var.f7695y && this.f7696z == o9Var.f7696z && this.A == o9Var.A) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f7693w;
        long j11 = this.f7694x;
        long j12 = this.f7695y;
        long j13 = this.f7696z;
        long j14 = this.A;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) + 527) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + ((int) ((j13 >>> 32) ^ j13))) * 31) + ((int) ((j14 >>> 32) ^ j14));
    }

    public final String toString() {
        long j10 = this.f7693w;
        long j11 = this.f7694x;
        long j12 = this.f7695y;
        long j13 = this.f7696z;
        long j14 = this.A;
        StringBuilder sb2 = new StringBuilder(218);
        sb2.append("Motion photo metadata: photoStartPosition=");
        sb2.append(j10);
        sb2.append(", photoSize=");
        sb2.append(j11);
        sb2.append(", photoPresentationTimestampUs=");
        sb2.append(j12);
        sb2.append(", videoStartPosition=");
        sb2.append(j13);
        sb2.append(", videoSize=");
        sb2.append(j14);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f7693w);
        parcel.writeLong(this.f7694x);
        parcel.writeLong(this.f7695y);
        parcel.writeLong(this.f7696z);
        parcel.writeLong(this.A);
    }
}
