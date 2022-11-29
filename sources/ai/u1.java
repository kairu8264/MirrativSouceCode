package ai;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class u1 extends a2 {

    /* renamed from: i  reason: collision with root package name */
    public final y0 f10555i;

    /* renamed from: j  reason: collision with root package name */
    public long f10556j;

    public u1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11, y0 y0Var) {
        super(r0Var, "BF4UgSmqTS0MLe4qitQi/hj1jIQ+0vLIJEn32u0TtZn0VL9j15ZHt04Do4ADy833", "Yw5N4XiXXiTiwJwrJ8hW/AfPIwRQ2KMfiYKb9xu8vYQ=", c64Var, i10, 53);
        this.f10555i = y0Var;
        if (y0Var != null) {
            this.f10556j = y0Var.c();
        }
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f10555i != null) {
            this.f1688e.y(((Long) this.f1689f.invoke(null, Long.valueOf(this.f10556j))).longValue());
        }
    }
}
