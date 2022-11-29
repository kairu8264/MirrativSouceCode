package gi;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, ql.d<?>> f33630a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, ql.f<?>> f33631b;

    /* renamed from: c  reason: collision with root package name */
    public final ql.d<Object> f33632c;

    public x(Map<Class<?>, ql.d<?>> map, Map<Class<?>, ql.f<?>> map2, ql.d<Object> dVar) {
        this.f33630a = map;
        this.f33631b = map2;
        this.f33632c = dVar;
    }

    public final void a(Object obj, OutputStream outputStream) throws IOException {
        new u(outputStream, this.f33630a, this.f33631b, this.f33632c).j(obj);
    }
}
