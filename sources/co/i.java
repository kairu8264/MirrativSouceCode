package co;

import java.lang.reflect.Method;
import jo.p;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f20013a = new i();

    /* renamed from: b  reason: collision with root package name */
    public static final a f20014b = new a(null, null, null);

    /* renamed from: c  reason: collision with root package name */
    public static a f20015c;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f20016a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f20017b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f20018c;

        public a(Method method, Method method2, Method method3) {
            this.f20016a = method;
            this.f20017b = method2;
            this.f20018c = method3;
        }
    }

    public final a a(co.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f20015c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f20014b;
            f20015c = aVar3;
            return aVar3;
        }
    }

    public final String b(co.a aVar) {
        p.h(aVar, "continuation");
        a aVar2 = f20015c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 == f20014b) {
            return null;
        }
        Method method = aVar2.f20016a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f20017b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f20018c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
