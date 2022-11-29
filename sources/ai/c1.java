package ai;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c1 extends a2 {

    /* renamed from: j  reason: collision with root package name */
    public static final b2<String> f2653j = new b2<>();

    /* renamed from: i  reason: collision with root package name */
    public final Context f2654i;

    public c1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11, Context context) {
        super(r0Var, "Cm/m2hUfCdldkdMMT3yEm1sAGuFpKVfLQblDoR20XcK7ttTDkHIz3fwaKTv7az9S", "aEm/NgN//tNFhysboe/lIhu1ib9P4g8tTm8w79YCsSs=", c64Var, i10, 29);
        this.f2654i = context;
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f1688e.n0("E");
        AtomicReference<String> a10 = f2653j.a(this.f2654i.getPackageName());
        if (a10.get() == null) {
            synchronized (a10) {
                if (a10.get() == null) {
                    a10.set((String) this.f1689f.invoke(null, this.f2654i));
                }
            }
        }
        String str = a10.get();
        synchronized (this.f1688e) {
            this.f1688e.n0(i74.a(str.getBytes(), true));
        }
    }
}
