package hi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class d0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static q a(String str, f fVar, u4 u4Var, List<q> list) {
        String str2;
        char c10;
        String str3;
        double min;
        j jVar;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c10 = 0;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c10 = 2;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c10 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c10 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c10 = 3;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c10 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c10 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c10 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c10 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c10 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c10 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c10 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c10 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    c10 = 1;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c10 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c10 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c10 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c10 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c10 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            default:
                str2 = "toString";
                c10 = 65535;
                break;
        }
        double d10 = 0.0d;
        switch (c10) {
            case 0:
                q d11 = fVar.d();
                if (!list.isEmpty()) {
                    for (q qVar : list) {
                        q b10 = u4Var.b(qVar);
                        if (!(b10 instanceof h)) {
                            f fVar2 = (f) d11;
                            int p10 = fVar2.p();
                            if (b10 instanceof f) {
                                f fVar3 = (f) b10;
                                Iterator<Integer> u10 = fVar3.u();
                                while (u10.hasNext()) {
                                    Integer next = u10.next();
                                    fVar2.B(next.intValue() + p10, fVar3.r(next.intValue()));
                                }
                            } else {
                                fVar2.B(p10, b10);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return d11;
            case 1:
                v5.h("every", 1, list);
                q b11 = u4Var.b(list.get(0));
                if (b11 instanceof p) {
                    if (fVar.p() != 0 && b(fVar, u4Var, (p) b11, Boolean.FALSE, Boolean.TRUE).p() != fVar.p()) {
                        return q.f35927l;
                    }
                    return q.f35926k;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                v5.h("filter", 1, list);
                q b12 = u4Var.b(list.get(0));
                if (b12 instanceof p) {
                    if (fVar.m() == 0) {
                        return new f();
                    }
                    q d12 = fVar.d();
                    f b13 = b(fVar, u4Var, (p) b12, null, Boolean.TRUE);
                    f fVar4 = new f();
                    Iterator<Integer> u11 = b13.u();
                    while (u11.hasNext()) {
                        fVar4.B(fVar4.p(), ((f) d12).r(u11.next().intValue()));
                    }
                    return fVar4;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                v5.h("forEach", 1, list);
                q b14 = u4Var.b(list.get(0));
                if (b14 instanceof p) {
                    if (fVar.m() == 0) {
                        return q.f35921f;
                    }
                    b(fVar, u4Var, (p) b14, null, null);
                    return q.f35921f;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 4:
                v5.j("indexOf", 2, list);
                q qVar2 = q.f35921f;
                if (!list.isEmpty()) {
                    qVar2 = u4Var.b(list.get(0));
                }
                if (list.size() > 1) {
                    double a10 = v5.a(u4Var.b(list.get(1)).e().doubleValue());
                    if (a10 >= fVar.p()) {
                        return new i(Double.valueOf(-1.0d));
                    }
                    d10 = a10 < 0.0d ? fVar.p() + a10 : a10;
                }
                Iterator<Integer> u12 = fVar.u();
                while (u12.hasNext()) {
                    int intValue = u12.next().intValue();
                    double d13 = intValue;
                    if (d13 >= d10 && v5.l(fVar.r(intValue), qVar2)) {
                        return new i(Double.valueOf(d13));
                    }
                }
                return new i(Double.valueOf(-1.0d));
            case 5:
                v5.j("join", 1, list);
                if (fVar.p() == 0) {
                    return q.f35928m;
                }
                if (list.size() > 0) {
                    q b15 = u4Var.b(list.get(0));
                    str3 = ((b15 instanceof o) || (b15 instanceof v)) ? "" : b15.h();
                } else {
                    str3 = ",";
                }
                return new u(fVar.t(str3));
            case 6:
                v5.j("lastIndexOf", 2, list);
                q qVar3 = q.f35921f;
                if (!list.isEmpty()) {
                    qVar3 = u4Var.b(list.get(0));
                }
                double p11 = fVar.p() - 1;
                if (list.size() > 1) {
                    q b16 = u4Var.b(list.get(1));
                    p11 = Double.isNaN(b16.e().doubleValue()) ? fVar.p() - 1 : v5.a(b16.e().doubleValue());
                    if (p11 < 0.0d) {
                        p11 += fVar.p();
                    }
                }
                if (p11 < 0.0d) {
                    return new i(Double.valueOf(-1.0d));
                }
                for (int min2 = (int) Math.min(fVar.p(), p11); min2 >= 0; min2--) {
                    if (fVar.D(min2) && v5.l(fVar.r(min2), qVar3)) {
                        return new i(Double.valueOf(min2));
                    }
                }
                return new i(Double.valueOf(-1.0d));
            case 7:
                v5.h("map", 1, list);
                q b17 = u4Var.b(list.get(0));
                if (b17 instanceof p) {
                    if (fVar.p() == 0) {
                        return new f();
                    }
                    return b(fVar, u4Var, (p) b17, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                v5.h("pop", 0, list);
                int p12 = fVar.p();
                if (p12 == 0) {
                    return q.f35921f;
                }
                int i10 = p12 - 1;
                q r10 = fVar.r(i10);
                fVar.A(i10);
                return r10;
            case '\t':
                if (!list.isEmpty()) {
                    for (q qVar4 : list) {
                        fVar.B(fVar.p(), u4Var.b(qVar4));
                    }
                }
                return new i(Double.valueOf(fVar.p()));
            case '\n':
                return c(fVar, u4Var, list, true);
            case 11:
                return c(fVar, u4Var, list, false);
            case '\f':
                v5.h("reverse", 0, list);
                int p13 = fVar.p();
                if (p13 != 0) {
                    for (int i11 = 0; i11 < p13 / 2; i11++) {
                        if (fVar.D(i11)) {
                            q r11 = fVar.r(i11);
                            fVar.B(i11, null);
                            int i12 = (p13 - 1) - i11;
                            if (fVar.D(i12)) {
                                fVar.B(i11, fVar.r(i12));
                            }
                            fVar.B(i12, r11);
                        }
                    }
                }
                return fVar;
            case '\r':
                v5.h("shift", 0, list);
                if (fVar.p() == 0) {
                    return q.f35921f;
                }
                q r12 = fVar.r(0);
                fVar.A(0);
                return r12;
            case 14:
                v5.j("slice", 2, list);
                if (list.isEmpty()) {
                    return fVar.d();
                }
                double p14 = fVar.p();
                double a11 = v5.a(u4Var.b(list.get(0)).e().doubleValue());
                if (a11 < 0.0d) {
                    min = Math.max(a11 + p14, 0.0d);
                } else {
                    min = Math.min(a11, p14);
                }
                if (list.size() == 2) {
                    double a12 = v5.a(u4Var.b(list.get(1)).e().doubleValue());
                    if (a12 < 0.0d) {
                        p14 = Math.max(p14 + a12, 0.0d);
                    } else {
                        p14 = Math.min(p14, a12);
                    }
                }
                f fVar5 = new f();
                for (int i13 = (int) min; i13 < p14; i13++) {
                    fVar5.B(fVar5.p(), fVar.r(i13));
                }
                return fVar5;
            case 15:
                v5.h("some", 1, list);
                q b18 = u4Var.b(list.get(0));
                if (b18 instanceof j) {
                    if (fVar.p() == 0) {
                        return q.f35927l;
                    }
                    j jVar2 = (j) b18;
                    Iterator<Integer> u13 = fVar.u();
                    while (u13.hasNext()) {
                        int intValue2 = u13.next().intValue();
                        if (fVar.D(intValue2) && jVar2.a(u4Var, Arrays.asList(fVar.r(intValue2), new i(Double.valueOf(intValue2)), fVar)).f().booleanValue()) {
                            return q.f35926k;
                        }
                    }
                    return q.f35927l;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 16:
                v5.j("sort", 1, list);
                if (fVar.p() >= 2) {
                    List<q> w10 = fVar.w();
                    if (list.isEmpty()) {
                        jVar = null;
                    } else {
                        q b19 = u4Var.b(list.get(0));
                        if (b19 instanceof j) {
                            jVar = (j) b19;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    }
                    Collections.sort(w10, new c0(jVar, u4Var));
                    fVar.x();
                    int i14 = 0;
                    for (q qVar5 : w10) {
                        fVar.B(i14, qVar5);
                        i14++;
                    }
                }
                return fVar;
            case 17:
                if (list.isEmpty()) {
                    return new f();
                }
                int a13 = (int) v5.a(u4Var.b(list.get(0)).e().doubleValue());
                if (a13 < 0) {
                    a13 = Math.max(0, a13 + fVar.p());
                } else if (a13 > fVar.p()) {
                    a13 = fVar.p();
                }
                int p15 = fVar.p();
                f fVar6 = new f();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) v5.a(u4Var.b(list.get(1)).e().doubleValue()));
                    if (max > 0) {
                        for (int i15 = a13; i15 < Math.min(p15, a13 + max); i15++) {
                            fVar6.B(fVar6.p(), fVar.r(a13));
                            fVar.A(a13);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i16 = 2; i16 < list.size(); i16++) {
                            q b20 = u4Var.b(list.get(i16));
                            if (!(b20 instanceof h)) {
                                fVar.y((a13 + i16) - 2, b20);
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                } else {
                    while (a13 < p15) {
                        fVar6.B(fVar6.p(), fVar.r(a13));
                        fVar.B(a13, null);
                        a13++;
                    }
                }
                return fVar6;
            case 18:
                v5.h(str2, 0, list);
                return new u(fVar.t(","));
            case 19:
                if (!list.isEmpty()) {
                    f fVar7 = new f();
                    for (q qVar6 : list) {
                        q b21 = u4Var.b(qVar6);
                        if (!(b21 instanceof h)) {
                            fVar7.B(fVar7.p(), b21);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int p16 = fVar7.p();
                    Iterator<Integer> u14 = fVar.u();
                    while (u14.hasNext()) {
                        Integer next2 = u14.next();
                        fVar7.B(next2.intValue() + p16, fVar.r(next2.intValue()));
                    }
                    fVar.x();
                    Iterator<Integer> u15 = fVar7.u();
                    while (u15.hasNext()) {
                        Integer next3 = u15.next();
                        fVar.B(next3.intValue(), fVar7.r(next3.intValue()));
                    }
                }
                return new i(Double.valueOf(fVar.p()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public static f b(f fVar, u4 u4Var, j jVar, Boolean bool, Boolean bool2) {
        f fVar2 = new f();
        Iterator<Integer> u10 = fVar.u();
        while (u10.hasNext()) {
            int intValue = u10.next().intValue();
            if (fVar.D(intValue)) {
                q a10 = jVar.a(u4Var, Arrays.asList(fVar.r(intValue), new i(Double.valueOf(intValue)), fVar));
                if (a10.f().equals(bool)) {
                    return fVar2;
                }
                if (bool2 == null || a10.f().equals(bool2)) {
                    fVar2.B(intValue, a10);
                }
            }
        }
        return fVar2;
    }

    public static q c(f fVar, u4 u4Var, List<q> list, boolean z10) {
        q qVar;
        v5.i("reduce", 1, list);
        v5.j("reduce", 2, list);
        q b10 = u4Var.b(list.get(0));
        if (b10 instanceof j) {
            if (list.size() == 2) {
                qVar = u4Var.b(list.get(1));
                if (qVar instanceof h) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (fVar.p() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            } else {
                qVar = null;
            }
            j jVar = (j) b10;
            int p10 = fVar.p();
            int i10 = z10 ? 0 : p10 - 1;
            int i11 = z10 ? p10 - 1 : 0;
            int i12 = true == z10 ? 1 : -1;
            if (qVar == null) {
                qVar = fVar.r(i10);
                i10 += i12;
            }
            while ((i11 - i10) * i12 >= 0) {
                if (fVar.D(i10)) {
                    qVar = jVar.a(u4Var, Arrays.asList(qVar, fVar.r(i10), new i(Double.valueOf(i10)), fVar));
                    if (qVar instanceof h) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i10 += i12;
                } else {
                    i10 += i12;
                }
            }
            return qVar;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
