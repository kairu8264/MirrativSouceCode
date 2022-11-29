package uk;

import java.util.HashSet;
import java.util.Set;
import tk.a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f55969a;

    /* renamed from: b  reason: collision with root package name */
    public final a.b f55970b;

    /* renamed from: c  reason: collision with root package name */
    public final oi.a f55971c;

    /* renamed from: d  reason: collision with root package name */
    public final c f55972d;

    public d(oi.a aVar, a.b bVar) {
        this.f55970b = bVar;
        this.f55971c = aVar;
        c cVar = new c(this);
        this.f55972d = cVar;
        aVar.q(cVar);
        this.f55969a = new HashSet();
    }
}
