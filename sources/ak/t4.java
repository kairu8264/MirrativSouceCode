package ak;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class t4 implements dk.f0<Executor> {
    @Override // dk.f0
    public final /* bridge */ /* synthetic */ Executor zza() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(k4.f13512a);
        dk.e0.a(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }
}
