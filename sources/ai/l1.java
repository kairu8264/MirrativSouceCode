package ai;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class l1 extends a2 {

    /* renamed from: i  reason: collision with root package name */
    public final w f6444i;

    public l1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11, w wVar) {
        super(r0Var, "E20AdmxNj0iK7Vx72nHXXjWnsmv4FUkyxC/Oztwx6eZIzlENIrQYdkN17JfC0Q1q", "rY9DNDEvlJE2YV76YVSJLP4cBUy/u1xcBXUcMxb1h8o=", c64Var, i10, 11);
        this.f6444i = wVar;
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        w wVar = this.f6444i;
        if (wVar != null) {
            this.f1688e.c0(((Long) this.f1689f.invoke(null, wVar.c())).longValue());
        }
    }
}
