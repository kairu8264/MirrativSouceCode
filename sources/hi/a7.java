package hi;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a7<T> implements y6<T> {

    /* renamed from: w  reason: collision with root package name */
    public volatile y6<T> f35633w;

    /* renamed from: x  reason: collision with root package name */
    public volatile boolean f35634x;

    /* renamed from: y  reason: collision with root package name */
    public T f35635y;

    public a7(y6<T> y6Var) {
        Objects.requireNonNull(y6Var);
        this.f35633w = y6Var;
    }

    public final String toString() {
        Object obj = this.f35633w;
        if (obj == null) {
            String valueOf = String.valueOf(this.f35635y);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(TopicConstant.MATCH_PREFIX);
            obj = sb2.toString();
        }
        String obj2 = obj.toString();
        StringBuilder sb3 = new StringBuilder(obj2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(obj2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // hi.y6
    public final T zza() {
        if (!this.f35634x) {
            synchronized (this) {
                if (!this.f35634x) {
                    y6<T> y6Var = this.f35633w;
                    y6Var.getClass();
                    T zza = y6Var.zza();
                    this.f35635y = zza;
                    this.f35634x = true;
                    this.f35633w = null;
                    return zza;
                }
            }
        }
        return this.f35635y;
    }
}
