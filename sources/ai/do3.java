package ai;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class do3<T> implements eo3<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f3363c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile eo3<T> f3364a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f3365b = f3363c;

    public do3(eo3<T> eo3Var) {
        this.f3364a = eo3Var;
    }

    public static <P extends eo3<T>, T> eo3<T> a(P p10) {
        if ((p10 instanceof do3) || (p10 instanceof pn3)) {
            return p10;
        }
        Objects.requireNonNull(p10);
        return new do3(p10);
    }

    @Override // ai.eo3
    public final T zzb() {
        T t10 = (T) this.f3365b;
        if (t10 == f3363c) {
            eo3<T> eo3Var = this.f3364a;
            if (eo3Var == null) {
                return (T) this.f3365b;
            }
            T zzb = eo3Var.zzb();
            this.f3365b = zzb;
            this.f3364a = null;
            return zzb;
        }
        return t10;
    }
}
