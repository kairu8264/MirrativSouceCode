package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import j2.f;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final Parcel f14578a;

    public p0(String str) {
        jo.p.h(str, "string");
        Parcel obtain = Parcel.obtain();
        jo.p.g(obtain, "obtain()");
        this.f14578a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public final int a() {
        return this.f14578a.dataAvail();
    }

    public final float b() {
        return j2.a.c(e());
    }

    public final byte c() {
        return this.f14578a.readByte();
    }

    public final long d() {
        return c1.c0.h(p());
    }

    public final float e() {
        return this.f14578a.readFloat();
    }

    public final int f() {
        byte c10 = c();
        if (c10 == 0) {
            return d2.u.f29139b.b();
        }
        if (c10 == 1) {
            return d2.u.f29139b.a();
        }
        return d2.u.f29139b.b();
    }

    public final int g() {
        byte c10 = c();
        if (c10 == 0) {
            return d2.v.f29143b.b();
        }
        if (c10 == 1) {
            return d2.v.f29143b.a();
        }
        if (c10 == 3) {
            return d2.v.f29143b.c();
        }
        if (c10 == 2) {
            return d2.v.f29143b.d();
        }
        return d2.v.f29143b.b();
    }

    public final d2.x h() {
        return new d2.x(i());
    }

    public final int i() {
        return this.f14578a.readInt();
    }

    public final c1.f1 j() {
        return new c1.f1(d(), b1.g.a(e(), e()), e(), null);
    }

    public final y1.v k() {
        j1 j1Var;
        j1 j1Var2 = r15;
        j1 j1Var3 = new j1(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.f14578a.dataAvail() > 1) {
            byte c10 = c();
            if (c10 != 1) {
                j1Var = j1Var2;
                if (c10 == 2) {
                    if (a() < 5) {
                        break;
                    }
                    j1Var.e(o());
                    j1Var2 = j1Var;
                } else if (c10 == 3) {
                    if (a() < 4) {
                        break;
                    }
                    j1Var.h(h());
                    j1Var2 = j1Var;
                } else if (c10 == 4) {
                    if (a() < 1) {
                        break;
                    }
                    j1Var.f(d2.u.c(f()));
                    j1Var2 = j1Var;
                } else if (c10 != 5) {
                    if (c10 != 6) {
                        if (c10 != 7) {
                            if (c10 != 8) {
                                if (c10 != 9) {
                                    if (c10 != 10) {
                                        if (c10 != 11) {
                                            if (c10 == 12) {
                                                if (a() < 20) {
                                                    break;
                                                }
                                                j1Var.j(j());
                                            }
                                        } else if (a() < 4) {
                                            break;
                                        } else {
                                            j1Var.k(m());
                                        }
                                    } else if (a() < 8) {
                                        break;
                                    } else {
                                        j1Var.a(d());
                                    }
                                } else if (a() < 8) {
                                    break;
                                } else {
                                    j1Var.l(n());
                                }
                            } else if (a() < 4) {
                                break;
                            } else {
                                j1Var.b(j2.a.b(b()));
                            }
                        } else if (a() < 5) {
                            break;
                        } else {
                            j1Var.i(o());
                        }
                    } else {
                        j1Var.d(l());
                    }
                    j1Var2 = j1Var;
                } else if (a() < 1) {
                    break;
                } else {
                    j1Var.g(d2.v.e(g()));
                    j1Var2 = j1Var;
                }
            } else if (a() < 8) {
                break;
            } else {
                j1Var2.c(d());
            }
        }
        j1Var = j1Var2;
        return j1Var.m();
    }

    public final String l() {
        return this.f14578a.readString();
    }

    public final j2.f m() {
        int i10 = i();
        f.a aVar = j2.f.f37083b;
        boolean z10 = (aVar.b().e() & i10) != 0;
        boolean z11 = (i10 & aVar.d().e()) != 0;
        if (z10 && z11) {
            return aVar.a(xn.s.m(aVar.b(), aVar.d()));
        }
        if (z10) {
            return aVar.b();
        }
        if (z11) {
            return aVar.d();
        }
        return aVar.c();
    }

    public final j2.i n() {
        return new j2.i(e(), e());
    }

    public final long o() {
        long c10;
        byte c11 = c();
        if (c11 == 1) {
            c10 = m2.t.f40544b.b();
        } else if (c11 == 2) {
            c10 = m2.t.f40544b.a();
        } else {
            c10 = m2.t.f40544b.c();
        }
        if (m2.t.g(c10, m2.t.f40544b.c())) {
            return m2.r.f40540b.a();
        }
        return m2.s.a(e(), c10);
    }

    public final long p() {
        return wn.t.c(this.f14578a.readLong());
    }
}
