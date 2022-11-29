package hi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class u4 {

    /* renamed from: a  reason: collision with root package name */
    public final u4 f36009a;

    /* renamed from: b  reason: collision with root package name */
    public final y f36010b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, q> f36011c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Boolean> f36012d = new HashMap();

    public u4(u4 u4Var, y yVar) {
        this.f36009a = u4Var;
        this.f36010b = yVar;
    }

    public final u4 a() {
        return new u4(this, this.f36010b);
    }

    public final q b(q qVar) {
        return this.f36010b.a(this, qVar);
    }

    public final q c(f fVar) {
        q qVar = q.f35921f;
        Iterator<Integer> u10 = fVar.u();
        while (u10.hasNext()) {
            qVar = this.f36010b.a(this, fVar.r(u10.next().intValue()));
            if (qVar instanceof h) {
                break;
            }
        }
        return qVar;
    }

    public final q d(String str) {
        if (this.f36011c.containsKey(str)) {
            return this.f36011c.get(str);
        }
        u4 u4Var = this.f36009a;
        if (u4Var != null) {
            return u4Var.d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void e(String str, q qVar) {
        if (this.f36012d.containsKey(str)) {
            return;
        }
        if (qVar == null) {
            this.f36011c.remove(str);
        } else {
            this.f36011c.put(str, qVar);
        }
    }

    public final void f(String str, q qVar) {
        e(str, qVar);
        this.f36012d.put(str, Boolean.TRUE);
    }

    public final void g(String str, q qVar) {
        u4 u4Var;
        if (!this.f36011c.containsKey(str) && (u4Var = this.f36009a) != null && u4Var.h(str)) {
            this.f36009a.g(str, qVar);
        } else if (this.f36012d.containsKey(str)) {
        } else {
            if (qVar == null) {
                this.f36011c.remove(str);
            } else {
                this.f36011c.put(str, qVar);
            }
        }
    }

    public final boolean h(String str) {
        if (this.f36011c.containsKey(str)) {
            return true;
        }
        u4 u4Var = this.f36009a;
        if (u4Var != null) {
            return u4Var.h(str);
        }
        return false;
    }
}
