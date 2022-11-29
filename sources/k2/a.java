package k2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import jo.p;
import l0.i;
import xn.o;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f38368a = new a();

    public final int a(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return (int) Math.ceil((i10 + i11) / 15.0d);
    }

    public final boolean b(Class<?>[] clsArr, Class<?>[] clsArr2) {
        boolean z10;
        if (clsArr.length == clsArr2.length) {
            ArrayList<Boolean> arrayList = new ArrayList(clsArr.length);
            int length = clsArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                arrayList.add(Boolean.valueOf(clsArr[i10].isAssignableFrom(clsArr2[i11])));
                i10++;
                i11++;
            }
            if (!arrayList.isEmpty()) {
                for (Boolean bool : arrayList) {
                    if (!bool.booleanValue()) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            return z10;
        }
        return false;
    }

    public final int c(int i10) {
        return (int) Math.ceil(i10 / 31.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.reflect.Method d(java.lang.Class<?> r9, java.lang.String r10, java.lang.Object... r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r2 = r11.length     // Catch: java.lang.ReflectiveOperationException -> L8b
            int r2 = r8.a(r2, r1)     // Catch: java.lang.ReflectiveOperationException -> L8b
            jo.h0 r3 = new jo.h0     // Catch: java.lang.ReflectiveOperationException -> L8b
            r4 = 4
            r3.<init>(r4)     // Catch: java.lang.ReflectiveOperationException -> L8b
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.ReflectiveOperationException -> L8b
            r4.<init>()     // Catch: java.lang.ReflectiveOperationException -> L8b
            int r5 = r11.length     // Catch: java.lang.ReflectiveOperationException -> L8b
            r6 = r1
        L14:
            if (r6 >= r5) goto L28
            r7 = r11[r6]     // Catch: java.lang.ReflectiveOperationException -> L8b
            if (r7 == 0) goto L1f
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.ReflectiveOperationException -> L8b
            goto L20
        L1f:
            r7 = r0
        L20:
            if (r7 == 0) goto L25
            r4.add(r7)     // Catch: java.lang.ReflectiveOperationException -> L8b
        L25:
            int r6 = r6 + 1
            goto L14
        L28:
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L8b
            java.lang.Object[] r11 = r4.toArray(r11)     // Catch: java.lang.ReflectiveOperationException -> L8b
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            if (r11 == 0) goto L85
            r3.b(r11)     // Catch: java.lang.ReflectiveOperationException -> L8b
            java.lang.Class<l0.i> r11 = l0.i.class
            r3.a(r11)     // Catch: java.lang.ReflectiveOperationException -> L8b
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch: java.lang.ReflectiveOperationException -> L8b
            r3.a(r11)     // Catch: java.lang.ReflectiveOperationException -> L8b
            po.i r5 = new po.i     // Catch: java.lang.ReflectiveOperationException -> L8b
            r5.<init>(r1, r2)     // Catch: java.lang.ReflectiveOperationException -> L8b
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.ReflectiveOperationException -> L8b
            r6 = 10
            int r6 = xn.t.u(r5, r6)     // Catch: java.lang.ReflectiveOperationException -> L8b
            r2.<init>(r6)     // Catch: java.lang.ReflectiveOperationException -> L8b
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.ReflectiveOperationException -> L8b
        L53:
            boolean r6 = r5.hasNext()     // Catch: java.lang.ReflectiveOperationException -> L8b
            if (r6 == 0) goto L63
            r6 = r5
            xn.i0 r6 = (xn.i0) r6     // Catch: java.lang.ReflectiveOperationException -> L8b
            r6.b()     // Catch: java.lang.ReflectiveOperationException -> L8b
            r2.add(r11)     // Catch: java.lang.ReflectiveOperationException -> L8b
            goto L53
        L63:
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L8b
            java.lang.Object[] r11 = r2.toArray(r11)     // Catch: java.lang.ReflectiveOperationException -> L8b
            if (r11 == 0) goto L7f
            r3.b(r11)     // Catch: java.lang.ReflectiveOperationException -> L8b
            int r11 = r3.c()     // Catch: java.lang.ReflectiveOperationException -> L8b
            java.lang.Class[] r11 = new java.lang.Class[r11]     // Catch: java.lang.ReflectiveOperationException -> L8b
            java.lang.Object[] r11 = r3.d(r11)     // Catch: java.lang.ReflectiveOperationException -> L8b
            java.lang.Class[] r11 = (java.lang.Class[]) r11     // Catch: java.lang.ReflectiveOperationException -> L8b
            java.lang.reflect.Method r11 = r8.e(r9, r10, r11)     // Catch: java.lang.ReflectiveOperationException -> L8b
            goto La9
        L7f:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch: java.lang.ReflectiveOperationException -> L8b
            r11.<init>(r4)     // Catch: java.lang.ReflectiveOperationException -> L8b
            throw r11     // Catch: java.lang.ReflectiveOperationException -> L8b
        L85:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch: java.lang.ReflectiveOperationException -> L8b
            r11.<init>(r4)     // Catch: java.lang.ReflectiveOperationException -> L8b
            throw r11     // Catch: java.lang.ReflectiveOperationException -> L8b
        L8b:
            java.lang.reflect.Method[] r11 = r9.getDeclaredMethods()     // Catch: java.lang.ReflectiveOperationException -> La8
            java.lang.String r2 = "declaredMethods"
            jo.p.g(r11, r2)     // Catch: java.lang.ReflectiveOperationException -> La8
            int r2 = r11.length     // Catch: java.lang.ReflectiveOperationException -> La8
        L95:
            if (r1 >= r2) goto La8
            r3 = r11[r1]     // Catch: java.lang.ReflectiveOperationException -> La8
            java.lang.String r4 = r3.getName()     // Catch: java.lang.ReflectiveOperationException -> La8
            boolean r4 = jo.p.c(r4, r10)     // Catch: java.lang.ReflectiveOperationException -> La8
            if (r4 == 0) goto La5
            r0 = r3
            goto La8
        La5:
            int r1 = r1 + 1
            goto L95
        La8:
            r11 = r0
        La9:
            if (r11 == 0) goto Lac
            return r11
        Lac:
            java.lang.NoSuchMethodException r11 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = r9.getName()
            r0.append(r9)
            r9 = 46
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = r0.toString()
            r11.<init>(r9)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.a.d(java.lang.Class, java.lang.String, java.lang.Object[]):java.lang.reflect.Method");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[LOOP:0: B:3:0x0013->B:12:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[EDGE_INSN: B:19:0x003c->B:14:0x003c ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.reflect.Method e(java.lang.Class<?> r8, java.lang.String r9, java.lang.Class<?>... r10) {
        /*
            r7 = this;
            int r0 = r10.length
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r0)
            java.lang.Class[] r10 = (java.lang.Class[]) r10
            java.lang.reflect.Method[] r8 = r8.getDeclaredMethods()
            java.lang.String r0 = "declaredMethods"
            jo.p.g(r8, r0)
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L13:
            if (r2 >= r0) goto L3b
            r3 = r8[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = jo.p.c(r9, r4)
            if (r4 == 0) goto L34
            k2.a r4 = k2.a.f38368a
            java.lang.Class[] r5 = r3.getParameterTypes()
            java.lang.String r6 = "it.parameterTypes"
            jo.p.g(r5, r6)
            boolean r4 = r4.b(r5, r10)
            if (r4 == 0) goto L34
            r4 = 1
            goto L35
        L34:
            r4 = r1
        L35:
            if (r4 == 0) goto L38
            goto L3c
        L38:
            int r2 = r2 + 1
            goto L13
        L3b:
            r3 = 0
        L3c:
            if (r3 == 0) goto L3f
            return r3
        L3f:
            java.lang.NoSuchMethodException r8 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = " not found"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.a.e(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    public final Object f(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return 0;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return '0';
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return 0L;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                break;
        }
        return null;
    }

    public final void g(String str, String str2, i iVar, Object... objArr) {
        p.h(str, "className");
        p.h(str2, "methodName");
        p.h(iVar, "composer");
        p.h(objArr, "args");
        try {
            Class<?> cls = Class.forName(str);
            p.g(cls, "composableClass");
            Method d10 = d(cls, str2, Arrays.copyOf(objArr, objArr.length));
            d10.setAccessible(true);
            if (Modifier.isStatic(d10.getModifiers())) {
                h(d10, null, iVar, Arrays.copyOf(objArr, objArr.length));
            } else {
                h(d10, cls.getConstructor(new Class[0]).newInstance(new Object[0]), iVar, Arrays.copyOf(objArr, objArr.length));
            }
        } catch (ReflectiveOperationException e10) {
            throw new ClassNotFoundException("Composable Method '" + str + '.' + str2 + "' not found", e10);
        }
    }

    public final Object h(Method method, Object obj, i iVar, Object... objArr) {
        Object obj2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        p.g(parameterTypes, "parameterTypes");
        int i10 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (p.c(parameterTypes[length], i.class)) {
                    i10 = length;
                    break;
                } else if (i11 < 0) {
                    break;
                } else {
                    length = i11;
                }
            }
        }
        int i12 = i10 + 1;
        int a10 = a(i10, obj != null ? 1 : 0) + i12;
        int length2 = method.getParameterTypes().length;
        if ((length2 != a10 ? c(i10) : 0) + a10 == length2) {
            Object[] objArr2 = new Object[length2];
            int i13 = 0;
            while (i13 < length2) {
                if (i13 >= 0 && i13 < i10) {
                    if (i13 < 0 || i13 > o.L(objArr)) {
                        a aVar = f38368a;
                        Class<?> cls = method.getParameterTypes()[i13];
                        p.g(cls, "parameterTypes[idx]");
                        obj2 = aVar.f(cls);
                    } else {
                        obj2 = objArr[i13];
                    }
                } else if (i13 == i10) {
                    obj2 = iVar;
                } else {
                    if (i12 <= i13 && i13 < a10) {
                        obj2 = 0;
                    } else {
                        if (a10 <= i13 && i13 < length2) {
                            obj2 = 2097151;
                        } else {
                            throw new IllegalStateException("Unexpected index".toString());
                        }
                    }
                }
                objArr2[i13] = obj2;
                i13++;
            }
            return method.invoke(obj, Arrays.copyOf(objArr2, length2));
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
