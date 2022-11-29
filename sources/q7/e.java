package q7;

import android.util.Log;
import h7.a;
import java.io.File;
import java.io.IOException;
import q7.a;

/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: b  reason: collision with root package name */
    public final File f48759b;

    /* renamed from: c  reason: collision with root package name */
    public final long f48760c;

    /* renamed from: e  reason: collision with root package name */
    public h7.a f48762e;

    /* renamed from: d  reason: collision with root package name */
    public final c f48761d = new c();

    /* renamed from: a  reason: collision with root package name */
    public final j f48758a = new j();

    @Deprecated
    public e(File file, long j10) {
        this.f48759b = file;
        this.f48760c = j10;
    }

    public static a c(File file, long j10) {
        return new e(file, j10);
    }

    @Override // q7.a
    public void a(m7.e eVar, a.b bVar) {
        h7.a d10;
        String b10 = this.f48758a.b(eVar);
        this.f48761d.a(b10);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b10 + " for for Key: " + eVar);
            }
            try {
                d10 = d();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
            if (d10.G(b10) != null) {
                return;
            }
            a.c C = d10.C(b10);
            if (C != null) {
                try {
                    if (bVar.a(C.f(0))) {
                        C.e();
                    }
                    C.b();
                    return;
                } catch (Throwable th2) {
                    C.b();
                    throw th2;
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: " + b10);
        } finally {
            this.f48761d.b(b10);
        }
    }

    @Override // q7.a
    public File b(m7.e eVar) {
        String b10 = this.f48758a.b(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b10 + " for for Key: " + eVar);
        }
        try {
            a.e G = d().G(b10);
            if (G != null) {
                return G.a(0);
            }
            return null;
        } catch (IOException e10) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
                return null;
            }
            return null;
        }
    }

    @Override // q7.a
    public synchronized void clear() {
        try {
            d().v();
        } catch (IOException e10) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e10);
            }
        }
        e();
    }

    public final synchronized h7.a d() throws IOException {
        if (this.f48762e == null) {
            this.f48762e = h7.a.K(this.f48759b, 1, 1, this.f48760c);
        }
        return this.f48762e;
    }

    public final synchronized void e() {
        this.f48762e = null;
    }
}
