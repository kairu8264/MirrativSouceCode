package gm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import rm.k;
import sm.h;
import vm.l;
import yl.f;
import zf.g;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: i  reason: collision with root package name */
    public static final lm.a f33665i = lm.a.e();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f33666a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final im.a f33667b;

    /* renamed from: c  reason: collision with root package name */
    public final sm.d f33668c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f33669d;

    /* renamed from: e  reason: collision with root package name */
    public final pk.c f33670e;

    /* renamed from: f  reason: collision with root package name */
    public final xl.b<l> f33671f;

    /* renamed from: g  reason: collision with root package name */
    public final f f33672g;

    /* renamed from: h  reason: collision with root package name */
    public final xl.b<g> f33673h;

    public c(pk.c cVar, xl.b<l> bVar, f fVar, xl.b<g> bVar2, RemoteConfigManager remoteConfigManager, im.a aVar, SessionManager sessionManager) {
        this.f33669d = null;
        this.f33670e = cVar;
        this.f33671f = bVar;
        this.f33672g = fVar;
        this.f33673h = bVar2;
        if (cVar == null) {
            this.f33669d = Boolean.FALSE;
            this.f33667b = aVar;
            this.f33668c = new sm.d(new Bundle());
            return;
        }
        k.k().r(cVar, fVar, bVar2);
        Context h10 = cVar.h();
        sm.d a10 = a(h10);
        this.f33668c = a10;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f33667b = aVar;
        aVar.O(a10);
        aVar.M(h10);
        sessionManager.setApplicationContext(h10);
        this.f33669d = aVar.h();
        lm.a aVar2 = f33665i;
        if (aVar2.h() && d()) {
            aVar2.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", lm.b.b(cVar.k().e(), h10.getPackageName())));
        }
    }

    public static sm.d a(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            Log.d("isEnabled", "No perf enable meta data found " + e10.getMessage());
            bundle = null;
        }
        return bundle != null ? new sm.d(bundle) : new sm.d();
    }

    public static c c() {
        return (c) pk.c.i().g(c.class);
    }

    public static Trace f(String str) {
        Trace c10 = Trace.c(str);
        c10.start();
        return c10;
    }

    public Map<String, String> b() {
        return new HashMap(this.f33666a);
    }

    public boolean d() {
        Boolean bool = this.f33669d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return pk.c.i().q();
    }

    public mm.c e(String str, String str2) {
        return new mm.c(str, str2, k.k(), new h());
    }
}
