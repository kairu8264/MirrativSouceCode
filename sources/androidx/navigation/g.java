package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.f;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.TypeCastException;

/* loaded from: classes.dex */
public final class g<Args extends f> implements wn.f<Args> {

    /* renamed from: w  reason: collision with root package name */
    public Args f15733w;

    /* renamed from: x  reason: collision with root package name */
    public final qo.b<Args> f15734x;

    /* renamed from: y  reason: collision with root package name */
    public final io.a<Bundle> f15735y;

    public g(qo.b<Args> bVar, io.a<Bundle> aVar) {
        jo.p.i(bVar, "navArgsClass");
        jo.p.i(aVar, "argumentProducer");
        this.f15734x = bVar;
        this.f15735y = aVar;
    }

    @Override // wn.f
    /* renamed from: a */
    public Args getValue() {
        Args args = this.f15733w;
        if (args == null) {
            Bundle invoke = this.f15735y.invoke();
            Method method = h.a().get(this.f15734x);
            if (method == null) {
                Class a10 = ho.a.a(this.f15734x);
                Class<Bundle>[] b10 = h.b();
                method = a10.getMethod("fromBundle", (Class[]) Arrays.copyOf(b10, b10.length));
                h.a().put(this.f15734x, method);
                jo.p.d(method, "navArgsClass.java.getMet…hod\n                    }");
            }
            Object invoke2 = method.invoke(null, invoke);
            if (invoke2 != null) {
                Args args2 = (Args) invoke2;
                this.f15733w = args2;
                return args2;
            }
            throw new TypeCastException("null cannot be cast to non-null type Args");
        }
        return args;
    }
}
