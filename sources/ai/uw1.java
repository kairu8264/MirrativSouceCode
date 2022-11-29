package ai;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class uw1 implements dq2 {

    /* renamed from: w  reason: collision with root package name */
    public final Map<wp2, String> f10859w = new HashMap();

    /* renamed from: x  reason: collision with root package name */
    public final Map<wp2, String> f10860x = new HashMap();

    /* renamed from: y  reason: collision with root package name */
    public final mq2 f10861y;

    public uw1(Set<tw1> set, mq2 mq2Var) {
        wp2 wp2Var;
        String str;
        wp2 wp2Var2;
        String str2;
        this.f10861y = mq2Var;
        for (tw1 tw1Var : set) {
            Map<wp2, String> map = this.f10859w;
            wp2Var = tw1Var.f10485b;
            str = tw1Var.f10484a;
            map.put(wp2Var, str);
            Map<wp2, String> map2 = this.f10860x;
            wp2Var2 = tw1Var.f10486c;
            str2 = tw1Var.f10484a;
            map2.put(wp2Var2, str2);
        }
    }

    @Override // ai.dq2
    public final void A(wp2 wp2Var, String str) {
    }

    @Override // ai.dq2
    public final void K(wp2 wp2Var, String str) {
        mq2 mq2Var = this.f10861y;
        String valueOf = String.valueOf(str);
        mq2Var.d(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."));
        if (this.f10859w.containsKey(wp2Var)) {
            mq2 mq2Var2 = this.f10861y;
            String valueOf2 = String.valueOf(this.f10859w.get(wp2Var));
            mq2Var2.d(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."));
        }
    }

    @Override // ai.dq2
    public final void c(wp2 wp2Var, String str) {
        mq2 mq2Var = this.f10861y;
        String valueOf = String.valueOf(str);
        mq2Var.e(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."), "s.");
        if (this.f10860x.containsKey(wp2Var)) {
            mq2 mq2Var2 = this.f10861y;
            String valueOf2 = String.valueOf(this.f10860x.get(wp2Var));
            mq2Var2.e(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "s.");
        }
    }

    @Override // ai.dq2
    public final void n(wp2 wp2Var, String str, Throwable th2) {
        mq2 mq2Var = this.f10861y;
        String valueOf = String.valueOf(str);
        mq2Var.e(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."), "f.");
        if (this.f10860x.containsKey(wp2Var)) {
            mq2 mq2Var2 = this.f10861y;
            String valueOf2 = String.valueOf(this.f10860x.get(wp2Var));
            mq2Var2.e(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "f.");
        }
    }
}
