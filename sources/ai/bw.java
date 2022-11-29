package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class bw extends xu {

    /* renamed from: w  reason: collision with root package name */
    public final String f2565w;

    /* renamed from: x  reason: collision with root package name */
    public final String f2566x;

    public bw(String str, String str2) {
        this.f2565w = str;
        this.f2566x = str2;
    }

    @Override // ai.yu
    public final String a() throws RemoteException {
        return this.f2566x;
    }

    @Override // ai.yu
    public final String c() throws RemoteException {
        return this.f2565w;
    }
}
