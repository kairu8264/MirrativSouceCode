package dq;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final Method f29841a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadMode f29842b;

    /* renamed from: c  reason: collision with root package name */
    public final Class<?> f29843c;

    /* renamed from: d  reason: collision with root package name */
    public final int f29844d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f29845e;

    /* renamed from: f  reason: collision with root package name */
    public String f29846f;

    public n(Method method, Class<?> cls, ThreadMode threadMode, int i10, boolean z10) {
        this.f29841a = method;
        this.f29842b = threadMode;
        this.f29843c = cls;
        this.f29844d = i10;
        this.f29845e = z10;
    }

    public final synchronized void a() {
        if (this.f29846f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f29841a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f29841a.getName());
            sb2.append('(');
            sb2.append(this.f29843c.getName());
            this.f29846f = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            a();
            n nVar = (n) obj;
            nVar.a();
            return this.f29846f.equals(nVar.f29846f);
        }
        return false;
    }

    public int hashCode() {
        return this.f29841a.hashCode();
    }
}
