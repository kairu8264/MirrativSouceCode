package gi;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class w implements rl.b<w> {

    /* renamed from: d  reason: collision with root package name */
    public static final ql.d<Object> f33625d = v.f33624a;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f33626e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, ql.d<?>> f33627a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, ql.f<?>> f33628b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ql.d<Object> f33629c = f33625d;

    @Override // rl.b
    public final /* bridge */ /* synthetic */ w a(Class cls, ql.d dVar) {
        this.f33627a.put(cls, dVar);
        this.f33628b.remove(cls);
        return this;
    }

    public final x b() {
        return new x(new HashMap(this.f33627a), new HashMap(this.f33628b), this.f33629c);
    }
}
