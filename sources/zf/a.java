package zf;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f63183a;

    /* renamed from: b  reason: collision with root package name */
    public final T f63184b;

    /* renamed from: c  reason: collision with root package name */
    public final d f63185c;

    public a(Integer num, T t10, d dVar) {
        this.f63183a = num;
        Objects.requireNonNull(t10, "Null payload");
        this.f63184b = t10;
        Objects.requireNonNull(dVar, "Null priority");
        this.f63185c = dVar;
    }

    @Override // zf.c
    public Integer a() {
        return this.f63183a;
    }

    @Override // zf.c
    public T b() {
        return this.f63184b;
    }

    @Override // zf.c
    public d c() {
        return this.f63185c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            Integer num = this.f63183a;
            if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
                if (this.f63184b.equals(cVar.b()) && this.f63185c.equals(cVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f63183a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f63184b.hashCode()) * 1000003) ^ this.f63185c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f63183a + ", payload=" + this.f63184b + ", priority=" + this.f63185c + "}";
    }
}
