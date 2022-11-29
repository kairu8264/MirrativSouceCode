package ai;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class he implements Parcelable {
    public static final Parcelable.Creator<he> CREATOR = new ge();
    public final boolean A;

    /* renamed from: w  reason: collision with root package name */
    public int f4830w;

    /* renamed from: x  reason: collision with root package name */
    public final UUID f4831x;

    /* renamed from: y  reason: collision with root package name */
    public final String f4832y;

    /* renamed from: z  reason: collision with root package name */
    public final byte[] f4833z;

    public he(Parcel parcel) {
        this.f4831x = new UUID(parcel.readLong(), parcel.readLong());
        this.f4832y = parcel.readString();
        this.f4833z = parcel.createByteArray();
        this.A = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof he) {
            if (obj == this) {
                return true;
            }
            he heVar = (he) obj;
            return this.f4832y.equals(heVar.f4832y) && vj.a(this.f4831x, heVar.f4831x) && Arrays.equals(this.f4833z, heVar.f4833z);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f4830w;
        if (i10 == 0) {
            int hashCode = (((this.f4831x.hashCode() * 31) + this.f4832y.hashCode()) * 31) + Arrays.hashCode(this.f4833z);
            this.f4830w = hashCode;
            return hashCode;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f4831x.getMostSignificantBits());
        parcel.writeLong(this.f4831x.getLeastSignificantBits());
        parcel.writeString(this.f4832y);
        parcel.writeByteArray(this.f4833z);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
    }

    public he(UUID uuid, String str, byte[] bArr, boolean z10) {
        Objects.requireNonNull(uuid);
        this.f4831x = uuid;
        this.f4832y = str;
        Objects.requireNonNull(bArr);
        this.f4833z = bArr;
        this.A = false;
    }
}
