package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class z7 implements u7 {
    public static final v4 C;
    public static final Parcelable.Creator<z7> CREATOR;
    public static final v4 D;
    public final byte[] A;
    public int B;

    /* renamed from: w  reason: collision with root package name */
    public final String f12900w;

    /* renamed from: x  reason: collision with root package name */
    public final String f12901x;

    /* renamed from: y  reason: collision with root package name */
    public final long f12902y;

    /* renamed from: z  reason: collision with root package name */
    public final long f12903z;

    static {
        t4 t4Var = new t4();
        t4Var.n(MimeTypes.APPLICATION_ID3);
        C = t4Var.I();
        t4 t4Var2 = new t4();
        t4Var2.n(MimeTypes.APPLICATION_SCTE35);
        D = t4Var2.I();
        CREATOR = new y7();
    }

    public z7(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = sb.f9778a;
        this.f12900w = readString;
        this.f12901x = parcel.readString();
        this.f12902y = parcel.readLong();
        this.f12903z = parcel.readLong();
        this.A = (byte[]) sb.I(parcel.createByteArray());
    }

    public z7(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f12900w = str;
        this.f12901x = str2;
        this.f12902y = j10;
        this.f12903z = j11;
        this.A = bArr;
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
        if (obj != null && z7.class == obj.getClass()) {
            z7 z7Var = (z7) obj;
            if (this.f12902y == z7Var.f12902y && this.f12903z == z7Var.f12903z && sb.H(this.f12900w, z7Var.f12900w) && sb.H(this.f12901x, z7Var.f12901x) && Arrays.equals(this.A, z7Var.A)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.B;
        if (i10 == 0) {
            String str = this.f12900w;
            int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f12901x;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f12902y;
            long j11 = this.f12903z;
            int hashCode3 = ((((((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + Arrays.hashCode(this.A);
            this.B = hashCode3;
            return hashCode3;
        }
        return i10;
    }

    public final String toString() {
        String str = this.f12900w;
        long j10 = this.f12903z;
        long j11 = this.f12902y;
        String str2 = this.f12901x;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb2.append("EMSG: scheme=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(j10);
        sb2.append(", durationMs=");
        sb2.append(j11);
        sb2.append(", value=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12900w);
        parcel.writeString(this.f12901x);
        parcel.writeLong(this.f12902y);
        parcel.writeLong(this.f12903z);
        parcel.writeByteArray(this.A);
    }
}
