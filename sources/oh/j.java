package oh;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class j implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        int i10 = 0;
        int i11 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                i11 = SafeParcelReader.t(parcel, r10);
            } else if (l10 == 2) {
                str = SafeParcelReader.f(parcel, r10);
            } else if (l10 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, r10, PendingIntent.CREATOR);
            } else if (l10 == 4) {
                connectionResult = (ConnectionResult) SafeParcelReader.e(parcel, r10, ConnectionResult.CREATOR);
            } else if (l10 != 1000) {
                SafeParcelReader.x(parcel, r10);
            } else {
                i10 = SafeParcelReader.t(parcel, r10);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new Status(i10, i11, str, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i10) {
        return new Status[i10];
    }
}
