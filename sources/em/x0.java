package em;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import em.a1;

/* loaded from: classes4.dex */
public class x0 extends Binder {

    /* renamed from: w  reason: collision with root package name */
    public final a f30766w;

    /* loaded from: classes4.dex */
    public interface a {
        vi.g<Void> a(Intent intent);
    }

    public x0(a aVar) {
        this.f30766w = aVar;
    }

    public void b(final a1.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f30766w.a(aVar.f30657a).b(w0.f30764w, new vi.c() { // from class: em.v0
                @Override // vi.c
                public final void a(vi.g gVar) {
                    a1.a.this.b();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
