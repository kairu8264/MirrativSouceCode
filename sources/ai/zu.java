package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zu {

    /* renamed from: a  reason: collision with root package name */
    public final String f13187a;

    /* renamed from: b  reason: collision with root package name */
    public final yu f13188b;

    public zu(yu yuVar) {
        String str;
        this.f13188b = yuVar;
        try {
            str = yuVar.c();
        } catch (RemoteException e10) {
            uj0.d("", e10);
            str = null;
        }
        this.f13187a = str;
    }

    public final String toString() {
        return this.f13187a;
    }
}
