package k2;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import jo.p;
import ro.g;
import ro.n;

/* loaded from: classes.dex */
public final class c {
    public static final Class<? extends l2.a<?>> a(String str) {
        p.h(str, "<this>");
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            Log.e("PreviewProvider", "Unable to find provider '" + str + '\'', e10);
            return null;
        }
    }

    public static final Object[] b(Class<? extends l2.a<?>> cls, int i10) {
        if (cls != null) {
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                p.g(constructors, "parameterProviderClass.constructors");
                int length = constructors.length;
                Constructor<?> constructor = null;
                int i11 = 0;
                boolean z10 = false;
                Constructor<?> constructor2 = null;
                while (true) {
                    if (i11 < length) {
                        Constructor<?> constructor3 = constructors[i11];
                        Class<?>[] parameterTypes = constructor3.getParameterTypes();
                        p.g(parameterTypes, "it.parameterTypes");
                        if (parameterTypes.length == 0) {
                            if (z10) {
                                break;
                            }
                            z10 = true;
                            constructor2 = constructor3;
                        }
                        i11++;
                    } else if (z10) {
                        constructor = constructor2;
                    }
                }
                Constructor<?> constructor4 = constructor;
                if (constructor4 != null) {
                    constructor4.setAccessible(true);
                    Object newInstance = constructor4.newInstance(new Object[0]);
                    if (newInstance != null) {
                        l2.a aVar = (l2.a) newInstance;
                        return i10 < 0 ? c(aVar.a(), aVar.getCount()) : new Object[]{n.i(aVar.a(), i10)};
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
                }
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            } catch (ho.b unused) {
                throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
            }
        }
        return new Object[0];
    }

    public static final Object[] c(g<? extends Object> gVar, int i10) {
        Iterator<? extends Object> it = gVar.iterator();
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = it.next();
        }
        return objArr;
    }
}
