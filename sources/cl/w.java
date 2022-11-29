package cl;

import cl.c0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class w extends c0 {

    /* renamed from: a  reason: collision with root package name */
    public final c0.a f19986a;

    /* renamed from: b  reason: collision with root package name */
    public final c0.c f19987b;

    /* renamed from: c  reason: collision with root package name */
    public final c0.b f19988c;

    public w(c0.a aVar, c0.c cVar, c0.b bVar) {
        Objects.requireNonNull(aVar, "Null appData");
        this.f19986a = aVar;
        Objects.requireNonNull(cVar, "Null osData");
        this.f19987b = cVar;
        Objects.requireNonNull(bVar, "Null deviceData");
        this.f19988c = bVar;
    }

    @Override // cl.c0
    public c0.a a() {
        return this.f19986a;
    }

    @Override // cl.c0
    public c0.b c() {
        return this.f19988c;
    }

    @Override // cl.c0
    public c0.c d() {
        return this.f19987b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return this.f19986a.equals(c0Var.a()) && this.f19987b.equals(c0Var.d()) && this.f19988c.equals(c0Var.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f19986a.hashCode() ^ 1000003) * 1000003) ^ this.f19987b.hashCode()) * 1000003) ^ this.f19988c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f19986a + ", osData=" + this.f19987b + ", deviceData=" + this.f19988c + "}";
    }
}
