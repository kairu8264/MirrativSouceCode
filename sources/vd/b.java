package vd;

import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f57299a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<String, Trace> f57300b = new WeakHashMap<>();

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Trace a(String str) {
            p.h(str, "tracename");
            return (Trace) b.f57300b.get(str);
        }

        public final Trace b(String str) {
            p.h(str, "tracename");
            Trace f10 = gm.c.f(str);
            p.g(f10, "startTrace(tracename)");
            b.f57300b.put(str, f10);
            return f10;
        }

        public final void c(String str) {
            p.h(str, "tracename");
            Trace a10 = a(str);
            if (a10 != null) {
                a10.stop();
                b.f57300b.remove(str);
            }
        }
    }
}
