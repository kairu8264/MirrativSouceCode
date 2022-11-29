package zo;

import com.google.android.exoplayer2.C;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f63309a = new n();

    public final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    public final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            return xn.a0.B0(ServiceLoader.load(cls, classLoader));
        }
    }

    public final List<y> c() {
        y yVar;
        if (!o.a()) {
            return b(y.class, y.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            y yVar2 = null;
            try {
                yVar = (y) y.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, y.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                yVar = null;
            }
            if (yVar != null) {
                arrayList.add(yVar);
            }
            try {
                yVar2 = (y) y.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, y.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (yVar2 == null) {
                return arrayList;
            }
            arrayList.add(yVar2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(y.class, y.class.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        ArrayList<URL> list = Collections.list(classLoader.getResources(jo.p.o("META-INF/services/", cls.getName())));
        jo.p.g(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            xn.x.y(arrayList, f63309a.e(url));
        }
        Set<String> F0 = xn.a0.F0(arrayList);
        if (!F0.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(xn.t.u(F0, 10));
            for (String str : F0) {
                arrayList2.add(f63309a.a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    public final List<String> e(URL url) {
        String url2 = url.toString();
        if (so.n.C(url2, "jar", false, 2, null)) {
            String H0 = so.o.H0(so.o.C0(url2, "jar:file:", null, 2, null), '!', null, 2, null);
            String C0 = so.o.C0(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(H0, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(C0)), C.UTF8_NAME));
                List<String> f10 = f63309a.f(bufferedReader);
                go.a.a(bufferedReader, null);
                jarFile.close();
                return f10;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        jarFile.close();
                        throw th3;
                    } catch (Throwable th4) {
                        wn.a.a(th2, th4);
                        throw th2;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(FirebasePerfUrlConnection.openStream(url)));
        try {
            List<String> f11 = f63309a.f(bufferedReader2);
            go.a.a(bufferedReader2, null);
            return f11;
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                go.a.a(bufferedReader2, th5);
                throw th6;
            }
        }
    }

    public final List<String> f(BufferedReader bufferedReader) {
        boolean z10;
        boolean z11;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return xn.a0.B0(linkedHashSet);
            }
            String obj = so.o.L0(so.o.I0(readLine, "#", null, 2, null)).toString();
            int i10 = 0;
            while (true) {
                if (i10 >= obj.length()) {
                    z10 = true;
                    break;
                }
                char charAt = obj.charAt(i10);
                i10++;
                if (charAt == '.' || Character.isJavaIdentifierPart(charAt)) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (!z11) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                if (obj.length() > 0) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(jo.p.o("Illegal service provider class name: ", obj).toString());
            }
        }
    }
}
