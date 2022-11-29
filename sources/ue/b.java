package ue;

import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public enum b {
    A("A"),
    I("I"),
    U("U"),
    E("E"),
    O("O"),
    EMPTY("");
    
    public static final a Companion = new a(null);
    private final String sendValue;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final b a(double[] dArr) {
            p.h(dArr, "formantArray");
            if (dArr.length != 2) {
                return b.EMPTY;
            }
            double d10 = dArr[0];
            double d11 = dArr[1];
            if (d10 <= 600.0d || d10 >= 1100.0d || d11 <= 1000.0d || d11 >= 3100.0d) {
                int i10 = (d10 > 150.0d ? 1 : (d10 == 150.0d ? 0 : -1));
                if (i10 <= 0 || d10 >= 450.0d || d11 <= 1800.0d || d11 >= 3100.0d) {
                    if (i10 <= 0 || d10 >= 500.0d || d11 <= 800.0d || d11 >= 1700.0d) {
                        if (d10 <= 400.0d || d10 >= 700.0d || d11 <= 1400.0d || d11 >= 2600.0d) {
                            if (d10 > 300.0d && d10 < 700.0d && d11 > 500.0d && d11 < 1700.0d) {
                                return b.O;
                            }
                            return b.EMPTY;
                        }
                        return b.E;
                    }
                    return b.U;
                }
                return b.I;
            }
            return b.A;
        }
    }

    b(String str) {
        this.sendValue = str;
    }

    public final String c() {
        return this.sendValue;
    }
}
