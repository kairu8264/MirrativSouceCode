package zo;

import ai.r23;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import uo.u0;

/* loaded from: classes4.dex */
public abstract class d<T> extends d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63283a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = c.f63278a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zo.d0
    public d<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zo.d0
    public final Object c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == c.f63278a) {
            obj2 = e(i(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(T t10, Object obj);

    public final Object e(Object obj) {
        if (u0.a()) {
            if (!(obj != c.f63278a)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        Object obj3 = c.f63278a;
        return obj2 != obj3 ? obj2 : r23.a(f63283a, this, obj3, obj) ? obj : this._consensus;
    }

    public final Object f() {
        return this._consensus;
    }

    public long g() {
        return 0L;
    }

    public final boolean h() {
        return this._consensus != c.f63278a;
    }

    public abstract Object i(T t10);
}
