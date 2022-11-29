package em;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f30696c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static a1 f30697d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f30698a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f30699b = k.f30693w;

    public l(Context context) {
        this.f30698a = context;
    }

    public static vi.g<Integer> a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return b(context, "com.google.firebase.MESSAGING_EVENT").c(intent).j(k.f30693w, h.f30689a);
    }

    public static a1 b(Context context, String str) {
        a1 a1Var;
        synchronized (f30696c) {
            if (f30697d == null) {
                f30697d = new a1(context, "com.google.firebase.MESSAGING_EVENT");
            }
            a1Var = f30697d;
        }
        return a1Var;
    }

    public static /* synthetic */ Integer c(vi.g gVar) throws Exception {
        return -1;
    }

    public static /* synthetic */ Integer e(vi.g gVar) throws Exception {
        return 403;
    }

    public static /* synthetic */ vi.g f(Context context, Intent intent, vi.g gVar) throws Exception {
        return (vh.n.k() && ((Integer) gVar.o()).intValue() == 402) ? a(context, intent).j(k.f30693w, i.f30690a) : gVar;
    }

    public vi.g<Integer> g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f30698a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public vi.g<Integer> h(final Context context, final Intent intent) {
        boolean z10 = false;
        if (vh.n.k() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z10 = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (z10 && flags == 0) {
            return a(context, intent);
        }
        return vi.j.c(this.f30699b, new Callable() { // from class: em.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(l0.b().g(context, intent));
                return valueOf;
            }
        }).l(this.f30699b, new vi.a() { // from class: em.g
            @Override // vi.a
            public final Object a(vi.g gVar) {
                return l.f(context, intent, gVar);
            }
        });
    }
}
