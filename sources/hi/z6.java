package hi;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class z6<T> implements Serializable, y6 {

    /* renamed from: w  reason: collision with root package name */
    public final y6<T> f36086w;

    /* renamed from: x  reason: collision with root package name */
    public volatile transient boolean f36087x;

    /* renamed from: y  reason: collision with root package name */
    public transient T f36088y;

    public z6(y6<T> y6Var) {
        Objects.requireNonNull(y6Var);
        this.f36086w = y6Var;
    }

    public final String toString() {
        Object obj;
        if (this.f36087x) {
            String valueOf = String.valueOf(this.f36088y);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(TopicConstant.MATCH_PREFIX);
            obj = sb2.toString();
        } else {
            obj = this.f36086w;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(valueOf2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // hi.y6
    public final T zza() {
        if (!this.f36087x) {
            synchronized (this) {
                if (!this.f36087x) {
                    T zza = this.f36086w.zza();
                    this.f36088y = zza;
                    this.f36087x = true;
                    return zza;
                }
            }
        }
        return this.f36088y;
    }
}
