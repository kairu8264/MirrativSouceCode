package s6;

import android.content.Context;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.File;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f52050a = false;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f52051b = false;

    /* renamed from: c  reason: collision with root package name */
    public static String[] f52052c;

    /* renamed from: d  reason: collision with root package name */
    public static long[] f52053d;

    /* renamed from: e  reason: collision with root package name */
    public static int f52054e;

    /* renamed from: f  reason: collision with root package name */
    public static int f52055f;

    /* renamed from: g  reason: collision with root package name */
    public static c7.f f52056g;

    /* renamed from: h  reason: collision with root package name */
    public static c7.e f52057h;

    /* renamed from: i  reason: collision with root package name */
    public static volatile c7.h f52058i;

    /* renamed from: j  reason: collision with root package name */
    public static volatile c7.g f52059j;

    /* loaded from: classes.dex */
    public class a implements c7.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f52060a;

        public a(Context context) {
            this.f52060a = context;
        }

        @Override // c7.e
        public File a() {
            return new File(this.f52060a.getCacheDir(), "lottie_network_cache");
        }
    }

    public static void a(String str) {
        if (f52051b) {
            int i10 = f52054e;
            if (i10 == 20) {
                f52055f++;
                return;
            }
            f52052c[i10] = str;
            f52053d[i10] = System.nanoTime();
            k3.j.a(str);
            f52054e++;
        }
    }

    public static float b(String str) {
        int i10 = f52055f;
        if (i10 > 0) {
            f52055f = i10 - 1;
            return 0.0f;
        } else if (f52051b) {
            int i11 = f52054e - 1;
            f52054e = i11;
            if (i11 != -1) {
                if (str.equals(f52052c[i11])) {
                    k3.j.b();
                    return ((float) (System.nanoTime() - f52053d[f52054e])) / 1000000.0f;
                }
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f52052c[f52054e] + TopicConstant.SEPARATOR);
            }
            throw new IllegalStateException("Can't end trace section. There are none.");
        } else {
            return 0.0f;
        }
    }

    public static c7.g c(Context context) {
        Context applicationContext = context.getApplicationContext();
        c7.g gVar = f52059j;
        if (gVar == null) {
            synchronized (c7.g.class) {
                gVar = f52059j;
                if (gVar == null) {
                    c7.e eVar = f52057h;
                    if (eVar == null) {
                        eVar = new a(applicationContext);
                    }
                    gVar = new c7.g(eVar);
                    f52059j = gVar;
                }
            }
        }
        return gVar;
    }

    public static c7.h d(Context context) {
        c7.h hVar = f52058i;
        if (hVar == null) {
            synchronized (c7.h.class) {
                hVar = f52058i;
                if (hVar == null) {
                    c7.g c10 = c(context);
                    c7.f fVar = f52056g;
                    if (fVar == null) {
                        fVar = new c7.b();
                    }
                    hVar = new c7.h(c10, fVar);
                    f52058i = hVar;
                }
            }
        }
        return hVar;
    }
}
