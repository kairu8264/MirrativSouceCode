package op;

import java.lang.reflect.Method;
import jo.p;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f45508d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Method f45509a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f45510b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f45511c;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final h a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new h(method3, method2, method);
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public h(Method method, Method method2, Method method3) {
        this.f45509a = method;
        this.f45510b = method2;
        this.f45511c = method3;
    }

    public final Object a(String str) {
        p.h(str, "closer");
        Method method = this.f45509a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.f45510b;
                p.e(method2);
                method2.invoke(invoke, str);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj != null) {
            try {
                Method method = this.f45511c;
                p.e(method);
                method.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }
}
