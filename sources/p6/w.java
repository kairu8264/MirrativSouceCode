package p6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class w {

    /* loaded from: classes.dex */
    public static final class a implements ServiceConnection {

        /* renamed from: w  reason: collision with root package name */
        public long f46139w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f46140x = false;

        /* renamed from: y  reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f46141y = new LinkedBlockingQueue<>(1);

        public a(long j10) {
            this.f46139w = j10;
        }

        public IBinder a() throws InterruptedException {
            if (!this.f46140x) {
                this.f46140x = true;
                return this.f46141y.poll(this.f46139w, TimeUnit.MILLISECONDS);
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f46141y.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f46142a;

        /* renamed from: b  reason: collision with root package name */
        public final Boolean f46143b;

        public b(String str, Boolean bool) {
            this.f46142a = str;
            this.f46143b = bool;
        }

        public String a() {
            return this.f46142a;
        }

        public Boolean b() {
            return this.f46143b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements IInterface {

        /* renamed from: w  reason: collision with root package name */
        public IBinder f46144w;

        public c(IBinder iBinder) {
            this.f46144w = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f46144w;
        }

        public String i0() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f46144w.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public Boolean s0(boolean z10) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z10 ? 1 : 0);
                this.f46144w.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                Boolean valueOf = Boolean.valueOf(obtain2.readInt() != 0);
                if (valueOf != null) {
                    return Boolean.valueOf(!valueOf.booleanValue());
                }
                return null;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static b a(Context context, long j10) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                a aVar = new a(j10);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (context.bindService(intent, aVar, 1)) {
                        try {
                            c cVar = new c(aVar.a());
                            return new b(cVar.i0(), cVar.s0(true));
                        } catch (Exception e10) {
                            throw e10;
                        }
                    }
                    throw new IOException("Google Play connection failed");
                } finally {
                    context.unbindService(aVar);
                }
            } catch (Exception e11) {
                throw e11;
            }
        }
        throw new IllegalStateException("Google Play Services info can't be accessed from the main thread");
    }
}
