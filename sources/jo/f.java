package jo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xn.m0;
import xn.n0;

/* loaded from: classes4.dex */
public final class f implements qo.b<Object>, e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38137b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final Map<Class<? extends wn.b<?>>, Integer> f38138c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<String, String> f38139d;

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap<String, String> f38140e;

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap<String, String> f38141f;

    /* renamed from: g  reason: collision with root package name */
    public static final Map<String, String> f38142g;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f38143a;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            Method enclosingMethod;
            Constructor<?> enclosingConstructor;
            p.h(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    if (cls.getEnclosingMethod() != null) {
                        p.g(simpleName, "name");
                        String C0 = so.o.C0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                        if (C0 != null) {
                            return C0;
                        }
                    }
                    if (cls.getEnclosingConstructor() == null) {
                        p.g(simpleName, "name");
                        return so.o.B0(simpleName, '$', null, 2, null);
                    }
                    p.g(simpleName, "name");
                    return so.o.C0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                } else if (!cls.isArray()) {
                    String str3 = (String) f.f38142g.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                } else {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) f.f38142g.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                }
            }
            return str2;
        }

        public final boolean b(Object obj, Class<?> cls) {
            p.h(cls, "jClass");
            Map map = f.f38138c;
            p.f(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return j0.k(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = ho.a.b(ho.a.c(cls));
            }
            return cls.isInstance(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 0;
        List m10 = xn.s.m(io.a.class, io.l.class, io.p.class, io.q.class, io.r.class, io.s.class, io.t.class, io.u.class, io.v.class, io.w.class, io.b.class, io.c.class, io.d.class, io.e.class, io.f.class, io.g.class, io.h.class, io.i.class, io.j.class, io.k.class, io.m.class, io.n.class, io.o.class);
        ArrayList arrayList = new ArrayList(xn.t.u(m10, 10));
        for (Object obj : m10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                xn.s.t();
            }
            arrayList.add(wn.q.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f38138c = n0.l(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f38139d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f38140e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        p.g(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            p.g(str, "kotlinName");
            sb2.append(so.o.E0(str, '.', null, 2, null));
            sb2.append("CompanionObject");
            wn.k a10 = wn.q.a(sb2.toString(), str + ".Companion");
            hashMap3.put(a10.c(), a10.d());
        }
        for (Map.Entry<Class<? extends wn.b<?>>, Integer> entry : f38138c.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        f38141f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(m0.b(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), so.o.E0((String) entry2.getValue(), '.', null, 2, null));
        }
        f38142g = linkedHashMap;
    }

    public f(Class<?> cls) {
        p.h(cls, "jClass");
        this.f38143a = cls;
    }

    @Override // qo.b
    public boolean a(Object obj) {
        return f38137b.b(obj, b());
    }

    @Override // jo.e
    public Class<?> b() {
        return this.f38143a;
    }

    @Override // qo.b
    public String c() {
        return f38137b.a(b());
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && p.c(ho.a.b(this), ho.a.b((qo.b) obj));
    }

    @Override // qo.b
    public int hashCode() {
        return ho.a.b(this).hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
