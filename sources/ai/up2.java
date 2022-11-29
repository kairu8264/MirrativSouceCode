package ai;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public abstract class up2<E> {

    /* renamed from: d  reason: collision with root package name */
    public static final s43<?> f10789d = j43.a(null);

    /* renamed from: a  reason: collision with root package name */
    public final t43 f10790a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f10791b;

    /* renamed from: c  reason: collision with root package name */
    public final vp2<E> f10792c;

    public up2(t43 t43Var, ScheduledExecutorService scheduledExecutorService, vp2<E> vp2Var) {
        this.f10790a = t43Var;
        this.f10791b = scheduledExecutorService;
        this.f10792c = vp2Var;
    }

    public final <I> tp2<I> e(E e10, s43<I> s43Var) {
        return new tp2<>(this, e10, s43Var, Collections.singletonList(s43Var), s43Var);
    }

    public final kp2 f(E e10, s43<?>... s43VarArr) {
        return new kp2(this, e10, Arrays.asList(s43VarArr), null);
    }

    public abstract String g(E e10);
}
