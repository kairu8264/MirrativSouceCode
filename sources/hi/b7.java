package hi;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b7<T> implements Serializable, y6 {

    /* renamed from: w  reason: collision with root package name */
    public final T f35659w;

    public b7(T t10) {
        this.f35659w = t10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b7) {
            T t10 = this.f35659w;
            T t11 = ((b7) obj).f35659w;
            return t10 == t11 || t10.equals(t11);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35659w});
    }

    public final String toString() {
        String obj = this.f35659w.toString();
        StringBuilder sb2 = new StringBuilder(obj.length() + 22);
        sb2.append("Suppliers.ofInstance(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // hi.y6
    public final T zza() {
        return this.f35659w;
    }
}
