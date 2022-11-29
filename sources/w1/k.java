package w1;

import androidx.compose.ui.platform.f1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k implements y, Iterable<Map.Entry<? extends x<?>, ? extends Object>>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public final Map<x<?>, Object> f57923w = new LinkedHashMap();

    /* renamed from: x  reason: collision with root package name */
    public boolean f57924x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f57925y;

    @Override // w1.y
    public <T> void d(x<T> xVar, T t10) {
        jo.p.h(xVar, "key");
        this.f57923w.put(xVar, t10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return jo.p.c(this.f57923w, kVar.f57923w) && this.f57924x == kVar.f57924x && this.f57925y == kVar.f57925y;
        }
        return false;
    }

    public final void f(k kVar) {
        jo.p.h(kVar, "peer");
        if (kVar.f57924x) {
            this.f57924x = true;
        }
        if (kVar.f57925y) {
            this.f57925y = true;
        }
        for (Map.Entry<x<?>, Object> entry : kVar.f57923w.entrySet()) {
            x<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.f57923w.containsKey(key)) {
                this.f57923w.put(key, value);
            } else if (value instanceof a) {
                Object obj = this.f57923w.get(key);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                a aVar = (a) obj;
                Map<x<?>, Object> map = this.f57923w;
                String b10 = aVar.b();
                if (b10 == null) {
                    b10 = ((a) value).b();
                }
                wn.b a10 = aVar.a();
                if (a10 == null) {
                    a10 = ((a) value).a();
                }
                map.put(key, new a(b10, a10));
            }
        }
    }

    public final <T> boolean g(x<T> xVar) {
        jo.p.h(xVar, "key");
        return this.f57923w.containsKey(xVar);
    }

    public int hashCode() {
        return (((this.f57923w.hashCode() * 31) + Boolean.hashCode(this.f57924x)) * 31) + Boolean.hashCode(this.f57925y);
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends x<?>, ? extends Object>> iterator() {
        return this.f57923w.entrySet().iterator();
    }

    public final k j() {
        k kVar = new k();
        kVar.f57924x = this.f57924x;
        kVar.f57925y = this.f57925y;
        kVar.f57923w.putAll(this.f57923w);
        return kVar;
    }

    public final <T> T k(x<T> xVar) {
        jo.p.h(xVar, "key");
        T t10 = (T) this.f57923w.get(xVar);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Key not present: " + xVar + " - consider getOrElse or getOrNull");
    }

    public final <T> T m(x<T> xVar, io.a<? extends T> aVar) {
        jo.p.h(xVar, "key");
        jo.p.h(aVar, "defaultValue");
        T t10 = (T) this.f57923w.get(xVar);
        return t10 == null ? aVar.invoke() : t10;
    }

    public final <T> T p(x<T> xVar, io.a<? extends T> aVar) {
        jo.p.h(xVar, "key");
        jo.p.h(aVar, "defaultValue");
        T t10 = (T) this.f57923w.get(xVar);
        return t10 == null ? aVar.invoke() : t10;
    }

    public final boolean r() {
        return this.f57925y;
    }

    public final boolean s() {
        return this.f57924x;
    }

    public final void t(k kVar) {
        jo.p.h(kVar, "child");
        for (Map.Entry<x<?>, Object> entry : kVar.f57923w.entrySet()) {
            x<?> key = entry.getKey();
            Object b10 = key.b(this.f57923w.get(key), entry.getValue());
            if (b10 != null) {
                this.f57923w.put(key, b10);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.f57924x) {
            sb2.append("");
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f57925y) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<x<?>, Object> entry : this.f57923w.entrySet()) {
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(entry.getKey().a());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return f1.a(this, null) + "{ " + ((Object) sb2) + " }";
    }

    public final void u(boolean z10) {
        this.f57925y = z10;
    }

    public final void w(boolean z10) {
        this.f57924x = z10;
    }
}
