package p7;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class n implements l {

    /* renamed from: d  reason: collision with root package name */
    public static final Bitmap.Config[] f46206d;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f46207e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f46208f;

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f46209g;

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f46210h;

    /* renamed from: a  reason: collision with root package name */
    public final c f46211a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final h<b, Bitmap> f46212b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f46213c = new HashMap();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f46214a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f46214a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46214a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46214a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46214a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements m {

        /* renamed from: a  reason: collision with root package name */
        public final c f46215a;

        /* renamed from: b  reason: collision with root package name */
        public int f46216b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f46217c;

        public b(c cVar) {
            this.f46215a = cVar;
        }

        @Override // p7.m
        public void a() {
            this.f46215a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f46216b = i10;
            this.f46217c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f46216b == bVar.f46216b && i8.k.d(this.f46217c, bVar.f46217c);
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f46216b * 31;
            Bitmap.Config config = this.f46217c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return n.i(this.f46216b, this.f46217c);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends d<b> {
        @Override // p7.d
        /* renamed from: d */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b b10 = b();
            b10.b(i10, config);
            return b10;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f46206d = configArr;
        f46207e = configArr;
        f46208f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f46209g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f46210h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String i(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public static Bitmap.Config[] j(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f46207e;
        }
        int i10 = a.f46214a[config.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return i10 != 4 ? new Bitmap.Config[]{config} : f46210h;
                }
                return f46209g;
            }
            return f46208f;
        }
        return f46206d;
    }

    @Override // p7.l
    public String a(Bitmap bitmap) {
        return i(i8.k.h(bitmap), bitmap.getConfig());
    }

    @Override // p7.l
    public Bitmap b() {
        Bitmap f10 = this.f46212b.f();
        if (f10 != null) {
            g(Integer.valueOf(i8.k.h(f10)), f10);
        }
        return f10;
    }

    @Override // p7.l
    public void c(Bitmap bitmap) {
        b e10 = this.f46211a.e(i8.k.h(bitmap), bitmap.getConfig());
        this.f46212b.d(e10, bitmap);
        NavigableMap<Integer, Integer> k10 = k(bitmap.getConfig());
        Integer num = (Integer) k10.get(Integer.valueOf(e10.f46216b));
        k10.put(Integer.valueOf(e10.f46216b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p7.l
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        b h10 = h(i8.k.g(i10, i11, config), config);
        Bitmap a10 = this.f46212b.a(h10);
        if (a10 != null) {
            g(Integer.valueOf(h10.f46216b), a10);
            a10.reconfigure(i10, i11, config);
        }
        return a10;
    }

    @Override // p7.l
    public String e(int i10, int i11, Bitmap.Config config) {
        return i(i8.k.g(i10, i11, config), config);
    }

    @Override // p7.l
    public int f(Bitmap bitmap) {
        return i8.k.h(bitmap);
    }

    public final void g(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> k10 = k(bitmap.getConfig());
        Integer num2 = (Integer) k10.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                k10.remove(num);
                return;
            } else {
                k10.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a(bitmap) + ", this: " + this);
    }

    public final b h(int i10, Bitmap.Config config) {
        Bitmap.Config[] j10;
        b e10 = this.f46211a.e(i10, config);
        for (Bitmap.Config config2 : j(config)) {
            Integer ceilingKey = k(config2).ceilingKey(Integer.valueOf(i10));
            if (ceilingKey != null && ceilingKey.intValue() <= i10 * 8) {
                if (ceilingKey.intValue() == i10) {
                    if (config2 == null) {
                        if (config == null) {
                            return e10;
                        }
                    } else if (config2.equals(config)) {
                        return e10;
                    }
                }
                this.f46211a.c(e10);
                return this.f46211a.e(ceilingKey.intValue(), config2);
            }
        }
        return e10;
    }

    public final NavigableMap<Integer, Integer> k(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f46213c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f46213c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f46212b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f46213c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f46213c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
