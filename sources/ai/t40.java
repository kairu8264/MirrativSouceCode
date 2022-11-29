package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class t40 implements Parcelable.Creator<s40> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ s40 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 1:
                    z10 = SafeParcelReader.m(parcel, r10);
                    break;
                case 2:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 3:
                    i10 = SafeParcelReader.t(parcel, r10);
                    break;
                case 4:
                    bArr = SafeParcelReader.b(parcel, r10);
                    break;
                case 5:
                    strArr = SafeParcelReader.g(parcel, r10);
                    break;
                case 6:
                    strArr2 = SafeParcelReader.g(parcel, r10);
                    break;
                case 7:
                    z11 = SafeParcelReader.m(parcel, r10);
                    break;
                case 8:
                    j10 = SafeParcelReader.u(parcel, r10);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new s40(z10, str, i10, bArr, strArr, strArr2, z11, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ s40[] newArray(int i10) {
        return new s40[i10];
    }
}
