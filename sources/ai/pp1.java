package ai;

import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes3.dex */
public final class pp1 {

    /* renamed from: a  reason: collision with root package name */
    public final up1 f8492a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f8493b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f8494c;

    public pp1(up1 up1Var, Executor executor) {
        this.f8492a = up1Var;
        this.f8494c = up1Var.c();
        this.f8493b = executor;
    }

    public final op1 d() {
        op1 op1Var = new op1(this);
        op1.a(op1Var);
        return op1Var;
    }
}
