package ai;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class qt3 implements Parcelable {
    public static final Parcelable.Creator<qt3> CREATOR = new ts3();
    public final byte[] A;

    /* renamed from: w  reason: collision with root package name */
    public int f9195w;

    /* renamed from: x  reason: collision with root package name */
    public final UUID f9196x;

    /* renamed from: y  reason: collision with root package name */
    public final String f9197y;

    /* renamed from: z  reason: collision with root package name */
    public final String f9198z;

    public qt3(Parcel parcel) {
        this.f9196x = new UUID(parcel.readLong(), parcel.readLong());
        this.f9197y = parcel.readString();
        String readString = parcel.readString();
        int i10 = sb.f9778a;
        this.f9198z = readString;
        this.A = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qt3) {
            if (obj == this) {
                return true;
            }
            qt3 qt3Var = (qt3) obj;
            return sb.H(this.f9197y, qt3Var.f9197y) && sb.H(this.f9198z, qt3Var.f9198z) && sb.H(this.f9196x, qt3Var.f9196x) && Arrays.equals(this.A, qt3Var.A);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f9195w;
        if (i10 == 0) {
            int hashCode = this.f9196x.hashCode() * 31;
            String str = this.f9197y;
            int hashCode2 = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f9198z.hashCode()) * 31) + Arrays.hashCode(this.A);
            this.f9195w = hashCode2;
            return hashCode2;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9196x.getMostSignificantBits());
        parcel.writeLong(this.f9196x.getLeastSignificantBits());
        parcel.writeString(this.f9197y);
        parcel.writeString(this.f9198z);
        parcel.writeByteArray(this.A);
    }

    public qt3(UUID uuid, String str, String str2, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.f9196x = uuid;
        this.f9197y = null;
        this.f9198z = str2;
        this.A = bArr;
    }
}
