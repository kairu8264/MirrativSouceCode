package com.google.protobuf;

import com.google.protobuf.z;
import java.util.Map;

/* loaded from: classes4.dex */
public class c0 implements b0 {
    public static <K, V> int i(int i10, Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        z zVar = (z) obj2;
        int i11 = 0;
        if (a0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : a0Var.entrySet()) {
            i11 += zVar.a(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    public static <K, V> a0<K, V> j(Object obj, Object obj2) {
        a0<K, V> a0Var = (a0) obj;
        a0<K, V> a0Var2 = (a0) obj2;
        if (!a0Var2.isEmpty()) {
            if (!a0Var.o()) {
                a0Var = a0Var.s();
            }
            a0Var.r(a0Var2);
        }
        return a0Var;
    }

    @Override // com.google.protobuf.b0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.protobuf.b0
    public z.a<?, ?> b(Object obj) {
        return ((z) obj).c();
    }

    @Override // com.google.protobuf.b0
    public Map<?, ?> c(Object obj) {
        return (a0) obj;
    }

    @Override // com.google.protobuf.b0
    public Object d(Object obj) {
        return a0.h().s();
    }

    @Override // com.google.protobuf.b0
    public Map<?, ?> e(Object obj) {
        return (a0) obj;
    }

    @Override // com.google.protobuf.b0
    public Object f(Object obj) {
        ((a0) obj).q();
        return obj;
    }

    @Override // com.google.protobuf.b0
    public int g(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // com.google.protobuf.b0
    public boolean h(Object obj) {
        return !((a0) obj).o();
    }
}
