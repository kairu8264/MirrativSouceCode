package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class jg0 extends of0 {

    /* renamed from: w  reason: collision with root package name */
    public final String f5774w;

    /* renamed from: x  reason: collision with root package name */
    public final int f5775x;

    public jg0(String str, int i10) {
        this.f5774w = str;
        this.f5775x = i10;
    }

    @Override // ai.pf0
    public final int a() throws RemoteException {
        return this.f5775x;
    }

    @Override // ai.pf0
    public final String c() throws RemoteException {
        return this.f5774w;
    }
}
