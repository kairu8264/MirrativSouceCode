package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class v<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final v<Integer> f15806b = new c(false);

    /* renamed from: c  reason: collision with root package name */
    public static final v<Integer> f15807c = new d(false);

    /* renamed from: d  reason: collision with root package name */
    public static final v<int[]> f15808d = new e(true);

    /* renamed from: e  reason: collision with root package name */
    public static final v<Long> f15809e = new f(false);

    /* renamed from: f  reason: collision with root package name */
    public static final v<long[]> f15810f = new g(true);

    /* renamed from: g  reason: collision with root package name */
    public static final v<Float> f15811g = new h(false);

    /* renamed from: h  reason: collision with root package name */
    public static final v<float[]> f15812h = new i(true);

    /* renamed from: i  reason: collision with root package name */
    public static final v<Boolean> f15813i = new j(false);

    /* renamed from: j  reason: collision with root package name */
    public static final v<boolean[]> f15814j = new k(true);

    /* renamed from: k  reason: collision with root package name */
    public static final v<String> f15815k = new a(true);

    /* renamed from: l  reason: collision with root package name */
    public static final v<String[]> f15816l = new b(true);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15817a;

    /* loaded from: classes.dex */
    public class a extends v<String> {
        public a(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.v
        public String c() {
            return "string";
        }

        @Override // androidx.navigation.v
        /* renamed from: j */
        public String b(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        @Override // androidx.navigation.v
        /* renamed from: k */
        public String h(String str) {
            return str;
        }

        @Override // androidx.navigation.v
        /* renamed from: l */
        public void i(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    }

    /* loaded from: classes.dex */
    public class b extends v<String[]> {
        public b(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.v
        public String c() {
            return "string[]";
        }

        @Override // androidx.navigation.v
        /* renamed from: j */
        public String[] b(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // androidx.navigation.v
        /* renamed from: k */
        public String[] h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.v
        /* renamed from: l */
        public void i(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    }

    /* loaded from: classes.dex */
    public class c extends v<Integer> {
        public c(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.v
        public String c() {
            return "integer";
        }

        @Override // androidx.navigation.v
        /* renamed from: j */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.v
        /* renamed from: k */
        public Integer h(String str) {
            if (str.startsWith("0x")) {
                return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
            }
            return Integer.valueOf(Integer.parseInt(str));
        }

        @Override // androidx.navigation.v
        /* renamed from: l */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public class d extends v<Integer> {
        public d(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.v
        public String c() {
            return "reference";
        }

        @Override // androidx.navigation.v
        /* renamed from: j */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.v
        /* renamed from: k */
        public Integer h(String str) {
            if (str.startsWith("0x")) {
                return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
            }
            return Integer.valueOf(Integer.parseInt(str));
        }

        @Override // androidx.navigation.v
        /* renamed from: l */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public class e extends v<int[]> {
        public e(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.v
        public String c() {
            return "integer[]";
        }

        @Override // androidx.navigation.v
        /* renamed from: j */
        public int[] b(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // androidx.navigation.v
        /* renamed from: k */
        public int[] h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.v
        /* renamed from: l */
        public void i(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    }

    /* loaded from: classes.dex */
    public class f extends v<Long> {
        public f(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.v
        public String c() {
            return "long";
        }

        @Override // androidx.navigation.v
        /* renamed from: j */
        public Long b(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        @Override // androidx.navigation.v
        /* renamed from: k */
        public Long h(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.startsWith("0x")) {
                return Long.valueOf(Long.parseLong(str.substring(2), 16));
            }
            return Long.valueOf(Long.parseLong(str));
        }

        @Override // androidx.navigation.v
        /* renamed from: l */
        public void i(Bundle bundle, String str, Long l10) {
            bundle.putLong(str, l10.longValue());
        }
    }

    /* loaded from: classes.dex */
    public class g extends v<long[]> {
        public g(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.v
        public String c() {
            return "long[]";
        }

        @Override // androidx.navigation.v
        /* renamed from: j */
        public long[] b(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // androidx.navigation.v
        /* renamed from: k */
        public long[] h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.v
        /* renamed from: l */
        public void i(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    }

    /* loaded from: classes.dex */
    public class h extends v<Float> {
        public h(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.v
        public String c() {
            return "float";
        }

        @Override // androidx.navigation.v
        /* renamed from: j */
        public Float b(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        @Override // androidx.navigation.v
        /* renamed from: k */
        public Float h(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // androidx.navigation.v
        /* renamed from: l */
        public void i(Bundle bundle, String str, Float f10) {
            bundle.putFloat(str, f10.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public class i extends v<float[]> {
        public i(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.v
        public String c() {
            return "float[]";
        }

        @Override // androidx.navigation.v
        /* renamed from: j */
        public float[] b(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // androidx.navigation.v
        /* renamed from: k */
        public float[] h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.v
        /* renamed from: l */
        public void i(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    }

    /* loaded from: classes.dex */
    public class j extends v<Boolean> {
        public j(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.v
        public String c() {
            return "boolean";
        }

        @Override // androidx.navigation.v
        /* renamed from: j */
        public Boolean b(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // androidx.navigation.v
        /* renamed from: k */
        public Boolean h(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        @Override // androidx.navigation.v
        /* renamed from: l */
        public void i(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public class k extends v<boolean[]> {
        public k(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.v
        public String c() {
            return "boolean[]";
        }

        @Override // androidx.navigation.v
        /* renamed from: j */
        public boolean[] b(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // androidx.navigation.v
        /* renamed from: k */
        public boolean[] h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.v
        /* renamed from: l */
        public void i(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class l<D extends Enum> extends p<D> {

        /* renamed from: n  reason: collision with root package name */
        public final Class<D> f15818n;

        public l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.f15818n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        @Override // androidx.navigation.v.p, androidx.navigation.v
        public String c() {
            return this.f15818n.getName();
        }

        @Override // androidx.navigation.v.p
        /* renamed from: m */
        public D k(String str) {
            D[] enumConstants;
            for (D d10 : this.f15818n.getEnumConstants()) {
                if (d10.name().equals(str)) {
                    return d10;
                }
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f15818n.getName() + TopicConstant.SEPARATOR);
        }
    }

    /* loaded from: classes.dex */
    public static final class m<D extends Parcelable> extends v<D[]> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D[]> f15819m;

        public m(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.f15819m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
                    return;
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable.");
        }

        @Override // androidx.navigation.v
        public String c() {
            return this.f15819m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || m.class != obj.getClass()) {
                return false;
            }
            return this.f15819m.equals(((m) obj).f15819m);
        }

        public int hashCode() {
            return this.f15819m.hashCode();
        }

        @Override // androidx.navigation.v
        /* renamed from: j */
        public D[] b(Bundle bundle, String str) {
            return (D[]) ((Parcelable[]) bundle.get(str));
        }

        @Override // androidx.navigation.v
        /* renamed from: k */
        public D[] h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.v
        /* renamed from: l */
        public void i(Bundle bundle, String str, D[] dArr) {
            this.f15819m.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class n<D> extends v<D> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D> f15820m;

        public n(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
            }
            this.f15820m = cls;
        }

        @Override // androidx.navigation.v
        public D b(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.v
        public String c() {
            return this.f15820m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            return this.f15820m.equals(((n) obj).f15820m);
        }

        @Override // androidx.navigation.v
        public D h(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public int hashCode() {
            return this.f15820m.hashCode();
        }

        @Override // androidx.navigation.v
        public void i(Bundle bundle, String str, D d10) {
            this.f15820m.cast(d10);
            if (d10 != null && !(d10 instanceof Parcelable)) {
                if (d10 instanceof Serializable) {
                    bundle.putSerializable(str, (Serializable) d10);
                    return;
                }
                return;
            }
            bundle.putParcelable(str, (Parcelable) d10);
        }
    }

    /* loaded from: classes.dex */
    public static final class o<D extends Serializable> extends v<D[]> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D[]> f15821m;

        public o(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.f15821m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
                    return;
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }

        @Override // androidx.navigation.v
        public String c() {
            return this.f15821m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || o.class != obj.getClass()) {
                return false;
            }
            return this.f15821m.equals(((o) obj).f15821m);
        }

        public int hashCode() {
            return this.f15821m.hashCode();
        }

        @Override // androidx.navigation.v
        /* renamed from: j */
        public D[] b(Bundle bundle, String str) {
            return (D[]) ((Serializable[]) bundle.get(str));
        }

        @Override // androidx.navigation.v
        /* renamed from: k */
        public D[] h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.v
        /* renamed from: l */
        public void i(Bundle bundle, String str, D[] dArr) {
            this.f15821m.cast(dArr);
            bundle.putSerializable(str, dArr);
        }
    }

    public v(boolean z10) {
        this.f15817a = z10;
    }

    public static v<?> a(String str, String str2) {
        String str3;
        v<Integer> vVar = f15806b;
        if (vVar.c().equals(str)) {
            return vVar;
        }
        v vVar2 = f15808d;
        if (vVar2.c().equals(str)) {
            return vVar2;
        }
        v<Long> vVar3 = f15809e;
        if (vVar3.c().equals(str)) {
            return vVar3;
        }
        v vVar4 = f15810f;
        if (vVar4.c().equals(str)) {
            return vVar4;
        }
        v<Boolean> vVar5 = f15813i;
        if (vVar5.c().equals(str)) {
            return vVar5;
        }
        v vVar6 = f15814j;
        if (vVar6.c().equals(str)) {
            return vVar6;
        }
        v<String> vVar7 = f15815k;
        if (vVar7.c().equals(str)) {
            return vVar7;
        }
        v vVar8 = f15816l;
        if (vVar8.c().equals(str)) {
            return vVar8;
        }
        v<Float> vVar9 = f15811g;
        if (vVar9.c().equals(str)) {
            return vVar9;
        }
        v vVar10 = f15812h;
        if (vVar10.c().equals(str)) {
            return vVar10;
        }
        v<Integer> vVar11 = f15807c;
        if (vVar11.c().equals(str)) {
            return vVar11;
        }
        if (str == null || str.isEmpty()) {
            return vVar7;
        }
        try {
            if (!str.startsWith(TopicConstant.SEPARATOR) || str2 == null) {
                str3 = str;
            } else {
                str3 = str2 + str;
            }
            if (str.endsWith("[]")) {
                str3 = str3.substring(0, str3.length() - 2);
                Class<?> cls = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new m(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new o(cls);
                }
            } else {
                Class<?> cls2 = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new n(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new l(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new p(cls2);
                }
            }
            throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static v d(String str) {
        try {
            try {
                try {
                    try {
                        v<Integer> vVar = f15806b;
                        vVar.h(str);
                        return vVar;
                    } catch (IllegalArgumentException unused) {
                        return f15815k;
                    }
                } catch (IllegalArgumentException unused2) {
                    v<Long> vVar2 = f15809e;
                    vVar2.h(str);
                    return vVar2;
                }
            } catch (IllegalArgumentException unused3) {
                v<Float> vVar3 = f15811g;
                vVar3.h(str);
                return vVar3;
            }
        } catch (IllegalArgumentException unused4) {
            v<Boolean> vVar4 = f15813i;
            vVar4.h(str);
            return vVar4;
        }
    }

    public static v e(Object obj) {
        if (obj instanceof Integer) {
            return f15806b;
        }
        if (obj instanceof int[]) {
            return f15808d;
        }
        if (obj instanceof Long) {
            return f15809e;
        }
        if (obj instanceof long[]) {
            return f15810f;
        }
        if (obj instanceof Float) {
            return f15811g;
        }
        if (obj instanceof float[]) {
            return f15812h;
        }
        if (obj instanceof Boolean) {
            return f15813i;
        }
        if (obj instanceof boolean[]) {
            return f15814j;
        }
        if (!(obj instanceof String) && obj != null) {
            if (obj instanceof String[]) {
                return f15816l;
            }
            if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                return new m(obj.getClass().getComponentType());
            }
            if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                return new o(obj.getClass().getComponentType());
            }
            if (obj instanceof Parcelable) {
                return new n(obj.getClass());
            }
            if (obj instanceof Enum) {
                return new l(obj.getClass());
            }
            if (obj instanceof Serializable) {
                return new p(obj.getClass());
            }
            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
        }
        return f15815k;
    }

    public abstract T b(Bundle bundle, String str);

    public abstract String c();

    public boolean f() {
        return this.f15817a;
    }

    public T g(Bundle bundle, String str, String str2) {
        T h10 = h(str2);
        i(bundle, str, h10);
        return h10;
    }

    public abstract T h(String str);

    public abstract void i(Bundle bundle, String str, T t10);

    public String toString() {
        return c();
    }

    /* loaded from: classes.dex */
    public static class p<D extends Serializable> extends v<D> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D> f15822m;

        public p(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                if (!cls.isEnum()) {
                    this.f15822m = cls;
                    return;
                }
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }

        @Override // androidx.navigation.v
        public String c() {
            return this.f15822m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                return this.f15822m.equals(((p) obj).f15822m);
            }
            return false;
        }

        public int hashCode() {
            return this.f15822m.hashCode();
        }

        @Override // androidx.navigation.v
        /* renamed from: j */
        public D b(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.v
        /* renamed from: k */
        public D h(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.v
        /* renamed from: l */
        public void i(Bundle bundle, String str, D d10) {
            this.f15822m.cast(d10);
            bundle.putSerializable(str, d10);
        }

        public p(boolean z10, Class<D> cls) {
            super(z10);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f15822m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }
    }
}
