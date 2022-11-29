package com.google.firebase.messaging;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import vi.g;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f28003a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, g<String>> f28004b = new s.a();

    /* loaded from: classes4.dex */
    public interface a {
        g<String> start();
    }

    public e(Executor executor) {
        this.f28003a = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized g<String> a(final String str, a aVar) {
        g<String> gVar = this.f28004b.get(str);
        if (gVar != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Joining ongoing request for: ".concat(valueOf) : new String("Joining ongoing request for: "));
            }
            return gVar;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf2 = String.valueOf(str);
            Log.d("FirebaseMessaging", valueOf2.length() != 0 ? "Making new request for: ".concat(valueOf2) : new String("Making new request for: "));
        }
        g l10 = aVar.start().l(this.f28003a, new vi.a() { // from class: em.k0
            @Override // vi.a
            public final Object a(vi.g gVar2) {
                com.google.firebase.messaging.e.this.b(str, gVar2);
                return gVar2;
            }
        });
        this.f28004b.put(str, l10);
        return l10;
    }

    public /* synthetic */ g b(String str, g gVar) throws Exception {
        synchronized (this) {
            this.f28004b.remove(str);
        }
        return gVar;
    }
}
