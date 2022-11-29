package ti;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class e extends di.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // di.b
    public final boolean h1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) di.c.a(parcel, ConnectionResult.CREATOR);
                b bVar = (b) di.c.a(parcel, b.CREATOR);
                break;
            case 4:
                Status status = (Status) di.c.a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) di.c.a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) di.c.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) di.c.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                o2((l) di.c.a(parcel, l.CREATOR));
                break;
            case 9:
                h hVar = (h) di.c.a(parcel, h.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
