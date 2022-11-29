package cr;

import i7.e;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jo.p;
import pq.b;
import pq.c;
import so.o;
import wn.i;
import xn.a0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28611a = new a();

    public final c a() {
        return b.f48484a;
    }

    public final i b() {
        return i.SYNCHRONIZED;
    }

    public final String c(qo.b<?> bVar) {
        p.h(bVar, "kClass");
        String name = ho.a.a(bVar).getName();
        p.g(name, "kClass.java.name");
        return name;
    }

    public final String d(Exception exc) {
        String className;
        p.h(exc, e.f36387u);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(exc);
        sb2.append("\n\t");
        StackTraceElement[] stackTrace = exc.getStackTrace();
        p.g(stackTrace, "e.stackTrace");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            p.g(stackTraceElement.getClassName(), "it.className");
            if (!(!o.H(className, "sun.reflect", false, 2, null))) {
                break;
            }
            arrayList.add(stackTraceElement);
        }
        sb2.append(a0.g0(arrayList, "\n\t", null, null, 0, null, null, 62, null));
        return sb2.toString();
    }

    public final <K, V> Map<K, V> e() {
        return new ConcurrentHashMap();
    }

    public final <R> R f(Object obj, io.a<? extends R> aVar) {
        R invoke;
        p.h(obj, "lock");
        p.h(aVar, "block");
        synchronized (obj) {
            invoke = aVar.invoke();
        }
        return invoke;
    }
}
