package wm;

import android.util.Log;
import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f59201e = Charset.forName(C.UTF8_NAME);

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f59202f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f59203g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a  reason: collision with root package name */
    public final Set<vh.d<String, com.google.firebase.remoteconfig.internal.a>> f59204a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f59205b;

    /* renamed from: c  reason: collision with root package name */
    public final d f59206c;

    /* renamed from: d  reason: collision with root package name */
    public final d f59207d;

    public j(Executor executor, d dVar, d dVar2) {
        this.f59205b = executor;
        this.f59206c = dVar;
        this.f59207d = dVar2;
    }

    public static com.google.firebase.remoteconfig.internal.a e(d dVar) {
        return dVar.f();
    }

    public static Set<String> f(d dVar) {
        HashSet hashSet = new HashSet();
        com.google.firebase.remoteconfig.internal.a e10 = e(dVar);
        if (e10 == null) {
            return hashSet;
        }
        Iterator<String> keys = e10.d().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    public static String g(d dVar, String str) {
        com.google.firebase.remoteconfig.internal.a e10 = e(dVar);
        if (e10 == null) {
            return null;
        }
        try {
            return e10.d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void j(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(vh.d<String, com.google.firebase.remoteconfig.internal.a> dVar) {
        synchronized (this.f59204a) {
            this.f59204a.add(dVar);
        }
    }

    public final void c(final String str, final com.google.firebase.remoteconfig.internal.a aVar) {
        if (aVar == null) {
            return;
        }
        synchronized (this.f59204a) {
            for (final vh.d<String, com.google.firebase.remoteconfig.internal.a> dVar : this.f59204a) {
                this.f59205b.execute(new Runnable() { // from class: wm.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        vh.d.this.a(str, aVar);
                    }
                });
            }
        }
    }

    public Map<String, vm.h> d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(f(this.f59206c));
        hashSet.addAll(f(this.f59207d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, h(str));
        }
        return hashMap;
    }

    public vm.h h(String str) {
        String g10 = g(this.f59206c, str);
        if (g10 != null) {
            c(str, e(this.f59206c));
            return new l(g10, 2);
        }
        String g11 = g(this.f59207d, str);
        if (g11 != null) {
            return new l(g11, 1);
        }
        j(str, "FirebaseRemoteConfigValue");
        return new l("", 0);
    }
}
