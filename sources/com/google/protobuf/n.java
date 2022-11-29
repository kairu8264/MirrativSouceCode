package com.google.protobuf;

import com.google.protobuf.p0;
import com.google.protobuf.r;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class n extends m<r.d> {

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28181a;

        static {
            int[] iArr = new int[p0.b.values().length];
            f28181a = iArr;
            try {
                iArr[p0.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28181a[p0.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28181a[p0.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28181a[p0.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28181a[p0.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28181a[p0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28181a[p0.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28181a[p0.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28181a[p0.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28181a[p0.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28181a[p0.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28181a[p0.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28181a[p0.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28181a[p0.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28181a[p0.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28181a[p0.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28181a[p0.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f28181a[p0.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.m
    public int a(Map.Entry<?, ?> entry) {
        return ((r.d) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.m
    public Object b(l lVar, d0 d0Var, int i10) {
        return lVar.a(d0Var, i10);
    }

    @Override // com.google.protobuf.m
    public p<r.d> c(Object obj) {
        return ((r.c) obj).extensions;
    }

    @Override // com.google.protobuf.m
    public p<r.d> d(Object obj) {
        return ((r.c) obj).P();
    }

    @Override // com.google.protobuf.m
    public boolean e(d0 d0Var) {
        return d0Var instanceof r.c;
    }

    @Override // com.google.protobuf.m
    public void f(Object obj) {
        c(obj).t();
    }

    @Override // com.google.protobuf.m
    public <UT, UB> UB g(j0 j0Var, Object obj, l lVar, p<r.d> pVar, UB ub2, m0<UT, UB> m0Var) throws IOException {
        Object i10;
        ArrayList arrayList;
        r.e eVar = (r.e) obj;
        int c10 = eVar.c();
        if (eVar.f28211b.f() && eVar.f28211b.k()) {
            switch (a.f28181a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    j0Var.M(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    j0Var.I(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    j0Var.h(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    j0Var.f(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    j0Var.A(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    j0Var.t(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    j0Var.D(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    j0Var.m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    j0Var.w(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    j0Var.b(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    j0Var.z(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    j0Var.u(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    j0Var.c(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    j0Var.i(arrayList);
                    ub2 = (UB) k0.z(c10, arrayList, eVar.f28211b.c(), ub2, m0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f28211b.g());
            }
            pVar.x(eVar.f28211b, arrayList);
        } else {
            Object obj2 = null;
            if (eVar.a() == p0.b.ENUM) {
                int r10 = j0Var.r();
                if (eVar.f28211b.c().a(r10) == null) {
                    return (UB) k0.L(c10, r10, ub2, m0Var);
                }
                obj2 = Integer.valueOf(r10);
            } else {
                switch (a.f28181a[eVar.a().ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(j0Var.readDouble());
                        break;
                    case 2:
                        obj2 = Float.valueOf(j0Var.readFloat());
                        break;
                    case 3:
                        obj2 = Long.valueOf(j0Var.N());
                        break;
                    case 4:
                        obj2 = Long.valueOf(j0Var.v());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(j0Var.r());
                        break;
                    case 6:
                        obj2 = Long.valueOf(j0Var.a());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(j0Var.y());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(j0Var.d());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(j0Var.g());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(j0Var.K());
                        break;
                    case 11:
                        obj2 = Long.valueOf(j0Var.e());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(j0Var.k());
                        break;
                    case 13:
                        obj2 = Long.valueOf(j0Var.E());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = j0Var.q();
                        break;
                    case 16:
                        obj2 = j0Var.F();
                        break;
                    case 17:
                        obj2 = j0Var.n(eVar.b().getClass(), lVar);
                        break;
                    case 18:
                        obj2 = j0Var.x(eVar.b().getClass(), lVar);
                        break;
                }
            }
            if (eVar.d()) {
                pVar.a(eVar.f28211b, obj2);
            } else {
                int i11 = a.f28181a[eVar.a().ordinal()];
                if ((i11 == 17 || i11 == 18) && (i10 = pVar.i(eVar.f28211b)) != null) {
                    obj2 = t.h(i10, obj2);
                }
                pVar.x(eVar.f28211b, obj2);
            }
        }
        return ub2;
    }

    @Override // com.google.protobuf.m
    public void h(j0 j0Var, Object obj, l lVar, p<r.d> pVar) throws IOException {
        r.e eVar = (r.e) obj;
        pVar.x(eVar.f28211b, j0Var.x(eVar.b().getClass(), lVar));
    }

    @Override // com.google.protobuf.m
    public void i(f fVar, Object obj, l lVar, p<r.d> pVar) throws IOException {
        r.e eVar = (r.e) obj;
        d0 r02 = eVar.b().i().r0();
        d P = d.P(ByteBuffer.wrap(fVar.A()), true);
        fn.t.a().b(r02, P, lVar);
        pVar.x(eVar.f28211b, r02);
        if (P.G() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.a();
        }
    }

    @Override // com.google.protobuf.m
    public void j(q0 q0Var, Map.Entry<?, ?> entry) throws IOException {
        r.d dVar = (r.d) entry.getKey();
        if (dVar.f()) {
            switch (a.f28181a[dVar.g().ordinal()]) {
                case 1:
                    k0.P(dVar.getNumber(), (List) entry.getValue(), q0Var, dVar.k());
                    return;
                case 2:
                    k0.T(dVar.getNumber(), (List) entry.getValue(), q0Var, dVar.k());
                    return;
                case 3:
                    k0.W(dVar.getNumber(), (List) entry.getValue(), q0Var, dVar.k());
                    return;
                case 4:
                    k0.e0(dVar.getNumber(), (List) entry.getValue(), q0Var, dVar.k());
                    return;
                case 5:
                    k0.V(dVar.getNumber(), (List) entry.getValue(), q0Var, dVar.k());
                    return;
                case 6:
                    k0.S(dVar.getNumber(), (List) entry.getValue(), q0Var, dVar.k());
                    return;
                case 7:
                    k0.R(dVar.getNumber(), (List) entry.getValue(), q0Var, dVar.k());
                    return;
                case 8:
                    k0.N(dVar.getNumber(), (List) entry.getValue(), q0Var, dVar.k());
                    return;
                case 9:
                    k0.d0(dVar.getNumber(), (List) entry.getValue(), q0Var, dVar.k());
                    return;
                case 10:
                    k0.Y(dVar.getNumber(), (List) entry.getValue(), q0Var, dVar.k());
                    return;
                case 11:
                    k0.Z(dVar.getNumber(), (List) entry.getValue(), q0Var, dVar.k());
                    return;
                case 12:
                    k0.a0(dVar.getNumber(), (List) entry.getValue(), q0Var, dVar.k());
                    return;
                case 13:
                    k0.b0(dVar.getNumber(), (List) entry.getValue(), q0Var, dVar.k());
                    return;
                case 14:
                    k0.V(dVar.getNumber(), (List) entry.getValue(), q0Var, dVar.k());
                    return;
                case 15:
                    k0.O(dVar.getNumber(), (List) entry.getValue(), q0Var);
                    return;
                case 16:
                    k0.c0(dVar.getNumber(), (List) entry.getValue(), q0Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    k0.U(dVar.getNumber(), (List) entry.getValue(), q0Var, fn.t.a().d(list.get(0).getClass()));
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    k0.X(dVar.getNumber(), (List) entry.getValue(), q0Var, fn.t.a().d(list2.get(0).getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (a.f28181a[dVar.g().ordinal()]) {
            case 1:
                q0Var.s(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                q0Var.H(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                q0Var.x(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                q0Var.g(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                q0Var.j(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                q0Var.v(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                q0Var.c(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                q0Var.y(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                q0Var.q(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                q0Var.A(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                q0Var.k(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                q0Var.N(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                q0Var.o(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                q0Var.j(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                q0Var.i(dVar.getNumber(), (f) entry.getValue());
                return;
            case 16:
                q0Var.f(dVar.getNumber(), (String) entry.getValue());
                return;
            case 17:
                q0Var.z(dVar.getNumber(), entry.getValue(), fn.t.a().d(entry.getValue().getClass()));
                return;
            case 18:
                q0Var.C(dVar.getNumber(), entry.getValue(), fn.t.a().d(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }
}
