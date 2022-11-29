package hi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public b f35676a;

    /* renamed from: b  reason: collision with root package name */
    public b f35677b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f35678c;

    public c() {
        this.f35676a = new b("", 0L, null);
        this.f35677b = new b("", 0L, null);
        this.f35678c = new ArrayList();
    }

    public final b a() {
        return this.f35676a;
    }

    public final b b() {
        return this.f35677b;
    }

    public final List<b> c() {
        return this.f35678c;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        c cVar = new c(this.f35676a.clone());
        for (b bVar : this.f35678c) {
            cVar.f35678c.add(bVar.clone());
        }
        return cVar;
    }

    public final void d(b bVar) {
        this.f35676a = bVar;
        this.f35677b = bVar.clone();
        this.f35678c.clear();
    }

    public final void e(String str, long j10, Map<String, Object> map) {
        this.f35678c.add(new b(str, j10, map));
    }

    public final void f(b bVar) {
        this.f35677b = bVar;
    }

    public c(b bVar) {
        this.f35676a = bVar;
        this.f35677b = bVar.clone();
        this.f35678c = new ArrayList();
    }
}
