package ar;

import java.util.Map;
import jo.p;
import qo.b;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<b<?>, String> f16659a = cr.a.f28611a.e();

    public static final String a(b<?> bVar) {
        p.h(bVar, "<this>");
        String str = f16659a.get(bVar);
        return str == null ? b(bVar) : str;
    }

    public static final String b(b<?> bVar) {
        p.h(bVar, "<this>");
        String c10 = cr.a.f28611a.c(bVar);
        f16659a.put(bVar, c10);
        return c10;
    }
}
