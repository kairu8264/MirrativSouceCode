package sp;

import android.support.v4.media.session.PlaybackStateCompat;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import io.l;
import io.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo.a0;
import jo.d0;
import jo.e0;
import jo.q;
import rp.k0;
import rp.t;
import rp.y;
import so.n;
import so.o;
import wn.v;

/* loaded from: classes4.dex */
public final class e {

    /* loaded from: classes4.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return zn.a.c(((d) t10).a(), ((d) t11).a());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends q implements p<Integer, Long, v> {
        public final /* synthetic */ d0 A;
        public final /* synthetic */ d0 B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a0 f52818w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f52819x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ d0 f52820y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ rp.e f52821z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var, long j10, d0 d0Var, rp.e eVar, d0 d0Var2, d0 d0Var3) {
            super(2);
            this.f52818w = a0Var;
            this.f52819x = j10;
            this.f52820y = d0Var;
            this.f52821z = eVar;
            this.A = d0Var2;
            this.B = d0Var3;
        }

        public final void a(int i10, long j10) {
            if (i10 == 1) {
                a0 a0Var = this.f52818w;
                if (!a0Var.f38125w) {
                    a0Var.f38125w = true;
                    if (j10 >= this.f52819x) {
                        d0 d0Var = this.f52820y;
                        long j11 = d0Var.f38135w;
                        if (j11 == 4294967295L) {
                            j11 = this.f52821z.C0();
                        }
                        d0Var.f38135w = j11;
                        d0 d0Var2 = this.A;
                        d0Var2.f38135w = d0Var2.f38135w == 4294967295L ? this.f52821z.C0() : 0L;
                        d0 d0Var3 = this.B;
                        d0Var3.f38135w = d0Var3.f38135w == 4294967295L ? this.f52821z.C0() : 0L;
                        return;
                    }
                    throw new IOException("bad zip: zip64 extra too short");
                }
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(Integer num, Long l10) {
            a(num.intValue(), l10.longValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends q implements p<Integer, Long, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ rp.e f52822w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e0<Long> f52823x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e0<Long> f52824y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ e0<Long> f52825z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(rp.e eVar, e0<Long> e0Var, e0<Long> e0Var2, e0<Long> e0Var3) {
            super(2);
            this.f52822w = eVar;
            this.f52823x = e0Var;
            this.f52824y = e0Var2;
            this.f52825z = e0Var3;
        }

        /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r10v12, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.Long] */
        public final void a(int i10, long j10) {
            if (i10 == 21589) {
                if (j10 >= 1) {
                    int readByte = this.f52822w.readByte() & TagConstant.TAG_CAT_RESERVED;
                    boolean z10 = (readByte & 1) == 1;
                    boolean z11 = (readByte & 2) == 2;
                    boolean z12 = (readByte & 4) == 4;
                    rp.e eVar = this.f52822w;
                    long j11 = z10 ? 5L : 1L;
                    if (z11) {
                        j11 += 4;
                    }
                    if (z12) {
                        j11 += 4;
                    }
                    if (j10 < j11) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z10) {
                        this.f52823x.f38136w = Long.valueOf(eVar.A1() * 1000);
                    }
                    if (z11) {
                        this.f52824y.f38136w = Long.valueOf(this.f52822w.A1() * 1000);
                    }
                    if (z12) {
                        this.f52825z.f38136w = Long.valueOf(this.f52822w.A1() * 1000);
                        return;
                    }
                    return;
                }
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(Integer num, Long l10) {
            a(num.intValue(), l10.longValue());
            return v.f59242a;
        }
    }

    public static final Map<y, d> a(List<d> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (d dVar : xn.a0.v0(list, new a())) {
            if (((d) linkedHashMap.put(dVar.a(), dVar)) == null) {
                while (true) {
                    y n10 = dVar.a().n();
                    if (n10 != null) {
                        d dVar2 = (d) linkedHashMap.get(n10);
                        if (dVar2 != null) {
                            dVar2.b().add(dVar.a());
                            break;
                        }
                        d dVar3 = new d(n10, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        linkedHashMap.put(n10, dVar3);
                        dVar3.b().add(dVar.a());
                        dVar = dVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final Long b(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i10 >> 9) & 127) + 1980, ((i10 >> 5) & 15) - 1, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    public static final String c(int i10) {
        String num = Integer.toString(i10, so.a.a(16));
        jo.p.g(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        return jo.p.o("0x", num);
    }

    public static final k0 d(y yVar, rp.i iVar, l<? super d, Boolean> lVar) throws IOException {
        int A1;
        jo.p.h(yVar, "zipPath");
        jo.p.h(iVar, "fileSystem");
        jo.p.h(lVar, "predicate");
        rp.g n10 = iVar.n(yVar);
        long j10 = 0;
        try {
            rp.e c10 = t.c(rp.g.q(n10, 0L, 1, null));
            int A12 = c10.A1();
            if (A12 != 67324752) {
                if (A12 == 101010256) {
                    throw new IOException("unsupported zip: empty");
                }
                throw new IOException("not a zip: expected " + c(67324752) + " but was " + c(A12));
            }
            v vVar = v.f59242a;
            go.a.a(c10, null);
            long o10 = n10.o() - 22;
            if (o10 >= 0) {
                long max = Math.max(o10 - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, 0L);
                while (true) {
                    rp.e c11 = t.c(n10.p(o10));
                    if (c11.A1() == 101010256) {
                        sp.a f10 = f(c11);
                        String P0 = c11.P0(f10.b());
                        c11.close();
                        long j11 = o10 - 20;
                        if (j11 > 0) {
                            rp.e c12 = t.c(n10.p(j11));
                            if (c12.A1() == 117853008) {
                                int A13 = c12.A1();
                                long C0 = c12.C0();
                                if (c12.A1() == 1 && A13 == 0) {
                                    rp.e c13 = t.c(n10.p(C0));
                                    if (c13.A1() == 101075792) {
                                        sp.a j12 = j(c13, f10);
                                        v vVar2 = v.f59242a;
                                        go.a.a(c13, null);
                                        f10 = j12;
                                    } else {
                                        throw new IOException("bad zip: expected " + c(101075792) + " but was " + c(A1));
                                    }
                                } else {
                                    throw new IOException("unsupported zip: spanned");
                                }
                            }
                            v vVar3 = v.f59242a;
                            go.a.a(c12, null);
                        }
                        ArrayList arrayList = new ArrayList();
                        rp.e c14 = t.c(n10.p(f10.a()));
                        long c15 = f10.c();
                        if (0 < c15) {
                            do {
                                j10++;
                                d e10 = e(c14);
                                if (e10.f() < f10.a()) {
                                    if (lVar.invoke(e10).booleanValue()) {
                                        arrayList.add(e10);
                                    }
                                } else {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                            } while (j10 < c15);
                        }
                        v vVar4 = v.f59242a;
                        go.a.a(c14, null);
                        k0 k0Var = new k0(yVar, iVar, a(arrayList), P0);
                        go.a.a(n10, null);
                        return k0Var;
                    }
                    c11.close();
                    o10--;
                    if (o10 < max) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                }
            } else {
                throw new IOException(jo.p.o("not a zip: size=", Long.valueOf(n10.o())));
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                go.a.a(n10, th2);
                throw th3;
            }
        }
    }

    public static final d e(rp.e eVar) throws IOException {
        int A1;
        d0 d0Var;
        long j10;
        jo.p.h(eVar, "<this>");
        if (eVar.A1() == 33639248) {
            eVar.k(4L);
            int y02 = eVar.y0() & 65535;
            if ((y02 & 1) == 0) {
                int y03 = eVar.y0() & 65535;
                Long b10 = b(eVar.y0() & 65535, eVar.y0() & 65535);
                long A12 = eVar.A1() & 4294967295L;
                d0 d0Var2 = new d0();
                d0Var2.f38135w = eVar.A1() & 4294967295L;
                d0 d0Var3 = new d0();
                d0Var3.f38135w = eVar.A1() & 4294967295L;
                int y04 = eVar.y0() & 65535;
                int y05 = eVar.y0() & 65535;
                eVar.k(8L);
                d0 d0Var4 = new d0();
                d0Var4.f38135w = eVar.A1() & 4294967295L;
                String P0 = eVar.P0(eVar.y0() & 65535);
                if (!o.G(P0, (char) 0, false, 2, null)) {
                    if (d0Var3.f38135w == 4294967295L) {
                        j10 = 8 + 0;
                        d0Var = d0Var4;
                    } else {
                        d0Var = d0Var4;
                        j10 = 0;
                    }
                    if (d0Var2.f38135w == 4294967295L) {
                        j10 += 8;
                    }
                    d0 d0Var5 = d0Var;
                    if (d0Var5.f38135w == 4294967295L) {
                        j10 += 8;
                    }
                    long j11 = j10;
                    a0 a0Var = new a0();
                    g(eVar, y04, new b(a0Var, j11, d0Var3, eVar, d0Var2, d0Var5));
                    if (j11 > 0 && !a0Var.f38125w) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    return new d(y.a.e(y.f51736x, "/", false, 1, null).p(P0), n.p(P0, "/", false, 2, null), eVar.P0(y05), A12, d0Var2.f38135w, d0Var3.f38135w, y03, b10, d0Var5.f38135w);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException(jo.p.o("unsupported zip: general purpose bit flag=", c(y02)));
        }
        throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(A1));
    }

    public static final sp.a f(rp.e eVar) throws IOException {
        int y02 = eVar.y0() & 65535;
        int y03 = eVar.y0() & 65535;
        long y04 = eVar.y0() & 65535;
        if (y04 == (eVar.y0() & 65535) && y02 == 0 && y03 == 0) {
            eVar.k(4L);
            return new sp.a(y04, 4294967295L & eVar.A1(), eVar.y0() & 65535);
        }
        throw new IOException("unsupported zip: spanned");
    }

    public static final void g(rp.e eVar, int i10, p<? super Integer, ? super Long, v> pVar) {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 >= 4) {
                int y02 = eVar.y0() & 65535;
                long y03 = eVar.y0() & 65535;
                long j11 = j10 - 4;
                if (j11 >= y03) {
                    eVar.I0(y03);
                    long X = eVar.l().X();
                    pVar.invoke(Integer.valueOf(y02), Long.valueOf(y03));
                    long X2 = (eVar.l().X() + y03) - X;
                    int i11 = (X2 > 0L ? 1 : (X2 == 0L ? 0 : -1));
                    if (i11 < 0) {
                        throw new IOException(jo.p.o("unsupported zip: too many bytes processed for ", Integer.valueOf(y02)));
                    }
                    if (i11 > 0) {
                        eVar.l().k(X2);
                    }
                    j10 = j11 - y03;
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    public static final rp.h h(rp.e eVar, rp.h hVar) {
        jo.p.h(eVar, "<this>");
        jo.p.h(hVar, "basicMetadata");
        rp.h i10 = i(eVar, hVar);
        jo.p.e(i10);
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final rp.h i(rp.e eVar, rp.h hVar) {
        e0 e0Var = new e0();
        e0Var.f38136w = hVar == null ? 0 : hVar.c();
        e0 e0Var2 = new e0();
        e0 e0Var3 = new e0();
        int A1 = eVar.A1();
        if (A1 == 67324752) {
            eVar.k(2L);
            int y02 = eVar.y0() & 65535;
            if ((y02 & 1) == 0) {
                eVar.k(18L);
                int y03 = eVar.y0() & 65535;
                eVar.k(eVar.y0() & 65535);
                if (hVar == null) {
                    eVar.k(y03);
                    return null;
                }
                g(eVar, y03, new c(eVar, e0Var, e0Var2, e0Var3));
                return new rp.h(hVar.g(), hVar.f(), null, hVar.d(), (Long) e0Var3.f38136w, (Long) e0Var.f38136w, (Long) e0Var2.f38136w, null, 128, null);
            }
            throw new IOException(jo.p.o("unsupported zip: general purpose bit flag=", c(y02)));
        }
        throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(A1));
    }

    public static final sp.a j(rp.e eVar, sp.a aVar) throws IOException {
        eVar.k(12L);
        int A1 = eVar.A1();
        int A12 = eVar.A1();
        long C0 = eVar.C0();
        if (C0 == eVar.C0() && A1 == 0 && A12 == 0) {
            eVar.k(8L);
            return new sp.a(C0, eVar.C0(), aVar.b());
        }
        throw new IOException("unsupported zip: spanned");
    }

    public static final void k(rp.e eVar) {
        jo.p.h(eVar, "<this>");
        i(eVar, null);
    }
}
