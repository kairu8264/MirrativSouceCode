package ai;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class pn3<T> implements eo3, kn3 {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f8482c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile eo3<T> f8483a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f8484b = f8482c;

    public pn3(eo3<T> eo3Var) {
        this.f8483a = eo3Var;
    }

    public static <P extends eo3<T>, T> eo3<T> a(P p10) {
        Objects.requireNonNull(p10);
        return p10 instanceof pn3 ? p10 : new pn3(p10);
    }

    public static <P extends eo3<T>, T> kn3<T> b(P p10) {
        if (p10 instanceof kn3) {
            return (kn3) p10;
        }
        Objects.requireNonNull(p10);
        return new pn3(p10);
    }

    @Override // ai.eo3
    public final T zzb() {
        T t10 = (T) this.f8484b;
        Object obj = f8482c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f8484b;
                if (t10 == obj) {
                    t10 = this.f8483a.zzb();
                    Object obj2 = this.f8484b;
                    if (obj2 != obj && obj2 != t10) {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(t10);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb2.append("Scoped provider was invoked recursively returning different results: ");
                        sb2.append(valueOf);
                        sb2.append(" & ");
                        sb2.append(valueOf2);
                        sb2.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    this.f8484b = t10;
                    this.f8483a = null;
                }
            }
        }
        return t10;
    }
}
