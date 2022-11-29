package dk;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class d0<T> implements f0, b0 {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f29684c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile f0<T> f29685a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f29686b = f29684c;

    public d0(f0<T> f0Var) {
        this.f29685a = f0Var;
    }

    public static <P extends f0<T>, T> b0<T> a(P p10) {
        if (p10 instanceof b0) {
            return (b0) p10;
        }
        Objects.requireNonNull(p10);
        return new d0(p10);
    }

    public static <P extends f0<T>, T> f0<T> b(P p10) {
        Objects.requireNonNull(p10);
        return p10 instanceof d0 ? p10 : new d0(p10);
    }

    @Override // dk.f0
    public final T zza() {
        T t10 = (T) this.f29686b;
        Object obj = f29684c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f29686b;
                if (t10 == obj) {
                    t10 = this.f29685a.zza();
                    Object obj2 = this.f29686b;
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
                    this.f29686b = t10;
                    this.f29685a = null;
                }
            }
        }
        return t10;
    }
}
