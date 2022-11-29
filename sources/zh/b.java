package zh;

import android.os.Looper;
import android.util.Log;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile ClassLoader f63187a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile Thread f63188b;

    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        synchronized (b.class) {
            if (f63187a == null) {
                f63187a = b();
            }
            classLoader = f63187a;
        }
        return classLoader;
    }

    public static synchronized ClassLoader b() {
        synchronized (b.class) {
            ClassLoader classLoader = null;
            if (f63188b == null) {
                f63188b = c();
                if (f63188b == null) {
                    return null;
                }
            }
            synchronized (f63188b) {
                try {
                    classLoader = f63188b.getContextClassLoader();
                } catch (SecurityException e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to get thread context classloader ".concat(valueOf) : new String("Failed to get thread context classloader "));
                }
            }
            return classLoader;
        }
    }

    public static synchronized Thread c() {
        SecurityException e10;
        a aVar;
        a aVar2;
        ThreadGroup threadGroup;
        synchronized (b.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i11];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i11++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i10 >= activeCount) {
                            aVar2 = null;
                            break;
                        }
                        aVar2 = threadArr[i10];
                        if ("GmsDynamite".equals(aVar2.getName())) {
                            break;
                        }
                        i10++;
                    }
                } catch (SecurityException e11) {
                    e10 = e11;
                    aVar = null;
                }
                if (aVar2 == null) {
                    try {
                        aVar = new a(threadGroup, "GmsDynamite");
                    } catch (SecurityException e12) {
                        e10 = e12;
                        aVar = aVar2;
                    }
                    try {
                        aVar.setContextClassLoader(null);
                        aVar.start();
                    } catch (SecurityException e13) {
                        e10 = e13;
                        String valueOf = String.valueOf(e10.getMessage());
                        Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to enumerate thread/threadgroup ".concat(valueOf) : new String("Failed to enumerate thread/threadgroup "));
                        aVar2 = aVar;
                        return aVar2;
                    }
                    aVar2 = aVar;
                }
            }
            return aVar2;
        }
    }
}
