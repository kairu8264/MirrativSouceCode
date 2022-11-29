package ai;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class zj3 {
    public static String a(xj3 xj3Var, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        c(xj3Var, sb2, 0);
        return sb2.toString();
    }

    public static final void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                b(sb2, i10, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb2, i10, str, entry);
            }
        } else {
            sb2.append('\n');
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(cl3.a(oh3.Q((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof oh3) {
                sb2.append(": \"");
                sb2.append(cl3.a((oh3) obj));
                sb2.append('\"');
            } else if (obj instanceof ri3) {
                sb2.append(" {");
                c((ri3) obj, sb2, i10 + 2);
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i13 = i10 + 2;
                b(sb2, i13, "key", entry2.getKey());
                b(sb2, i13, "value", entry2.getValue());
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj.toString());
            }
        }
    }

    public static void c(xj3 xj3Var, StringBuilder sb2, int i10) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : xj3Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb2, i10, d(concat), ri3.j(method2, xj3Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb2, i10, d(concat2), ri3.j(method3, xj3Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object j10 = ri3.j(method4, xj3Var, new Object[0]);
                    if (method5 == null) {
                        if (j10 instanceof Boolean) {
                            if (((Boolean) j10).booleanValue()) {
                                b(sb2, i10, d(concat3), j10);
                            }
                        } else if (j10 instanceof Integer) {
                            if (((Integer) j10).intValue() != 0) {
                                b(sb2, i10, d(concat3), j10);
                            }
                        } else if (j10 instanceof Float) {
                            if (((Float) j10).floatValue() != 0.0f) {
                                b(sb2, i10, d(concat3), j10);
                            }
                        } else if (j10 instanceof Double) {
                            if (((Double) j10).doubleValue() != 0.0d) {
                                b(sb2, i10, d(concat3), j10);
                            }
                        } else {
                            if (j10 instanceof String) {
                                equals = j10.equals("");
                            } else if (j10 instanceof oh3) {
                                equals = j10.equals(oh3.f7807x);
                            } else if (j10 instanceof xj3) {
                                if (j10 != ((xj3) j10).g()) {
                                    b(sb2, i10, d(concat3), j10);
                                }
                            } else {
                                if ((j10 instanceof Enum) && ((Enum) j10).ordinal() == 0) {
                                }
                                b(sb2, i10, d(concat3), j10);
                            }
                            if (!equals) {
                                b(sb2, i10, d(concat3), j10);
                            }
                        }
                    } else if (((Boolean) ri3.j(method5, xj3Var, new Object[0])).booleanValue()) {
                        b(sb2, i10, d(concat3), j10);
                    }
                }
            }
        }
        if (!(xj3Var instanceof oi3)) {
            el3 el3Var = ((ri3) xj3Var).zzc;
            if (el3Var != null) {
                el3Var.g(sb2, i10);
                return;
            }
            return;
        }
        oi3 oi3Var = (oi3) xj3Var;
        throw null;
    }

    public static final String d(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }
}
