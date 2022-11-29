package com.dena.mirrorman.net.api.response;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import de.c;
import jo.h;
import jo.p;
import so.o;

/* loaded from: classes2.dex */
public final class Singer {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String[] DAKUON_AND_SEION = {"がぎぐげござじずぜぞだぢづでどばびぶべぼ", "かきくけこさしすせそたちつてとはひふへほ"};
    private static final String[] HAN_DAKUON_AND_SEION = {"ぱぴぷぺぽ", "はひふへほ"};

    /* renamed from: id  reason: collision with root package name */
    private final String f26160id;
    private final String kana;
    private final String name;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public Singer(String str, String str2, String str3) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "name");
        p.h(str3, "kana");
        this.f26160id = str;
        this.name = str2;
        this.kana = str3;
    }

    public static /* synthetic */ Singer copy$default(Singer singer, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = singer.f26160id;
        }
        if ((i10 & 2) != 0) {
            str2 = singer.name;
        }
        if ((i10 & 4) != 0) {
            str3 = singer.kana;
        }
        return singer.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f26160id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.kana;
    }

    public final Singer copy(String str, String str2, String str3) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "name");
        p.h(str3, "kana");
        return new Singer(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Singer) {
            Singer singer = (Singer) obj;
            return p.c(this.f26160id, singer.f26160id) && p.c(this.name, singer.name) && p.c(this.kana, singer.kana);
        }
        return false;
    }

    public final String getId() {
        return this.f26160id;
    }

    public final String getInitial() {
        if (this.kana.length() == 0) {
            return "";
        }
        String b10 = c.b(this.kana.charAt(0));
        String[] strArr = DAKUON_AND_SEION;
        if (o.H(strArr[0], b10, false, 2, null)) {
            return String.valueOf(strArr[1].charAt(o.U(strArr[0], b10, 0, false, 6, null)));
        }
        String[] strArr2 = HAN_DAKUON_AND_SEION;
        if (o.H(strArr2[0], b10, false, 2, null)) {
            return String.valueOf(strArr2[1].charAt(o.U(strArr2[0], b10, 0, false, 6, null)));
        }
        return b10;
    }

    public final String getKana() {
        return this.kana;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.f26160id.hashCode() * 31) + this.name.hashCode()) * 31) + this.kana.hashCode();
    }

    public String toString() {
        return "Singer(id=" + this.f26160id + ", name=" + this.name + ", kana=" + this.kana + ')';
    }
}
