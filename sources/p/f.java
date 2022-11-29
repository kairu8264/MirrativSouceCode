package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f45642a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ICustomTabsService f45643b;

    /* renamed from: c  reason: collision with root package name */
    public final ICustomTabsCallback f45644c;

    /* renamed from: d  reason: collision with root package name */
    public final ComponentName f45645d;

    /* renamed from: e  reason: collision with root package name */
    public final PendingIntent f45646e;

    public f(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName, PendingIntent pendingIntent) {
        this.f45643b = iCustomTabsService;
        this.f45644c = iCustomTabsCallback;
        this.f45645d = componentName;
        this.f45646e = pendingIntent;
    }

    public IBinder a() {
        return this.f45644c.asBinder();
    }

    public ComponentName b() {
        return this.f45645d;
    }

    public PendingIntent c() {
        return this.f45646e;
    }
}
