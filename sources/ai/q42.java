package ai;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class q42 {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, ya0> f8823a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final mn1 f8824b;

    public q42(mn1 mn1Var) {
        this.f8824b = mn1Var;
    }

    public final void a(String str) {
        try {
            this.f8823a.put(str, this.f8824b.c(str));
        } catch (RemoteException e10) {
            uj0.d("Couldn't create RTB adapter : ", e10);
        }
    }

    public final ya0 b(String str) {
        if (this.f8823a.containsKey(str)) {
            return this.f8823a.get(str);
        }
        return null;
    }
}
