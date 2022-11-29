package wn;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class c<T> implements f<T>, Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final T f59215w;

    public c(T t10) {
        this.f59215w = t10;
    }

    @Override // wn.f
    public T getValue() {
        return this.f59215w;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
