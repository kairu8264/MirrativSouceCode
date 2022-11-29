package jh;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        int i10 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 1:
                    i10 = SafeParcelReader.t(parcel, r10);
                    break;
                case 2:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 3:
                    str2 = SafeParcelReader.f(parcel, r10);
                    break;
                case 4:
                    str3 = SafeParcelReader.f(parcel, r10);
                    break;
                case 5:
                    str4 = SafeParcelReader.f(parcel, r10);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.e(parcel, r10, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.f(parcel, r10);
                    break;
                case 8:
                    j10 = SafeParcelReader.u(parcel, r10);
                    break;
                case 9:
                    str6 = SafeParcelReader.f(parcel, r10);
                    break;
                case 10:
                    arrayList = SafeParcelReader.j(parcel, r10, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.f(parcel, r10);
                    break;
                case 12:
                    str8 = SafeParcelReader.f(parcel, r10);
                    break;
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
