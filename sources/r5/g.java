package r5;

import android.content.Context;

/* loaded from: classes.dex */
public class g {

    /* renamed from: e  reason: collision with root package name */
    public static g f49763e;

    /* renamed from: a  reason: collision with root package name */
    public a f49764a;

    /* renamed from: b  reason: collision with root package name */
    public b f49765b;

    /* renamed from: c  reason: collision with root package name */
    public e f49766c;

    /* renamed from: d  reason: collision with root package name */
    public f f49767d;

    public g(Context context, w5.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f49764a = new a(applicationContext, aVar);
        this.f49765b = new b(applicationContext, aVar);
        this.f49766c = new e(applicationContext, aVar);
        this.f49767d = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, w5.a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f49763e == null) {
                f49763e = new g(context, aVar);
            }
            gVar = f49763e;
        }
        return gVar;
    }

    public a a() {
        return this.f49764a;
    }

    public b b() {
        return this.f49765b;
    }

    public e d() {
        return this.f49766c;
    }

    public f e() {
        return this.f49767d;
    }
}
