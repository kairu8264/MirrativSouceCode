package s6;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l<V> {

    /* renamed from: a  reason: collision with root package name */
    public final V f52164a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f52165b;

    public l(V v10) {
        this.f52164a = v10;
        this.f52165b = null;
    }

    public Throwable a() {
        return this.f52165b;
    }

    public V b() {
        return this.f52164a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (b() == null || !b().equals(lVar.b())) {
                if (a() == null || lVar.a() == null) {
                    return false;
                }
                return a().toString().equals(a().toString());
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public l(Throwable th2) {
        this.f52165b = th2;
        this.f52164a = null;
    }
}
