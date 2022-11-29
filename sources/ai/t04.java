package ai;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class t04 implements j24 {

    /* renamed from: a  reason: collision with root package name */
    public final List<v4> f10066a = zz2.r();

    public t04(int i10) {
    }

    @Override // ai.j24
    public final l24 a(int i10, i24 i24Var) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new o14(new l14(i24Var.f5103b));
            }
            if (i10 != 21) {
                if (i10 != 27) {
                    if (i10 != 36) {
                        if (i10 != 89) {
                            if (i10 != 129) {
                                if (i10 == 138) {
                                    return new o14(new u04(i24Var.f5103b));
                                }
                                if (i10 == 172) {
                                    return new o14(new p04(i24Var.f5103b));
                                }
                                if (i10 == 257) {
                                    return new y14(new n14(MimeTypes.APPLICATION_AIT));
                                }
                                if (i10 == 134) {
                                    return new y14(new n14(MimeTypes.APPLICATION_SCTE35));
                                }
                                if (i10 != 135) {
                                    switch (i10) {
                                        case 15:
                                            return new o14(new s04(false, i24Var.f5103b));
                                        case 16:
                                            return new o14(new c14(c(i24Var)));
                                        case 17:
                                            return new o14(new k14(i24Var.f5103b));
                                        default:
                                            return null;
                                    }
                                }
                            }
                            return new o14(new m04(i24Var.f5103b));
                        }
                        return new o14(new w04(i24Var.f5104c));
                    }
                    return new o14(new i14(b(i24Var)));
                }
                return new o14(new g14(b(i24Var), false, false));
            }
            return new o14(new j14());
        }
        return new o14(new z04(c(i24Var)));
    }

    public final z14 b(i24 i24Var) {
        return new z14(d(i24Var));
    }

    public final n24 c(i24 i24Var) {
        return new n24(d(i24Var));
    }

    public final List<v4> d(i24 i24Var) {
        String str;
        int i10;
        List<byte[]> list;
        hb hbVar = new hb(i24Var.f5105d);
        List<v4> list2 = this.f10066a;
        while (hbVar.l() > 0) {
            int v10 = hbVar.v();
            int o10 = hbVar.o() + hbVar.v();
            if (v10 == 134) {
                list2 = new ArrayList<>();
                int v11 = hbVar.v() & 31;
                for (int i11 = 0; i11 < v11; i11++) {
                    String e10 = hbVar.e(3, zw2.f13232c);
                    int v12 = hbVar.v();
                    int i12 = v12 & 128;
                    if (i12 != 0) {
                        i10 = v12 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i10 = 1;
                    }
                    byte v13 = (byte) hbVar.v();
                    hbVar.s(1);
                    if (i12 != 0) {
                        int i13 = w9.f11516c;
                        list = Collections.singletonList((v13 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    t4 t4Var = new t4();
                    t4Var.n(str);
                    t4Var.g(e10);
                    t4Var.G(i10);
                    t4Var.p(list);
                    list2.add(t4Var.I());
                }
            }
            hbVar.p(o10);
        }
        return list2;
    }
}
