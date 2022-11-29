package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import ao.a;
import ao.g;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import uo.l0;

@Keep
/* loaded from: classes4.dex */
public final class AndroidExceptionPreHandler extends a implements l0 {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(l0.f56050r);
        this._preHandler = this;
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z10 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z10 = true;
                }
            }
            if (z10) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // uo.l0
    public void handleException(g gVar, Throwable th2) {
        int i10 = Build.VERSION.SDK_INT;
        if (26 <= i10 && i10 < 28) {
            Method preHandler = preHandler();
            Object invoke = preHandler == null ? null : preHandler.invoke(null, new Object[0]);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler == null) {
                return;
            }
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        }
    }
}
