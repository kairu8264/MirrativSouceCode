package in;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class o {

    /* renamed from: g  reason: collision with root package name */
    public static final h f36921g = new d();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: h  reason: collision with root package name */
    public static volatile o f36922h;

    /* renamed from: a  reason: collision with root package name */
    public final Context f36923a;

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f36924b;

    /* renamed from: c  reason: collision with root package name */
    public final q f36925c;

    /* renamed from: d  reason: collision with root package name */
    public final kn.a f36926d;

    /* renamed from: e  reason: collision with root package name */
    public final h f36927e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f36928f;

    public o(s sVar) {
        Context context = sVar.f36935a;
        this.f36923a = context;
        this.f36926d = new kn.a(context);
        q qVar = sVar.f36937c;
        if (qVar == null) {
            this.f36925c = new q(kn.b.c(context, "com.twitter.sdk.android.CONSUMER_KEY", ""), kn.b.c(context, "com.twitter.sdk.android.CONSUMER_SECRET", ""));
        } else {
            this.f36925c = qVar;
        }
        ExecutorService executorService = sVar.f36938d;
        if (executorService == null) {
            this.f36924b = kn.e.e("twitter-worker");
        } else {
            this.f36924b = executorService;
        }
        h hVar = sVar.f36936b;
        if (hVar == null) {
            this.f36927e = f36921g;
        } else {
            this.f36927e = hVar;
        }
        Boolean bool = sVar.f36939e;
        if (bool == null) {
            this.f36928f = false;
        } else {
            this.f36928f = bool.booleanValue();
        }
    }

    public static void a() {
        if (f36922h == null) {
            throw new IllegalStateException("Must initialize Twitter before using getInstance()");
        }
    }

    public static synchronized o b(s sVar) {
        synchronized (o.class) {
            if (f36922h == null) {
                f36922h = new o(sVar);
                return f36922h;
            }
            return f36922h;
        }
    }

    public static o f() {
        a();
        return f36922h;
    }

    public static h g() {
        if (f36922h == null) {
            return f36921g;
        }
        return f36922h.f36927e;
    }

    public static void i(s sVar) {
        b(sVar);
    }

    public kn.a c() {
        return this.f36926d;
    }

    public Context d(String str) {
        Context context = this.f36923a;
        return new t(context, str, ".TwitterKit" + File.separator + str);
    }

    public ExecutorService e() {
        return this.f36924b;
    }

    public q h() {
        return this.f36925c;
    }
}
