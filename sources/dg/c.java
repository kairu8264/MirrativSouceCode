package dg;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f29615a;

    /* renamed from: b  reason: collision with root package name */
    public final ng.a f29616b;

    /* renamed from: c  reason: collision with root package name */
    public final ng.a f29617c;

    /* renamed from: d  reason: collision with root package name */
    public final String f29618d;

    public c(Context context, ng.a aVar, ng.a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f29615a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f29616b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f29617c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f29618d = str;
    }

    @Override // dg.h
    public Context b() {
        return this.f29615a;
    }

    @Override // dg.h
    public String c() {
        return this.f29618d;
    }

    @Override // dg.h
    public ng.a d() {
        return this.f29617c;
    }

    @Override // dg.h
    public ng.a e() {
        return this.f29616b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f29615a.equals(hVar.b()) && this.f29616b.equals(hVar.e()) && this.f29617c.equals(hVar.d()) && this.f29618d.equals(hVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f29615a.hashCode() ^ 1000003) * 1000003) ^ this.f29616b.hashCode()) * 1000003) ^ this.f29617c.hashCode()) * 1000003) ^ this.f29618d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f29615a + ", wallClock=" + this.f29616b + ", monotonicClock=" + this.f29617c + ", backendName=" + this.f29618d + "}";
    }
}
