package com.mirrativ.llstream;

import jo.h;
import jo.p;
import so.a;

/* loaded from: classes4.dex */
public final class LLStreamKeyFeatures {
    private final int rawValue;
    public static final Companion Companion = new Companion(null);
    private static final LLStreamKeyFeatures EMPTY = new LLStreamKeyFeatures(0);
    private static final LLStreamKeyFeatures LLSTREAM_BROADCAST = new LLStreamKeyFeatures(1);
    private static final LLStreamKeyFeatures FEATURE2 = new LLStreamKeyFeatures(2);
    private static final LLStreamKeyFeatures FEATURE3 = new LLStreamKeyFeatures(4);
    private static final LLStreamKeyFeatures FEATURE4 = new LLStreamKeyFeatures(8);
    private static final LLStreamKeyFeatures FEATURE5 = new LLStreamKeyFeatures(16);
    private static final LLStreamKeyFeatures FEATURE6 = new LLStreamKeyFeatures(32);
    private static final LLStreamKeyFeatures FEATURE7 = new LLStreamKeyFeatures(64);
    private static final LLStreamKeyFeatures FEATURE8 = new LLStreamKeyFeatures(128);
    private static final LLStreamKeyFeatures FEATURE9 = new LLStreamKeyFeatures(256);
    private static final LLStreamKeyFeatures FEATURE10 = new LLStreamKeyFeatures(512);
    private static final LLStreamKeyFeatures FEATURE11 = new LLStreamKeyFeatures(1024);
    private static final LLStreamKeyFeatures FEATURE12 = new LLStreamKeyFeatures(2048);

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final LLStreamKeyFeatures fromHexString$llstream_release(String str) {
            p.h(str, "value");
            return new LLStreamKeyFeatures(Integer.parseInt(str, 16));
        }

        public final LLStreamKeyFeatures getEMPTY() {
            return LLStreamKeyFeatures.EMPTY;
        }

        public final LLStreamKeyFeatures getFEATURE10() {
            return LLStreamKeyFeatures.FEATURE10;
        }

        public final LLStreamKeyFeatures getFEATURE11() {
            return LLStreamKeyFeatures.FEATURE11;
        }

        public final LLStreamKeyFeatures getFEATURE12() {
            return LLStreamKeyFeatures.FEATURE12;
        }

        public final LLStreamKeyFeatures getFEATURE2() {
            return LLStreamKeyFeatures.FEATURE2;
        }

        public final LLStreamKeyFeatures getFEATURE3() {
            return LLStreamKeyFeatures.FEATURE3;
        }

        public final LLStreamKeyFeatures getFEATURE4() {
            return LLStreamKeyFeatures.FEATURE4;
        }

        public final LLStreamKeyFeatures getFEATURE5() {
            return LLStreamKeyFeatures.FEATURE5;
        }

        public final LLStreamKeyFeatures getFEATURE6() {
            return LLStreamKeyFeatures.FEATURE6;
        }

        public final LLStreamKeyFeatures getFEATURE7() {
            return LLStreamKeyFeatures.FEATURE7;
        }

        public final LLStreamKeyFeatures getFEATURE8() {
            return LLStreamKeyFeatures.FEATURE8;
        }

        public final LLStreamKeyFeatures getFEATURE9() {
            return LLStreamKeyFeatures.FEATURE9;
        }

        public final LLStreamKeyFeatures getLLSTREAM_BROADCAST() {
            return LLStreamKeyFeatures.LLSTREAM_BROADCAST;
        }
    }

    public LLStreamKeyFeatures(int i10) {
        this.rawValue = i10;
    }

    private final int component1() {
        return this.rawValue;
    }

    public static /* synthetic */ LLStreamKeyFeatures copy$default(LLStreamKeyFeatures lLStreamKeyFeatures, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = lLStreamKeyFeatures.rawValue;
        }
        return lLStreamKeyFeatures.copy(i10);
    }

    public final boolean contains(LLStreamKeyFeatures lLStreamKeyFeatures) {
        p.h(lLStreamKeyFeatures, "features");
        return p.c(times(lLStreamKeyFeatures), lLStreamKeyFeatures);
    }

    public final LLStreamKeyFeatures copy(int i10) {
        return new LLStreamKeyFeatures(i10);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LLStreamKeyFeatures) && this.rawValue == ((LLStreamKeyFeatures) obj).rawValue);
    }

    public int hashCode() {
        return Integer.hashCode(this.rawValue);
    }

    public final LLStreamKeyFeatures minus(LLStreamKeyFeatures lLStreamKeyFeatures) {
        p.h(lLStreamKeyFeatures, "features");
        return new LLStreamKeyFeatures((~lLStreamKeyFeatures.rawValue) & this.rawValue);
    }

    public final LLStreamKeyFeatures plus(LLStreamKeyFeatures lLStreamKeyFeatures) {
        p.h(lLStreamKeyFeatures, "features");
        return new LLStreamKeyFeatures(lLStreamKeyFeatures.rawValue | this.rawValue);
    }

    public final LLStreamKeyFeatures times(LLStreamKeyFeatures lLStreamKeyFeatures) {
        p.h(lLStreamKeyFeatures, "features");
        return new LLStreamKeyFeatures(lLStreamKeyFeatures.rawValue & this.rawValue);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LLStreamKeyFeatures");
        sb2.append('(');
        sb2.append("rawValue");
        sb2.append("=0b");
        String num = Integer.toString(this.rawValue, a.a(2));
        p.g(num, "toString(this, checkRadix(radix))");
        sb2.append(num);
        sb2.append(')');
        return sb2.toString();
    }
}
