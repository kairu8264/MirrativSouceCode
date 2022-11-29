package ai;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class kp2 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6303a;

    /* renamed from: b  reason: collision with root package name */
    public final List<s43<?>> f6304b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ up2 f6305c;

    public /* synthetic */ kp2(up2 up2Var, Object obj, List list, lp2 lp2Var) {
        this.f6305c = up2Var;
        this.f6303a = obj;
        this.f6304b = list;
    }

    public final <O> tp2<O> a(Callable<O> callable) {
        t43 t43Var;
        h43 o10 = j43.o(this.f6304b);
        s43 a10 = o10.a(ip2.f5315a, hk0.f4883f);
        up2 up2Var = this.f6305c;
        Object obj = this.f6303a;
        List<s43<?>> list = this.f6304b;
        t43Var = up2Var.f10790a;
        return new tp2<>(up2Var, obj, a10, list, o10.a(callable, t43Var));
    }
}
