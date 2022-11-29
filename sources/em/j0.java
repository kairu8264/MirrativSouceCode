package em;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes4.dex */
public class j0 implements Parcelable.Creator<com.google.firebase.messaging.d> {
    public static void c(com.google.firebase.messaging.d dVar, Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.e(parcel, 2, dVar.f28001w, false);
        sh.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public com.google.firebase.messaging.d createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            if (SafeParcelReader.l(r10) != 2) {
                SafeParcelReader.x(parcel, r10);
            } else {
                bundle = SafeParcelReader.a(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new com.google.firebase.messaging.d(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public com.google.firebase.messaging.d[] newArray(int i10) {
        return new com.google.firebase.messaging.d[i10];
    }
}
