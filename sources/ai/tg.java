package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class tg extends xg {
    public static final Parcelable.Creator<tg> CREATOR = new sg();
    public final byte[] A;

    /* renamed from: x  reason: collision with root package name */
    public final String f10281x;

    /* renamed from: y  reason: collision with root package name */
    public final String f10282y;

    /* renamed from: z  reason: collision with root package name */
    public final int f10283z;

    public tg(Parcel parcel) {
        super(ApicFrame.ID);
        this.f10281x = parcel.readString();
        this.f10282y = parcel.readString();
        this.f10283z = parcel.readInt();
        this.A = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tg.class == obj.getClass()) {
            tg tgVar = (tg) obj;
            if (this.f10283z == tgVar.f10283z && vj.a(this.f10281x, tgVar.f10281x) && vj.a(this.f10282y, tgVar.f10282y) && Arrays.equals(this.A, tgVar.A)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f10283z + 527) * 31;
        String str = this.f10281x;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10282y;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.A);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10281x);
        parcel.writeString(this.f10282y);
        parcel.writeInt(this.f10283z);
        parcel.writeByteArray(this.A);
    }

    public tg(String str, String str2, int i10, byte[] bArr) {
        super(ApicFrame.ID);
        this.f10281x = str;
        this.f10282y = null;
        this.f10283z = 3;
        this.A = bArr;
    }
}
