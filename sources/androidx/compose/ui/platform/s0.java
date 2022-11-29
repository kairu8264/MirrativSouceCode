package androidx.compose.ui.platform;

import java.util.List;
import java.util.Map;
import u0.f;

/* loaded from: classes.dex */
public final class s0 implements u0.f {

    /* renamed from: a  reason: collision with root package name */
    public final io.a<wn.v> f14602a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u0.f f14603b;

    public s0(u0.f fVar, io.a<wn.v> aVar) {
        jo.p.h(fVar, "saveableStateRegistry");
        jo.p.h(aVar, "onDispose");
        this.f14602a = aVar;
        this.f14603b = fVar;
    }

    @Override // u0.f
    public boolean a(Object obj) {
        jo.p.h(obj, "value");
        return this.f14603b.a(obj);
    }

    @Override // u0.f
    public f.a b(String str, io.a<? extends Object> aVar) {
        jo.p.h(str, "key");
        jo.p.h(aVar, "valueProvider");
        return this.f14603b.b(str, aVar);
    }

    @Override // u0.f
    public Map<String, List<Object>> c() {
        return this.f14603b.c();
    }

    @Override // u0.f
    public Object d(String str) {
        jo.p.h(str, "key");
        return this.f14603b.d(str);
    }

    public final void e() {
        this.f14602a.invoke();
    }
}
