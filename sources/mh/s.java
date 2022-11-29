package mh;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Messenger f41168a;

    /* renamed from: b  reason: collision with root package name */
    public final i f41169b;

    public s(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f41168a = new Messenger(iBinder);
            this.f41169b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f41169b = new i(iBinder);
            this.f41168a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public final void a(Message message) throws RemoteException {
        Messenger messenger = this.f41168a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        i iVar = this.f41169b;
        if (iVar != null) {
            iVar.b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
