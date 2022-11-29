package hn;

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes4.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static Constructor<?> f36153a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f36154b;

    static {
        try {
            d();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static Object a(String str) {
        return t.l(f36153a, str);
    }

    public static List<Object> b(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a(str));
        }
        return arrayList;
    }

    public static int c() {
        try {
            try {
                return Class.forName("android.os.Build$VERSION").getField("SDK_INT").getInt(null);
            } catch (Exception unused) {
                return Integer.parseInt((String) Class.forName("android.os.Build$VERSION").getField("SDK").get(null));
            }
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static void d() throws Exception {
        f36153a = t.e("javax.net.ssl.SNIHostName", new Class[]{String.class});
        f36154b = t.f("javax.net.ssl.SSLParameters", "setServerNames", new Class[]{List.class});
    }

    public static void e(Socket socket, String[] strArr) {
        if ((socket instanceof SSLSocket) && strArr != null) {
            int c10 = c();
            if (c10 > 0 && c10 < 24) {
                try {
                    socket.getClass().getMethod("setHostname", String.class).invoke(socket, strArr[0]);
                    return;
                } catch (Exception e10) {
                    PrintStream printStream = System.err;
                    printStream.println("SNI configuration failed: " + e10.getMessage());
                    return;
                }
            }
            SSLParameters sSLParameters = ((SSLSocket) socket).getSSLParameters();
            if (sSLParameters == null) {
                return;
            }
            f(sSLParameters, strArr);
        }
    }

    public static void f(SSLParameters sSLParameters, String[] strArr) {
        t.g(f36154b, sSLParameters, b(strArr));
    }
}
