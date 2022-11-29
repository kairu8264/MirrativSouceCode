package zo;

import java.util.List;
import kotlin.KotlinNothingValueException;
import uo.o2;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f63274a = true;

    public static final b0 a(Throwable th2, String str) {
        if (f63274a) {
            return new b0(th2, str);
        }
        if (th2 == null) {
            d();
            throw new KotlinNothingValueException();
        }
        throw th2;
    }

    public static /* synthetic */ b0 b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static final boolean c(o2 o2Var) {
        return o2Var.h0() instanceof b0;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final o2 e(y yVar, List<? extends y> list) {
        try {
            return yVar.createDispatcher(list);
        } catch (Throwable th2) {
            return a(th2, yVar.hintOnError());
        }
    }
}
