package rh;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class o0 implements Parcelable.Creator<n0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ n0 createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        Account account = null;
        int i10 = 0;
        int i11 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            int l10 = SafeParcelReader.l(r10);
            if (l10 == 1) {
                i10 = SafeParcelReader.t(parcel, r10);
            } else if (l10 == 2) {
                account = (Account) SafeParcelReader.e(parcel, r10, Account.CREATOR);
            } else if (l10 == 3) {
                i11 = SafeParcelReader.t(parcel, r10);
            } else if (l10 != 4) {
                SafeParcelReader.x(parcel, r10);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.e(parcel, r10, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new n0(i10, account, i11, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n0[] newArray(int i10) {
        return new n0[i10];
    }
}
