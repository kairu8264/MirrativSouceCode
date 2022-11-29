package com.dena.mirrorman.clientlog.logs;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;
import xm.c;
import xm.f;
import ym.b;

/* loaded from: classes2.dex */
public final class AvatarItemSelectLog {
    public static final int $stable = 0;

    /* renamed from: id  reason: collision with root package name */
    private final String f25295id;
    @b(BooleanTypeAdapter.class)
    private final boolean isHave;
    @b(BooleanTypeAdapter.class)
    private final boolean isTrial;

    public AvatarItemSelectLog(String str, boolean z10, boolean z11) {
        p.h(str, TtmlNode.ATTR_ID);
        this.f25295id = str;
        this.isHave = z10;
        this.isTrial = z11;
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…e()\n        .toJson(this)");
        return s10;
    }
}
