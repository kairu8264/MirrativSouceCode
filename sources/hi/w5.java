package hi;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class w5 implements a6 {

    /* renamed from: g  reason: collision with root package name */
    public static final Map<Uri, w5> f36033g = new s.a();

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f36034h = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f36035a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f36036b;

    /* renamed from: c  reason: collision with root package name */
    public final ContentObserver f36037c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f36038d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Map<String, String> f36039e;

    /* renamed from: f  reason: collision with root package name */
    public final List<x5> f36040f;

    public w5(ContentResolver contentResolver, Uri uri) {
        u5 u5Var = new u5(this, null);
        this.f36037c = u5Var;
        this.f36038d = new Object();
        this.f36040f = new ArrayList();
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f36035a = contentResolver;
        this.f36036b = uri;
        contentResolver.registerContentObserver(uri, false, u5Var);
    }

    public static w5 a(ContentResolver contentResolver, Uri uri) {
        w5 w5Var;
        synchronized (w5.class) {
            Map<Uri, w5> map = f36033g;
            w5Var = map.get(uri);
            if (w5Var == null) {
                try {
                    w5 w5Var2 = new w5(contentResolver, uri);
                    try {
                        map.put(uri, w5Var2);
                    } catch (SecurityException unused) {
                    }
                    w5Var = w5Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return w5Var;
    }

    public static synchronized void d() {
        synchronized (w5.class) {
            for (w5 w5Var : f36033g.values()) {
                w5Var.f36035a.unregisterContentObserver(w5Var.f36037c);
            }
            f36033g.clear();
        }
    }

    public final Map<String, String> b() {
        Map<String, String> map;
        Map<String, String> map2 = this.f36039e;
        if (map2 == null) {
            synchronized (this.f36038d) {
                map2 = this.f36039e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) y5.a(new z5() { // from class: hi.t5
                            @Override // hi.z5
                            public final Object zza() {
                                return w5.this.c();
                            }
                        });
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.f36039e = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    public final /* synthetic */ Map c() {
        Map hashMap;
        Cursor query = this.f36035a.query(this.f36036b, f36034h, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new s.a(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    public final void e() {
        synchronized (this.f36038d) {
            this.f36039e = null;
            q6.e();
        }
        synchronized (this) {
            for (x5 x5Var : this.f36040f) {
                x5Var.zza();
            }
        }
    }

    @Override // hi.a6
    public final /* bridge */ /* synthetic */ Object t(String str) {
        return b().get(str);
    }
}
