package wn;

import ai.r23;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes4.dex */
public final class n<T> implements f<T>, Serializable {

    /* renamed from: w  reason: collision with root package name */
    public volatile io.a<? extends T> f59227w;

    /* renamed from: x  reason: collision with root package name */
    public volatile Object f59228x;

    /* renamed from: y  reason: collision with root package name */
    public final Object f59229y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f59226z = new a(null);
    public static final AtomicReferenceFieldUpdater<n<?>, Object> A = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "x");

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public n(io.a<? extends T> aVar) {
        jo.p.h(aVar, "initializer");
        this.f59227w = aVar;
        u uVar = u.f59241a;
        this.f59228x = uVar;
        this.f59229y = uVar;
    }

    public boolean a() {
        return this.f59228x != u.f59241a;
    }

    @Override // wn.f
    public T getValue() {
        T t10 = (T) this.f59228x;
        u uVar = u.f59241a;
        if (t10 != uVar) {
            return t10;
        }
        io.a<? extends T> aVar = this.f59227w;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (r23.a(A, this, uVar, invoke)) {
                this.f59227w = null;
                return invoke;
            }
        }
        return (T) this.f59228x;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
