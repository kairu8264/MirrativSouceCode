package tq;

import java.util.HashMap;
import java.util.HashSet;
import jo.h;
import jo.p;
import rq.c;
import rq.d;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f53901a;

    /* renamed from: b  reason: collision with root package name */
    public HashSet<d<?>> f53902b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, c<?>> f53903c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<vq.a> f53904d;

    public a() {
        this(false, 1, null);
    }

    public a(boolean z10) {
        this.f53901a = z10;
        this.f53902b = new HashSet<>();
        this.f53903c = new HashMap<>();
        this.f53904d = new HashSet<>();
    }

    public static /* synthetic */ void f(a aVar, String str, c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.e(str, cVar, z10);
    }

    public final boolean a() {
        return this.f53901a;
    }

    public final HashSet<d<?>> b() {
        return this.f53902b;
    }

    public final HashMap<String, c<?>> c() {
        return this.f53903c;
    }

    public final HashSet<vq.a> d() {
        return this.f53904d;
    }

    public final void e(String str, c<?> cVar, boolean z10) {
        p.h(str, "mapping");
        p.h(cVar, "factory");
        if (!z10 && this.f53903c.containsKey(str)) {
            b.a(cVar, str);
        }
        this.f53903c.put(str, cVar);
    }

    public /* synthetic */ a(boolean z10, int i10, h hVar) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
