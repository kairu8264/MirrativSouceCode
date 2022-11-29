package jf;

import com.dena.mirrorman.net.api.Referer;

/* loaded from: classes2.dex */
public enum g0 {
    RECOMMEND(0, f0.RECOMMEND, Referer.Notice.Campaign.RECOMMEND),
    EMOMO(1, f0.EMOMO, Referer.Notice.Campaign.EMOMO),
    APP(2, f0.APP, Referer.Notice.Campaign.APP);
    
    private final f0 category;
    private final int index;
    private final String referer;

    g0(int i10, f0 f0Var, String str) {
        this.index = i10;
        this.category = f0Var;
        this.referer = str;
    }

    public final f0 c() {
        return this.category;
    }

    public final int e() {
        return this.index;
    }

    public final String h() {
        return this.referer;
    }
}
