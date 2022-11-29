package c;

import android.content.Context;
import android.content.Intent;
import jo.p;

/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* renamed from: c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0134a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f18591a;

        public C0134a(T t10) {
            this.f18591a = t10;
        }

        public final T a() {
            return this.f18591a;
        }
    }

    public abstract Intent a(Context context, I i10);

    public C0134a<O> b(Context context, I i10) {
        p.h(context, "context");
        return null;
    }

    public abstract O c(int i10, Intent intent);
}
