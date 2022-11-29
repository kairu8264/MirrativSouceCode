package ao;

import ai.r23;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jo.p;
import wn.l;

/* loaded from: classes4.dex */
public final class i<T> implements d<T>, co.e {

    /* renamed from: x  reason: collision with root package name */
    public static final a f16652x = new a(null);
    @Deprecated

    /* renamed from: y  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<i<?>, Object> f16653y = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");
    private volatile Object result;

    /* renamed from: w  reason: collision with root package name */
    public final d<T> f16654w;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(d<? super T> dVar, Object obj) {
        p.h(dVar, "delegate");
        this.f16654w = dVar;
        this.result = obj;
    }

    public final Object a() {
        Object obj = this.result;
        bo.a aVar = bo.a.UNDECIDED;
        if (obj == aVar) {
            if (r23.a(f16653y, this, aVar, bo.c.c())) {
                return bo.c.c();
            }
            obj = this.result;
        }
        if (obj == bo.a.RESUMED) {
            return bo.c.c();
        }
        if (obj instanceof l.b) {
            throw ((l.b) obj).f59225w;
        }
        return obj;
    }

    @Override // co.e
    public co.e getCallerFrame() {
        d<T> dVar = this.f16654w;
        if (dVar instanceof co.e) {
            return (co.e) dVar;
        }
        return null;
    }

    @Override // ao.d
    public g getContext() {
        return this.f16654w.getContext();
    }

    @Override // co.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // ao.d
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            bo.a aVar = bo.a.UNDECIDED;
            if (obj2 == aVar) {
                if (r23.a(f16653y, this, aVar, obj)) {
                    return;
                }
            } else if (obj2 != bo.c.c()) {
                throw new IllegalStateException("Already resumed");
            } else {
                if (r23.a(f16653y, this, bo.c.c(), bo.a.RESUMED)) {
                    this.f16654w.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f16654w;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d<? super T> dVar) {
        this(dVar, bo.a.UNDECIDED);
        p.h(dVar, "delegate");
    }
}
