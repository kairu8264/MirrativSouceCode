package mh;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import mh.c;

/* loaded from: classes3.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new g();

    /* renamed from: w  reason: collision with root package name */
    public Messenger f41150w;

    /* renamed from: x  reason: collision with root package name */
    public c f41151x;

    public i(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f41150w = new Messenger(iBinder);
        } else {
            this.f41151x = new c.a(iBinder);
        }
    }

    public final IBinder a() {
        Messenger messenger = this.f41150w;
        return messenger != null ? messenger.getBinder() : this.f41151x.asBinder();
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.f41150w;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f41151x.N3(message);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((i) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f41150w;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f41151x.asBinder());
        }
    }
}
