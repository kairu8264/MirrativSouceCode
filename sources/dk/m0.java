package dk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class m0 extends h0 implements n0 {
    public m0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // dk.h0
    public final boolean i0(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                y5(parcel.readInt(), (Bundle) i0.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                A0(parcel.readInt(), (Bundle) i0.a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                j3(parcel.readInt(), (Bundle) i0.a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                P0(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                r3((Bundle) i0.a(parcel, creator), (Bundle) i0.a(parcel, creator));
                return true;
            case 7:
                g0((Bundle) i0.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                h2((Bundle) i0.a(parcel, creator2), (Bundle) i0.a(parcel, creator2));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                x2((Bundle) i0.a(parcel, creator3), (Bundle) i0.a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                S2((Bundle) i0.a(parcel, creator4), (Bundle) i0.a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                w3((Bundle) i0.a(parcel, creator5), (Bundle) i0.a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                O1((Bundle) i0.a(parcel, creator6), (Bundle) i0.a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                A1((Bundle) i0.a(parcel, creator7), (Bundle) i0.a(parcel, creator7));
                return true;
            case 15:
                E0((Bundle) i0.a(parcel, Bundle.CREATOR));
                return true;
        }
    }
}
