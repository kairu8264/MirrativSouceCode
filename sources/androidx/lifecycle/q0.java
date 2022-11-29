package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: w  reason: collision with root package name */
    public final Map<String, Object> f15610w = new HashMap();

    /* renamed from: x  reason: collision with root package name */
    public volatile boolean f15611x = false;

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f15611x = true;
        Map<String, Object> map = this.f15610w;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f15610w.values()) {
                    b(obj);
                }
            }
        }
        d();
    }

    public <T> T c(String str) {
        T t10;
        Map<String, Object> map = this.f15610w;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = (T) this.f15610w.get(str);
        }
        return t10;
    }

    public void d() {
    }

    public <T> T e(String str, T t10) {
        Object obj;
        synchronized (this.f15610w) {
            obj = this.f15610w.get(str);
            if (obj == null) {
                this.f15610w.put(str, t10);
            }
        }
        if (obj != null) {
            t10 = obj;
        }
        if (this.f15611x) {
            b(t10);
        }
        return t10;
    }
}
