package com.dena.mirrorman.net.fme;

import java.nio.charset.Charset;
import jo.h;
import jo.p;
import so.q;
import xn.a0;
import xn.o;

/* loaded from: classes2.dex */
public final class FmeLyricsRubyBlockParser {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        private final String getChara(byte[] bArr) {
            byte[] U = o.U(FmeParserKt.getBytes(bArr, 4, getLength(bArr) * 2));
            try {
                if (U[0] == 0) {
                    U = a0.x0(o.C(U, 1));
                }
                if (U.length != 1 && U[1] == 0) {
                    U = a0.x0(a0.Q(o.T(U), 1));
                }
                Charset forName = Charset.forName("Shift-JIS");
                p.g(forName, "forName(\"Shift-JIS\")");
                return q.R0(new String(U, forName)).toString();
            } catch (Exception unused) {
                return "";
            }
        }

        private final int getLength(byte[] bArr) {
            return FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 0, 2));
        }

        private final int getPositionX(byte[] bArr) {
            return FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 2, 2));
        }

        public final RubyData parse(byte[] bArr) {
            p.h(bArr, "bytes");
            if (bArr.length == 0) {
                return new RubyData(0, 0, "");
            }
            return new RubyData(getLength(bArr), getPositionX(bArr), getChara(bArr));
        }
    }
}
