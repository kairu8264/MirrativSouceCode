package mh;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;

/* loaded from: classes3.dex */
public abstract class u<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f41170a;

    /* renamed from: b  reason: collision with root package name */
    public final vi.h<T> f41171b = new vi.h<>();

    /* renamed from: c  reason: collision with root package name */
    public final int f41172c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f41173d;

    public u(int i10, int i11, Bundle bundle) {
        this.f41170a = i10;
        this.f41172c = i11;
        this.f41173d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzqVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f41171b.b(zzqVar);
    }

    public final void d(T t10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f41171b.c(t10);
    }

    public final String toString() {
        int i10 = this.f41172c;
        int i11 = this.f41170a;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i10);
        sb2.append(" id=");
        sb2.append(i11);
        sb2.append(" oneWay=");
        sb2.append(b());
        sb2.append("}");
        return sb2.toString();
    }
}
